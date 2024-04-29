# Gemini Echo

## Team Members
- 6488021 Russarin Eaimrittikrai
- 6488045 Supithcha Jongphoemwatthanaphon
- 6488052 Sasasuang Pattanakitjaroenchai
- 6488061 Chaninan Phetpangun
- 6488184 Runchida Ananartyasit
- 6488203 Phacharaphan Chalitchaiya


## Project Description
This project is an implementation of a web application of Gemini software using Java, Spring Boot, Thymeleaf, and the H2 database which communicates with the OCS backend.

There are 4 use cases:
1. Login and register to the system.
2. Create a science plan by astronomers.
3. Validate a science plan by science observers.
4. Create an observing program by science observers.

## Design Pattern
The Echo-Gemini project is designed around the MVC (Model-View-Controller) pattern, which separates the application into three interconnected components:

- **Model**: The project defines several classes (e.g., ObservingProgramEcho, SciencePlanEcho, and User) responsible for managing the application's data. These classes handle operations related to observing programs, science plans, and users.
- **View**: HTML templates are used to present the application's data to users. These templates, including those for displaying created science plans, creating observing programs, and creating/validating science plans, are responsible for rendering the user interface in a readable format.
- **Controller**: Java classes serve as controllers, managing HTTP requests and acting as intermediaries between the model and view. Controllers process user inputs, update the model based on these inputs, and select the appropriate view to render the response to the user.


## How to run the Application
To run the application, download the implementations folder and execute the Java file named "BackendApplication.java".

## How to execute *Login and register to the system* use case
1. Access URL http://localhost:8080/ to access the login page.
<p align="center">
  <img width="700" src="https://github.com/ICT-Mahidol/Gemini-2023/assets/128398519/ad3c0be2-8410-4d11-bea4-8ff63038dedb" alt="Login page">
</p>
2. If you haven't registered an account, you'll have to click `+` button to register an account. You must select your role (Astronomer or Science Observer) and fill in the registration form.
<p align="center">
  <img width="700" alt="Register page" src="https://github.com/ICT-Mahidol/Gemini-2023/assets/128398519/2c9195ef-6e70-44b8-9713-809b7c9e4a73">
</p>
3. If you already own an account, you can input your username and password to access the application.

## How to execute *Create a science plan by astronomers* use case
1. Once astronomers access the website, they will see the homepage http://localhost:8080/astronomer. They can click `Start create a science plan`. They can click on it to navigate to the Create Science Plan page http://localhost:8080/scienceplan .
<p align="center">
  <img width="700" alt="Astronomer Hompage" src="https://github.com/ICT-Mahidol/Gemini-2023/assets/128398519/c052b3be-231a-48f9-894c-629fa0769e6a">
</p>
2. The astronomers can fill in science plan information into the input areas and click save to record the science plan. Afterward, the created science plans will appear on the table.
<p align="center">
  <img width="700" alt="Create science plan page" src="https://github.com/ICT-Mahidol/Gemini-2023/assets/128398519/471b4401-16bc-42ed-8719-44f7a614e761">
</p>

## How to execute *Validate a science plan by science observers* use case
1. Once science observers access the website, they will see the homepage http://localhost:8080/observer. They can click `Start validate a science plan` to navigate to the Validate Science Plan page http://localhost:8080/validatescienceplan.
<p align="center">
  <img width="700" alt="Observer Hompage" src="https://github.com/ICT-Mahidol/Gemini-2023/assets/128398519/a48d3c09-3739-43de-815e-f2d59081d6d1">
</p>
2. The science observers can read science plan information on the table or click the button `Validated` or `Invalidated` to read the full details and click the button again to change the science plan status.
<p align="center">
  <img width="700" alt="Validate Science Plan Page 1" src="https://github.com/ICT-Mahidol/Gemini-2023/assets/128398519/28fe846e-307b-4f7e-8a5a-3ec0e4d36458">
</p>
<p align="center">
  <img width="700" alt="Validate Science Plan Page 2" src="https://github.com/ICT-Mahidol/Gemini-2023/assets/128398519/9487e8ba-7eb6-4979-943c-f6f5a4c4b5f3">
</p>

## How to execute *Create an observing program by science observers* use case
1. Once science observers access the website, they will see the homepage http://localhost:8080/observer. They can click `Start create an observing program` to navigate to the Create Observing Program page http://localhost:8080/observingprogram.
<p align="center">
 <img width="700" alt="Observer Homepage 2" src="https://github.com/ICT-Mahidol/Gemini-2023/assets/128398519/0a72bc4e-b4fb-4de6-8232-834821f006bb">
</p>
2. The science observers can select a validated science plan from the list to create an observing program. Then, they can fill in observing program information into the input areas and click Create to record the observing program.
<p align="center">
 <img width="700" alt="Create Observing Program Page" src="https://github.com/ICT-Mahidol/Gemini-2023/assets/128398519/87334b97-a69c-4694-baa3-cc8d8cb7f78d">
</p>



