# Team members
1. 6488001 Napat Boongaree
2. 6488072 Pachanitha Saeheng
3. 6488081 Pittinunt Sirigittikul
4. 6488086 Chutweeraya Sriwilailuk
5. 6488099	Yotsapat	Tanprathumwong
6. 6488149	Kongphob	Wutthiumphol

| Actor               | Responsibility                                                                                        |
|---------------------|--------------------------------------------------------------------------------------------------------|
| Astronomer          | Uses the Gemini system for science data collection, develops a science plan, and may engage in interactive observing. The astronomer is the primary customer for the Gemini telescopes. |
| Science Observer    | Monitors data acquisition, validates data integrity, and ensures the science plan aligns with the astronomer's needs. |
| Telescope Operator  | Controls the telescope and instruments on-site, ensuring the integrity of the system and accurate functioning during observations. Collaborates with the observer and the science plan for optimal data quality. |
| Support             | On-site (or near-site) personnel responsible for system maintenance, including hardware and software. They handle the installation of subsystems and configuration changes. |
| Developer           | Designs, tests, configures, and upgrades subsystems to enhance the overall functionality of the Gemini system.|


# Chapter 2
Certainly! The functional and non-functional requirements in Chapter 2 can be categorized as follows:

## Functional Requirements:
### System Access and Control
1. The system should allow the developer to have full access to each subsystem in the test.
2. The system should allow the support team to have full access to all subsystems in the test and maintenance.

### User Interface and Controls
3. The system interface shall provide simple and safe controls for planning, monitoring, and observation activities.
4. The system must provide a user interface across all subsystems with different access levels presenting ‘look-and-feels.’

### Automation and Programming Environment
5. The system should allow monitoring of all subsystems and can detect and report unsafe conditions or errors.
6. The observing program must be fully automated, requiring minimal human interaction during the observation process.
7. The Gemini software should include a rich programming environment to support automation, be visually oriented, and easy-to-use for astronomers.

### Testing and Simulation
8. A full telescope simulator is required to enable astronomers to test observing programs for completeness, errors, and functionality.
9. All control software must support simulated use within the virtual telescope environment.
10. Software is needed to assist in object selection within an observing program and across multiple observing programs.

### Remote Monitoring and Operations
11. Remote monitoring is a necessary level of remote observing, complementing service observing and making the system friendlier for users.
12. Remote monitoring should be designed to be user-friendly, allowing remote users to pick and choose the information displayed on their screens.
13. Remote monitoring coincides to a large extent with multipoint monitoring, providing flexibility for users.
14. Remote users should be able to “pick and choose” the information that is displayed on their remote screens, allowing customization based on their preferences.
15. There is no requirement that the remote screen be a duplicate of the local screen, emphasizing independence in the remote user's display.
16. The remote keyboard will not affect the local user's environment, ensuring that remote input does not interfere with local operations.
17. A remote observer might need a real-time video and voice link with the operator in the control room.
18. The real-time video and voice link may involve the use of a portable video camera that the operator can position as necessary.
19. Service observing requires the capability to switch between telescope modes and instruments during the night.

### Transition between Modes and Instruments
20. The system should ensure smooth transitions between different telescope modes and instruments, minimizing disruptions during the switching process.

## Non-Functional Requirements:
### Safety and Responsiveness
1. The system must have easy control and quick response to unsafe conditions.
4. Every command must be accepted/rejected within seconds and before the corresponding action occurs.
5. Status display update must be within 4 seconds at local stations, except for certain functions such as telescope positions.

### Data Storage and Capacity
2. The system should be capable of a data capacity so great as to store 7 days of the largest instrument’s data load, the last 3 days of which must be available interactively from a hard disk or similar medium.
3. The system should store data from all instruments and detectors as compressed data, using a standard format.

### Observing Time and Queuing
6. The system should maximize the use of available observing time, allowing queuing of all possible observations with the currently available instruments.
7. The interleaving of observing programs should be transparent to individual observing programs.

### Remote Operations
8. The method used to restrict specific operations to remote sites should be dynamic, allowing for changes as needed.
9. Remote operations should be reliable and stable, ensuring that users can perform tasks without significant disruptions or differences in performance.
10. The system should be scalable to accommodate team observing with multiple observers at different remote sites.
11. Security measures should be in place to ensure that remote operations are conducted securely, especially when restricting specific operations to designated remote sites.
12. The hardware involved in remote operations should have sufficient bandwidth to support remote operations effectively.
13. The system should take advantage of commercially available protocols such as ISDN, TCP/IP, and the Internet to facilitate remote operations.
14. The chosen protocols should ensure interoperability with commonly used network technologies and standards.
15. The selected protocols should allow for efficient data transfer between the remote locations and the observatory.
16. The choice of protocols should be commercially available and cost-effective, aligning with budget considerations for the project.
17. The real-time video and voice link facility is assumed to be provided entirely by hardware and is beyond the scope of the Gemini software.
18. The real-time video and voice link should be efficient, providing clear and timely communication between the remote observer and the operator in the control room.
19. The hardware providing the real-time video and voice link should seamlessly integrate with the Gemini software and other components of the system.
20. The system should ensure efficient use of shared resources, considering the diverse nature of observing programs.


# Chapter 3 
## Functional Requirements:
### Data Transport and Acquisition
1. The system shall transport astronomical data between GEMINI and the home institutes of visiting astronomers in FITS format.
2. The system shall acquire and store raw data for quick look evaluations.

### System Configuration and Access
3. The system should express capacity in terms of nodes, defined as the number of workstations.
4. The software shall support access to the system from any user station.
5. Computers used at the Gemini 8m Telescopes site must meet altitude and humidity specifications.
6. Allow users to access the Gemini 8m Telescopes system from different stations without impacting functionality. The interface should be network-transparent.

### Telescope Control and Subsystem Management
7. The Telescope Control System should be capable of detecting and invoking parallel operation for control of telescope and enclosure subsystems.
8. Subsystems should have independent software installation and maintenance.

### Development and Testing Processes
9. The system shall be developed according to a structured and formally defined development model, as defined in [SMP] and [SCP].
10. The environment should provide tools and features for efficient coding and debugging processes, supporting developers in writing robust and error-free code.
11. The Software Test Plan (STP) shall include well-defined test procedures for various testing phases, such as component and integration testing.
12. Test plans must be created for all individual software packages and modules within the Gemini 8m Telescopes software.

## Non-Functional Requirements:

### Data Logging and Management
1. The system shall log control parameters, telescope, and instrument information at quite high rates for short periods (i.e. up to 200 Hz for some information).
2. The system shall interface and manage bandwidth costs to make TV data concerning site monitoring and voice available at a specific location.
3. The software should be compatible with different subsystems and be aware of the installed and operational subsystems at any given time.

### Standards and Procedures
4. Gemini 8m Telescopes standards must be defined for online software and the development environment.
5. System status parameters must be maintained to allow restarting the system and regaining the previous state.
6. The system should be capable of detecting and initiating parallel operations as needed.
7. The ability to reconfigure software in the event of actuator failure is desirable.

### Interface and Network
8. Ensure the interface works smoothly on various network locations.

#### Compliance and Documentation
9. The system shall adhere to the standards and procedures defined in the [SMP] and [SCP] documents.
10. The environment should support the portability of software, allowing it to be independent of the target hardware and easily adaptable to different platforms.
11. The testing procedures outlined in the STP should be traceable to the defined requirements.
12. Documentation should be kept up-to-date with any changes in the software or testing processes.


# Chapter 4 

## Functional Requirements:

### Telescope and Instrument Control
1. The software must enable control of telescope and instrument parameters.
2. Implementation of module selection must be logical, minimizing interfaces between modules.
3. All telescope, instrument, and detector control information must be available at any operational level.
4. Time-access critical information should be available in memory.

### Database and Data Access
5. The database must support both remote access and distributed data.
6. A measure of fault rates must be conducted during commissioning to establish baseline rates for system reliability monitoring.
7. The internal implementation of the database within the IOC must be based on EPICS (Experimental Physics and Industrial Control System).

### Remote Operations
8. The software should fully support remote operations, including observing, control of telescope, enclosure, and instruments, multipoint monitoring, remote monitoring, and remote access for testing, development, diagnostics, and maintenance.
9. There must be a security mechanism to control access to system features, potentially restricting certain operations to specific remote sites.
16. All operational capabilities found in on-site operations must be extended to remote operations, with some performance degradation due to WAN bandwidth considerations.

### Data Management
10. Astronomical data must be automatically stored in the Archive medium using external software.
11. Star catalogs should be available in Astronomical object catalogs through external software.
12. Telescope and instrument parameters should be distributed in databases across the IOCs for those systems.

### Monitoring and Reliability
13. Monitoring of fault rates during commissioning establishes baseline rates for system reliability.
14. Reliability and availability of the system should be maintained, considering WAN bandwidth constraints in remote operations.
15. The interface between software control packages is to be done via interface calls to the online database.

## Non-Functional Requirements:

### Maintenance and Scalability
1. The Gemini software must adhere to the maintenance philosophy described in the Software Management Plan (SMP).
2. The software should scale well as additional modules are added, maintaining a logical fashion in module selection.

### Performance and Documentation
3. The software should exhibit acceptable performance levels in both on-site and remote operations, with some degradation in the latter due to WAN bandwidth constraints.
4. Comprehensive documentation must be provided for the Gemini software, including detailed descriptions of internal database implementation and interface protocols.

### Compatibility and Security
5. The Gemini software must be compatible with the EPICS framework for internal database implementation.
6. Security mechanisms must be robust to ensure the integrity and confidentiality of data, particularly in remote operations.

### User-Friendliness and Reliability
7. The software should be user-friendly, facilitating easy implementation of table-driven applications using the online databases.
8. The software must exhibit high reliability, with fault rates measured during commissioning serving as a baseline for ongoing reliability monitoring.

### Data Access and Control
9. The online database must support distributed data, enhancing the software's support for remote access and operations.
10. All telescope, instrument, and detector control information must be accessible at any operational level, ensuring seamless control and monitoring capabilities.

These categories help organize the functional and non-functional requirements based on their functionalities and characteristics.

# Chapter 5

## Functional Requirements:

### Data Transmission and Examination
1. The subsystem must be equipped with direct command transfer, channel-based routing, and broadcast functionality for efficient data transmission and examination across the control system.
2. All commands must follow a specific structure with identification, source, target, opcode, and parameter set fields. The identification (Command_ID) must be unique for each instance, with a monotonically increasing portion acting as a timestamp for journaling and tracking.
3. The system must respond to general-purpose commands such as GetVersion, GetStatus, GetState, GetID, and GetConfiguration to obtain information about the state and configuration of subsystems.
4. Specific control commands, as described in the Gemini Software Design Description, must be supported to provide specific functionality during observation.
5. The system must support status queries (e.g., GetStatus) to obtain information about the operational state of subsystems, including readiness, busy states, and other specific status levels.
6. SetConfiguration must be supported to allow the downloading of configurations from the host to the target subsystem. Also, GetConfiguration must be supported to retrieve detailed configuration information, including internal settings and results of self-tests.
7. RunTest commands must be supported for subsystems to run self-tests and report the results.
8. SetLogging must be supported to set logging levels by the indicated subsystem.
9. Commands like OpenRoute, CloseRoute, ResetRoute, and TestRoute must be supported to establish, close, reset, and test routes for data communication within the system.
10. Commands like AwaitItem, SetCallback, and ClearCallback must be supported for communication among IOC-based subsystems.

## Non-Functional Requirements:
### Reliability and Scalability
1. Command transmission mechanisms (Direct, Channel, Broadcast) must be reliable and ensure the correct delivery of commands and data.
2. The system must be scalable to handle additional subsystems, channels, and routes as the Gemini system evolves.
3. Commands must be processed efficiently, and communication routes, especially in asynchronous communication, should not introduce significant delays.

### Documentation and Compatibility
4. Comprehensive documentation must be provided for constructing/deconstructing/routing command strings, and mappings of specific IOC commands between ASCII strings and EPICS channel access calls.
5. The system must be compatible with ASCII representations of commands within the OCS, ensuring interoperability.
6. Security measures should be in place to protect the integrity and confidentiality of transmitted commands and data.
7. Commands must be represented as ASCII strings, and the system should allow nesting using braces, ensuring ease of use and understanding.

### Time Synchronization and Error Handling
8. Time synchronization commands must be supported to ensure coordination among control subsystems.
9. The system must have robust error-handling mechanisms to handle unexpected situations and prevent system failures.

### Flexibility
10. The system should be flexible enough to accommodate different types of commands, including those specific to individual subsystems, as outlined in the Work Package Descriptions.

## ITCS431 Software Design and Development (2023)

# Uae case diagram
![Use case diagram - fah organ](https://github.com/ICT-Mahidol/Gemini-2023/assets/142656246/8753b411-a93b-41a8-8a94-61c098327365)

### User Actions

#### Astronomers
1. Can create a science plan.
2. Can submit a science plan to the system.
3. Should be able to inquire about the status of the telescope or any subsystem at any time.
4. Can collect science data.
5. Can test a science plan with interactive observing mode via a virtual telescope.
6. Can access the observing mode.

#### Science Observers
7. Have to validate a science plan in the system.
8. Should be able to transform a science plan into an observing program.
9. Have to submit an observing program to the system.
10. Have to send collected astronomical data to the astronomer.
11. Should be able to monitor the progress of science plan execution in the system.
12. Should be able to execute the approved plan.
13. Should be able to collect astronomical data in the system.
14. Have to validate the collected data.
15. Can manage the collected data in the system.
16. Should be able to review and adjust the program.
17. Must be able to create an observing program.
18. Should be able to monitor data acquisition.
19. Should be able to validate data integrity.
20. Can access the observing mode.
21. Can access the operation mode.

#### Administrators
22. Can access operation tables only in read mode.
23. Should be able to collaborate with users to determine observation scheduling changes and maintenance downtime.
24. Should be able to collaborate with users to determine appropriate system modifications.
25. Should be able to collaborate with users to determine scheduling changes.

#### Telescope Operators
26. Have the ability to monitor all subsystems.
27. Will be able to direct control of the telescope and instruments.
28. Are responsible for ensuring the integrity of the system.
29. Will be able to maintain function accurately during observation.
30. Can access operation mode.
31. Will be able to access the observing mode.
32. Will be able to monitor all sub-systems.

#### Operations Staff
33. Should be able to validate the observing program in the system.
34. Will be able to update the maintenance table.
35. Can advise observing astronomers.
36. Can monitor general performance and system safety.
37. Have to maintain procedures.
38. Can change the operational status.
39. Can enable direct interactive operation.
40. Should be able to supervise telescope operation.
41. Access direct control of physical units.
42. Have to grant user permission to telescope monitoring operation.
43. Can access operation tables in update mode.
44. Can validate observing program.
45. Should be able to conduct remote monitoring sessions.
46. Can perform actual data collection.
47. Can install special equipment and sub-system.
48. Can control telescopes and instruments.

#### Visitors
49. Should be able to install special equipment and sub-systems.

#### Supporter
50. Shall have access to testing mode.
51. Have the ability to install sub-systems.
52. Have to maintain configuration changes.
53. Shall have access operation mode.
54. Have to maintain the system, hardware, and software.

#### Developer
55. Will be able to update the maintenance table.
56. Are responsible for developing subsystems.

### System Authentication and Permissions
57. All users have to log in to the system first to grant user permissions.


