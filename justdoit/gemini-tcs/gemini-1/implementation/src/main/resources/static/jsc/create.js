function checkUserId() {
  if (localStorage.getItem("userid") == 0) {
    location.replace("/");
  }
  if (localStorage.getItem("permission") == 2) {
    location.replace("/observerDashboard");
  }
  console.log(localStorage.getItem("userid"));
}

window.onload = checkUserId;

async function logout() {
  localStorage.setItem("check_login", false);
  localStorage.setItem("userid", 0);
  location.replace("/");
}

document.addEventListener('DOMContentLoaded', function() {
   const form = document.querySelector("#progress-form");
   if (form) {
     form.addEventListener("submit", function(event) {
       event.preventDefault();

       const formData = new FormData(form);
       const data = {
         creator: formData.get("creator"),
         submitter: formData.get("submitter"),
         funding: parseInt(formData.get("funding")),
         objective: formData.get("objectives"),
         starSystem: formData.get("starSystem"),
         telescopeLocation: formData.get("telescopeLocation"),
         startdate: formData.get("startDate"),
         enddate: formData.get("endDate"),
       };

       console.log(data);

       const url = "http://localhost:8080/scienceplans?id=" + localStorage.getItem("userid");

       fetch(url, {
         method: "POST",
         body: JSON.stringify(data),
         headers: {
           "Content-Type": "application/json",
         },
       })
       .then((response) => {
         if (!response.ok) {
           throw new Error("Network response was not ok");
         }
         return response.text();
       })
       .then((responseText) => {
         console.log("Science plan submitted:", responseText);
       })
       .catch((error) => {
         console.error("Error submitting science plan:", error);
       });
     });
   } else {
     console.error("Form not found");
   }
 });
document.addEventListener('DOMContentLoaded', function() {
   const form = document.querySelector("#progress-form");
   const submissionStatus = document.querySelector("#submission-status");

   if (form) {
     form.addEventListener("submit", function(event) {
       event.preventDefault();

       const formData = new FormData(form);
       const data = {
         // Data object
       };

       const url = "http://localhost:8080/scienceplans?id=" + localStorage.getItem("userid");

       fetch(url, {
         method: "POST",
         body: JSON.stringify(data),
         headers: {
           "Content-Type": "application/json",
         },
       })
       .then((response) => {
         if (!response.ok) {
           throw new Error("Network response was not ok");
         }
         return response.text();
       })
       .then((responseText) => {
         submissionStatus.textContent = "";

         submissionStatus.textContent = "Science plan submitted: " + responseText;
         submissionStatus.style.color = "green";
       })
       .catch((error) => {
         submissionStatus.textContent = "";

         submissionStatus.textContent = "Error submitting science plan: " + error.message;
         submissionStatus.style.color = "red";
       });
     });
   } else {
     console.error("Form not found");
   }
 });
function addSciencePlan(planData) {
  fetch('http://localhost:8080/addSciencePlan', {
    method: 'POST',
    headers: {
      'Content-Type': 'application/json',
    },
    body: JSON.stringify(planData),
  })
  .then(response => response.json())
  .then(data => {
    console.log('Success:', data);
    // Optionally refresh the table or add the new row directly with JavaScript
  })
  .catch((error) => {
    console.error('Error:', error);
  });
}
