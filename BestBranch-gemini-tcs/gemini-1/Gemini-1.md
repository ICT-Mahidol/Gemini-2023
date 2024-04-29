# Step how to execute our project

0. Run ./gradlew build

1. Run docker build -t best_branch/best_branch . command

2. Run docker run -d -p 8080:8080 --name bestGenimi best_branch/best_branch:latest
## Login Usecase

1. Open http://localhost:8080/ in the browser which Spring boots to initiate DemoApplication and redirects to the login page
![image](https://github.com/ICT-Mahidol/Gemini-2023/assets/131664453/efaefe23-c0a6-469a-8a31-a76deb1cc23b)

2. If the User did not have an account, the user is required to register to the system first
![image](https://github.com/ICT-Mahidol/Gemini-2023/assets/131664453/9ccbb756-fa18-4f4a-9202-2a52cd60bc1e)

3. Once the user has an account, the next step is to log in to the system
![image](https://github.com/ICT-Mahidol/Gemini-2023/assets/131664453/18ac6235-8025-48ce-bedd-07282a3fd52f)

4. After authentication, the controller will redirect the user to the dashboard of the system to see the current ongoing plan that happening in the system
![image](https://github.com/ICT-Mahidol/Gemini-2023/assets/131664453/3ad8fd2b-0f12-4f9f-8577-4c4d3044db79)

## Manu bar
The system has a menu bar for the user to redirect to and features of the system, and the nav bar contains CreateSciPlan, SubmitSciPlan, And TestSciPlan routes All of these are our Use cases in our project scope

![image](https://github.com/ICT-Mahidol/Gemini-2023/assets/131664453/ffa93198-6bec-4614-9529-463c78e8fc44)

## Create SciPlan Usecase
1. Start by redirecting to Create SciPlan Use case

![image](https://github.com/ICT-Mahidol/Gemini-2023/assets/131664453/a65b8d74-0508-430e-99be-c7c3d5172e0a)

2. This page is used for the Creation of the sciPlan, it contains a form for submitting the required data for creating the SciPlan
![image](https://github.com/ICT-Mahidol/Gemini-2023/assets/131664453/2b11e4f7-204e-4ac9-9186-d9e7ee241954)

3. Since SciPlan requires Data Processing Requirement Details, this page includes the form section for Data Processing Requirement right under the detail of SciPlan
![image](https://github.com/ICT-Mahidol/Gemini-2023/assets/131664453/3d640254-6cdd-492a-81ac-b547f09461f8)

4. After filling in all the details of the SciPlan, one user submits the dashboard Appear The SciPlan that was recently created as well

![image](https://github.com/ICT-Mahidol/Gemini-2023/assets/131664453/d0ea9519-e962-4a20-b0b6-d8db93679f25)
![image](https://github.com/ICT-Mahidol/Gemini-2023/assets/131664453/1a785459-ec68-47bb-ab3e-3abcda244dac)

## Test SciPlan Usecase
1. Let's try Testing Our Sciplan on Test SciPlan Page
![image](https://github.com/ICT-Mahidol/Gemini-2023/assets/131664453/d43c4b5a-7fa6-43f0-a342-0499a2d5dcbb)

2. On the test Page have a Test Button for initiating testing in OCS

![image](https://github.com/ICT-Mahidol/Gemini-2023/assets/131664453/d3a4d54d-290e-43bd-8aac-f9ecd55964cc)

3. One User clicks the test button it will run the testing system in the OCS
![image](https://github.com/ICT-Mahidol/Gemini-2023/assets/131664453/abe88681-c931-4008-98cc-892bd183a504)

4. If the test fails the page will redirect to the testing result page
![image](https://github.com/ICT-Mahidol/Gemini-2023/assets/131664453/c2fd3f0a-9cf4-4783-a7e7-f5724deaf1d2)


## Submit Sciplan Usecase
1. Now let's Submit the tested Sci Plan
![image](https://github.com/ICT-Mahidol/Gemini-2023/assets/131664453/19bf390a-15af-4c64-98c6-2cb7c5b46afb)

2. Similar to test SciPlan Usecase which has a submit button
![image](https://github.com/ICT-Mahidol/Gemini-2023/assets/131664453/a55448df-44d1-48cc-9b2d-cfb2b6f88e57)

3. Once submitted the page will route to Submit result page
![image](https://github.com/ICT-Mahidol/Gemini-2023/assets/131664453/d72a7ff8-72da-4396-8835-f6669f7679ef)

![image](https://github.com/ICT-Mahidol/Gemini-2023/assets/131664453/b2dcbdeb-8e4b-48a2-a119-d112aad8ed2c)

## Pattern We Use
Since we are required to Create Our own Sciplan, So we have to make an adapter for SciPlan to convert OurSciPlan To SciencePlan in OCS to make Our Product run testing feature
![image](https://github.com/ICT-Mahidol/Gemini-2023/assets/131664453/8c14d1f2-2f3b-47b8-bd1a-aa900087389a)
