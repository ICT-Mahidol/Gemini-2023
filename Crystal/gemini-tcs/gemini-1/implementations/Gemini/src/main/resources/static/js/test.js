const selectElement = document.querySelector(".form-select");
fetch("http://localhost:8080/scienceplans?id="+localStorage.getItem("userid"))
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

const creatorInput = document.querySelector("#creatorName");
const starSystemInput = document.querySelector("#starSystem");
const fundingInput = document.querySelector("#funding");
const statusInput = document.querySelector("#status");
const telescopeLoc = document.querySelector("#telescopeLoc");
const startDateInput = document.querySelector("#startDate");
const endDateInput = document.querySelector("#endDate");

selectElement.addEventListener("change", () => {
  console.log("changed");
  fetch(`http://localhost:8080/scienceplan?id=${localStorage.getItem("userid")}&planNo=${document.getElementById("sciplanNo").value}`)
    .then((response) => response.json())
    .then((data) => {
      console.log(data);
      creatorInput.value = data.creator;
      starSystemInput.value = data.starSystem;
      fundingInput.value = data.fundingInUSD;
      statusInput.value = data.status;
      telescopeLoc.value = data.telescopeLocation;
      startDateInput.value = data.startDate;
      endDateInput.value = data.endDate;
    })
    .catch((error) => console.error(error));
});

const form = document.querySelector("form");
form.addEventListener("submit", async (event) => {
  event.preventDefault();

  form.style.display = "none";
  const after = document.getElementById("after");
  after.style.display = "flex";
  after.style.flexDirection = "column";

  fetch(`http://localhost:8080/testscienceplan?id=${localStorage.getItem("userid")}&sciplan=${document.getElementById("sciplanNo").value}`)
    .then((response) => response.text())
    .then((data) => {
      const resultArray = data.split(/\r?\n/);
      const resultDiv = document.getElementById("result");

      resultArray.shift();
      resultArray.shift();
      resultArray.pop();

      let counter = 1;
      for (const result of resultArray) {
        const p = document.createElement("p");
        p.id = `result-${counter}`;
        if (result.includes("ERROR")) {
          p.innerHTML += `<i class="fa-solid fa-xmark"></i> ${result}`;
        } else {
          p.innerHTML += `<i class="fa-solid fa-check"></i> ${result}`;
        }
        resultDiv.appendChild(p);
        counter++;
      }
      const buttonDiv = document.createElement("div");
      const buttonAnchor = document.createElement("a");
      const button = document.createElement("button");
      
      buttonDiv.classList.add("button-div");
      buttonAnchor.href = "/test_scienceplan";
      button.textContent = "Return";
      
      resultDiv.appendChild(buttonDiv);
      buttonDiv.appendChild(buttonAnchor);
      buttonAnchor.appendChild(button);
    })
    .catch((error) => console.error(error));

  moveProgressBarOne();
  await new Promise((resolve) => setTimeout(resolve, 8000));
  moveProgressBarTwo();
  await new Promise((resolve) => setTimeout(resolve, 4000));
  moveProgressBarThree();
  await new Promise((resolve) => setTimeout(resolve, 5000));
  moveProgressBarFour();
  await new Promise((resolve) => setTimeout(resolve, 5000));

  after.style.display = "none";
  document.getElementById("result").style.display = "block";
});

function delay(time) {
  return new Promise((resolve) => setTimeout(resolve, time));
}


function moveProgressBarOne() {
  console.log("moveProgressBarOne");
  var getPercent = $(".progressone-wrap").data("progress-percent") / 100;
  var getProgressWrapWidth = $(".progressone-wrap").width();
  var progressTotal = getPercent * getProgressWrapWidth;
  var animationLength = 8000;

  $(".progressone-bar").stop().animate(
    {
      left: progressTotal,
    },
    animationLength
  );
}
function moveProgressBarTwo() {
  console.log("moveProgressBarTwo");
  var getPercent = $(".progresstwo-wrap").data("progress-percent") / 100;
  var getProgressWrapWidth = $(".progresstwo-wrap").width();
  var progressTotal = getPercent * getProgressWrapWidth;
  var animationLength = 4000;

  $(".progresstwo-bar").stop().animate(
    {
      left: progressTotal,
    },
    animationLength
  );
}
function moveProgressBarThree() {
  console.log("moveProgressBarThree");
  var getPercent = $(".progressthree-wrap").data("progress-percent") / 100;
  var getProgressWrapWidth = $(".progressthree-wrap").width();
  var progressTotal = getPercent * getProgressWrapWidth;
  var animationLength = 5000;

  $(".progressthree-bar").stop().animate(
    {
      left: progressTotal,
    },
    animationLength
  );
}
function moveProgressBarFour() {
  console.log("moveProgressBarFour");
  var getPercent = $(".progressfour-wrap").data("progress-percent") / 100;
  var getProgressWrapWidth = $(".progressfour-wrap").width();
  var progressTotal = getPercent * getProgressWrapWidth;
  var animationLength = 4000;

  $(".progressfour-bar").stop().animate(
    {
      left: progressTotal,
    },
    animationLength
  );
}

function checkUserId() {
  if (localStorage.getItem("userid")==0) {
    location.replace("/");
  }
  if (localStorage.getItem("permission")==2) {
    location.replace("observer");
  }
  console.log(localStorage.getItem("userid"));
}

window.onload = checkUserId;


async function logout() {
localStorage.setItem("check_login", false);
localStorage.setItem("userid", 0);
location.replace("/");
}