const selectElement = document.querySelector(".form-select");
fetch("http://localhost:8080/scienceplans?id=" + localStorage.getItem("userid"))
  .then((response) => response.json())
  .then((data) => {
    const planNumbers = data.map((plan) => plan.planNo);
    console.log(planNumbers);
    // Clear the existing options
    selectElement.innerHTML = "";
    // Add the default option
    const defaultOption = document.createElement("option");
    defaultOption.text = "Select Science Plan ID";
    defaultOption.selected = true;
    defaultOption.value = "";
    selectElement.appendChild(defaultOption);
    // Add the fetched plan numbers as options
    planNumbers.forEach((planNo) => {
      // Check the status of the current plan
      const currentPlan = data.find((plan) => plan.planNo === planNo);
      if (currentPlan.status === "COMPLETE") {
        const option = document.createElement("option");
        option.value = planNo;
        option.text = `${planNo}`;
        selectElement.appendChild(option);
      }
    });
  });

const creatorInput = document.querySelector("#creatorName");
const starSystemInput = document.querySelector("#starSystem");
const fundingInput = document.querySelector("#funding");
const statusInput = document.querySelector("#status");
const telescopeLoc = document.querySelector("#telescopeLoc");
const startDateInput = document.querySelector("#startDate");
const endDateInput = document.querySelector("#endDate");

selectElement.addEventListener("change", () => {
  console.log("changed");
  fetch(
    `http://localhost:8080/scienceplan?id=${localStorage.getItem(
      "userid"
    )}&planNo=${document.getElementById("sciplanNo").value}`
  )
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
const formValidate = document.getElementById("sciplanNo");

form.addEventListener("submit", async (event) => {
  event.preventDefault();
  
console.log(formValidate.value)
  if (!formValidate.value) {
    formValidate.style.border = "1px solid red";
    return;
  }
  console.log(formValidate.value)
  fetch(`http://localhost:8080/getastronomicaldata?id=${localStorage.getItem(
      "userid"
    )}&planNo=${formValidate.value}`)
    .then((response) => response.json())
    .then((encodedImages) => {
      const carouselInner = document.querySelector(".carousel-inner");
      encodedImages.forEach((encodedImage, index) => {
        const carouselItem = document.createElement("div");
        carouselItem.classList.add("carousel-item");
        if (index === 0) {
          carouselItem.classList.add("active");
        }
        const img = document.createElement("img");
        img.src = `data:image/jpeg;base64,${encodedImage}`;
        img.classList.add("d-block", "w-100");
        carouselItem.appendChild(img);
        carouselInner.appendChild(carouselItem);
      });
      const carouselControls = `
      <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleControlsNoTouching" data-bs-slide="prev">
        <span class="carousel-control-prev-icon" aria-hidden="true"></span>
        <span class="visually-hidden">Previous</span>
      </button>
      <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleControlsNoTouching" data-bs-slide="next">
        <span class="carousel-control-next-icon" aria-hidden="true"></span>
        <span class="visually-hidden">Next</span>
      </button>
    `;
      document
        .querySelector("#carouselExampleControlsNoTouching")
        .insertAdjacentHTML("beforeend", carouselControls);
    });
formValidate.disabled = true;

  form.style.display = "none";
  const after = document.getElementById("after");
  after.style.display = "flex";
  after.style.flexDirection = "column";

  moveProgressBarOne();
  await new Promise((resolve) => setTimeout(resolve, 12000));
  moveProgressBarTwo();
  await new Promise((resolve) => setTimeout(resolve, 4000));
  moveProgressBarThree();
  await new Promise((resolve) => setTimeout(resolve, 4000));

  after.style.display = "none";
  document.getElementById("title").style.display = "block";
  document.getElementById("collectbtn").style.display = "none";
  document.getElementById("result").style.display = "block";

  const selectElement = document.getElementById("sciplanNo");
  const element = document.querySelector("#result");
  element.style.display = "flex";
  element.style.flexDirection = "column";
  element.style.justifyContent = "center";
  element.style.textAlign = "center";
  form.style.display = "block";
});

function delay(time) {
  return new Promise((resolve) => setTimeout(resolve, time));
}

const buttonDiv = document.querySelector('.button-div');

buttonDiv.addEventListener('click', (event) => {
  const clickedButton = event.target;
  const responseMessage = document.getElementById("content")

   responseMessage.innerHTML = "The Astronomical Data of the SciencePlan has been Collected";

  const response = document.querySelector('.response');
response.style.display = 'flex';
response.style.justifyContent = 'center';
response.style.flexDirection = 'column';
response.style.alignItems = 'center';
form.style.display = "none"
document.getElementById("result").style.display = "none";


});

function moveProgressBarOne() {
  console.log("moveProgressBarOne");
  var getPercent = $(".progressone-wrap").data("progress-percent") / 100;
  var getProgressWrapWidth = $(".progressone-wrap").width();
  var progressTotal = getPercent * getProgressWrapWidth;
  var animationLength = 12000;

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
  var animationLength = 4000;

  $(".progressthree-bar").stop().animate(
    {
      left: progressTotal,
    },
    animationLength
  );
}

function checkUserId() {
  if (localStorage.getItem("userid") == 0) {
    location.replace("/");
  }
  if (localStorage.getItem("permission") == 1) {
    location.replace("/astronomer");
  }
  console.log(localStorage.getItem("userid"));
}

window.onload = checkUserId;

async function logout() {
  localStorage.setItem("check_login", false);
  localStorage.setItem("userid", 0);
  location.replace("/");
}
