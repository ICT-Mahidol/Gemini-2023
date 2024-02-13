# Team members
1. 6488003	Kasidis	Aiamsamarng
2. 6488040	Alongkorn	Janpensri
3. 6488083	Kanyanut	Sompong
4. 6488091	Tulagarn	Sornprasit
5. 6488103	Panyaporn	Wattanapong
6. 6488148	Pattanun	Worakitsitthisatorn

# Functional
1. The system must have an observing mode. This mode provides simple and safe access to the system for collecting science data, selecting instrument parameters, and quick-look data reduction. Access to the system is through the sequencer, with no direct control of the telescope and instruments
2. The system must have a monitoring mode. This is a special, read-only case of the observing mode that can be invoked on a subsystem basis. Under no circumstances should monitoring affect the performance of an ongoing observation.
3. The system must have operation mode. This access is used for direct control of the telescope and instruments, typically during observation-level operation. It is usually available only to the Telescope Operator and the science program sequencer at the operation level.
4. The system must have a planning mode. Access to the Gemini system is provided during science planning. Actual access to the telescope is not permitted in this mode, but the virtual telescope capability of the Gemini system provides a telescope simulator that is useful for planning observations, as are online databases.
5. The system must have a testing mode. Test access allows complete, direct control of any subsystem. All features of the sub-system are available in this mode. Under no circumstances should testing affect the performance of an ongoing observation.
6. The system must have an administrative mode. Using administrative access, it is possible to inquire about system utilization, efficiency, etc. No control is available in this mode; only status and scheduling information is accessible. Under no circumstances should administrative access affect the performance of an ongoing observation.
7. The system must automatically schedule observations based on predefined scientific criteria.
8. Ensure compatibility with various instruments, including visitor instruments, through standardized interfaces.
9. Implement features to ensure data integrity and validation during acquisition.
10. Facilitate remote operations from various locations, including control and monitoring.
11. Implement a robust user access management system to regulate different user roles and access levels.
12. Adapt operational parameters in real-time in response to environmental changes.
13. Monitor the system's health continuously and alert operators to potential issues.
14. Enable multi-user collaboration, allowing simultaneous operations without interference
15. Allow user interface customization to cater to different user preferences and requirements.
16. Include modes for routine maintenance and calibration of instruments without affecting ongoing observations.
17. Incorporate a training mode with simulations for educational and preparatory purposes.
18. Implement efficient energy and resource management protocols to optimize system operation.
19. Data can be exchanged among different processing units.
20. Commands must be capable of receiving replies from users.
21. Control information for all controlled variables must be provided by all subsystems upon request.
22. No request for information shall cause a delay in control activities or locking.
23. Control parameters, telescope, and instrument information must be available to the Gemini 8m Telescopes software.
24. Data from the detector must be acquirable and storable.
25. Voice connectivity must be available.
26. The system must support off-site observing modes.
27. Automatic procedures must be in place to implement the startup and shutdown of the telescope and instruments.
28. Reconfiguration procedures must be established.
29. The Gemini 8m Telescopes software must interface with external software.
30. The Gemini 8m Telescopes data output format must comply with the GEMINI archive requirements.
31. Computers must have access to star catalogs.
32. The Gemini 8m Telescopes software must interface with all commercial software packages available on the Gemini 8m Telescopes and integrate into Gemini 8m Telescopes operations.
33. Telescope software at the two telescopes must be maintained to be identical in the upper layers.
34. Control information must be transferred through commands and replies from users to the telescope and instrument.
35. Replies must be stored together with astronomical data.
36. Astronomical data must be transported between GEMINI and the home institutes of visiting astronomers in FITs format.
37. The telescope, instruments, and subsystems must be operated at three different levels.
38. Capacity requirements must be expressed in terms of nodes.
39. The capacity system must provide a single off-site data acquisition and instrument control node to be located at either the Gemini 8m Telescopes Site Support or Base Facility.
40. Reconfiguration procedures must exist to change the observing environment.
41. The definition of the observing environment must be dynamic.
42. Links between electronic interfaces and main processors must meet the requirements imposed by the data specification.
43. The output format of the Gemini 8m Telescopes data must be compatible with the GEMINI archive requirements.
44. A transparent hierarchical mode must be implemented for maintenance reasons and hardware independence.
45. The Gemini 8m Telescopes software shall be able to bring the Gemini 8m Telescopes system quickly to a safe state upon detection of danger.
46. Communication hardware independence using DARPA TCP/IP communication protocol
47. The communication software must support the standard ARPA services.
48. The software interface between the workstation and IOC uses DRAMA’s IMP protocol for all control communication and SDS as the command structure.
49. Interprocess communication on the host workstations is through the same IMP protocol.
50. Communications between real-time components based on the EPICS Channel Access protocol.
51. Data communications are typically through IMP/SDS.
52. Off-line data reduction for connecting to the Gemini system
53. Quick-look analysis through PV-Wave/IDL
54. Archiving system for astronomical data in FITS format through STARCAT
55. Star catalogs and software access requirements can be accessed both online and offline using STARCAT.
56. Distribution of IOC control databases across the IOC subsystems
57. Configuration, logging, maintenance schedules, and subsystem documentation in the commercial relational database
58. Implement a secure user authentication system to control access to the software, with different authorization levels for various user roles.
59. Develop a module for real-time visualization of astronomical data, allowing for immediate observation and analysis.
60. An automated system to send alerts or notifications based on specific triggers or anomalies detected in astronomical data.
61. Ensure the software is compatible with mobile devices, allowing remote access and control from smartphones and tablets.
62. Incorporate cloud storage solutions for backup and archiving of astronomical data, ensuring data durability and scalability.
63. Provide options for users to customize the interface according to their preferences and needs.
64. Implement a feature to monitor and report the energy consumption of the telescope and related equipment.
65. Develop a system that uses historical data to predict when equipment maintenance should be performed.
66. Add multi-language support to make the software accessible to international users.
67. Ensure compatibility and seamless integration with other widely used astronomical software and databases.
68. Ability to dynamically allocate computational resources based on the current processing needs of the system.
69. Real-time monitoring of telescope hardware status with diagnostic tools for troubleshooting.
70. Integration with meteorological systems for real-time weather data, impacting observation planning.
71.  An automated system for regular backups of both operational data and configuration settings.
72. Enable full remote operation capabilities, including telescope positioning and data collection.
73. Implement AI algorithms for advanced data analysis, including pattern recognition and anomaly detection.
74. A system for users to submit feedback or report issues directly within the software interface.
75. Feature to analyze and report the environmental impact of the observatory's operations.
76. Provide various data export formats and customizations to cater to different user needs.
77. Establish connections with academic and research databases for data sharing and collaboration.

# Non-functional
1. The system needs to be usable for science data collection.
2. The system needs to be able to be observed.
3. The system needs to be able to ensure integrity and keep the system functioning accurately during operator observations.
4. The system needs to support personnel who are responsible for the maintenance of the system.
5. Observing astronomers will wish to concentrate on the efficient acquisition of astronomical data and online assessment of data quality rather than on the details of controlling the telescope and instruments.
6. The system must offer to a user an interface which, while fulfilling the various operational requirements in the different modes and offering status information both automatically and on request at any required level, is still simple to learn and secure in its use.
7. Observing commands will normally be submitted via the User interface to a queue for later execution.
8. The Gemini software should have no hard restrictions on the number of simultaneous users but should allow for policy decisions that restrict the amount of simultaneous access.
9. Every command must be accepted/rejected within 2 sec and before the corresponding action occurs.
10. The status display update must be within 4 seconds at the local stations.
11. Requests of subsystems for status information must be answered within 5 sec and be possible in maintenance-level operation.
12. Requirements for response times within the user interfaces are given in the User Interface Requirements section.
13. All software bugs should be logged and then fixed as soon as possible after detection. The goal is to have restart conditions occur only on hardware failure.
14. Fault recovery, exception handling, fail-safe checks, etc., should be used to improve reliability.
15. Subsystems must notify the user when faults occur.
16. It may also prove useful to have multiple levels of fault notification, such as detailed, verbose, short, etc., to aid in tracking down problems.
17. Should a subsystem fail (e.g., one detector, one instrument), predefined procedures must exist to redefine the environment so that the operation can restart with the remaining equipment.
18. In case of computer hardware failure concerning the user station equipment, it shall be possible to transfer control from one user station to another via a simple software reconfiguration procedure.
19. In the case of IOC failure, no transfer of control to another IOC will be possible due to the local connections and interfaces to the control electronics. In this case, a procedure shall be to replace faulty cards and/or assemblies.
20. All communication shall be based on the use of standard communication protocols, where retry procedures are applied (a form of software redundancy) as part of the protocol.
21. Certain network concepts may be preferable as they offer intrinsic redundancy (e.g., double loops) and re-routing possibilities in case of node failures (single-point failure protection). The Gemini system software is designed under the following constraints.
22. Commercial packages, off-the-shelf public domain software, and standards will be used whenever feasible.
23. Existing external software will be integrated with the Gemini software. The interfaces involved in this integration are considered part of the Gemini software system.
24. All Gemini software will be developed using standard methodologies and development environments. One of the goals of Gemini software is that all components be easily (preferably automatically) combined into an integrated system.
25. All Gemini subsystem packages should include as part of the software both a simulator module for inclusion in the virtual telescope (see Design constraints below), and user interface modules for the user interface environments that the subsystem will be operating in.
26. All Gemini software must be fully documented internally with appropriate comments and external documentation.
27. All Gemini subsystem packages must provide modules for testing and diagnosing the subsystem.
28. All instrumentation control software must fully access all instrument functionality.
29. All Gemini software must be version labeled, both in source and binary form.
30. The Gemini system must ensure high reliability and availability, minimizing downtime and ensuring consistent performance during critical observational periods.
31. The system should provide an intuitive and user-friendly interface for various user categories, ensuring ease of use and efficient operation.
32. The system must demonstrate high performance in data processing and response times, particularly during peak observation activities.
33. Robust security measures must be in place to safeguard against unauthorized access and to protect sensitive data and system integrity.
34. The system should be scalable and flexible to accommodate future expansions, technological advancements, and evolving scientific goals.
35. The system must maintain high reliability in all operational modes to ensure continuous and error-free functioning.
36. Interfaces for different user categories should be intuitive, catering to their specific needs and technical proficiency.
37. The system must perform effectively under varying operational levels, ensuring swift data processing and response times.
38. The system should be scalable to accommodate future expansions in terms of users, instruments, or functionalities.
39. Robust security protocols must be in place to prevent unauthorized access and protect sensitive data.
40. The system should be designed for easy maintenance, with clear procedures for regular updates and troubleshooting.
41. The system must be flexible enough to adapt to changing scientific goals and technological advancements.
42. Remote and on-site access should be seamless, providing equal operational capabilities.
43. The system should be compatible with various instruments and technologies, allowing easy integration and data exchange.
44. The Gemini system requires controlled accessibility, ensuring that different categories of users (such as astronomers, telescope operators, and developers) have appropriate access levels. This includes safeguarding sensitive operations and data against unauthorized access while maintaining ease of use for authorized users.
45. High availability is crucial to maximize telescope utility, especially during peak observation times.
46. The system's network should support high data transfer rates and reliable communication between components.
47. Implement comprehensive data backup and recovery mechanisms to protect against data loss.
48.  The system must operate highly efficiently and reliably, particularly during critical observation periods. This includes maintaining system integrity, accuracy in data collection and processing, and robust performance under various operational scenarios and environmental conditions
49. Adherence to relevant international and industry design, data management, and operations standards.
50. Delay times for the exchanges of control information must stay within specific time limits.
51. Commands can reply containing status information and data regarding instruments and telescopes.
52. Data in the form of video and voice data can be transferred to different processing units.
53. Access to control parameters, telescopes, or other uses significantly contributes to the control flow and may be logged at high rates for short periods(up to 200Hz).
54. Voice connectivity must be consistently available. 
55. Replies might contain status information and data concerning instruments and telescopes
56. Control information can be retransmitted.
57. The retransmission protocol has to be predictable.
58. Control parameters, telescope, and instrument information are available to all users of the Gemini 8m Telescopes.
59. Detector data must be acquired and stored in the most effective way technology will allow.
60. Intermediate storage of raw data in memory on different nodes and in different formats should be kept to a minimum.
61. There must be at least 2 copies of raw data at all times.
62. Transferring data should present the least amount of bottleneck
63. Raw data can be fast preprocessed into a preprocessed format without being stored.
64. Data formats have to be able to be transported between GEMINI and the home institutes of visiting astronomers in FITS format.
65. TV data concerning site monitoring and voice should be available at all operation facilities.
66. Astronomical information from sky field monitors, autoguider cameras, and sky monitoring devices should be available.
67. The operation of telescopes, instruments, and subsystems can be carried out at three different levels, with their parameters associated with each level.
68. Privileges are to be implemented in association with categories of users or the location of the user station.
69. Enforced protections should be indicated among users and the operational software.
70. Subsystems in different modes can check their compatibility.
71. Nodes of capacity will have the capability to run at all operation levels.
72. When the Gemini 8m Telescopes’s telescope is used in its normal observing mode, there will be a single operator node for the telescope and two data acquisition and instrument control nodes.
73. The system will provide for one auxiliary data acquisition and instrument control nodes when running in parallel.
74. The system can provide a single off-site data acquisition and instrument control node.
75. The system will provide for a single monitoring node and a single remote monitoring node.
76. The Gemini 8m Telescopes control software shall allow simultaneous operation up to six active control nodes and up to two monitoring nodes without appreciable degradation in performance.
77. The Gemini 8m Telescopes computers and software shall be capable of coping with the load of 10 active nodes.
78. A suitable combination of instruments can be changed by operations staff with privileges.
79. The user interface should be seen as a package that is callable by a large number of people.
80. The user interface tools should be portable across different computer hardware platforms.
81. The Gemini 8m Telescopes software should cover all aspects of control and data acquisition related to the telescope, instruments, auxiliary instrumentation, and the operational aspects, including online scheduling and rescheduling.
82. Data should be able to be monitored for quality as it comes in.
83. Standard reduction procedures should be available for primary on-line calibrations of the observed data.
84. Quick-look data processing should be provided on the Gemini 8m Telescopes, with procedures suitable for fast online data preprocessing.
85. Acquired data is made available as directly as possible in a common format, and additional data related to exposure and logging information are made available online simultaneously.
86. Quick-look should be usable within exposure sequences to provide results and feedback parameters to the control software in a programmed way without manual intervention. 
87. Near-line processing should be available for simple data reductions required for data integrity validation.
88. The LAN shall support most of the Gemini 8m Telescope system's internal communication needs.
89. Individual instruments must be able to run fully independently.
90. Switching to different configurations must be possible at any time with appropriate procedures.
91. There must be easy procedures to reconfigure the system when subsystems are modified or removed.
92. The number of main software packages must be kept to a minimum to facilitate maintenance but compatible with the need for the right modularity.
93. Commercial and public domain packages should be used whenever possible.
94. Existing software packages should be reused wherever possible
95. Existing software expertise should be consulted whenever possible.
96. All software that does not directly control specific hardware must be written as machine-independent, portable code.
97. At boot time, the Gemini 8m Telescopes software shall check the consistency of versions of all the various software components.
98. Table-driven software should be used whenever possible.
99. Changing system constants, such as arcseconds/bit for an encoder, shall not require recompiling but will be updated as part of system startup or modified during operation.
100. A maximum of 15 minutes per night or one night per month of downtime is allowed. 
101. retry procedures must be embodied in the software in case of error or failure
102. The error or failure has to be reported in a clear form, and the system shall put itself into a safe state whenever a safety aspect might be involved.
103. The system should be able to reconfigure itself in a different mode.
104. Range checking and validity checking shall be supported before the execution of any input command.
105. On-line pre-checking of the operational status of equipment should be done prior to sending critical or time-consuming commands. 
106. It must be possible to apply continuous monitoring to all subsystems on request, both when in operation and when idle, to check their operational status.
107. The system should be constantly monitoring active subsystems to be sure they are operating correctly before sending commands to each subsystem. This monitoring should continue on inactive subsystems.
108. The goal for recovery and/or reconfiguration is 5 minutes from the onset of the error condition to observing again.
109. All subsystem software is to include modules to aid in the maintenance and testing of the subsystem.
110. Simple mechanisms should exist for replacing a subsystem with its simulation. 
111. The Gemini system must be self-monitoring to invoke safety monitoring to prevent risk to people or damage to equipment. The software should be able to quickly bring the Gemini system to a safe state upon notification of such danger.
112. In the event that the risk persists, subsystems must be able to move themselves into safe states to protect people and equipment.
113. Safety protection must be applied whenever there is the risk that the actions of the control software could endanger people or cause damage to any Gemini 8m Telescopes subsystem
114. There should be security preventing the intrusion into the system by unauthorized users or users at unauthorized access levels.
115. The online databases can be considered part of this interface but are only accessible through their defined interfaces.
116. The software must be strictly modular, i.e., the functionality of a subsystem should correspond to that which belongs to that subsystem and only to that
117. The security and safety of the system should be guaranteed even in the event of failure of any component, including the higher-level software.
118. The software is developed by modularization and standardization techniques.
119. Real-time support at the IOC level
120. Workstations must match specified software standards and present a well-designed development environment.
121. The support from state-of-the-art systems allows the migration of development systems.
122. Reliability, manufacturer support, and upgrade capability of the development systems
123. Workstations must have at least 2GB of disk, DDS DAT cartridges for software transport, and CD-ROM for SUN OS and software upgrades.
124. Ability to handle increasing data volumes and user requests efficiently.
125. High-speed processing and response times under varying loads.
126. The system should be operational and accessible at all times.
127. Ability to continue functioning in the event of partial system failures.
128. Robust security measures to protect sensitive data and prevent unauthorized access.
129. Ensuring accuracy and consistency of stored data.
130. User-friendly interfaces and intuitive navigation.
131. Ease of updating, modifying, and extending the software.
132. Seamless integration with existing and future technologies and software.
133. Ability to run on different hardware and operating systems.
134. Efficient communication and operation with other systems and software.
135. Adherence to relevant legal and regulatory standards.
136. Effective backup and recovery procedures in case of major failures.
137. Capacity to adapt to changing requirements and environments.
138. Optimization for low energy consumption.
139. Minimized ecological footprint of the system's operation.
140. Ensuring the software is usable by people with a range of disabilities.
141. Adaptation of the software for different languages and regions.
142. Ease of diagnosing and resolving issues.
143. Facilitation of efficient and thorough testing processes.

ITCS431 Software Design and Development (2023)

# Use case diagram
![Alt text](https://m1r.ai/9/kay9q.jpg)

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

### Actor: Telescope operator
The on-site controller of the telescope and instruments. Telescope operators are responsible for ensuring the system’s integrity and functioning. Telescope operators also work with the observer to ensure that the science plan produces the best data.
- **Maintain accurate system functioning during observations**  
Telescope operators possess the capacity to periodically oversee the system's general performance, integrity, and safety. 

 - **Control the telescope**  
 The Telescope operator has the capability to issue telescope control commands as properly.

### Actor: Developer
Developers are responsible for designing, testing, configuring, and upgrading the subsystems.
- **Design, test, configure and upgrade subsystems**  
Developers are responsible for designing, testing, configuring, and upgrading the subsystems.

### Actor: Administrator
Administrators are responsible for high-level control of the Gemini system. They work with other users to regulate proper observation scheduling changes, maintenance, and system modifications.

- **Controll integrate system**  
Administrators possess the authority to iteratively implement system modifications as required.
- **Determine Appropriate Observation Scheduling Changes**  Administrators possess the authority to iteratively determine and implement suitable changes to the observation scheduling within the system.

- **Configure Maintenance downtime**  
Administrators are empowered to repeatedly ascertain and schedule maintenance downtime for the system as required.

