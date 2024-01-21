# Team members
#### 1. 6488077 Thanat Sathapornwatthanakul
#### 2. 6488121 Hao Huang
#### 3. 6488143 Nichapat Thumrongpowarat
#### 4. 6488155 Pengkai Kong
#### 5. 6488171 Sui Zhou
#### 6. 6488180 Sukan Huang

# Functional
### 4.3.2 Gemini Breakdown of Tasks
1.	Support for new devices including PMAC, VMIC5578, and BANCOMM is required as part of the SIC work package.

2.	The OCS may require a CA client that can implement the OCS Attribute/Value protocol.
3.	The DHS may require a CA client capable of gathering logging information, possibly utilizing EPICS AR or AR_cmd task.

4.	A database for the IOC must be maintained.

5.	SNC programs related to the IOC must be supported.

6.	The file associated with OPI Channel Access Tools must be supported, including MDM.adl display definition files, PvWave/IDL scripts, AR request files, ALH alarm configuration files, etc.

### 4.3.3 GEMINI Definitions
7. Development of client and server software, scanners, and monitors.

8.	Work-related to supporting records, devices, and the development of drivers.

   9. Development of additional CA clients.

10. Development or maintenance of the database associated with the input/output Controller.
11. Development or support of SNC programs related to IOC or OPI.

Files associated with OPI Channel Access Tools: This includes the creation or management of files necessary for OPI Channel Access Tools. 

### 4.3.4 Required Developer Skills
12. Development of client and server software, scanners, and monitors for Channel Access.

13. Support for creating and managing the EPICS database.

14. Development and support of SNC programming.

15. Utilization of standard EPICS OPI tools.

16. Development skills in advanced C/C++ programming, UNIX internals, VxWorks internals, real-time programming, Motif application development, and networking with TCP/IP and UDP/IP sockets.

### 5.1 Command Routing
17. Ability for a command source to directly specify the target subsystem.

18. Capability to route commands and data through a channel, including intelligent channels 
that can convert data forms during transmission and connect multiple sources and targets.

19. Functionality for broadcasting commands and data signals across the control system, allowing subsystems to respond to or ignore the broadcasts, such as a Run Test or Shutdown command.

### 5.2 Command Structure
20. The system must generate a unique Command ID for each instance of a command.

21. The system must include Source and Target fields for each command to identify the originator and recipient.

22. The system should be capable of executing commands which contain an Opcode and a set of Parameters.

### 5.3.1 General Purpose Commands
23. The system must provide a GetVersion command that returns the subsystem’s version identification as a string value.

24. The system must provide a GetStatus command that reports the subsystem’s status from a predefined set of statuses.

25. The system must provide a GetState command that returns the internal state of the subsystem as READY, BUSY or NOT READY.

26. The system must provide a GetID command that reports the subsystem’s unique identification tag.

27. The system must provide a GetConfiguration command that returns detailed configuration information of the subsystem.

### 5.3.2 Generic Commands
28. The system must be able to change the state of a subsystem to a specified status such as SIMULATION or SHUTDOWN.

29. The system should be capable of downloading and applying configuration settings to a subsystem from a host system.
30. The system must provide the functionality to execute self-tests on subsystems and report the results as OK, BAD, or WARNING.

31. The system must support enabling and setting the level of logging for individual subsystems.

### 5.4 Data Communications
32. The system must be able to open a communication route for specified items.

33. The system should provide a means to close a previously opened route.

34. There must be a feature to reinitialize a route, which includes flushing buffers and resetting operating parameters.

35. The system should have the capability to send test messages across routes and receive identifications in response.

36. The system must allow for setting up callbacks to process data across a route.

37. The system should provide functionality to remove previously established callbacks.

### 5.5.1 Local Database Access
38. The system must be able to locate an item in the IOC local database and establish a communication route to it.

39. The system should provide a function to retrieve the value of a specified item from the database.

40. There must be a capability to transmit a value for a specified item to the database.

41. The system should be able to start a continuous data stream along a specified route.

### 5.5.2 Time Handing
42. The system must provide a mechanism for time synchronization across control subsystems.

43. Time information should be available and provided in IRIG-B format.

### 5.5.3 Remote DB Access
44. The system must enable subsystems to obtain information from other systems within the control system using communication and database access commands.

### 5.6 Command Implementation
45. All commands must be representable as ASCII strings with a specified format, allowing for nesting using braces.

46. The system should be able to construct, deconstruct, and route command strings properly.

# Non-Functional
### 4.3.2 Gemini Breakdown of Tasks
1.	Gemini will not modify the core of EPICS, indicating a decision for system stability and maintainability.

2.	No new host-based development tools will be created, indicating a constraint on the development environment.

### 4.3.3 GEMINI Definitions
3. there is a need for a structured approach to categorize the work, suggesting a need for maintainability and organization.

4. The mention of an “EPICS Basics, Building and Using Applications course” suggests a requirement for training and knowledge transfer, which could be related to usability or documentation standards.

### 4.3.4 Required Developer Skills
5. Knowledge requirements for applications and internals developers. Which implies a need for training and knowledge in specific technical areas.

6. The distribution of developer classes reflects organizational and operational constraints, such as ensuring the right mix of skills and experience within the development team.

7.	The need for ease of use for one-time users, simultaneous local and remote monitoring, and data export capabilities indicates requirements for usability, performance, reliability, and interoperability.

8. The planned distribution of work suggests scalability and maintainability considerations within the Gemini project.

### 5.1 Command Routing
9. The system must reliably route commands and data, ensuring accurate delivery and correct action.

10. The system should support multiple sources and targets, indicating the need to handle potentially increasing volumes of command and data traffic.
11. The routing of commands and data should be efficient to prevent large transmissions from interfering with normal operations.

12. The system should be capable of intelligent routing, such as converting data formats and using separate physical routes to avoid interference.

### 5.2 Command Structure
13. The Command ID should be monotonically increasing and function as a timestamp for journaling and tracing, ensuring traceability and reliability of command execution history.

14. The command structure must accommodate various recipients, including specific targets, channels, or broadcasts, indicating the system’s ability to scale with varying command routing complexities.

15. The technique used for implementing Command ID should be analogous to a known, reliable method, suggesting a preference for maintainable and proven solutions in system design.

### 5.3.1 General Purpose Commands
16. The system must reliably execute status commands and return accurate information every time they are called.

17. The system should execute status commands promptly, ensuring that the status information is up-to-date and there is minimal delay in communication.

18. The status information provided by the commands should be clear and understandable to the users.

19. The system should maintain performance and reliability as the number of subsystems or status command requests increases.

20. The status commands should be always available, allowing for continuous monitoring of the system.

### 5.3.2 Generic Commands
21. The system must allow for flexible configuration changes as per the Set Configuration command.

22. The Run Test command implies the system should reliably execute self-tests and accurately report the status.

23. The system should handle partial failures as indicated by the ability to report a WARNING status and still function.
24. The system is expected to perform self-tests and respond to status changes quickly, as these commands are likely to be critical for operation.

25. The Set Logging command suggests that the system should support detailed logging at various specified levels for maintenance and troubleshooting purposes.

26. The SetStatus and RunTest commands imply that the system should be available to receive and process these commands at any time.

27. The system should be capable of managing configurations and running tests across multiple subsystems without degradation of performance.

### 5.4 Data Communications
28. The system should reliably open, reset, and test communication routes without failure.

29. Communication routes should handle data transfer efficiently, with minimal latency.

30. The system must scale to handle multiple routes being opened, closed, or reset simultaneously without degradation in performance.

31. The system should support concurrent data communications across multiple routes.

32. Communication routes need to be available whenever the system is operational, ensuring high availability for critical operations.

33. The Awaitltem function implies a requirement for timely response to prevent indefinite blocking of modules.

### 5.5.1 Local Database Access
34. The system should provide quick access to database items and handle data streams efficiently.

35. The system must reliably start and stop data streams and handle event setting and clearing without errors.

36. The system should be able to handle multiple simultaneous database access commands without performance degradation.

37. The commands for database access should be simple and intuitive for users to operate.

### 5.5.2 Time Handing
38. Time synchronization must be accurate to ensure that all control subsystems are operating at the correct time.
39. Time data should be consistently formatted across all subsystems, following the IRIG-B standard.

40. The system must be compatible with other systems that use IRIG-B time format for synchronization.

5.5.3 Remote DB Access
41. Remote database Access must be executed swiftly to ensure timely retrieval and updating of data across the system.

42. The system must reliably provide accurate information when accessing remote databases, with minimal errors or downtime.

### 5.6 Command Implementation
  43. The system must ensure that commands are structured in a way that allows for interoperability across different subsystems and components within the control system.

44. The command structure and routing should accommodate a potentially large number of subsystems and complex command strings.

45. The use of ASCII strings for commands implies a standard format for command representation across the system.


