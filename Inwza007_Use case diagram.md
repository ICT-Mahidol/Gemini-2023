# Team members
1. 6488003	Kasidis	Aiamsamarng
2. 6488040	Alongkorn	Janpensri
3. 6488083	Kanyanut	Sompong
4. 6488091	Tulagarn	Sornprasit
5. 6488103	Panyaporn	Wattanapong
6. 6488148	Pattanun	Worakitsitthisatorn

# Use case diagram
![Alt text](https://m1r.ai/9/zirrw.png)

# Use case diagram description
### Actor: Astronomer 
The use case for an astronomer includes drafting a science plan, a crucial document that outlines the objectives and methods for celestial observation. Once the plan is in place, the astronomer proceeds to observe the skies, collecting meticulously managed and organized data. A critical review of the science plan ensures it is robust and feasible. Subsequently, the plan is translated into an actionable observing program submitted to the observatory's system for execution. Throughout this process, the astronomer monitors the program's progress, making necessary adjustments to stay aligned with the scientific goals, ensuring the integrity and success of the astronomical project.

- **Drafting a science plan**  
Astronomers will need to draft a science plan that involves the astronomer’s mission to craft a comprehensive strategy for gathering scientific data with the help of the Gemini telescope system. The plan should be designed to facilitate the data acquisition of astronomical observations that are important to the astronomer’s research.

- **Test science plan**  
A test science plan is crucial to ensure that the objectives outlined in the plan can be realistically achieved with the available resources and within the constraints of the observatory's capabilities. The testing phase may involve simulations or preliminary data analysis to confirm that the expected outcomes are attainable and that the methodologies proposed are sound. This process helps to identify any potential issues or adjustments needed before the plan is officially submitted for execution.

- **Submit an observing program to the system**  
Once an observing program has been successfully developed, it must be submitted to the telescope's control system in a format that is executable by the computer systems. This ensures the program can interactively operate through the Observatory Control System (OCS), allowing for real-time adjustments and flexibility. The submission process verifies that the program is ready for execution, clearly defining all necessary parameters and instructions


### Actor: Visitor
The use case for the Visitor pattern arises in software design when there is a need to perform various operations on a complex object structure without modifying the classes representing that structure. By implementing the Visitor pattern, you can define new operations by creating distinct visitor classes, keeping the operations separate from the elements being operated upon. 

- **Propose for installation**  
A visitor proposes an installation for the Gemini telescope.


### Actor: Supporter
In a supporter use case, the process involves validating the device and its configuration, installing new configurations, and subsequently handing over the device to the installation operation staff. 

- **Validate Device and configuration**  
When visitors suggest installing a specific device on Gemini, supporters take charge by first validating and configuring the device When visitors propose the installation of a specific device on Gemini, supporters take on the responsibility of validating the device and configuring it. This initial step is critical to confirm that the device is compatible with the observatory's existing infrastructure and that its configuration aligns with the observatory's requirements.

- **Install new configurations**  
Following successful validation, supporters proceed to implement any necessary new configurations. This may involve updating software, adjusting hardware settings, or making other modifications to ensure optimal performance. These configurations are tailored to ensure the device functions seamlessly within the observatory's environment.

- **Pass the device for installation**  
Once the device has been meticulously configured and tested, supporters pass it on to the operational staff. The operational staff takes charge of the physical installation phase, ensuring that the device is securely and effectively integrated into the observatory's systems. This handover marks the transition from the supporter's role to the operational phase.

### Actor: Operation staff
The on-site controller of the telescope and instruments. This person is responsible for ensuring the system's integrity and for keeping the system functioning accurately during observations. The Telescope Operator works with the Observer and the science plan to produce as good data as possible.

- **Validate the observing program**  
After an observing program is created, the operation staff are to validate the observing program before it can acquire a greenlight.

- **Install device**  
A visitor will propose to install a special device on the Gemini telescope. The device will be validated by the supporter. After the device is greenlit, the operation staff will proceed to install the device onto the telescope.

### Actor: Science Observer

An on-site person who is responsible for monitoring the data acquisition and validating the data integrity collected from the Gemini telescope in order to forward them to the astronomer afterward, and ensures that the science plan is ongoing according to the plan and adapts them to suit the needs for the astronomer.
- **Validate a science plan**  
After the astronomer submits the science plan to the Gemini Telescope system, the science observer will validate the science plan and check to ensure its effect and efficiency before transforming the plan into an observing program.

- **Transform a science plan to an observing program**  
This action involves translating the existing science plan into a pragmatic and automated observing sequence that the Gemini telescope's systems can execute without human interaction. The transformation process includes programming the sequence using software that provides a user-friendly interface. This allows for the efficient use of the telescope's time and resources, ensuring that the transition from plan to program is smooth and effective.

- **Execute the approved plan**  
The approved observing program is put into action. This critical phase involves collecting astronomical data as specified by the plan. The execution must be precise, adhering to the detailed specifications of the observing program to ensure that the scientific objectives are met. It typically requires automation to allow for consistent and accurate observations over extended periods.

- **Monitor the progress of science plan execution**  
Science Observer will need to monitor the progress of the plan continuously. Monitoring is essential to ensure that the execution of the science plan is on track, such as overseeing the commands issued to various subsystems, managing the responses and status updates, and ensuring the integrity of data flows to and from online databases. 

- **Collect astronomical data**  
The science observers are involved in capturing observations from the cosmos using the Gemini telescope's array of instruments in this action. The data collected is crucial for the astronomer's research, enabling the exploration and understanding of astronomical phenomena.

- **Validate the integrity of collected data**  
Once the data is collected, it is essential to validate its integrity. This means ensuring that the data is accurate, complete, and uncorrupted. The science observer will need to monitor the performance, integrity, safety, and instruments of the telescope during the data collection phase to detect any anomalies or issues that might compromise data quality.

- **Manage the collected data**  
Once the data is collected and validated, it must be managed effectively. This involves cataloging, storing, and maintaining the data for accessibility and use in future scientific analysis. Data management is crucial for preserving the integrity of the data over time and facilitating its availability for current and future research projects.

- **Submit an observing program to the system**  
Once an observation has been completed, the science observers must submit the program to the telescope’s control system in a format that is executable by the computer systems. The submission process verifies that the program is ready for execution, clearly defining all necessary parameters and instructions.
