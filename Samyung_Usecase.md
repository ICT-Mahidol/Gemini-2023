# Team Members
1. 6488036 Krittin Kumthornthip
2. 6488075 Jirayu Saejiam
3. 6488092 Thanaphat Sumrith
4. 6488095 Panyaporn Suwannasit
5. 6488123 Kitiphum Mueangthongkham
6. 6488175 Penpitchapa Pantaraksakul

# Use Case
### A Use Case Diagram
![Use Case Diagram1](https://github.com/ICT-Mahidol/Gemini-2023/assets/94012979/f41d5dcf-a174-4d50-b52a-63b339884383)

### A Short Description
#### Actor List
1. **Astronomer:** For the observation flow, astronomers are an external party. They want to use Gemini for research purposes  i.e. shooting photos of the stars, sky, and galaxy. They create a science plan ⇒ Test a science plan via virtual telescope and interactive observing mode ⇒ Submit a science plan to the system ทำอาราย
2. **Science Observer:** This is the on-site person responsible for monitoring the data acquisition and validating the data integrity being collected for the astronomer, as well as ensuring that the science plan is functioning to the needs of the astronomer
3. **Telescope Operator:** A Telescope Operator is a specialized professional responsible for the remote control and management of astronomical telescopes and associated instruments
4. **Support:** Support personnel are in charge of taking care of the system, including its hardware and software. They also handle tasks like installing subsystems and making configuration changes to ensure everything runs smoothly.
5. **Developer:** Developers are responsible for the designing, testing, configuring, and upgrading of subsystems.
6. **Administrator:** The Administrator is responsible for monitoring the system’s overall management and smooth operation. This role is crucial in managing efficiency and strict security, ensuring that the system is both simple to use and safe. This position serves as the central point for many system operations between user roles.

#### Use Case List
1. **Log Activities:** Users can log their activities, such as initiating observations, accessing data, and controlling instruments, to maintain a comprehensive record for auditing and analysis purposes.
2. **Communication:** The system enables seamless communication between users involved in telescope operations, allowing them to exchange information, coordinate tasks, and address any issues that may arise during observations.
3. **Request Interactive Observation:** Astronomers can submit requests for interactive observations, specifying parameters and criteria for the telescope to follow during real-time observations.
4. **Access and Analyze Data:** Authorized users can access observational data collected by the telescope and perform analysis using integrated tools for research and discovery.
5. **Control Telescope Remotely:** Users can remotely control the telescope, adjusting its position, focus, and other parameters to optimize observations based on real-time conditions.
6. **Submit Schedules:** Astronomers can submit observation schedules, allowing the system to automate the telescope's activities based on predefined plans.
7. **Define Plans and Observations:** Users can create detailed observation plans, defining specific targets, timeframes, and instrument configurations to streamline the observation process.
8. **Monitor System Levels:** The system continuously monitors various levels, including power, temperature, and equipment status, ensuring the telescope operates within optimal conditions
9. **Prevent Conflicting Actions:** The system employs conflict resolution mechanisms to prevent overlapping or conflicting actions, ensuring smooth and efficient telescope operations.
10. **Distinct Access Modes:** Users are assigned distinct access modes based on their roles, allowing for controlled access and operations to maintain security and prevent unauthorized actions.
11. **Secure Transitions:** The system ensures secure transitions between different operational states, preventing unauthorized access or changes to critical settings.
12. **Provide Updates and Notifications:** Users receive real-time updates and notifications about the status of ongoing observations, system health, and any relevant alerts.
13. **Alerts and Conflict Resolution:** The system generates alerts for potential issues and employs conflict resolution mechanisms to address conflicts or anomalies in the operations workflow.
14. **Initiate and Manage Transitions:** Authorized personnel can initiate and manage transitions between different observation modes or states, ensuring flexibility in the telescope's operation.
15. **Control Instruments:** Users can control and configure various instruments attached to the telescope, tailoring their settings to specific research requirements.
16. **Auditing Purposes:** The system maintains detailed logs of all activities performed within the telescope network. This includes user actions, configuration changes, and system events. Auditors can review these logs to ensure compliance, investigate incidents, and trace the history of operations.
17. **Authenticate and Verify Roles:** Robust authentication mechanisms verify user roles, ensuring that only authorized personnel have access to critical functions.
18. **Granting Access:** Providing secure and controlled access for different user roles, including Astronomers, Science Observers, Telescope Operators, Developers, and Administrators. Access permissions are determined based on authenticated roles and the current operational level/access mode.
19. **Transfer Control Information:** Control information can be securely transferred between different users or roles to facilitate collaboration and handovers during extended observation sessions.
20. **Implement Safeguards and Security:** The system incorporates multiple safeguards and security measures to protect against unauthorized access, data breaches, and other potential risks.
21. **Prevent Conflicts:** Conflict prevention mechanisms are in place to avoid scheduling conflicts, resource clashes, or any other issues that may impact the continuity of observations.
22. **Distinct Access Modes and Control:** The system allows administrators to define distinct access modes for astronomers based on their roles (e.g., researcher, observer, administrator). 
23. **Nodes Control:** The system allows administrators to remotely configure and control individual nodes within a distributed telescope network. This includes adjusting the parameters of each node, such as telescope orientation, focus, and instrument settings, ensuring coordinated and synchronized observations.
24. **Nodes Monitoring:** The system continuously monitors the health and performance of each node in the telescope network in real time. This includes tracking temperature, power consumption, and system status. Any deviations from predefined thresholds trigger alerts for immediate attention.
25. **Conformance to Standards:** The system adheres to industry standards (e.g., ASCOM, FITS) for telescope control and data formats. This ensures compatibility with other observatories, telescopes, and astronomical tools, promoting seamless collaboration and data exchange.
26. **Review Procedures:** Users can review and refine observation procedures based on past activities and outcomes, contributing to continuous improvement in operational efficiency.
27. **Define Interfaces:** The system provides well-defined interfaces for integration with other astronomical tools and databases, fostering interoperability in the broader astronomical community.
28. **Prioritize Safety Measures:** Safety measures are prioritized to protect both the equipment and personnel involved in the telescope operations, minimizing the risk of damage or accident
29. **Standard Software and Database Development:** The system is built using industry-standard software development practices and databases to ensure reliability, maintainability, and scalability.
30. **Record Information during Observations:** Relevant information, including environmental conditions, instrument configurations, and observational data, is automatically recorded during each observation for later analysis and documentation.
31. **Implement Security Measures:** Stringent security measures are implemented to protect against cyber threats, unauthorized access, and data tampering.
32. **Remote Monitoring and Access:** Authorized users can remotely monitor and access the telescope system from anywhere with internet connectivity, providing flexibility and accessibility.
33. **Adhere to Maintenance Philosophy:** The system follows a proactive maintenance philosophy, conducting regular checks and updates to ensure the telescope's reliability and longevity
34. **Subsystem Maintenance Checks:** Routine maintenance checks are performed on individual subsystems to identify and address any issues before they impact overall system performance.
35. **Provide Control Information:** Users can access comprehensive control information, including system status, logs, and reports, to facilitate informed decision-making and troubleshooting.
