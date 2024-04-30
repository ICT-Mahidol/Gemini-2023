const usersUrl = "http://localhost:8080/users";
const sciencePlansUrl = "http://localhost:8080/scienceplans?id=1";

const usersTable = document.getElementById("users");
const sciencePlansTable = document.getElementById("science-plans");

const fetchUsers = () => {
  return new Promise((resolve, reject) => {
    setTimeout(() => {
      fetch(usersUrl)
        .then((response) => response.json())
        .then((data) => {
          const tbody = usersTable.querySelector("tbody");
          tbody.innerHTML = "";
          data.forEach((user) => {
            const tr = document.createElement("tr");
            tr.innerHTML = `
              <th scope="row">${user.userId}</th>
              <td>${user.userUsername}</td>
              <td>${user.userPassword}</td>
              <td>${user.userAccountName}</td>
              <td>${user.userPermission}</td>
            `;
            tbody.appendChild(tr);
          });
          resolve();
        })
        .catch((error) => {
          console.error(error);
          reject(error);
        });
    }, 1000);
  });
};

const fetchSciencePlans = () => {
  return new Promise((resolve, reject) => {
    setTimeout(() => {
      fetch(sciencePlansUrl)
        .then((response) => response.json())
        .then((data) => {
          const tbody = sciencePlansTable.querySelector("tbody");
          tbody.innerHTML = "";
          data.forEach((plan) => {
            const tr = document.createElement("tr");
            tr.innerHTML = `
              <td>${plan.planNo}</td>
              <td>${plan.creator}</td>
              <td>${plan.fundingInUSD}</td>
              <td>${plan.starSystem}</td>
              <td>${plan.startDate}</td>
              <td>${plan.endDate}</td>
              <td>${plan.telescopeLocation}</td>
              <td>${plan.status}</td>
            `;
            tbody.appendChild(tr);
          });
          resolve();
        })
        .catch((error) => {
          console.error(error);
          reject(error);
        });
    }, 2000);
  });
};

Promise.all([fetchUsers(), fetchSciencePlans()])
  .then(() => console.log("Fetch complete"))
  .catch((error) => console.error(error));

function setDummyData() {
  const url = `http://localhost:8080/setsciplanstatus?id=1&planNo=${document.getElementById("sciplanNo").value}&status=COMPLETE`;
  fetch(url)
    .then((response) => {
      if (!response.ok) {
        throw new Error("Network response was not ok");
      }
      return response.json();
    })
    .then((data) => {
      console.log(data);
      // do something with the response data
    })
    .catch((error) => {
      console.error("There was a problem with the fetch operation:", error);
    });
    const modal = document.getElementById('exampleModal');
    window.location.reload();
}

const confirmBtn = document.querySelector(
  "#exampleModal .modal-footer .btn-primary"
);
confirmBtn.addEventListener("click", setDummyData);


const selectElement = document.querySelector(".form-select");
fetch("http://localhost:8080/scienceplans?id=1")
  .then((response) => response.json())
  .then((data) => {
    const planNumbers = data.map((plan) => plan.planNo);
    console.log(planNumbers);
    // Clear the existing options
    selectElement.innerHTML = "";
    // Add the default option
    const defaultOption = document.createElement("option");
    defaultOption.text = "Select Science Plan ID";
    defaultOption.disabled = true;
    defaultOption.selected = true;
    selectElement.appendChild(defaultOption);
    // Add the fetched plan numbers as options
    planNumbers.forEach((planNo) => {
      const option = document.createElement("option");
      option.value = planNo;
      option.text = `${planNo}`;
      selectElement.appendChild(option);
    });
  })
  .catch((error) => console.error(error));