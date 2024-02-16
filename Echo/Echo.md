# Team Members
- 6488021 Russarin Eaimrittikrai
- 6488045 Supithcha Jongphoemwatthanaphon
- 6488052 Sasasuang Pattanakitjaroenchai
- 6488061 Chaninan Phetpangun
- 6488184 Runchida Ananartyasit
- 6488203 Phacharaphan Chalitchaiya

# Actors
| Actors | Responsibilities |
|-------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Astronomer | - Observing <br>- Collect science data <br>- Work with the science plan |
| Science Observer | - Observing, maintenance, testing <br>- Monitor data acquisition <br>- Validate the integrity of data collected by the Astronomer <br>- Ensure the functionality of the science plan |
| Telescope Operator| - Observing, maintenance, testing <br>- Ensure the integrity of the system <br>- Ensure the accuracy of the system function during observation <br>- Work with the Observer and the science plan |
| Support | - Maintenance, test <br>- Maintain the system, hardware, and software <br>- Maintain the installation of the subsystems <br>- Maintain the configuration changes |
| Developer | - Maintenance, test <br>- Design, test, configure, and upgrade subsystems |
| Administrator | - Observing, maintenance, test <br>- High-level functional control of the Gemini system <br>- Determine appropriate observation scheduling changes <br>- Determine maintenance downtime <br>- Determine system modifications |

--- 
# Functional Requirements
1. (2.2) The Gemini system has three operational levels: Observing level, Maintenance level, and Test level.
2. (2.3) The Gemini system has six access modes: Observing, Monitoring, Operation, Planning, Testing, and Administrative.
3. (2.6.4) The system must allow all kinds of users to access with login and configuration.
4. (2.6.4) The system must allow all other users wishing to monitor Gemini 8m Telescopes operations to go through the procedures set up by Operations and get permission to do so. 
5. (2.7.2 D) The software shall assist in object selection within the observing program and across observing programs while considering target positions, weather conditions, and instrument configurations.
6. (2.7.2 F)  The system must be able to queue all of the observations that are possible with the currently available instruments.
7. (2.7.3 B) All observing facilities shall work both on-site and off-site. 
8. (2.7.3.4) The system must have remote monitoring that coincides to a large extent with multipoint monitoring but allows the remote user to pick and choose the information that is displayed on the remote screen.
9. (2.7.3.5) The system must allow remote access to the Gemini 8m Telescopes and its instruments for monitoring and diagnostic purposes.
10. (2.8.2)  The system’s observing program shall have flexible scheduling which requires switching during the night between telescope modes and instruments.
11. (2.9.1 B) All subsystems respond to a common set of commands to test operational status, inquiries as to version, perform self-tests, etc.
12. (2.9.1 E) The system shall provide timeout support for commands that allow delayed replies.
13. (2.9.2.1 D) The system shall automatically archive data while observing and maintaining level operation in the Gemini Archive subsystem.
14. (2.10) The system shall establish privileges at each operating level during user authentication.
15. (2.11.2 C) The requests of subsystems for status information shall be requestable in maintenance-level operation.
16. (2.13.1) Subsystems must notify the user when faults occur. 
17. (3.1.1) The system shall transfer control information in the form of commands and replies from users to telescopes and instruments.
18. (3.1.1) The system shall provide control information on all controlled variables by all subsystems on request.
19. (3.1.1) The system shall provide meteorological information from a weather station which is available centrally.
20. (3.1.1) The system shall be able to restrict user access such that all information available to the Gemini 8m Telescopes software and is capable of being available to all users of the Gemini 8m Telescopes, subject only to restrictions concerning updating.
21. (3.1.2.1) The system’s intermediate storage must have at least two copies of raw data to secure data as acquired and to do an assessment of data quality online.
22. (3.2.2.1) The system shall provide further subdivision within the levels that can be achieved by implementing privileges associated with categories of users or with the location of the user station.
23. (3.2.2.2) The operational software shall indicate clearly to users the current operation level and check the compatibility between subsystems in different modes.
24. (3.2.3) Each node of the system shall have the capability to run at all operation levels.
25. (3.2.5) The system must have automatic procedures to implement the startup and shutdown of the telescope and instruments.
26. (3.2.5) The system must allow the startup and shutdown of instruments independently of the telescope and without affecting the telescope operation.
27. (3.2.5) The system must have reconfiguration procedures to change the observing environment.
28. (3.3.3.1) The image preprocessing systems shall be able to monitor the quality (image quality, spectral resolution, signal to noise, etc.) of the astronomical data as it comes in.
29. (3.3.3.1) The image preprocessing systems shall possess standard reduction procedures that are available for basic on-line calibrations of the observed data.
30. (3.3.3.2) The system shall have computer access to star catalogs so that an automatic selection of candidate guides and standard stars can be made.
31. (3.5.4.1 A) At the monitor level, each subsystem shall have a background task running. 
32. (3.5.4.1 B) At the self-test level, each subsystem shall provide a module for fully exercising all subsystem components, both hardware and software.
33. (3.5.4.1 C) The system level shall have software modules for testing the subsystem as an integrated portion of the entire system. 
34. (3.5.11) The Telescope Control System shall be capable of detecting and invoking parallel operation as it is responsible for control of all of the telescope and enclosure subsystems.
35. (4.1.2) The system shall constantly monitor active and inactive subsystems to be sure they are operating correctly before sending commands to each subsystem.
36. (4.1.2) The system shall be able to monitor active and inactive subsystems.
37. (4.1.2) The software shall enable a measure of fault rates that is done during commissioning to establish baseline rates for system reliability monitoring.
38. (4.2.3.1 A) The system shall have access to the on-line data store that holds astronomical data for the current observation.
39. (4.2.3.1 B) The system shall store astronomical data automatically onto the Archive medium.
40. (4.2.3.1 C) The system shall have access to Star catalogs that are available in Astronomical object catalogs.
41. (4.2.3.1 E) The system shall store all additional data that is not required on-line in a relational DBMS.
42. (4.2.3.2) The system shall accept the data inputs including catalogs, calibrations, and flat fields available in archives.
43. (4.2.3.2) The system shall allow observing commands as an input that provides information on the course of operation and trigger events.
44. (4.2.3.4) The system must appropriately log all input and output data.
45. (4.2.4.1 E) The system must have specific procedures for start-up and shut-down at various levels, including cold start-up, warm start-up, telescope start-up, and instrument start-up.
46. (4.2.4.1 E 4) The system shall provide a way to shut down all subsystems (hardware and software).
47. (4.2.4.2) The system shall provide enough time-stamp information, and error logging to trace the condition back to its apparent source, both in equipment and the event sequence.
48. (4.2.4.2 B) The system must provide Error logging.
49. (4.2.4.2 D) The system must prevent the failure of one subsystem from affecting other operational subsystems.
50. (4.2.4.2 D) The system shall monitor the warning message rate since an increase might indicate that some tuning or maintenance is appropriate.
51. (4.2.2.1) The system of Gemini telescope operation supports full implementation of remote operations including remote observing, remote control of telescope, enclosure, and instruments, multipoint monitoring, remote monitoring, remote access for testing, development, diagnostics, and maintenance.
52. (4.2.2.1) The system must encode video data signals and facilitate their transfer via the WAN to remote sites.


### Astronomer
1. (2.5.8) The system allows astronomers to access only the Observing level.
2. (2.5.8) The system allows astronomers to access only the Planning, Observing, and Monitoring modes.
3. (2.5.9.1) The system must not allow astronomers to send control commands directly.
4. (2.5.9.1) The system must allow astronomers to enquire about the status of the telescope or any subsystem.
5. (2.5.9.1) The system can give control access to instruments to astronomers. 
6. (2.7.2 B) The system shall have a full telescope simulator for astronomers within the virtual telescope environment of the system.
7. (2.7.2 C) All control software must provide support for simulated use within the virtual telescope.
8. (2.7.4 C) The system shall allow astronomers to communicate special notes, instructions, and comments on the programming environment to the observers.
9. (2.7.4 C) The program shall allow others to perform an observing program on behalf of the astronomer.


### Science observer
1. (2.5.8) The system allows science observers to access only the Observing level.
2. (2.5.8) The system allows science observers to access only the Observing and Monitoring modes.
3. (2.5.9.1) The system must allow observers to directly control the telescope.
4. (2.7.4 B) The system’s observing program should be available to the observer for developing the program.
5. (2.7.4 B) The system’s observing program should be available to the observer for review and adjustment of the program.


### Telescope Operator
1. (2.5.8) The system allows telescope operators to access only the Observing, Maintenance, and Test levels.
2. (2.5.8) The system allows telescope operators to access only the Observing, Monitoring, Operation, and Testing modes.
3. (2.5.9.2) The system must allow telescope operators to control the Gemini 8m Telescopes indirectly via a scheduler program or commands.
4. (2.5.9.2) The system must allow telescope operators to monitor general performance and system safety.
5. (2.5.9.2) The system shall allow telescope operators to have privileges to access all commands and maintenance procedures in case of problems.
6. (2.5.9.2) The system must not allow telescope operators to have access to subsystems in normal operation.
7. (2.5.9.2) The system must not allow telescope operators ​​to change the operational status of units according to the results of tests performed on such units.
8. (2.7.3.1) The system must allow Telescope Operators to enter telescope control commands from a remote site.
9. (2.7.3 D) The system must allow the restriction of specific operations to specific remote sites. For example, at the Mauna Kea site, remote telescope control might be restricted to Hale Pohaku.
10. (2.7.3.3) The system must provide a multipoint monitoring mode where the monitor’s screen appears as a duplicate of that which can be seen by the observer.
11. (2.7.3.3) In the multipoint monitoring mode of the system, the observer’s environment must remain unaffected by the actions performed on the monitor’s keyboard.
12. (3.2.5) The system must allow telescope operators to have the privilege to select a suitable combination of instruments.


### Support
1. (2.5.8) The system allows support to access only the Maintenance and test levels.
2. (2.5.8) The system allows support to access only the Monitoring, Operation, and Testing modes.


### Developer
1. (2.5.8) The system allows developers to access only the Maintenance and Test level.
2. (2.5.8) The system allows developers to access only the Monitoring and Testing modes.


### Administrator
1. (2.5.8) The system allows administrators to access only the Observing, Maintenance, and Test levels.
2. (2.5.8) The system allows administrators to access only the Monitoring and Administrative modes.


### Software development and maintenance staff
1. (2.5.9.3) The system must be accessible to software development and maintenance staff based at the Gemini 8m Telescopes site or base facility, remote operations facility, and non-Gemini staff from a contract company or an associated Institute.
2. (2.5.9.3) The system must allow intervention by software development and maintenance staff to resolve major problems.
3. (2.5.9.3) The system must allow for the installation of software upgrades by the software development and maintenance staff.
4. (2.5.9.3) The system must allow the generation of systems for new software packages or releases according to established test and validation procedures by the software development and maintenance staff.
5. (2.5.9.3) The system must grant the highest level of privilege to software development and maintenance staff for system modifications. 
6. (2.5.9.3) The system must enable software development and maintenance staff to primarily work at the test level for the specific software under test.
7. (2.5.9.3) The system must allow certain parts of Gemini 8m Telescopes to run in test mode to support integration tests.


### Database
1. (2.9.2.1 C) The system shall store only the preprocessing data for the data that requires preprocessing.
2. (3.1.1) The system shall transfer replies containing status information and data concerning instruments and telescopes to be stored together with the astronomical data.
3. (3.3.3.2) The system shall possess on-line interactive access to the data archiving system so that access to this database is possible for Gemini 8m Telescopes users.
4. (4.2.1 A) The system must allow all telescope, instrument, and detector control information to be available at any operation level.
5. (4.2.1 D) The system’s database must keep crucial time-access information in memory.
6. (4.2.1 E) The system’s database shall provide a consistent and logical (i.e., name-based) access method.
7. (4.2.3.1 D) The system shall distribute telescope and instrument parameters in databases across the Input/Output Control Modules for those systems. 
8. (4.2.3.1 D) The system shall have a central repository maintained by the Observatory Control Software that holds these databases for downloading to the IOCs.
9. (4.2.3.3) ​​The system shall distribute data outputs including replies to commands, status information, updates to parameters, video, and astronomical information into different databases.
10. (4.2.5.1.8) The system shall store configuration, logging, maintenance schedules, and subsystem documentation in the commercial relational database.


### System operational requirements
1. (4.2.4.1 A) The system must have an automatic operation which is a normal mode of operation that is performed through a preplanned program.
2. (4.2.4.1 B) The system must have an interactive operation for science planning and program changes which is the normal mode of operation at maintenance and test levels.
3. (4.2.4.1 E 4) The system must automatically log all start-ups and shut-downs with time stamps.
4. (4.2.4.2 B) The system must group errors into three categories: Fatal, Serious, and Warning.
5. (4.2.4.2 B) The system must describe errors resulting in an alarm along with the proper action required to acknowledge and eliminate the alarm condition.
6. (4.2.4.2 B) The system provides tools for extracting error and logging information.
7. (4.2.4.2 B) The system must distinguish alarms from errors.
8. (4.2.4.2 B) The system must categorize alarms into two conditions: automatically monitored alarms and alarms that require human acknowledgment to clear.
9. (4.2.4.2 D) The system must monitor warning message rates for potential tuning or maintenance.

---
# Non-Functional Requirements


1. The system shall have available capabilities to be adapted to the operational needs both locally and remotely.
2. (2.5.9.1) The system can offer status information both automatically and on request at any requirement level while fulfilling the various operational requirements in different modes.
3. (2.5.9.1) The system must provide an interface that is simple to learn and secure.
4. (2.6.4) The system must allow different kinds of users to work at the same time.
5. (2.6.4) Any subsection of the system should be accessible and controllable from any single point.
6. (2.6.4) The system’s utilization of monitoring mode shall exist both in the form of automatic displays of status information at different locations, and in the form of explicit access to the required status information from any point.
7. (2.6.4) The system’s utilization of monitoring mode shall not affect the performance of ongoing observations.
8. (2.7.1 A) The interactive observing mode of the system shall be executed with the sequencer by providing a computer-executable program.
9. (2.7.1 B) The interactive observing mode of the system shall support interactive observing operations through the Observatory Control System (OCS).
10. (2.7.1 C) The interactive observing mode of the system shall have a visual user interface to the OCS to allow for changes to the viewing program.
11. (2.7.1 D) The interactive observing mode of the system shall allow more than one station to participate in the observation.
12. (2.7.1) The software shall support telescope operation in a smooth and very friendly way.
13. (2.7.1) The interaction of the interactive observing mode of the system shall be via an automatic sequencer.
14. (2.7.1) The system must have an interactive observing mode with time allocation for full nights.
15. (2.7.2 A) The system’s observing program must be fully automated.
16. (2.7.2 A) The system must offer a visually oriented environment with a simple and easy-to-use interface.
17. (2.7.2 E) The system must have software to support flexible scheduling, both manually and via a scheduler.
18. (2.7.3 C) The system shall support team observation with multiple observers at different sites.
19. (2.7.4 A) The system’s observing program should be a visually oriented environment providing a simple, easy-to-use interface to the astronomer.
20. (2.9.2.1 A) The system shall ensure that the syntax of control flow commands is consistent across the system.
21. (2.9.2.1 C) The system shall be able to compress data using a loss-less compression technique.
22. (2.9.1 C) The system shall ensure that the support structure for communicating commands is reliable with a uniform ACK/NAK protocol adopted across all systems.
23. (2.9.3) The system must allow fast transmission of rough images every 0.5 seconds.
24. (2.9.3) The system's high-quality transmission must require less than 20 seconds, and can only be assisted with loss-less compression.
25. (2.10) The system shall have protection against accidental interference implemented using an Access Mode Allocation system that dynamically identifies and assigns resources as needed.
26. (2.10) The system’s critical resources should be assigned solely through the Access Mode Allocation system.
27. (2.10) The Access Mode Allocation system must ensure that the system is unable to remain deadlocked for resource allocation.
28. (2.11.1) The Gemini software shall have no hard restrictions on the number of simultaneous users, but it shall allow for policy decisions that restrict the amount of simultaneous access.
29. (2.11.3) The software bugs in the system shall be logged and fixed as soon as possible after detection.
30. (2.12) The telescope and instrument software shall contain built-in test (BIT) facilities to verify the performances of the Gemini 8m Telescopes system and software.
31. (2.12) Every Gemini 8m Telescopes software module shall have corresponding test specifications used for acceptance tests and as an online test procedure.
32. (2.12) The Gemini 8m Telescopes control software shall provide for the execution of self-test sequences of the Gemini 8m Telescopes system and subsystems that automatically exercise all subsystems present in a given operational configuration.
33. (2.12) Regression tests shall be a part of every Gemini 8m Telescopes software package.
34. (2.13.1) The subsystem’s fault notification must be specific as to the origin and problem.
35. (2.13.1) The subsystem’s fault notification must be capable of being electronically logged.
36. (2.14.1 A) The software shall not restrict users. Only policy decisions (permissions, access privileges, etc.) shall determine which parts of the Gemini system users can access from any local or remote station.
37. (3.1.1) Every request for control information in the system must not produce a delay in control activities or locking even if the corresponding equipment is not available or faulty.
38. (3.1.2.1) The link chosen to transfer data in the system shall represent as small a bottleneck as possible for data acquisition.
39. (3.1.2.3) Astronomical data must be transported between GEMINI and the home institutes of visiting astronomers in FITS format.
40. (3.1.3) The system’s TV data concerning site monitoring and voice need to be capable of being available at all operations facilities.
41. (3.1.3) The system’s voice connectivity, possibly point-to-point, must be available on a permanent connection.
42. (3.1.3) The system’s additional astronomical information such as that coming from sky field monitors, auto guider cameras, and sky monitoring devices such as cloud and seeing monitors shall be available.
43. (3.2.2.2.) The system shall enforce protections among users.
44. (3.2.3) The Gemini 8m Telescope computers and software shall be capable of coping with the load of 10 active nodes.
45. (3.2.3) The control software shall allow simultaneous operation of up to six active control nodes and up to two more monitoring nodes without appreciable degradation of performance.
46. (3.2.4) The system’s commands must be acknowledged positively or negatively before the occurrence of the corresponding action within given response times.
47. (3.2.5) The system’s observing environments must be dynamic.
48. (3.3.1) The system shall offer a homogeneous user interface which can be achieved by applying the same user interface tools to the whole project.
49. (3.3.1) The system’s user interface shall not be seen as a package linked to a specific computer.
50. (3.3.1) The system’s user interface shall be seen as a package to be callable from a large number of stations depending on the location of the user while being network transparent.
51. (3.3.1) The system’s user interface tools shall be portable across different computer hardware platforms.
52. (3.3.3) The Gemini 8m Telescopes software must interface with the external software.
53. (3.3.3.2) The system shall provide the output format of the Gemini 8m Telescopes data that is compatible with the GEMINI archive requirements.
54. (3.3.3.3) The Gemini 8m Telescopes software must be able to interface with all commercial software packages available on the Gemini 8m Telescopes and integrated into the Gemini 8m Telescopes operation.
55. (3.5.3.1) The system shall have a maximum downtime of only 15 minutes per night or 1 night per month. 
56. (3.5.3.1) The system shall incorporate retry procedures for error recovery with clear reporting of failures and the system transitioning to a safe state when safety is a concern.
57. (3.5.4.1) All subsystem software must include maintenance and testing modules, such as simulators providing reference behavior.
58. (3.5.4.6.1) All equipment shall support a programmed adjustment and maintenance interval of 30 days or longer.
59. (3.8) Every system must be able to supply its current version upon request.
60. (4.2.2.1) The system must have security to control access to system features and restrict some operations to specific remote sites.
61. (4.2.3.4) The system shall operate via a sequence of commands which is complemented by utilizing previously stored data, calibrations, and star catalogs.
62. (4.2.4.1) The system shall utilize all possible concurrencies in system operation to enhance performance.
63. (4.2.4.1 C) The system must support smooth and regular operation across all its levels.
64. (4.2.4.1 D) The system must define the overall performance of the Gemini telescope as the percentage of viewable time when exposures have been taken.
65. (4.2.4.1 E 1) The system shall perform a Cold Start-up that takes approximately 5 minutes.
66. (4.2.4.1 E 2) The system shall perform a Warm Start-up that takes approximately 1 minute.
67. (4.2.4.1 E 3) The system shall perform a Telescope Start-up that takes approximately 4 minutes.
68. (4.2.4.1 E 4) The system shall perform an Instrument Start-up that takes 2 minutes or less.
69. (4.2.4.1 F) The system’s logging information encompasses all significant events, appropriately time-stamped and indexed.
70. (4.2.4.1 G 1) The system must support logging engineering data at high frequencies, up to 200 Hz, for short durations.
71. (4.2.4.1 G 2) The system must support long-term logging of engineering data at lower frequencies (1 Hz or less).
72. (4.2.4.1 G 2) The system’s long-term logging of engineering data must be logged into a common format, baselined as SYBASE.
73. (4.2.4.2 A and 2.11.3) The system must provide fault tolerance and recovery, exception handling, and fail-safe checks. 
74. (4.2.4.2 B) The system must employ a common, system-wide procedure to report all errors.
75. (4.2.5.1.1) All Gemini-supported software is to be developed using a formally defined model


### Response time
1. (2.9.1 C) The system’s time out of communicating commands must be supported at approximately 500 msec.
2. (2.9.1 D) The system’s handshaking of commands between IOCs must occur within 100-200 msec. 
3. (2.9.1 F) The system’s peak control information shall not exceed 100 TPS.
4. (2.11.2 A) The system’s command must be able to be accepted/rejected within 2 seconds before the corresponding action occurs.
5. (2.11.2 B) The system’s status display update must be within 4 seconds at the local stations
6. (2.11.2 C) The requests of subsystems for status information must be answered within 5 seconds.


### Database
1. (2.9.2.1 B) The system shall be able to provide multiple, simultaneous access to data.
2. (2.9.2.1 D) The system shall store data from all instruments and detectors as compressed data.
3. (2.9.2.1 E) The data transmitted between Gemini and home Institutes shall contain all header information.
4. (2.9.2.1 F) The system data capacity shall be capable of retaining 7 days of data.
5. (2.9.2.1 F) The system data capacity of the last 3 days must be available interactively from a hard disk or similar medium.
6. (3.1.2.1) The system’s intermediate storage of raw data in memory on different nodes and in different formats shall be kept to a minimum. 
7. (4.2.1 B) The database must be optimized for 2-3 millisecond access times.
8. (4.2.1 C) The system’s database must support asynchronous writes.
9. (4.2.1 F) The system’s database must support both remote access and distributed data.
10. (4.2.5.1.8) The system shall store astronomical data in both the Archiving system and in the data storage subsystem.


### Video information flow
1. (2.9.3 A) The system must allow for fast transmission of rough images every 0.5 seconds. 
2. (2.9.3 B) The system must allow for the transmission of images that are not matched to the original resolution. 
3. (2.9.3 B) The system's high-quality transmission must require less than 20 seconds.
4. (2.9.3 B) The system's high-quality transmission shall be lossless compression of quality.


### Image preprocessing systems
1. (3.3.3.1) Quick-look data processing should be provided on the Gemini 8m Telescopes with procedures suitable for fast on-line data preprocessing.
2. (3.3.3.1) Quick-look should be usable within exposure sequences to provide results and feedback parameters to the control software in a programmed way without the need for manual intervention. 
1. (3.3.3.1) Quick-look should be synchronous.
2. (3.3.3.1) Near-line processing should be available for simple data reductions required for data integrity validation.

---
# Constraints


### Software constraints
1. (2.14.3 A) The system should utilize commercial packages, ready-to-use public domain software, and standards whenever possible.
2. (2.14.3 B) The interfaces of integration of existing external software with the Gemini software are considered part of the Gemini software system.
3. (2.14.3 C) Gemini software shall be developed using standard methodologies and development environments.
4. (2.14.3 D) Gemini software shall keep accurate change logs to track software modifications applied to the system software.
5. (2.14.3 E) Gemini software shall follow a standard process for reporting and documenting errors from both internal and external sources.
6. (2.14.3 F) Gemini software shall be developed using the CVS version control system iteratively.
7. (2.14.3 G) All Gemini subsystem packages shall include a simulator module for the virtual telescope (refer to Design constraints) and user interface modules for the respective operating environments. 
8. (2.14.3 H) All Gemini software is to be fully documented, internally with appropriate comments, and external documentation. External documentation must include Unix-style man pages.
9. (2.14.3 I) All Gemini subsystem packages must provide modules for the testing and diagnosis of the subsystem.
10. (2.14.3 J) The instrument control software must provide users full access to all instrument functionality. Different user interface modules may present different parts of this functionality.
11. (2.14.3 K) All Gemini software, both in source and binary form, must have version labels. The version information shall be accessible through control commands when executing the software.
12. (2.12) Regression tests shall be a part of every Gemini 8m Telescopes software package. 
13. (3.4.1) In the case of remote operations, other users can allow coordination both locally at the Gemini 8m Telescopes site between the various users and with remote users, the software shall support access to the system from any user station.
14. (3.4.3 A) Individual instruments must be able to run fully independently.
15. (3.4.3 B) Telescope software at the two telescopes must be maintained to be identical in the upper layers (even if the hardware shall differ).
16. (3.4.3 C) Additions of new instrument modifications should be confined to the operational procedures and should not affect the bulk of the existing software.
17. (3.4.3 D) There must be easy procedures to reconfigure the system when subsystems are modified or removed. 
18. (3.4.3 F) The number of main packages of software must be kept to a minimum to facilitate maintenance.
19. (3.4.3 H) Existing software packages should be reused wherever possible.
20. (3.4.3 J) All software that does not directly control specific hardware must be written as machine-independent, portable code.
21. (3.5.4.1) Maintenance of commercial software (Solaris, VxWorks) falls under the responsibility of the WPR, with costs not covered by the work package budget. 


### Design constraints
1. (2.14.4 A) The system shall have different requirements for software running on different layers. For instance, strict real-time control is restricted to the IOC layer. 
2. (2.14.4 B) The Gemini system utilizes a virtual telescope model for independent testing and development of the integrated system. 
3. (2.14.4 C) The Gemini subsystem shall be as self-contained and autonomous as possible, thereby decreasing the functional width of the interface to the rest of the Gemini system. 
4. (2.14.4 D) No subsystem package shall make any assumptions about the surrounding environment beyond that provided in the interface specifications.

ITCS431 Software Design and Development (2023)

--- 

# Use Case Diagram and Description

![Gemini_UseCase](https://github.com/ICT-Mahidol/Gemini-2023/assets/128398519/3594155d-f3b3-4a06-a0e7-7f4843c22b0e)

1. **Login** =  Each Astronomer, Science Observer, Supporter, Operation Staff, Telescope Operator, Developer, and Administrator can log in to the system multiple times.
2. **Create a science plan** = Astronomers can create a science plan, test the science plan via the virtual telescope and interactive observing mode, and submit the science plan to the system.
3. **Obtain control access to instruments** = Astronomers can obtain control access to instruments multiple times.
4. **Collect science data** = Astronomers can collect science data.
5. **Enquire about the status of the telescope or any subsystem** = The astronomer can enquire about the status of the telescope or any subsystem multiple times.
6. **Create an observing program** = After the use case “Create a science plan” is finished, the Science Observer can validate the science plan, transform the science plan to an observing program, and submit an observing program to the system. Then, the Operation staff can validate the submitted observing program.
7. **Execute the approved plan** = After the use case “Create an observing program” is completed, science observers can execute the approved plan multiple times, including monitoring the progress of the science plan execution and collecting astronomical data.
8. **Monitor the progress of science plan execution** = After the use case “Execute the approved plan” is finished, the Science Observer can monitor the progress of science plan execution multiple times.
9. **Review and adjust the program** = Science observers can review and adjust the program.
10. **Collect astronomical data** = After the use case “Execute the approved plan” is completed, Science observers can collect astronomical data, validate the integrity of collected data, and manage the collected data.
11. **Monitor general performance and system safety** = Telescope operators can monitor general performance and system safety multiple times.
12. **Enter telescope control commands from a remote site** = The Telescope operator can enter telescope control commands from a remote site anytime.
13. **Maintain the system, hardware, and software** = Supporters can maintain the system, hardware, and software multiple times.
14. **Maintain the installation of the subsystems** = Supporters can maintain the installation of the subsystems multiple times.
15. **Maintain the configuration changes** = Supporters can perform many times to maintain the configuration changes.
16. **Design, test, configure, and upgrade subsystems** = Developers can design, test, configure, and upgrade subsystems multiple times.
17. **Determine appropriate observation scheduling changes** = Administrators can determine appropriate observation scheduling changes in the system multiple times.
18. **Determine maintenance downtime** = Administrators can determine the maintenance downtime of the system multiple times.
19. **Determine system modifications** = Administrators can determine system modifications of the system multiple times.
20. **Install special equipment and sub-systems** = Visitors can install special equipment and sub-systems multiple times.

