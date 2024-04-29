fetch("http://localhost:8080/scienceplans?id=" + localStorage.getItem("userid"))
    .then((response) => response.json())
    .then((data) => {
        const tableBody = document.querySelector("#table-body");
        if (data == null || data.length === 0) {
            const messageRow = document.createElement("tr");
            messageRow.innerHTML = `<td colspan="10">You have not created any science plans.</td>`;
            tableBody.appendChild(messageRow);
        } else {
            data.forEach((plan) => {
                const row = document.createElement("tr");
                row.innerHTML = `
                    <td>${plan.planNo}</td>
                    <td>${plan.creator}</td>
                    <td>${plan.submitter}</td>
                    <td>${plan.fundingInUSD}</td>
                    <td>${plan.starSystem}</td>
                    <td>${plan.startDate}</td>
                    <td>${plan.endDate}</td>
                    <td>${plan.telescopeLocation}</td>
                    <td>${plan.status}</td>
                `;
                if (plan.status === "SAVED") {
                    const buttonCell = document.createElement("td");
                    const button = document.createElement("button");
                    button.type = "button";
                    button.classList.add("button");
                    button.innerText = "Submit";
                    button.onclick = () => submitSciencePlan(plan.planNo, button);
                    buttonCell.appendChild(button);
                    row.appendChild(buttonCell);
                }
                else {
                    const buttonCell = document.createElement("td");
                    row.appendChild(buttonCell);
                }
                tableBody.appendChild(row);
            });
        }
    });

async function submitSciencePlan(planNo, button) {
    console.log("science plan to submit", planNo);
    // await getSubmittedSciencePlans(planNo, button);
    button.classList.add("submitted");
    const userId = localStorage.getItem("userid");
    try {
        const res = await fetch(`http://localhost:8080/submit-science-plans?planNo=${planNo}&userId=${userId}`, {
            method: 'GET',
            headers: {
                'Content-Type': 'application/json',
                'Accept': 'application/json'
            }
        });
        const data = await res.text();
        alert(data);
        setTimeout(() => {
            window.location.reload();
        }, 800);
        console.log(res);
        return res;
    } catch (error) {
        throw error;
    }
}
// async function getSubmittedSciencePlans(planNo, button) {
//     try {
//         const res = await fetch(`http://localhost:8080/Save-scienceplans?status=SAVED`, {
//             method: 'GET',
//             headers: {
//                 'Content-Type': 'application/json',
//                 'Accept': 'application/json'
//             }
//         });
//         if (res.ok) {
//             const data = await res.json();
//             console.log(data);
//             if (data.length > 0) {
//                 button.classList.remove("submittedtoocs");
//             } else {
//                 button.classList.add("submittedtoocs");
//             }
//             return data;
//         } else {
//             throw new Error('Failed to fetch submitted science plans');
//         }
//     } catch (error) {
//         console.error('An error occurred while fetching submitted science plans:', error);
//         throw error;
//     }
// }


// create science plan
async function createSciencePlan(formData, userId) {
    try {
        const res = await fetch(`http://localhost:8080/create-scienceplan?id=${userId}`, {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json',
                'Accept': 'application/json'
            },
            body: JSON.stringify(formData)
        });
        console.log(res);
        return res;
    } catch (error) {
        throw error;
    }
}

async function saveSciencePlan() {
    event.preventDefault();
    var submitter = document.getElementById("submitter").value;
    var funding = document.getElementById("funding").value;
    var objectives = document.getElementById("objectives").value;
    var startDate = document.getElementById("startDate").value;
    var endDate = document.getElementById("endDate").value;
    var colorType = document.getElementById("colorTypeInput").value;
    var brightnessInput = document.getElementById("brightnessInput").value;
    var saturationInput = document.getElementById("saturationInput").value;
    var highlightsInput = document.getElementById("highlightsInput").value;
    var shadowsInput = document.getElementById("shadowsInput").value;
    var whitesInput = document.getElementById("whitesInput").value;
    var blacksInput = document.getElementById("blacksInput").value;
    var luminanceInput = document.getElementById("luminanceInput").value;
    var hueInput = document.getElementById("hueInput").value;
    var contrastInput = document.getElementById("contrastInput").value;
    var exposureInput = document.getElementById("exposureInput").value;


    if (submitter === "" || funding === "" || objectives === "" || startDate === "" || endDate === "" ) {
        alert("Please fill in all required fields.");
        return false;
    } else if (isNaN(funding)) {
        alert("Please enter a valid funding amount.");
        return false;
    } else if (colorType === "Color mode") {
        if (contrastInput === "" || brightnessInput === "" || saturationInput === "" || exposureInput === "" || luminanceInput === "" || hueInput === ""){
            alert("Please fill in all required fields.");
            return false;
        } else if (isNaN(contrastInput)){
            alert("Please enter a valid Contrast amount.");
            return false;
        } else if (isNaN(brightnessInput)) {
            alert("Please enter a valid Brightness amount.");
            return false;
        } else if (isNaN(saturationInput)) {
            alert("Please enter a valid Saturation amount.");
            return false;
        } else if (isNaN(exposureInput)) {
            alert("Please enter a valid Exposure amount.");
            return false;
        } else if (isNaN(luminanceInput)) {
            alert("Please enter a valid Luminance amount.");
            return false;
        } else if (isNaN(hueInput)) {
            alert("Please enter a valid Hue amount.");
            return false;
        }
    } else if (colorType === "B&W mode") {
        if (contrastInput === "" || highlightsInput === "" || shadowsInput === "" || exposureInput === "" ||  whitesInput === "" ||  blacksInput === "" ) {
            alert("Please fill in all required fields.");
            return false;
        } else if (isNaN(contrastInput)){
            alert("Please enter a valid Contrast amount.");
            return false;
        } else if (isNaN(highlightsInput)) {
            alert("Please enter a valid Highlights amount.");
            return false;
        } else if (isNaN(exposureInput)) {
            alert("Please enter a valid Exposure amount.");
            return false;
        } else if (isNaN(shadowsInput)) {
            alert("Please enter a valid Shadows amount.");
            return false;
        } else if (isNaN(whitesInput)) {
            alert("Please enter a valid Whites amount.");
            return false;
        } else if (isNaN(blacksInput)) {
            alert("Please enter a valid Blacks amount.");
            return false;
        }
    }

    console.log("Save Science Plan");
    startDate = new Date(document.getElementById('startDate').value);
    var formattedStartDate = startDate.getDate() + "/" + (startDate.getMonth() + 1) + "/" + startDate.getFullYear() + " " +
        startDate.getHours() + ":" + startDate.getMinutes() + ":" + startDate.getSeconds();
    endDate = new Date(document.getElementById('endDate').value);
    var formattedEndDate = endDate.getDate() + "/" + (endDate.getMonth() + 1) + "/" + endDate.getFullYear() + " " +
        endDate.getHours() + ":" + endDate.getMinutes() + ":" + endDate.getSeconds();
    console.log(formattedStartDate);
    console.log(formattedEndDate);

    if (startDate > endDate) {
        alert("Start date cannot be after the end date.");
        return;
    }
    const userId = localStorage.getItem("userid");
    const formData = {
        creator: document.getElementById('creator').value,
        submitter: document.getElementById('submitter').value,
        fundingInUSD: parseFloat(document.getElementById('funding').value),
        objectives: document.getElementById('objectives').value,
        starSystem: document.getElementById('starSystem').value,
        // startDate: document.getElementById('startDate').value,
        // endDate: document.getElementById('endDate').value,
        startDate: formattedStartDate,
        endDate: formattedEndDate,
        telescopeLocation: document.getElementById('telescopeLocation').value,
        dataProcRequirements: {
            fileType: document.getElementById('fileTypeInput').value,
            fileQuality: document.getElementById('fileQualityInput').value,
            colorType: document.getElementById('colorTypeInput').value,
            contrast: parseFloat(document.getElementById('contrastInput').value),
            brightness: parseFloat(document.getElementById('brightnessInput').value),
            saturation: parseFloat(document.getElementById('saturationInput').value),
            highlights: parseFloat(document.getElementById('highlightsInput').value),
            exposure: parseFloat(document.getElementById('exposureInput').value),
            shadows: parseFloat(document.getElementById('shadowsInput').value),
            whites: parseFloat(document.getElementById('whitesInput').value),
            blacks: parseFloat(document.getElementById('blacksInput').value),
            luminance: parseFloat(document.getElementById('luminanceInput').value),
            hue: parseFloat(document.getElementById('hueInput').value)
        },
        status: "SAVED"
    };
    console.log(formData);
    try {
        const response = await createSciencePlan(formData, userId);
        if (response.ok) {
            alert("Science plan created successfully.");
            console.log('Science plan created successfully.');
            setTimeout(() => {
                window.location.reload();
            }, 500);
        } else {
            console.error('Failed to create science plan.');
            alert("Failed to create science plan.");
        }
    } catch (error) {
        console.error('An error occurred while creating the science plan:', error);
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

// Add this
const nameInput = document.getElementById("creator");

fetch("http://localhost:8080/usersname?id=" + localStorage.getItem("userid"))
    .then((response) => response.text())
    .then((data) => {
        const username = data.trim();
        console.log(username);
        nameInput.value = username;
    })

// function to check if user logged in or not
function checkUserId() {
    if (localStorage.getItem("userid")===0) {
        location.replace("/");
    }
    if (localStorage.getItem("role")==="Observer") {
        location.replace("/observer");
    }
    console.log(localStorage.getItem("userid"));
}

window.onload = checkUserId;


async function fetchAllSciencePlans() {
    try {
        const response = await fetch('/SciPlansOCS');
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

    try {
        const plans = await fetchAllSciencePlans();

        if (plans && plans.length > 0) {
            plans.forEach(plan => {
                const row = document.createElement("tr");
                row.innerHTML = `
                    <td>${plan.planNo}</td>
                    <td>${plan.creator}</td>
                    <td>${plan.submitter}</td>
                    <td>${plan.fundingInUSD}</td>
                    <td>${plan.starSystem}</td>
                    <td>${plan.startDate}</td>
                    <td>${plan.endDate}</td>
                    <td>${plan.telescopeLocation}</td>
                    <td>${plan.status}</td>
                `;
                tableBody.appendChild(row);
            });
        } else {
            const row = document.createElement("tr");
            row.innerHTML = "<td colspan='9'>No science plans found.</td>";
            tableBody.appendChild(row);
        }
    } catch (error) {
        console.error('Error populating science plans:', error);
    }
}


populateValidatedSciencePlans();

function addStyles() {
    const style = `
        <style>
            .button {
                background-color: #B0C4DE;
                color: white;
                border: none;
                padding: 5px 7px;
                cursor: pointer;
            }
            .submitted {
                background-color: green; /* Change to your desired color */
                color: white; /* Change to your desired text color */
            }
            .submittedtoocs{
                display: none;
            }
       </style>
    `;
    document.head.insertAdjacentHTML('beforeend', style);
}

addStyles();




