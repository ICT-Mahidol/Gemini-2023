async function fetchAllobservingprograms() {
    try {
        const response = await fetch('/observingprograms');
        if (!response.ok) {
            throw new Error('Failed to fetch');
        }
        const data = await response.json();
        console.log('Observing program fetch data:', data);
        return data;
    } catch (error) {
        console.error('Error fetching:', error);
        return [];
    }
}

let currentIndex = 0;
let plans = [];

async function populateObservingprograms() {
    const listContainer = document.getElementById('ObservingprogramList');

    async function fetchAndDisplayObservingProgram(index) {
        try {
            plans = await fetchAllobservingprograms();

            if (plans.length === 0) {
                listContainer.innerHTML = '<p class="NoValidated">No observing programs are currently available.</p> <br>';
                return;
            }

            const plan = plans[index];

            const listItem = document.createElement("div");
            listItem.innerHTML = `
                <p>Plan Number: ${plan.planNo}</p>
                <p>Optics Primary: ${plan.opticsPrimary}</p>
                <p>Optics Secondary RMS: ${plan.opticsSecondaryRMS}</p>
                <p>Science Fold Mirror Degree: ${plan.scienceFoldMirrorDegree}</p>
                <p>Science Fold Mirror Type: ${plan.scienceFoldMirrorType}</p>
                <p>Module Content: ${plan.moduleContent}</p>
                <p>Calibration Unit: ${plan.calibrationUnit}</p>
                <p>Light Type: ${plan.lightType}</p>
                <p><strong>Degree:</strong> ${plan.telePositionPairs.degree ? plan.telePositionPairs.degree : 'N/A'}</p>
                <p><strong>Direction:</strong> ${plan.telePositionPairs.direction ? plan.telePositionPairs.direction : 'N/A'}</p>
                <div style="margin-left: 62%">
                    <button onclick="previousObservingProgram()" class="btnnextprevious">Previous</button>
                    <button onclick="nextObservingProgram()" class="btnnextprevious">Next</button>
                </div>
            `;
            listContainer.innerHTML = '';
            listContainer.appendChild(listItem);
        } catch (error) {
            console.error('Error fetching science plans:', error);
        }
    }

    await fetchAndDisplayObservingProgram(currentIndex);
}

async function nextObservingProgram() {
    currentIndex = (currentIndex + 1) % plans.length;
    await populateObservingprograms();
}

async function previousObservingProgram() {
    currentIndex = (currentIndex - 1 + plans.length) % plans.length;
    await populateObservingprograms();
}

populateObservingprograms();


async function createObservingprogram(ObservingData) {
    var submitter = document.getElementById("submitter").value;
    try {
        console.log(ObservingData);
        const res = await fetch(`http://localhost:8080/create-observingprogram`, {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json',
                'Accept': 'application/json'
            },
            body: JSON.stringify(ObservingData)
        });

        alert("Observing program created successfully.");
        setTimeout(() => {
            window.location.reload();
        }, 800);

        return res;
    } catch (error) {
        throw error;
    }
}

function fetchSciencePlans() {
    fetch("http://localhost:8080/scienceplans?id=" + localStorage.getItem("userid"))
        .then((response) => response.json())
        .then((data) => {
            const tableBody = document.querySelector("#table-body");
            tableBody.innerHTML = ""; // Clear existing rows

            data.forEach((plan) => {
                const row = document.createElement("tr");
                row.innerHTML = `
                    <td>${plan.planNo}</td>
                    <td>${plan.creator}</td>
                    <td>${plan.fundingInUSD}</td>
                    <td>${plan.starSystem}</td>
                    <td>${plan.startDate}</td>
                    <td>${plan.endDate}</td>
                    <td>${plan.telescopeLocation}</td>
                    <td>${plan.status}</td>
                `;
                tableBody.appendChild(row);
            });
        })
        .catch((error) => {
            console.error("Error fetching science plans:", error);
        });
}

document.addEventListener('DOMContentLoaded', function () {
    document.getElementById('observingprogramform').addEventListener('submit', async function (event) {
        event.preventDefault();
        var scienceplan_id = selectedScienceplan;
        if (scienceplan_id === 0 ) {
            alert("Please select a science plan");
            return false;
        }
        const observer_id = localStorage.getItem("userid");
        // const scienceplan_id = ###

        const observing = {
            // planNo: 100,
            opticsPrimary: document.getElementById('opticsPrimary').value,
            fStop: parseFloat(document.getElementById('fStop').value),
            opticsSecondaryRMS: parseFloat(document.getElementById('RMS').value),
            scienceFoldMirrorDegree: parseFloat(document.getElementById('scienceFoldMirrorDegree').value),
            scienceFoldMirrorType: document.getElementById('scienceFoldMirrorType').value, // Assuming this is a string value
            moduleContent: parseInt(document.getElementById('moduleContent').value),
            calibrationUnit: document.getElementById('calibrationUnit').value, // Assuming this is a string value
            lightType: document.getElementById('lightType').value, // Assuming this is a string value
            // telePositionPair: document.getElementById('telescopeLocation').value, // Assuming this is a string value or an array of strings
            telePositionPair: {
                direction: document.getElementById('Tele_direction').value,
                degree: document.getElementById('Tele_degree').value,
            },
            observer_id: parseInt(observer_id),
            scienceplan_id: selectedScienceplan
        };
        try {
            console.log(observing);
            const response = await createObservingprogram(observing);
            if (response.ok) {
                console.log('Observing program created successfully.');
                setTimeout(() => {
                    window.location.reload();
                }, 500);
            } else {
                console.error('Failed to create observing program.');
                alert("Failed to create science plan.");
            }
        } catch (error) {
            console.error('An error occurred while creating the observing program:', error);
        }
    });
});

async function fetchValidatedSciencePlans() {
    try {
        const response = await fetch('/science-plans?status=VALIDATED');
        if (!response.ok) {
            throw new Error('Failed to fetch science plans');
        }
        const data = await response.json();
        console.log('Response data:', data);
        return data;
    } catch (error) {
        console.error('Error fetching science plans:', error);
        return [];
    }
}

async function populateValidatedSciencePlans() {
    const tableBody = document.getElementById('sciencePlanTableBody');
    const savedSciencePlans = await fetchValidatedSciencePlans();
    console.log('Saved Science Plans:', savedSciencePlans);

    // Clear existing rows
    tableBody.innerHTML = '';

    if (savedSciencePlans.length === 0) {
        const row = document.createElement("tr");
        row.innerHTML = `
            <td colspan="9">There are currently no validated science plans.</td>
        `;
        tableBody.appendChild(row);
    } else {
        savedSciencePlans.forEach(plan => {
            const row = document.createElement("tr");
            row.innerHTML = `
                <td> <button class="button" onclick="selectPlan(this, ${plan.planNo})">Select</button></td>
                <td>${plan.planNo}</td>
                <td>${plan.creator}</td>
                <td>${plan.fundingInUSD}</td>
                <td>${plan.starSystem}</td>
                <td>${plan.startDate}</td>
                <td>${plan.endDate}</td>
                <td>${plan.telescopeLocation}</td>
                <td>${plan.status}</td>
            `;
            tableBody.appendChild(row);
        });
    }
}


populateValidatedSciencePlans()

let selectedScienceplan = 0;

function selectPlan(button, planNo) {
    const selected = button.classList.contains('selected');
    if (selected) {
        button.classList.remove('selected');
        // Deselect logic, e.g., remove from selected plans array
    } else {
        button.classList.add('selected');
        // Select logic, e.g., add to selected plans array
    }
    selectedScienceplan = planNo;
    console.log('Selected Plan Number:', selectedScienceplan);
}

function addStyles() {
    const style = `
        <style>
            .button {
                background-color: #B0C4DE;
                color: white;
                border: none;
                padding: 5px 10px;
                cursor: pointer;
            }

            .button.selected {
                color: white;
                background-color: #008080;
            }
            p{
                font-size: 0.9em;
                margin-top: 0.3px;
                margin-bottom: 0.5px;
                /*color: white;*/
            }
            .btnnextprevious {
                font-size: 0.9em;
                border-radius: 5px;
                background-color: #A9A9A9;
                color: white;
                border: none;
                padding: 10px 10px;
                cursor: pointer;
                margin-top:1em;
                margin-left: 0.9em;
                margin-bottom: 1em;
            }
            .NoValidated{
                padding: 3px;
                font-size: 0.95em;
            }
        </style>
    `;
    document.head.insertAdjacentHTML('beforeend', style);
}

addStyles();

function checkUserId() {
    if (localStorage.getItem("userid") == 0) {
        location.replace("/");
    }
    if (localStorage.getItem("role") == "Astronomer") {
        location.replace("/astronomer");
    }
    console.log(localStorage.getItem("userid"));
}

window.onload = checkUserId;
