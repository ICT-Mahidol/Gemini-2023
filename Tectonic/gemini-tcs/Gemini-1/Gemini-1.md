# Gemini Tectonic

## Team Members
- 6488073 Chalisa Sae-ngow
- 6488089 Pattaravit Suksri
- 6488100 Jiraruch Tantiyavarong
- 6488105 Kantinan Yontawil
- 6488128 Thanapat Nonpassopon
- 6488134 Jirateep Rudeerudchanawong

## How to run
1.git clone https://github.com/ICT-Mahidol/Gemini-2023.git

2.Open your compiler such as VSCode or IntelliJ

3.Run DemoApplication.java

4.Use your browser such as Chrome and typing URL: http://localhost:8080/

<img width="738" alt="Screenshot 2567-04-29 at 23 36 17" src="https://github.com/ICT-Mahidol/Gemini-2023/assets/84704161/1fbafbae-ec63-4162-b70c-7e19ef56426c">

## Selected Use Case
- Login
- Create a science plan.
- Create an observing program.
- Access to astronomical data.

## Design pattern
- The singleton design pattern ensures a single instance for a class, preventing other objects from using new operators. This is evident in UserController.java, where the ocs instance is accessible to all clients, and SciencePlanController.java, where all science plans can access the ocs instance.

## Usage
**1. Login**

a.    On the "Create Science Plan" page, fill in the required fields such as creator, funding, objectives, star system, start and end dates, and telescope location

b.    Optionally, you can specify data processing requirements by clicking the "Show/Hide" button and filling in the desired settings
 
c.    Click the "Submit" button to create the science plan

<img width="736" alt="Screenshot 2567-04-29 at 23 37 25" src="https://github.com/ICT-Mahidol/Gemini-2023/assets/84704161/dc5e4095-ef8a-4e22-be77-f30e9d4a8d01">


**2. Observing Program**

a.    Select a science plan from the list by checking the corresponding checkbox 

b.    Input the required observing program parameters

c.    Click the "Create Observing Program" button

d.    If the observing program is valid, it will be saved to the OCS, and a success message will be displayed

e.    If the observing program is invalid, an error message will be displayed

<img width="1465" alt="Screenshot 2567-04-29 at 23 38 06" src="https://github.com/ICT-Mahidol/Gemini-2023/assets/84704161/7b93a789-0ff1-41f6-b446-8a56b2a90496">


**3. Astronomical Data**

a.    Access the page to see the stars’ images

<img width="1429" alt="Screenshot 2567-04-29 at 23 38 39" src="https://github.com/ICT-Mahidol/Gemini-2023/assets/84704161/ff86022a-11f4-4277-8fe6-d4725cef0aca">

