async function fetchSubmittedSciencePlans() {
    try {
        const response = await fetch('/science-plans?status=SUBMITTED');
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

async function populateSubmittedSciencePlans() {
    const tableBody = document.getElementById('sciencePlanTableBody');
    const savedSciencePlans = await fetchSubmittedSciencePlans();
    // Clear existing rows
    tableBody.innerHTML = '';

    if (savedSciencePlans.length === 0) {
        const row = document.createElement("tr");
        row.innerHTML = `
            <td colspan="10">There are currently no submitted science plans.</td>
        `;
        tableBody.appendChild(row);
    } else {
        savedSciencePlans.forEach(plan => {
            const row = document.createElement("tr");
            row.innerHTML = `
                <td>
                    <button class="button" onclick="selectPlan(this, ${plan.planNo}, \'toValidate\')">Validate</button>
                    <button class="button" onclick="selectPlan(this, ${plan.planNo}, \'toInvalidate\')">Invalidate</button>
                </td>
                <td>${plan.planNo}</td>
                <td>${plan.creator}</td>
                <td>${plan.submitter}</td>
                <td>${plan.fundingInUSD}</td>
                <td>${plan.objectives}</td>
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

populateSubmittedSciencePlans()

let selectedScienceplan = 0;

async function selectPlan(button, planNo, todo) {
    const selected = button.classList.contains('selected');
    if (selected) {
        button.classList.remove('selected');
    } else {
        button.classList.add('selected');
    }
    
    const response = await fetch(`http://localhost:8080/science-plan/${planNo}`);
    const planDetails = await response.json();
    const popup = document.createElement('div');
    popup.classList.add('popup');
    popup.innerHTML = `
        <div class="popup-content">
            <span class="close" onclick="closePopup()">&times;</span>
            <h2>Plan Details</h2> <br>
            <p><strong>Plan Number:</strong> ${planDetails.planNo}</p>
            <p><strong>Creator:</strong> ${planDetails.creator}</p>
            <p><strong>Submitter:</strong> ${planDetails.submitter}</p>
            <p><strong>Funding:</strong> ${planDetails.fundingInUSD}</p>
            <p><strong>Objectives:</strong> ${planDetails.objectives}</p>
            <p><strong>Star System:</strong> ${planDetails.starSystem}</p>
            <p><strong>Start Date:</strong> ${planDetails.startDate}</p>
            <p><strong>End Date:</strong> ${planDetails.endDate}</p>
            <p><strong>Telescope Location:</strong> ${planDetails.telescopeLocation}</p>
            <p><strong>DataProcRequirements:</strong>
                 <ul>
                    <li>File Type: ${planDetails.dataProcRequirements.fileType}</li>
                    <li>File Quality: ${planDetails.dataProcRequirements.fileQuality}</li>
                    ${
                    planDetails.dataProcRequirements.colorType === 'B&W mode' ?
                        `
                                <li>Contrast: ${planDetails.dataProcRequirements.contrast}</li>
                                <li>Highlights: ${planDetails.dataProcRequirements.highlights}</li>
                                <li>Exposure: ${planDetails.dataProcRequirements.exposure}</li>
                                <li>Shadows: ${planDetails.dataProcRequirements.shadows}</li>
                                <li>Whites: ${planDetails.dataProcRequirements.whites}</li>
                                <li>Blacks: ${planDetails.dataProcRequirements.blacks}</li>
                                ` :
                        planDetails.dataProcRequirements.colorType === 'Color mode' ?
                            `
                                <li>Contrast: ${planDetails.dataProcRequirements.contrast}</li>
                                <li>Brightness: ${planDetails.dataProcRequirements.brightness}</li>
                                <li>Saturation: ${planDetails.dataProcRequirements.saturation}</li>
                                <li>Exposure: ${planDetails.dataProcRequirements.exposure}</li>
                                <li>Luminance: ${planDetails.dataProcRequirements.luminance}</li>
                                <li>Hue: ${planDetails.dataProcRequirements.hue}</li>
                                ` :
                            ''
                    }
                </ul>
            </p>
            <p><strong>Status:</strong> ${planDetails.status}</p>
            <button class="btntocheck" onclick="${todo === 'toInvalidate' ? `invalidatePlan(${planNo})` : `validatePlan(${planNo})`}">${todo === 'toInvalidate' ? 'Invalidate' : 'Validate'}</button>
        </div>
    `;
    document.body.appendChild(popup);
}


async function validatePlan(planNo) {
    console.log('Validating plan:', planNo);
    try {
        const response = await fetch(`/validateSciencePlan/${planNo}`);
        if (!response.ok) {
            throw new Error('Failed to validate science plans');
        }
        const data = await response.json();
        alert("Validate science plan successfully.");
        closePopup();
        setTimeout(() => {
            window.location.reload();
        }, 500);
        return data;
    } catch (error) {
        console.error('Error validating science plan.', error);
        return [];
    }

}

async function invalidatePlan(planNo) {
    console.log('Validating plan:', planNo);
    try {
        const response = await fetch(`/invalidateSciencePlan/${planNo}`);
        if (!response.ok) {
            throw new Error('Failed to validate science plans');
        }
        const data = await response.json();
        alert("Invalidate Science plan successfully.");
        closePopup();
        setTimeout(() => {
            window.location.reload();
        }, 500);
        return data;
    } catch (error) {
        console.error('Error invalidating science plan', error);
        return [];
    }
}

function closePopup() {
    const popup = document.querySelector('.popup');
    if (popup) {
        popup.remove();
        const button = document.querySelector('.button');
        if (button) {
            button.classList.add('selected');
        }
    }
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
            .popup {
                /*text-align: center;*/
                /*align-items: center;*/
                font-size: 1.2em;
                width: 20%;
                position: fixed;
                top: 50%;
                left: 50%;
                transform: translate(-50%, -50%);
                background-color: white;
                padding: 40px;
                border: 1px solid #ccc;
                border-radius: 5px;
                box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
                z-index: 9999;
            }

            .popup-content {
                max-width: 600px;
                margin: 0 auto;
            }

            .close {
                position: absolute;
                top: 10px;
                right: 10px;
                cursor: pointer;
            }
            .btntocheck {
                margin-top: 5%;
                margin-left: 27%;
                background-color: #4682B4;
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
    if (localStorage.getItem("userid")==0) {
        location.replace("/");
    }
    if (localStorage.getItem("role")=="Astronomer") {
        location.replace("/astronomer");
    }
    console.log(localStorage.getItem("userid"));
}

window.onload = checkUserId;