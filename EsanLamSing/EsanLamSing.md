# Team Members
| Student ID | Student Name              |
|------------|---------------------------|
| 6488051    | Purinat Pattanakeaw       |
| 6488124    | Sarttra Prasongtichol     |
| 6488125    | Phutthikanj Kitivoranondh |
| 6488133    | Sirasit Puangpathanachai  |
| 6488178    | Thanawat Jarusuthirug     |
| 6488217    | Pattaradanai Kaeodumkoeng |
# Identifying Actor
| Actor Name | Description |
|------------|---------------------------|
| Astronomer | This person is using the Gemini system for the collection of science data. The astronomer is the customer for the services provided by the Gemini telescope. The astronomer has worked out, with the Gemini system, a science plan for the collection of the data. This science plan may include interactive observation.|
|Science observer | This is the on-site person responsible for monitoring the data acquisition and validating the data integrity being collected for the astronomer, as well as ensuring that the science plan is functioning to the needs of the astronomer. |
| Telescope Operator | The on-site controller of the telescope and instruments. This person is responsible for ensuring the integrity of the system and for keeping the system functioning accurately during observations. The Telescope Operator works with the Observer and the science plan to produce as good data as is possible. |
| Support | On-site (or near-site) support personnel are responsible for the maintenance of the system, hardware and software, as well as the installation of subsystems and configuration changes. |
| Developer | Developers are responsible for the designing, testing, configuring, and upgrading of subsystems |
| Administrator | Administrators are responsible for high-level functional control of the Gemini system as an integrated system. They work with other users to determine appropriate observation scheduling changes, maintenance downtime, and system modifications. It is possible that a particular individual would fall into several of the categories. For example, it is not unusual for the astronomer to also be the science observer.  |

# Chapter 1
## Functional
1. The software used with the Gemini telescopes can be viewed as falling into the Developed software, Supported software, and External software
2. Developed software to be used in the Gemini telescope is non-commercial software developed for the control of the telescopes and instrumentation
3. Supported software to be used in Gemini Telescope is commercial or “public-domain” software used for telescope control and instrumentation
4. External software to be used with the Gemini Telescope  is any software available to the Gemini system that is not integral to the system.
5. Software that is embedded into hardware and that presents no software interface to the Gemini system is also considered external software and need not be considered further 
## Non-functional
1. The Gemini System Software shall be maintained under a version control system.
2. Software that is embedded into hardware and that presents no software interface to the Gemini system is also considered external software and need not be considered further 
3. Embedded software that does interface with the Gemini system via software is considered Gemini software and is subject to the requirements presented in this document.
4. All software will be maintained under a version control system and must include facilities for easy (nearly automatic) inclusion into the Gemini software environment.   
# Chapter 2
## Functional
1. The Gemini System software shall impose security and control through a series of access levels, which are classified into: Observation, Monitoring, Operating, Planning, Training, and Administrative.
2. Observing access level shall allow access for the collection of data and selection of parameters without direct control of telescopes and instruments.
3. Monitoring access level shall be an extension of the Observing access level with read-only restriction on the subsystem it is invoked in.
4. Operating access level shall allow for direct control of the telescopes and instruments.
5. Planning access level shall not allow for direct control of the telescopes and instruments but will allow for control of the virtual telescope simulator.
6. Testing access level shall allow full, direct control of any subsystems.
7. Administrative access level will be used only to retrieve information about system utilization, status, efficiency without direct control of any system.
8. The system’s observation commands shall be submitted through the User Interface and be queued for execution.
9. The system shall allow indirect control of the telescopes through a “scheduler program” or directly via commands.
10. The system shall treat all instruments as servers that respond to commands from the system.
11. The installed instruments shall operate as a subset of the existing instrument interface rather than being a separate system.
12. The visitor instrument interface shall support: acquisition of status information of instruments by other systems, input of observing sequences, and ability to offset the telescope position and focus
13. Monitoring shall exist both in the form of automatic displays of status information at different locations, and in the form of explicit access to the required status information from any point.
14. In the observation mode, interactive operation is supported through the Observatory Control System through an automatic sequencer.
15. Monitoring shall exist both in the form of automatic displays of status information at different locations, and in the form of explicit access to the required status information from any point. 
16. In the observation mode, interactive operation is supported through the Observatory Control System through an automatic sequencer
17. Queue-based observation mode is the primary mode of the Gemini Telescope which is entirely automated.
18. The queue-based observation system must support both flexible scheduling and scheduler.
19. The system shall support off-site remote operations.
20. It must be possible for a specific operation to be restricted to only specific sites.
21. The remote monitoring system shall allow users to pick information that shall be displayed on the remote screen. 
22. The syntax of control commands must be consistent across all systems.
23. All subsystems must respond to a common set of commands to test operational status, version, self-tests, etc.
24. Archiving of data is automatically done while observing and maintaining mode of operation to the Gemini Archive Subsystem before being sent to a central archive.
25. The system shall dynamically allocate resources as needed per user using Access Mode during log in to prevent unauthorized action.
26. Every software module shall have corresponding test specifications to check normality.
27. The control software shall also provide self-test sequences which will verify all subsystems present.
28. Subsystems must notify the user when faults occur.
29. If a subsystem fails, the remaining equipment in the environment must still be operable after restarting.
30. If a user station has a computer hardware failure, it shall be possible to transfer control from one user station to another using a simple software reconfiguration procedure.
31. The observing program shall allow observation that is automated and requires little human interaction.

## Non-functional
1. All requirements and modes of operations are available to all users unless explicitly stated.
2. The execution queue can be broken and rearranged.
3. The system shall support visitor instruments only if they are capable of operating as servers in the Gemini system.
4. The visitor interface shall support: coordinates transformation between the instrument and the Gemini system, archiving instrument data, and maintenance of operation tables e.g. filter lists...
5. Indepently of the location of users, they shall be able to access (according to their privileges) any part of the whole system with a simple logon and configuration operation. 
6. There shall be no differences between software working on-site and off-site.
7. The communication must be reliable with a uniform ACK/NAK protocol across all systems with handshaking occurring within 100 to 200 milliseconds
8. The system must be able to retain 7 days amounts of data generated by the largest instrument.
9. The data transmission uses a FITS format and contains all header information provided with the data.
10. The Gemini software shall not have restrictions on the number of simultaneous users.
11. All software defects must be logged and fixed as soon as possible after detection.
12. The system shall have improved reliability through fault recovery, exception handling, fail-safe checking etc.
13. Every software package should contain regression tests.
14. A fault notification must be specific into the origin and the problem.
15. A fault notification should be capable of being electronically logged.
16. There should be multiple levels of fault notifications to aid in tracking down issues.
17. All communication shall be based on the use of standard communication protocols where retry procedures are applied (a form of software redundancy) as part of the protocol.
18. There shall be no restrictions imposed by the software on any user. Only policy decisions such as access level, permissions, should prevent any user from accessing any part of the Gemini system from any local or remote station.
19. User interfaces should clearly reflect access modes and operational levels.
20. Commercial packages, off-the-shelf public domain software, and standards are to be used whenever feasible.
21. All Gemini subsystem packages shall include both a simulator module for the virtual telescope and user interface modules for the user interface environment  that the subsystem will be operating in.
22. All Gemini subsystem packages shall include modules for testing and diagnosis of the subsystem.
23. Gemini subsystems should be self-contained and autonomous as much as possible.
24. No subsystem shall make any assumption about its surrounding environment beyond that provided in the interface specification.
25. The observing program should be a visually-oriented environment providing a simple, easy-to-use interface to the astronomer.

# Chapter 3
## Functional
1. The system must be able to transfer control information in the form of commands and replies from users to telescopes and instruments.
2. All subsystems must provide control information on all controlled variables on request.
3. The system must be able to synchronize with the Time Reference System at the Gemini 8m Telescopes site.
4. The system should provide access to control parameters, telescopes, and instrument information for monitoring or other purposes.
5. All relevant information, including control parameters, must be available to the Gemini 8m Telescopes software.
6. Systems must also be able to restrict user access to such information.
7. GEMINI System must be able to transport astronomical data to the home institutes visiting astronomers in FITS format (as defined by NOST 100-1.0, “Definition of the Flexible Image Transport System (FITS)”, NASA Science Office of Standards and Technology).
8. The system must ensure that TV data related to site monitoring is available at all operations facilities.
9. There must be a normal operation mode system allowing a certain number of embedded tests, normally at a fairly high level. Monitoring is also done at this level.
10. There must be maintenance tables (for example, with instrument parameters) to be updated.
11. The system must allow the installation and testing of new packages or new releases. Any low-level test can be performed in this mode
12. The system must support further subdivisions within the levels that can be achieved by implementing privileges associated with categories of users or with the location of the user station (local or remote).
13. When the Gemini 8m Telescopes telescope is used in its normal observing mode, there will be a single operator node for the telescope and two data acquisition and instrument control nodes.
14. The system must support parallel execution of tests on instruments, even when the light beam is not present, allowing multiple nodes to operate simultaneously.
15. The system shall include one auxiliary data acquisition and instrument control node to facilitate additional operations even when the main instruments are not actively collecting data.
16. The system must support off-site observing modes by providing a single off-site data acquisition and instrument control node, located at either the Gemini 8m Telescopes Site Support or Base Facility.
17. The system shall include one supervisor node responsible for overall system monitoring. Additionally, the system must provide one local monitoring node and one remote monitoring node to allow users to monitor observing programs locally or remotely.
18. The Gemini 8m Telescopes control software shall allow the simultaneous operation of up to six active control nodes and up to two monitoring nodes (one local and one remote) without significant degradation of performance.
19. The system must incorporate automatic procedures for the startup and shutdown of both the telescope and instruments.
20. The automatic procedures must allow for the independent startup and shutdown of instruments without affecting the telescope's ongoing operation.
21. The system shall include reconfiguration procedures to facilitate changes in the observing environment.
22. Observing environments and related light paths must be dynamically definable during operations, without requiring a system restart.
23. The Gemini 8m Telescope software must cover all aspects of control and data acquisition related to the telescope, instruments, and auxiliary instrumentation.
24. The software should encompass all operational aspects of the Gemini 8m Telescopes, including online scheduling and rescheduling functionality.
25. The Gemini 8m Telescopes software must interface with external software, including:
•Commercial software integrated into the Gemini 8m Telescopes software (e.g., DBMS).
•Preexisting software used in the Gemini 8m Telescopes (e.g., image processing systems, star catalogs).
•Software associated with visitor instrumentation.
•Embedded software dedicated to hardware control, not communicating online with other Gemini 8m Telescopes software.
26. The system must allow the monitoring of the quality (image quality, spectral resolution, signal to noise, etc.) of astronomical data in real-time as it is acquired.
27. Standard reduction procedures should be available for basic online calibrations of observed data, facilitating quick-look analysis.
28. Quick-look data processing must be provided on the Gemini 8m Telescopes, supporting fast online preprocessing of acquired data.
29. Acquired data should be made available in a common format to support efficient quick-look analysis, and additional data related to exposure and logging information must be available online simultaneously.
30. Quick-look should be usable within exposure sequences to provide results and feedback parameters to the control software in a programmed manner, without manual intervention.
31. Near-line processing should be available for simple data reductions required for data integrity validation, removing instrument and observatory effects to aid observer decisions about further observing actions.
32. Off-line pixel processing for full data reduction should exist at the Gemini 8m Telescopes site, compatible with and adaptable to image processing software packages used by the astronomical community.
33. The output format of the Gemini 8m Telescopes data must be compatible with the Gemini archive requirements.
34. An online interactive access system to the data archiving system should exist, enabling Gemini 8m Telescopes users to access and retrieve data from the database interactively.
35. The system must provide computer access to star catalogs, allowing for the automatic selection of candidate guides and standard stars.
36. The Gemini 8m Telescopes software must be able to interface seamlessly with all commercial software packages available on the Gemini 8m Telescopes and integrated into its operation.
37. The software must integrate with a general database management system (DBMS) to store and manage operational information, including schedules, logs, problem reports, and maintenance information related to various pieces of equipment.
38. The LAN must support the majority of the Gemini 8m Telescopes system's internal communication needs, facilitating data transfer, control commands, and status information within the system.
39. The system shall include a Local Time Bus for the distribution of absolute and relative time signals.
40. The software must support observing astronomers who are physically present at the Gemini 8m Telescope site, allowing them to make use of the control room facilities for centralized support and coordination of their operations.
41. The software must support remote operations, enabling users, such as support staff, who might be on Cerro Tololo or in Hilo, to access and coordinate activities with the Gemini 8m Telescopes system.
42. Operational decisions, including privileges and priorities for different categories of users, as well as definitions of user capabilities, shall be determined based on user roles and responsibilities.
43. Remote operation must include remote monitoring from the Gemini 8m Telescopes base facilities, along with access tools for diagnostic and test use. The system should aim to support remote observation from the Gemini 8m Telescope base facilities.
44. Each instrument must possess the capability to operate fully independently, ensuring autonomy in its functionalities.
45. The upper layers of the telescope software at both telescopes must be consistently identical, even if hardware configurations differ.
46. The addition of new instruments should aim to introduce no modifications to already operational parts. Modifications should be confined to operational procedures and should not affect the bulk of the existing software.
47. The system must allow switching to different configurations at any time with appropriate procedures, ensuring flexibility in telescope operations.
48. Easy procedures must be in place to reconfigure the system when subsystems are modified or removed, ensuring adaptability to changes.
49. The system should prioritize the use of commercial and public domain software packages whenever possible to leverage established solutions and industry standards.
50. Existing software packages must be reused wherever possible to capitalize on established functionality and reduce redundancy.
51. Existing software expertise must be consulted whenever possible to benefit from established knowledge and best practices.
52. Online version control must be implemented to ensure the availability of the version control system for recovering/restoring versions at all times.
53. Table-driven software should be used whenever possible to avoid unnecessary compilations, promoting flexibility and ease of maintenance.
54. At boot time, the Gemini 8m Telescopes software shall check the consistency of versions for all various software components.
55. Retry procedures must be incorporated into the software to address errors or failures promptly. These procedures should aim to achieve online recovery whenever possible.
56. In the event of recovery failure, the system must generate clear and comprehensive error or failure reports. This reporting mechanism is crucial for identifying the root cause of the problem.
57. Whenever a safety aspect is involved, the system shall automatically put itself into a safe state upon recovery failure. This ensures the safety and integrity of the overall system.
58. The system must be capable of dynamic reconfiguration to continue observing in the event of a single non-critical subsystem failure. This reconfiguration may involve switching to a different mode if required.
59. Before the execution of any input command, the software must perform range checking and validity checking to ensure the input's correctness. This capability should be available ahead of time for preparing observing sequences and simulating observations.
60. Before sending critical or time-consuming commands, the system should perform online pre-checking of the operational status of equipment. Continuous monitoring of all subsystems, both during operation and idle periods, should be possible.
61. Recovery procedures must be in place to restart the system after an error or failure. The goal for recovery and/or reconfiguration should be set at 5 minutes from the onset of the error condition to resuming observations.
62. Active subsystems must be constantly monitored to ensure correct operation before sending commands. This monitoring should extend to inactive subsystems as well.
63. The software should support means of verification for input command checking, pre-checking, and continuous monitoring. This ensures the effectiveness of these processes.
64. All subsystem software must include modules designed to aid in the maintenance and testing of the subsystem. This includes a simulator providing reference behavior for each subsystem. Mechanisms should be in place for seamlessly replacing a subsystem with its simulation.
65. Subsystem software shall incorporate self-check levels, including:
•A. Monitor Level: Background tasks for operational subsystems, checking power supply levels, temperatures, and performance, and ensuring correct responses to commands. The OCS (Observatory Control System) is to be notified of any detected problems.
•B. Self-test Level: Each subsystem must provide a module for fully exercising all hardware and software components. This module should execute automatically during start-up and on-demand through the defined interface. Problems are to be automatically reported to the OCS via the defined interface.
•C. System Level: Software modules for testing the subsystem as an integrated part of the entire system. This software is executed on demand during the maintenance operation level.
66. The system must support repair by unit replacement, allowing for the substitution of entire units (e.g., an additional computer system) to address malfunctions or failures.
67. The maintenance process should facilitate the repair of units by module replacement. For example, allowing the replacement of a VME card in an IOC (Input/Output Controller) to address issues or faults at the module level.
68. The system must support repair by module replacement at a Gemini 8m Telescopes base facility during the day.
69. The system must facilitate module repair at a Gemini 8m Telescope base facility during the day.
70. The system should support different levels of maintenance, such as corrective, preventive, and predictive maintenance, providing flexibility to address various maintenance needs.
71. Specify and implement sparing plans for critical components, ensuring that an adequate supply of spare parts is available to minimize downtime during maintenance.
72. Incorporate functionality for conducting periodic testing of system components, ensuring ongoing performance monitoring and early detection of potential issues.
73. Design the system to support scheduled or preventative maintenance activities, allowing for systematic inspections and actions to prevent potential failures.
74. Define and incorporate support equipment into the maintenance plan, ensuring that necessary tools and resources are readily available for maintenance tasks.
75. The system is designed for attended or unattended operation, outlining requirements for user interaction or autonomous functioning.
76. The Gemini system shall possess self-monitoring capabilities to detect and mitigate potential risks to people or equipment.
77. Safety protection measures must be activated whenever there is a risk that control software actions could endanger people or damage any Gemini 8m Telescope subsystem.
78. the software will not allow unsafe actions; the command will be rejected
79. the software will detect unsafe areas and halt; the software will allow movement off of soft limits.
80. the software will halt if its watchdog has not been reset
81. limits; the software/electrical systems will allow movement off of hard limits
82. Hardware interlock will prevent both software and hardware from action - there will be no bypass of these systems
83. the mechanism cannot move beyond this point due to mechanical limit(s). In general hard stops will use dampers to avoid damage to equipment.
84. The Gemini 8m Telescopes software shall have the capability to rapidly bring the system to a safe state upon detecting potential danger.
85. During the functional specification phase, safety aspects shall be comprehensively analyzed.
86. The system, when operating in Engineering/Maintenance mode, must ignore directives from other systems while still providing status information for external use.
87. Security measures shall be implemented to prevent accidental command mix-ups from different users and parts of the system.
88. Intrusion prevention from the wide area network into the Gemini 8m Telescopes shall be ensured, especially protecting the astronomical database.


## Non-functional
1. Operations staff must have the necessary privileges to change the observing environment, enabling them to select suitable combinations of instruments.
2. The system must be adaptable to new hardware features and cost efficiencies expected to emerge over the next 5 to 10 years.
3. The project must have a plan in place for transitioning to new hardware standards when the currently chosen standard is no longer available.
4. The system must evaluate and choose hardware standards based on a cost analysis, considering that maintaining an existing hardware standard may become costlier than adopting a new one.
5. System should include Rick’s information about complexity criteria here, so show that we are aiming to achieve as simple a system as we can.
6. No request for information shall produce a delay of control activities or locking, even if the corresponding equipment is not available or faulty.
7. System’s Delay times for exchanging control information must stay within precise time limits.
8. Access to control parameters may be logged at high rates for short periods (e.g., up to 200 Hz for certain information).
9. Information should be accessible to all users of the Gemini 8m Telescopes, with restrictions only on updating.
10. Operational overheads must be minimized, to maximize actual observing times.
11. Intermediate storage of raw data in memory on different nodes and in different formats should be kept to a minimum.
12. Effectiveness should be evaluated in terms of cost, space requirements, longevity, and speed. This shall lead to the definition of a Gemini 8m Telescopes standard, used on all instruments.
13. The link chosen to transfer data should represent as small a bottleneck as possible for data acquisition.
14. The availability of TV data at a specific location depends on interfacing capabilities and bandwidth costs.
15. Voice connectivity, perhaps point to point, be available on a permanent connection.
16. It is anticipated that the majority of parameters at this level will be accessed by operations and development staff.
17. It shall be possible to update all non-protected parameter values, i.e. those not used by operations at observing level.
18. Access to this level will be extremely limited.
19. The operational software should indicate clearly to users the current operation level and check the compatibility between subsystems in different modes.
20. Protections must also be enforced among users.
21. In practice, the expected maximum number of active nodes is approximately three due to operational and facility constraints. However, the Gemini 8m Telescopes computers and software must be capable of handling a load of up to 10 active nodes, should such a scenario arise, without appreciable degradation in performance.
22. Every command sent to the system must receive a positive or negative acknowledgment before the corresponding action takes place.
23. The system should implement a homogeneous user interface across all active stations, ensuring consistent setups and commands for operational and maintenance purposes.
24. User interface tools must be applied uniformly throughout the project to provide a consistent 'look and feel' for the Gemini 8m Telescopes user interface.
25. The user interface should be network transparent, allowing users to access it from different points without any impact on its functionality.
26. The user interface package must be callable from a large number of stations, enabling users to access the system from various points.
27. User interface tools shall be based on standards to ensure portability across different computer hardware platforms (Portable User Interface Toolkit).
28. The user interface tools' standards should be portable to facilitate migrating existing and future Gemini systems to different hardware platforms as needed.
29. The current intent is to limit the selection of computer hardware platforms to as few as is practical, ensuring ease of maintenance and system management.
30. There should be standard interfaces between main processors, control electronics, and microprocessors.
•main processors - these are the computers with which the user interacts
•control electronics - these are the computers controlling the instruments
•microprocessors - these are computers embedded in the instrument (for instance a DSP or transputer required for array control functions, or special purpose controllers for
the primary mirror support actuators).
31. Standard interfaces to the control electronics shall be available, in the form of:
•standard bus systems
•a standard set of interface cards to be used on all the subsystems and instruments
•a standard software skeleton running on the control electronics
32. A standard software skeleton, running on the control electronics, should be established to streamline software development and maintenance.
33. The standard software must meet real-time requirements and offer drivers compatible with standard electronics used across all Gemini 8m Telescopes software subsystems and instruments.
34. The interfaces between Gemini 8m Telescopes software and external software must be clearly defined and documented.
35. Quick-look analysis should be synchronous, ensuring timely results and feedback within the exposure sequences.
36. Data acquisition takes precedence over near-line data reduction, emphasizing the priority of acquiring data during observations.
37. The specific on-line (quick-look) software development should be considered a subset of the development for the off-line data reduction system to minimize duplication of development effort.
38. The LAN must be capable of dealing with both the data bandwidths required (at peak and on average) and the required response times and synchronization needs.
39. The network must support global synchronization needs, including universal time synchronization, with the required accuracy
40. The network must enable the collection and transfer of raw astronomical data for archiving or remote access, with capacity specifications
41. LAN and WAN interfaces shall be homogeneous and based on standards, allowing for migration to different media if required during the project's life.
42. A clear hierarchical model must be implemented for maintenance reasons and hardware independence, supporting the separation of logical and physical layers following the ISO/OSI model.
43. Network redundancy should be considered in the design phase to increase reliability and security, particularly for control information.
44. Violation of the hierarchical nature of the system, such as peer-to-peer connectivity and bypassing the hierarchy, should be limited and constrained:
* Peer-to-peer connectivity should only be used to overcome demonstrated performance problems.
* Bypassing the hierarchy should only be used for the transmission of status information or bulk data, not control flow.
45. Enabling access from any user station should greatly simplify the coordination problem posed by the large number of simultaneous users, as described in the Capacity requirements.
46. The system must minimize the number of main software packages to facilitate maintenance while maintaining an appropriate degree of modularity.
47. All software that does not directly control specific hardware must be written as machine-independent, portable code. Even for microprocessor software, the code should be hardware independent, allowing for a later choice of the target microprocessors.
48. Strict checking should be applied to preserve maintainability and ensure the reconfiguration of the system is done with accuracy and reliability.
49. The system design should have supportability influence design.
50. System must be able to provide support at minimum cost
51. System must be able to handle personnel availability and work hour constraints
52. System must be able to handle personnel skill level constraints
53. System must be able to operate at minimum cost
54. System can target failures correctable at each maintenance level
55. System can reduce allowable downtime at site
56. System can reduce turnaround time to fix and maintain system
57. System met standardization requirements
58. The system shall have a comprehensive maintenance planning process to strategically schedule and manage maintenance activities.
59. A robust manpower and personnel supply support system shall be established to ensure an adequate workforce for maintenance operations.
60. The system shall define and provide necessary support equipment required for maintenance tasks to enhance operational efficiency.
61. Maintenance activities shall be supported by accurate and up-to-date technical data, ensuring the availability of necessary information for troubleshooting and repairs.
62. A comprehensive training program and support system shall be implemented to ensure maintenance personnel are adequately trained and equipped for their roles.
63. Adequate computer resources support shall be provided to facilitate data management, analysis, and other technical aspects of maintenance activities.
64. The system shall have dedicated facilities to support maintenance operations, providing a suitable environment for equipment inspections, repairs, and upgrades.
65. Provisions shall be in place for proper packaging, handling, storage, and transportation of components and equipment to and from maintenance locations.
66. The system's design shall include interfaces that facilitate maintenance, ensuring accessibility, ease of disassembly, and efficient component replacement.
67. The total system downtime due to failures, encompassing mechanical, electrical, and software components, must not exceed 2%, with a goal of 1% downtime. This translates to a maximum of 15 minutes per night or 1 night per month.
68. The software and controls must adhere to stringent MTBF requirements to ensure the reliability of the system and meet the specified downtime goals.
69. The software and control components must have a low MTTR to facilitate swift recovery and minimize downtime in the event of failures.
70. During commissioning, a measure of fault rates must be conducted to establish baseline rates for ongoing system reliability monitoring.
71. Measurable and realistic reliability needs must be defined, including performance criteria for the system. Clear definitions of failure, conditions of use, and environments in which the system operates should be provided.
72. Specify the period of time during the system's life for which these robustness and reliability features should be maintained and monitored.
73. Maintenance of commercial software (Solaris, VxWorks) used by this work package is the responsibility of the WPR (Work Package Responsible), and the associated maintenance costs are not covered by the work package budget.
74. Community software support (EPICS) is available nominally free of charge through normal release and bug-fix procedures used in the community.
75. Maintenance activities, including repairs or replacements, should be conducted at the contractor/vendor's site.
76. The system must aim to minimize downtime resulting from maintenance activities, ensuring that the impact on system availability is kept to a minimum.
77. Maintenance processes should be designed and executed with the goal of minimizing overall maintenance costs, taking into account labor, materials, and any associated expenses.
78. The system should be designed to require a minimal number of personnel with specific skill levels for effective maintenance, optimizing resource utilization.
79. Efforts required to perform maintenance tasks should be minimized, streamlining processes and reducing the complexity of maintenance procedures.
80. The system must incorporate measures to minimize errors during maintenance operations, enhancing the overall reliability and effectiveness of maintenance activities.
81. Maintenance processes should be designed to avoid inducing failures or issues within the system, ensuring that maintenance activities do not compromise the overall integrity and performance of the Gemini 8m Telescopes.
82. The system design must accommodate constraints related to the availability, skills, and work hours of maintenance personnel.
83. Establish specific turnaround time objectives for maintenance activities, setting the maximum acceptable time for completing maintenance tasks.
84. Define criteria and decision-making processes for determining whether components should be repaired or discarded, considering factors such as cost-effectiveness and system performance.
85. The acceptable operating hours for the system, considering factors such as daily, weekly, or seasonal variations in usage.
86. The acceptable downtime limits or target availability levels, ensuring that the system meets reliability and performance expectations.
87. The environmental conditions under which the system is expected to operate effectively, including temperature, humidity, and other relevant factors.
88. The acceptable average time required to repair the system, subsystems, and individual components at each maintenance level.
89. The maximum allowable time for repairing the system, subsystems, and individual components at each maintenance level.
90. The annual hours allocated for preventative maintenance activities, ensuring the system's continued reliability.
91. Establish that all equipment should support a programmed adjustment and maintenance interval of 30 days or longer to ensure optimal performance and reliability.
92. The Gemini Software shall be designed to minimize stress effects and fatigue among users during extended usage.
93. The software shall incorporate feedback mechanisms to provide clear information on the successful completion or status of specific tasks.
94. Gemini Software interfaces shall be designed to facilitate effective interaction between users and the system, ensuring a user-friendly experience.
95. The software shall implement procedures that are intuitive and easy to understand, promoting user-friendly interactions.
96. Gemini Software design shall account for varying user training and experience levels, providing interfaces suitable for users with different levels of expertise.
97. The software shall facilitate effective interaction and collaboration among team members, supporting seamless teamwork.
98. Gemini Software design shall consider aspects of management and organizational behavior to align with broader operational requirements.
99. The system shall ensure freedom from conditions that can cause death, injury, occupational illness, or damage to or loss of equipment or property.
100. The system shall assess and express the possibility of a mishap in terms of hazard severity and hazard probability.
  
# Chapter 4
## Functional
1. EPICS software components (Hardware) must be used to create the control system.
2. The system must include an OPI Operator Interface, an IOC Input Output Controller, and a LAN Local area network.
3. The EPICS system must support Channel Access, Record Support, Device Support, and Device Drivers.
4. The system must support IOC Database and IOC SNC programs.
5. The system must support Other OPI CA Clients.
6. The system must support Host-based Development Tools.
7. The system must support new devices such as PMAC, VMIC5578, and BANCOMM.
8. The system must support files associated with OPI Channel Access Tools.
9. The EPICS system must provide network transparent communication between a Channel Access client and an arbitrary number of Channel Access servers.
10. The EPICS system must support four types of database scanning: Periodic, Event, I/O Event, and Passive.
11. The EPICS system must provide a number of OPI based tools, including MEDM, DM Display Manager, ALH Alarm Handler, AR Archiver, Sequencer, and other OPI CA clients.
12. The EPICS system must support the creation of a run time database for an IOC using tools such as DCT Database Configuration Tool and CAPFAST and GDCT Graphical Database Configuration Tools.
13. The EPICS system must support the creation of display list files using the EDD Display Editor.
14. The system must use modularization and standardization techniques
15. The system must provide real-time support at the IOC (Input/Output Controller) level
16. The system must operate on a UNIX System V, Release 4 development environment
17. The system must maintain configuration, logging, maintenance schedules, and subsystem documentation in a commercial relational database
18. The system must utilize workstations that conform to specified software standards
19. The system must be developed following the Ward/Mellor approach
20. The system's GUI must be developed using X-windows (version 11, release 5 or 6) and Tcl/Tk as the principal language
21. The system must constantly monitor both active and inactive subsystems
22. The system must support standard ARPA services (telnet, FTP, SMTP, etc.), NFS, RPC, IPC, and the Unix socket interface library in its communication software
23. The system's installation software must be based on Unix (Solaris 2.3 or above)
24. The system must use the DARPA TCP/IP communication protocol over LANs and WANs for communication hardware independence
25. The system must establish baseline rates for system reliability monitoring during commissioning

## Non-functional
1. The EPICS developers must have advanced C/C++ programming techniques, UNIX internals, VxWorks internals, real-time programming techniques, Motif application development skills, and networking skills.
2. The EPICS system must be evaluated in terms of the specifications given to reduce life-cycle costs and maintenance efforts.
3. The communication hardware must meet the data flow requirements and software protocols defined in the document.
4. The control LAN must be based on Ethernet IEEE 802.3.
5. The backbone LAN cannot be Ethernet because of bandwidth requirements. A FDDI system is recommended for the backbone LAN.
6. Interlock connections must be provided for all critical subsystems.
7. EPICS developers must have knowledge of VME and other I/O electronics, EPICS Database design techniques, SNC programming, and basic knowledge of UNIX and VxWorks as development environments.
8. EPICS developers must be able to differentiate between the two classes of EPICS development work: Internals and Applications.
9. The EPICS system must be flexible and adaptable to changes in technology.
10. The EPICS system must be evaluated in terms of life cycle constraints discussed in the Gemini Software Management Plan.
11. EPICS developers must have the ability to interface pre existing software systems to the channel access library.
12. The EPICS system must be able to efficiently access the database using database access routines
13. The system should monitor warning message rates to indicate maintenance needs.
14. The development environment selection is based on productivity, development tools, software and hardware independence, industry standards, and support for distributed environments.
15. The system includes a maintenance philosophy with scheduled preventative maintenance as per the Gemini Design Requirements Specification.
16. Development workstations must adhere to specific software standards and support necessary communication interfaces and compatible data formats.
17. The system requires defined recovery procedures for inoperative subsystems, including automatic command retries for common issues.
18. Software development should follow a formally defined model, like the Ward/Mellor approach, aligning with system goals and established practices.
19. Error logging must provide detailed information for tracing issues back to their sources, with tools available for detailed error analysis.

# Chapter 5
## Functional
1. All commands contain the same general structure: Identification: Command_ID ,Source, and Target
2. The Command_ID will be an identification that is unique to that specific instance of each command.
3. For Instruction includes Opcode and Parameter set
4. General Purpose Command presents the “generic” commands that all Gemini systems must respond to.
5. Gemini System have Status Command where “status” queries used to obtain information about the state of the subsystem.
6. Control Commands” common to all Gemini systems to provide specific functionality during observing.
7. GetVersion is the command where The subsystem returns its version identification as a string value.
8. GetStatus is the command where The subsystem reports its current status as one of:
DOWN - the subsystem is not operational 
BOOTED - the subsystem has been booted, but not yet configured 
CONFIGURING - the system is in the process of configuring (Steven). 
CONFIGURED - the subsystem is configured, but not yet initialized 
INITIALIZING - the subsystem is doing initialization actions 
RUNNING - the subsystem is running at observing level 
MAINTENANCE - the subsystem is running at maintenance level 
SIMULATION - the subsystem is running in simulation mode 
DISABLED - the subsystem is functional, but has been commanded to ignore control commands 
SHUTDOWN - the subsystem is in the process of shutting down 
LOCKED - an interlock exists on this subsystem. 
9. GetState The internal state of the subsystem is returned as one of: 
READY - the subsystem is fully operational, but currently idle. 
BUSY_ON command - the subsystem is working, and currently processing the indicated command. 
NOT_READY - the subsystem is not responding to commands at this time. A GetStatus command can be used to determine the current status.
10. GetID is the command where The subsystem reports its unique identification tag.
11. GetConfiguration is the command where Detailed configuration information is provided. This configuration information includes details of any settings internal configurations (filters, positions, etc.) and, if requested, the detailed results of any self-tests.
12. Generic commands affect the behavior of a subsystem independently of the specific task of that subsystem.
13. SetStatus is the command The target subsystem is to enter the state associated with the specified status argument.
14. SetConfiguration This command directs the downloading of a configuration from the host to the target subsystem.
15. RunTest is the command where The subsystem runs a self-test and reports the result as one of: 
OK - the subsystem has detected no problems, it is running within specifications         
BAD - the subsystem has detected problems that prevent its successful operation 
WARNING - the subsystem has detected a problem that may prevent it from operator
16. SetLogging is the command where Logging by the indicated subsystem is set to occur at the specified level.
17.  Communication via a route is typically asynchronous, with commands available to establish synchronization as needed. 
18. OpenRoute A route of the indicated class is being established for some item. The command includes sufficient information on the route to permit the IOC to communicate through the route
19. CloseRoute A previously-opened route is being closed. Modules at either end of the channel are notified and take appropriate action.
20. ResetRoute The route is to be reinitialized. Modules receiving this command are to flush buffers associated with this route and reset operating parameters to initial conditions. 
21. TestRoute A test message is transmitted across the route. All receivers on the route are to respond with an identification.
22. AwaitItem The module sending this command is blocked until information is received via the indicated route, or a timeout occurs. 
23. SetCallback A callback is established to process data across the indicated route.
24. ClearCallback A previously established callback is removed.
25. IOC commands are processed by the IOC subsystem.
26. IOC crates in the Gemini system have local databases.
27. Under the Gemini control system, it is expected that the majority of subsystem control is accomplished through these databases
28. LocateItem If the IOC local database contains the requested item, it responds with an identification sufficient for establishing a route to that item. The LocateItem may be broadcast through the IOC network.
29. GetValue The value of the specified item is obtained.
30. PutValue A value is transmitted for the specified item.
31. StartStream A stream of data is transmitted through the indicated route. The IOC system continues to transmit data values until a StopStream command is received. 
32. StopStream The indicated data stream is terminated. 
33. SetEvent An event is established as a monitor of some database entry. Appropriate changes to that entry are to result in the indicated event being transmitted.
34. ClearEvent A previously set event is terminated
35. Remote DB access is accomplished using the same communication and database access commands as given above.
## Non-functional
1. There are several means of transmitting commands and data across the Gemini system.
2. A command source may directly specify the target subsystem.
3. Commands and data may be routed through a channel.
4. The channel mechanism requires that some (unknown to the source) target subsystem has been attached to the channel as the target.
5.  Some commands and data signals are simply broadcast across the control system.
6. Communication of information is similar across all systems in the Gemini controls network.
7. Instances of this communication is via routes, which may be direct channels, intelligent channels, or broadcasts.
8. The 'route' may be a specific subsystem, channel, or broadcast. -NFR
9. Some subsystems may need to obtain information from other systems within the Gemini control system.
10. Time synchronization is commonly required among control subsystems - NFR
11. Fields within the command are labeled and nesting is permitted using braces ({, }).
12. Within the OCS, all commands are represented as ASCII strings.
## ITCS431 Software Design and Development (2023)
