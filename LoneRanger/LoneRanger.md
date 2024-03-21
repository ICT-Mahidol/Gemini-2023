# Team members
#### 1. 6488077 Thanat Sathapornwatthanakul
#### 2. 6488121 Hao Huang
#### 3. 6488143 Nichapat Thumrongpowarat
#### 4. 6488155 Pengkai Kong
#### 5. 6488171 Sui Zhou
#### 6. 6488180 Sukan Huang

# Functional Requirements
# Page 9-23
    
# 1.5 Overview
## 1. Developed software - non-commercial software for the control of telescopes and instrumentation.
a. This category falls under the specifications presented in the document, acting as a guide for developing the software.
## 2. Supported software - commercial or "public-domain" software for telescope control and instrumentation.
a. The design goal is to use off-the-shelf software to decrease life-cycle costs and maintenance concerns.
b. Interface specifications required for such software are presented in the document.
## 3. External software - any software available to the Gemini system that is not integral to the system.
a. User-supplied data reduction tools, operating systems, CASE tools, etc., are considered external software.
b. Only the interface requirements to such software are considered part of the Gemini software.
## 4. Embedded software that interfaces with the Gemini system via software.
a. Such embedded software is considered Gemini software and is subject to the requirements presented in the document.

# 2.1 System Users
### 1. Astronomer
a. Purpose: Collecting science data using the Gemini system.
b. Involvement: Working out a science plan for data collection.
### 2. Science Observer
a. Purpose: Monitoring data acquisition, validating data integrity, and ensuring 
the science plan meets the astronomer's needs.
b. Involvement: On-site responsibility for overseeing data collection.
### 3. Telescope Operator
a. Purpose: Controlling the telescope and instruments, ensuring system 
integrity, and maintaining accurate functioning during observations.
b. Involvement: Collaboration with the Observer and adherence to the science 
plan for optimal data collection.
### 4. Developer
a. Purpose: Designing, testing, configuring, and upgrading subsystems.
b. Involvement: Responsible for the development life cycle of subsystems.

# 2.2 Operational Levels
### 1. Observer
a. Purpose: Observing and collecting science data.
b. Involvement: Engaged in the "normal" operational mode of the system, known as the Observing level.

# 2.3 Access Modes
### 1. Observing
a. Purpose: Simple and safe access to the system for the collection of science data, instrument parameter selection, and quick-look data reduction.
b. Involvement: Access through the sequencer with no direct control of the telescope and instruments.
### 2. Monitoring
a. Purpose: A read-only case of the observing mode, invoked on a subsystem basis. It should not affect the ongoing observation's performance.
b. Involvement: Special mode for observing ongoing processes without influencing them.
### 3. Operation
a. Purpose: Direct control of the telescope and instruments, typically during observing level operation. Available to the Telescope Operator and the science program sequencer.
b. Involvement: Used for real-time control during observation level operation.
### 4. Planning
a. Purpose: Access during science planning, providing a telescope simulator for planning observations without actual telescope access.
b. Involvement: Useful for planning observations with virtual telescope capabilities and online databases.

# 2.4 Location of users of the system
### 1. Gemini 8m Telescopes Enclosure
a. Purpose: Housing the telescope.
b. Involvement: Limited to maintenance and engineering use.
### 2. Gemini 8m Telescopes Control Facility
a. Purpose: Facility collocated with the enclosure; nightly operations take place from here.
b. Involvement: Central hub for operational activities, coordinating telescope
### 3. Gemini 8m Telescopes Site Support Facility
a. Purpose: Facility where off-duty personnel reside while stationed on the summit (Hale Pohaku facility on Mauna Kea and Cerro Tololo in Chile).
b. Involvement: Support and residence for personnel involved in telescope
### 4. Gemini 8m Telescopes Base Facility
a. Purpose: Facility where offices, shops, etc., are located (JACH in Hilo for Hawaii and La Serena or Cerro Tololo facilities for Chile).
b. Involvement: Administrative and logistical support for telescope operations.
### 5. Gemini 8m Telescopes Remote Operations Facility
a. Purpose: Super sites located in partner countries with direct links to the telescopes via communication lines. These sites have remote operations capability.
b. Involvement: Remote operations and control of the telescopes from partnercountries.
### 6. Satellite Site Facility
a. Purpose: Sites with high bandwidth connections to super sites, providing remote operations capability at a reduced level.
b. Involvement: Intermediate sites with reduced remote operations capability.
### 7. Institutional Site Facility
a. Purpose: Sites at existing observatories, universities, etc., with some form of connectivity to the telescopes, possibly via satellite sites and/or super sites.
b. Involvement: Connectivity to the telescopes, with remote operations capability determined by link capacity.

# 2.5 User-Level requirements
## 1. Astronomers and Observers
### Definition:
• Observing astronomers are end-users of the system, ranging from occasional users to very experienced users.
• Purpose of Work:
• Efficient acquisition of astronomical data and on-line assessment of data quality.
### Privileges:
• No direct control of the telescope.
• Ability to inquire about the status of the telescope or any subsystem.
• Programs may have the capability of direct control of the telescope.
### Operation Mode:
• Traditional interactive operation replaced by operation via an automatic 
sequencer.
• Interaction provided through the scheduler program.
• Observing commands submitted via the User interface to a queue for later execution.
• Transparent scheduling queue during the initial phases of telescope operation.

## 2. Operations Staff
### Definition:
• Includes 'night assistants' and staff of the 'operations group,' potentially becoming telescope operators, operations supervisors, and instrument operators.
### Purpose of Work:
• Control of the Gemini 8m Telescopes indirectly via a scheduler program or directly via commands.
• Supervision of telescope operation and advising observing astronomers.
• Monitoring general performance and system safety.
### Privileges:
• Access to all commands and maintenance procedures in case of problems.
• Direct control of physical units.
• No access to subsystems during normal operation; reconfiguration procedures required for access.
### Operation Mode:
• Access to operation tables in update mode.

## 3. Software Development and Maintenance Staff
### Definition:
• Staff based at the Gemini 8m Telescopes site or base facility, remote operations facility, or non-Gemini staff from a contract company or an associated institute.
### Purpose of Work:
• Intervene in major problem-solving, installing upgrades, performing system generation, and installing new software packages or releases.
### Privileges:
• Highest privilege level to modify everything in the system.
• Strict configuration control guidelines must be followed to prevent interference with ongoing normal operation.
### Operation Mode:
• Usually work at the test level for the part of the software under test.
• Access to test commands for hardware testing, not accessible to observing astronomers.

## 2.6 Operational context
### 1. Multi-Telescope Context:
a. Capability for future use in conjunction with nearby telescopes (e.g., for interferometry).
### 2. Multi-Instrument Context:
a. Parallel access to all mounted instruments.
b. Support for inactive instruments to take calibration or flat field exposures, prepare for exposure, and work at all operation levels.
c. Ensure that actions of inactive instruments do not adversely impact the active instrument.
### 3. Visitor Instrument Context:
a. Standardized interface for visitor instruments, operating as servers.
b. Minimum support for acquisition of status information, preprogrammed observing sequences, and telescope position/focus offset.
c. Goals for additional support like coordinate transforms, archiving of data, and maintenance of operations tables.
d. Acknowledgment that more complicated functionality may require joint efforts and adherence to stable interfaces.

# Page 24-38

## 2.6.4 Multi-user Context
1. Different kinds of users can working at the same time with the Gemini 8m Telescopes software. 
2. Any subsection of the whole Gemini 8m Telescopes system should be accessible and controllable from any single point. 
3. While one user is in control of the system, others should be able to monitor relevant data from the telescope and instruments. 
4. The system should support multi-point monitoring for expert advice Multi-point monitoring also allows a local observer to be monitored and advised by a remote supervisor.
## 2.7.1 Interactive Observing
5. A computer executable program executes with the sequencer to efficiently utilize the Gemini telescope.
6. Interactive operation is supported, but always through the Observatory Control System.
7. There is a visual user interface to the OCS to allow for changes to the viewing program. 
8. More than one station participate in the observing.
## 2.7.2 Queue-based
9. The observing program must be fully automated. 
10. Full telescope simulator to enable the astronomer to test observing programs for completeness, errors, andfunctionality.
11. All control software must provide support for simulated use within the virtual telescope.
12. Software to assist in object selection both within an observing program and across observing programs, in order to optimize observing efficiency. 
13. The software must support flexible scheduling, allowing for manual scheduling and scheduling via a scheduler. 
14. All observations possible with currently available instruments are queue. 
## 2.7.3 Remote Operations
15. All software should be developed to permit remote operations. There should be noconceptual difference between software working on-site and remotely. 
16. All observing facilities should work both on-site and off-site. 
17. It should be possible to do full operations remotely. 
18. Team observing, with multiple observers at different sites should be supported.
19. It must be possible to restrict specific operations to specific remote sites. 
20. Functionality of the system be transparent. 
21. Security of operation shall be considered and might imply different operation levels and privileges at different sites.
22. It is required that the remote operations software be considered from the beginning in the Gemini 8m Telescopes software design.
## 2.7.4 Service
23. The observing program must be automated, requiring little human interaction during the observation. 
24. This programming environment should be available both to the astronomer, for developing the program, and to the observer, for review and adjustment of the program. 
25. The programming environment should allow for the communication of special notes, instructions, and comments from the astronomer to the observer, possibly using multimedia techniques.
## 2.8.1 Planned Observing
26. Should be possible to carry out observations automatically, in accordance with pre defined sequences of exposures. 
27. Competent monitoring should be in place either at the Gemini 8m Telescopes site or remotely to oversee.   
## 2.8.2 Flexible Scheduling
28. The software should enable the possibility of reacting to changes in weather and other conditions by allocating the current use of the telescope to the optimal observing program suited for those conditions.
29. It will require the use of service and/or remote observing.
## 2.9.1 Control Information Flow
30. The syntax of control flow commands is to be consistent across the system.
31. All subsystems must respond to a common set of commands to test operational status, inquiries as to version, perform self-tests, etc.
## 2.9.2 Astronomical Data Flow
32. Data flow. Data from detectors must be stored in the most effective method permit ted by available technology.
33. Concurrent data access and display.
34. Data acquisition format. Data is normally acquired as uncompressed data, but may be compressed using a loss-less compression technique.
35. Storage of data. Data from all instruments and detectors is stored as compressed data, using a standard format.
36. Data transmission format. Data is transmitted between Gemini and home Institutes using a FITS format and contains all header information provided with the data.
37. System-wide data capacity. The data capacity of the system is limited by transfer meth ods and technology, as well as archiving capacity on site.
## 2.9.3 Video Information Flow
38. Fast Transmission of Rough Images.
39. Transmission of images matching the original resolution.
## 2.10 Operation Privileges Protections and Procedures
40. A system of privileges established at each operating level of the system. These privileges should be determined in a simple manner during logging into the system. 
41. Procedures must be implemented for convenience and system integrity, to simplify and codify common tasks. For example Telescope and Instrument Management.
## 2.11.1 Capacity
42. The Gemini software should have no hard restrictions on the number of simultaneous users, but should allow for policy decisions that do restrict the amount of simultaneous access.
## 2.11.2 Response Time
43. The system must be able to accept or reject every command.
44. Status Display Updates.
45. Requests of subsystems for status information.
## 2.11.3 Availability
46. All software bugs should be logged and then fixed as soon as possible after detection.
## 2.12 Test and Checkout Requirements
47. The telescope and instrument software shall contain built-in test (BIT) facilities to verify Gemini 8m Telescopes system and Gemini 8m Telescopes software performances.
48. Vary Gemini 8m Telescopes software module shall have corresponding test specifications.
49. The Gemini 8m Telescopes control software shall also provide for execution of self-test.
## 2.13.1 Fault Notification
50. Subsystems must notify the user when faults occur.
## 2.13.2 Fault Tolerance
51. Should a subsystem fail (e.g. one detector, one instrument) predefined procedures mustexist to redefine the environment in such a way that operation can restart with the remaining equipment.
52. If an Instrument Operation Controller (IOC) fails, there must be a procedure for replacing faulty cards or assemblies.
## 2.13.3 Redundancy
53. Full redundancy is not a requirement of the Gemini 8m Telescopes and it will be acceptable to have to replace units in case of failure.
## 2.14.1 User Constraints
54. There should be no restrictions imposed by the software on users.
## 2.14.3 Software Constraints
55. Commercial packages, off-the-shelf public domain software, and standards are to be used whenever feasible.
56. Existing external software will be integrated with the Gemini software.
57. All Gemini software is to be developed using standard methodologies and development environments.
58. Gemini software developers should maintain accurate change logs showing software modifications as they are applied to the system software.
59. Gemini software developers should adhere to a standard method for the reporting and recording of errors from both internal and external sources.
60. Gemini software should be developed in evolutionary fashion, using the CVS version control system.
61. All Gemini subsystem packages should include as part of the software both a simulator module for inclusion in the virtual telescope.
62. All Gemini software is to be fully documented, internally with appropriate comments, and external documentation.
63. All instrumentation control software must provide full access to all instrument functionality.
64. All Gemini software must be version labeled, both in source and binary form.
## 2.14.4 Design Constraints
65. There are different requirements for software running on different layers.
66. All hardware subsystems must provide a software simulation module.
67. Gemini subsystem should be as self-contained and autonomous as possible, thereby decreasing the functional width of the interface to the rest of the Gemini system.

# Page 39-53

## 3.1.1 Control Information Flow
1. Control information must be transferred, typically in the form of commands and replies from users, to telescopes and instruments.
2. Replies might contain status information and, in general, data concerning instrumentsand telescopes, to be stored together with the astronomical data.
3. Control information on all controlled variables must be provided by all subsystems on request.
4. All such information is available to the Gemini 8m Telescopes software and is capable of being available to all users of the Gemini 8m Telescopes software.
### 3.1.2.2 Format of data acquisition
5. Raw data will be acquired and stored as such for quick look evaluations
### 3.1.2.3 Transport data format
6. Astronomical data will have to be transported between GEMINI and the home institutesof visiting astronomers in FITS format
   
## 3.1.3 Other Information Flow
7. TV data concerning site monitoring and voice need to be capable of being available at all operations facilities.
### 3.2.1.1 Observing Level
8. In normal operation mode, it allows a certain number of embedded test at a fairly high level.
### 3.2.1.2 Maintenance Level
9. Allows maintenance tables to be updated.
10. It is anticipated that the majority of parameters at maintenance level will be accessed by operations and development staff.
### 3.2.1.3 Test Level
11. Allows the installation and testing of new packages or new releases.
12. Any low level test can be performed in the mode.
13. It shall be possible to update all non-protected parameter values.
    
## 3.2.2 Privilege and protection levels
### 3.2.2.1 Privileges
14. A further subdivision within the levels can be achieved by implementing privileges associated with categories of users or with the location of the user station.
    
## 3.2.3 Capacity
15. Each node will have the capability to run at all operation levels
16. When the Gemini 8m Telescopes telescope is used in its normal observing mode, there will be a single operator node for the telescope and two data acquisition and instrument control nodes.
17. The system will provide for one auxiliary data acquisition and instrument control nodes.
18. The system must support off-site observing modes.
19. The system will provide for a single off-site data acquisition and instrument control node - to be located at either the Gemini 8m Telescopes Site Support or Base Facility.
20. The system will provide for a single local monitoring node and a single remote monitoring node.
21. Gemini 8m Telescopes will limit this number to a maximum in the order of three active nodes.
    
## 3.2.4 Performance criteria
22. Every command must be acknowledged in a positive or negative way before the occurrence of the corresponding action within given response times.
    
## 3.2.5 Procedures
23. There must be automatic procedures to implement startup and shutdown of the telescope and instruments. These must allow startup and shutdown of instruments independently of the telescope and without affecting the telescope operation.
24. Reconfiguration procedures must exist, to change the observing environment.
25. Operations staff have privileges to change the environment, meaning selecting a suitable combination of instruments.
26. The operational software should know which subsystems are installed and operational at any given time.
    
## 3.3 External Interface Requirements
### 3.3.2 Hardware interfaces
27. The standard software must be adequate for the real-time requirements and must offer drivers to the standard electronics.
28. Links between electronics interfaces and main processors must meet the requirements imposed by the data specifications
### 3.3.3 Software interfaces
29. The Gemini 8m Telescopes software must interface to the external software.
### 3.3.3.1 Online image processing interfaces
30. It shall be possible to monitor the quality of the astronomical data as it comes in.
31. Quick-look data processing should be provided on the Gemini 8m Telescopes, with procedures suitable for fast on-line data preprocessing
32. A prerequisite acquired data to made available in a common format.
33. All additional data related to an exposure and logging information are made available on-line at the same time.
34. Off-line pixel processing for full data reduction should exist at the Gemini 8m Telescopes site, but does not have any interface to the Gemini 8m Telescopes software.
35. The specific on-line (quick-look) software development shall be seen as a subset of the development for the off-line data reduction system.
### 3.3.3.2 Online access to catalogues and previous data
36. On-line interactive access to the data archiving system should exist.
37. Computer access to star catalogues is also required, so that an automatic selection of candidate guide and standard stars can be made.
### 3.3.3.3 Access to other package
38. The Gemini 8m Telescopes software must be able to interface with all commercial software packages available on the Gemini 8m Telescopes and integrated into the Gemini 8m Telescopes operation.

## 3.3.4 Communication interfaces
### 3.3.4.1 Local Area Network(LAN)
39. The LAN shall support the majority of the Gemini 8m Telescopes system internal communication needs.
40. LAN shall be supplemented with a Local Time Bus, for distribution of absolute and relative time signals, and both a digital reflective memory bus and an analog event-based bus, for distribution of signals with requirements not satisfied by a LAN.
41. Local coordination and synchronization needs within a subsystem. This layer could be considered as internal to a given sub- system or instrument, but as more than one subsystem might need it, one should aim for a unique solution at the hardware and software level.
42. Global synchronization needs, such as the universal time synchronization requirement.
43. Exchange of control information, in the form of commands and status information.
44. Collection and transfer of raw astronomical data. Access from Wide Area Network (WAN) for remote diagnostics and monitoring from operations facilities (Bi-directional traffic).
    
## 3.4 General Constraints
### 3.4.1 User constraints
45. To allow coordination both locally at the Gemini 8m Telescopes site between the various users and with remote users, the software shall support access to the system from any user station.
### 3.4.2 Hardware constraints
46. Computer hardware must be able to run the Gemini 8m Telescopes software environment (operating systems, Gemini 8m Telescopes software) and provide compatibility in data format (identical internal data representation).
47. Identical network access must be supported
48. remote operation must include remote monitoring from the Gemini 8m Tele-scopes base facilities, together with access tools for diagnostic and test use.
### 3.4.3 Software constraints
49. Individual instruments must be able to run fully independently.
50. Telescope software at the two telescopes must be maintained to be identical in the upper layers (even if hardware should differ).
51. Additions of new instruments should aim, as a goal, at introducing no modification to already operational parts.
52. Modifications should be confined to the operational procedures and should not affect the bulk of the existing software.
53. Switching to different configurations must be possible at any time with appropriate procedures.
54. There must be easy procedures to reconfigure the system when subsystems are modified or removed.
55. The number of main packages of software must be kept to a minimum to facilitate maintenance, but compatibly with the need to have the right degree of modularity.
56. Commercial and public domain packages should be used whenever possible.
57. Existing software expertise should be consulted whenever possible
58. Existing software packages should be reused wherever possible
59. All software which does not directly control specific hardware must be written as machine independent, portable code. Even for microprocessor software, the software should be hardware independent, to allow a later choice of the target microprocessors.
60. To allow for expansion and maintenance, Gemini 8m Telescopes standards must be defined for the on-line software and the development environment.
61. On-line version control must be implemented. That is, the version control system must be available to recover/restore versions at all times.
62. At boot time, the Gemini 8m Telescopes software shall check the consistency of versions of all the various software components.
63. Table-driven software should be used whenever possible, to avoid unnecessary compilations.

# Page 54-68

## 3.5.3 Reliability and Availability
1. A reliability program should be a part in Gemini Control System. 
2. Retry procedures should be incorporated in the software in case of error.
3. The system should be able to reconfigure itself so that it continues observing for avoiding unnecessary downtime, even if needed to change into different mode.
4. There should be recovery procedures to restart after error failure. 
5. The system should be constantly monitoring active subsystems to be sure that they are operational before sending command to each subsystem, monitoring includes inactive subsystem as well. 
## 3.5.4 Maintainability
6. All subsystem software should include modules to aid in maintenance and testing of the subsystem. For example, including a simulator that provides a reference behavior for that subsystem. 
7. Each subsystem should have a background task running whenever that subsystem is operational, performing such tasks as checking power supply level, temperatures, performance, correct responses to commands. The OCS is to be notified of any detected problems. 
8. Each subsystem should provide a module for exercising all subsystem components, hardware and software. This module is executed automatically during start-up and on demand thorough the defined interface.
   
## 3.5.6 Security and Safety
9. The Gemini system must be able to self-monitor. The software should be able to quickly bring the system to a safe state upon notification of danger. 
10. Subsystem must be able to detect danger and report it appropriately. In case that risk persists, subsystem must be able to move themselves into safe states. 
11. Safety protection must be applied whenver there is the risk that the action of control software could endanger people or cause damage to any subsystem.
12. The Safety protection must be independent of the software. Which may include mechanical hard stops, electrical interlocks, electrical hard limit switches, soft limit switches, software limits, and watch dogs. 
13. The Gemini 8m Telescopes software should be able to bring the Gemini 8m Telescopes system quickly to a safe state upon detecting danger. 
14. Security must be provided to prevent accidental mix-up of commands from different users on different parts of the subsystem, and to prevent intrusion from the wide area network into the Gemini 8m Telescopes. 
15. A system operating in Engineering/Maintenance mode must ignore directives from other systems, additionally status information should be provided for use by other systems.
    
## 3.8 Installation Aspects
16. Test plans should be written for all individual software packages and modules comprising the Gemini 8m Telescopes software. 
17. Every system must be able to supply its current version upon request.
## 4.1.2 Modularity
18. During Science planning, there should be validity and feasibility checks for effective and efficient use of the telescope. 
## 4.2.1 On-line database subsystems
19. All telescope and instrument parameters should be kept in an on line database to allow easy implementation of table-driven applications.
20. The interface between software control packages should be normally done via interface calls to the on-line database.
21. All telescopes, instruments, and detector control information should be available at any operation level. 
22. The database must support both remote access and distributed data. 

# Page 69-84

## Remote Operations:
1: Full remote control and monitoring of telescope, enclosure, and instruments.
2: Multipoint monitoring for status checks from various locations.
3: Remote access for testing, development, diagnostics, and maintenance.
## Data Framework:
4: Storage and management of real-time astronomical data.
5: Automatic archiving of data using external software.
6: Accessible star catalogs managed through specialized software.
7: Centralized management and distribution of telescope/instrument parameters across databases.
8: Additional data storage in a relational DBMS.
## Data Inputs:
9: Handling of predefined data at startup, including catalogs, calibrations, and flat fields.
10: Processing of observing commands entered interactively or via the Sequencer.
## Data Outputs:
11: Generation of accurate responses to commands, including status, parameter updates, video, and astronomical data.
12: Capture and storage of operational information like logs, alarms, and errors for debugging.
## Inter-function Data Definitions:
13: Comprehensive logging of all input/output data for recreating observation sequences.
14: Command-based operation utilizing stored data, calibrations, and catalogs.
## Normal Operation:
15: Support for both automatic and interactive operations.
16: Detailed start-up and shut-down procedures.
17: Comprehensive event logging and engineering data logging capabilities.
## Operation in Failure Mode:
18: Robust fault-tolerance and recovery mechanisms.
19: Comprehensive error logging and categorization.
20: Strategies for handling errors and maintaining operation continuity.
## Software Methods:
21: Adoption of Ward/Mellor approach for real-time system development.
22: Use of specific tools and software for various development phases.
## Operating Systems:
23: Usage of UNIX and VxWorks for development and IOC operation.
24: Application of specific tools for GUI development and version control.
## Software Interfaces:
25: Utilization of specific protocols for inter-component communication.
26: Detailed documentation of software interfaces.
## External Software Packages:
27: Integration with off-line data reduction and quick-look analysis software.
28: Standardized data storage and transport formats.
## Databases:
29: Storage and management of astronomical data, control databases, and documentation.
30: Ensuring data integrity and reliability.
## Hardware Requirements:
31: Specification of workstation capabilities and peripheral requirements.
32: Recommendations for development and operational hardware.
## Communication Hardware:
33: Standards and protocols for network infrastructure and interlock systems.
## EPICS Components:
34: Configuration of system components, database access, and record support.
35: Tools for monitoring, control, and interfacing.

# Page 85-96

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
18. Capability to route commands and data through a channel, including intelligent channels that can convert data forms during transmission and connect multiple sources and targets.
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





# Non-functional Requirements
# Page 9-23
   
# 1.5 Overview
1. Maintenance under a version control system for all software.
2. Software must include facilities for easy (nearly automatic) inclusion into the Gemini software environment.
   
# 2.1 System Users
## 1. Support
a. Purpose: Maintaining the system (hardware and software), installing subsystems, and managing configuration changes.
b. Involvement: On-site or near-site support for the operational integrity of the system.
## 2. Administrator
a. Purpose: High-level functional control of the Gemini system as an integrated whole.
b. Involvement: Working with other users to determine observation scheduling changes, maintenance downtime, and system modifications.

# 2.2 Operational Levels
## 1. Operational Levels
a. Purpose: The system operates in different levels, each serving a specific purpose.
b. Involvement: Access to the system is restricted based on the current operational level.
## 2. Observing Level
a. Purpose: The "normal" operational mode of the system.
b. Involvement: This is where the system is primarily engaged in observing and collecting science data.
## 3. Maintenance Level
a. Purpose: Allows access to all subsystems for routine maintenance and diagnostic work.
b. Involvement: Typically used during daylight (non-observing) hours for maintenance activities.
## 4. Test Level
a. Purpose: The most primitive operational level used for installation/deinstallation of subsystems, including full diagnostics and installation calibration activities.
b. Involvement: Primarily used for system testing, installation, and calibration.

# 2.3 Access Modes
## 1. Testing
a. Purpose: Full, direct control of any subsystem for testing purposes.
b. Involvement: Access to all features of the subsystem. It should not affect the performance of ongoing observations.
## 2. Administrative
a. Purpose: Inquire about system utilization, efficiency, etc., using administrative access. No control, only status and scheduling information is accessible.
b. Involvement: Used for monitoring and obtaining information about system status without impacting ongoing observations.

# 2.4 Location of users of the system
## 1. Location of users
a. Purpose: Describes the physical locations associated with telescope operations.
b. Involvement: Determines the geographical distribution and infrastructure of facilities for telescope-related activities.

# 2.6 Operational context
## 1. Operational Constraints for Visitor Instruments:
a. Stability and long-lived nature of the visitor instrument interface.
b. Recognition that Gemini standards may not be cost-effective for some visitor instruments.
c. Evolution of Gemini standards over time and the potential impact on visitor instruments.
d. Recognition that establishing a combined standard for all instruments may not be feasible.
## 2. Gemini Observatory Simulator:
a. The simulator should present a functional definition of the observatory, appearing as standard hardware and software interfaces

# Page 24-38

1. Monitoring shall not affect the performance of ongoing observation.
2. The requirement for smooth and user-friendly interaction during interactive observing is prioritized as a top priority requirement.
3. In a “pass through” mode where all commands are accepted and transmitted with minimal checking and delay.
4. The design of the system should take into account future phases of implementation.
5. Remote control should be restricted to specific areas within the observatory grounds, and specific control measures must be provided, such as a "stop" button and live video and audio.
6. The system should support remote observing, allowing users to observe from remote sites, such as Cerro Tololo, Hilo, or their home institutes, depending on the available bandwidth.
7. Remote access to the Gemini 8m Telescopes and its instruments is required for monitoring and diagnostic purposes. To back up local users expertise and to help in case of problems.
8. Observing program can be performed by someone other than the proposing astronomer.
9. Service observing requires switching during the night among telescope modes and instruments.
10. Service observing requires a suitable organization to support it, and first of all, considerable experience with asmooth running system.
11. The software and data structures to support classical observing which have to be present in a system that is only interactive at the start.
12. Flexible scheduling requires switching during the night among telescope modes and instruments (typically 2 times per night).
13. The support structure for communicating commands must be reliable, with a uniform ACK/NAK protocol adopted across all systems. Timeouts must be supported at approximately 500 msec.
14. Handshaking of commands between IOCs must occur within 100-200 msec, signaling acceptance of each command.
15. For focusing and related activities, maximum acceptable detector readout time is about 0.1 sec.
16. For mosaicked, large optical detectors, a full readout of the detector must be done in about 2 or 3 minutes.
17. The LAN must sup port a transfer rate of 20-40 Mbits/second.
18. The system data capacity is capable of retaining 7 days of data produced by the largest instrument, the last 3 days.
19. The system must allow for fast transmission of rough images every 0.5 sec.
20. High-quality transmission must require less than 20 sec, and can only be assisted with loss-less compression.
21. Protection against accidental interference is to be implemented using an Access mode.
22. Every command must be accepted/rejected within 2 sec and before the corresponding action occurs.
23. Status display update must be within 4 sec at the local stations.
24. Requests of subsystems for status information must be answered within 5 sec and be possible in maintenance level operation.
25. Requirements for response times within the user interfaces are given in the User Interface requirements section.
26. Fault recovery, exception handling, fail-safe checks, etc. should be used to improve reliability.
27. This notification must be specific as to origin and problem. The notification must also be capable of being electronically logged.
28. In case of computer hardware failure concerning the user station equipment, it shall be possible to transfer control from one user station to another via a simple software reconfiguration procedure.
29. Similar functionality should be presented to the users using similar user interfaces. However, user interfaces should clearly reflect access modes and operating levels.
30. One of the goals of Gemini software is that all components be easily (pref erably automatically) combined into an integrated system.
31. software simulation module it cannot require any hardware specific to the application.
32. No subsystem package should make any assumptions about the surrounding environment beyond that provided in the interface specification.

# Page 39-53

## 3.1.1 Control Information Flow
1. No request for information shall produce a delay of control activities or locking, even if the corresponding equipment is not available or faulty.
2. Delay times for the exchange of control information must stay within precise time limits.
3. The protocol has to be predictable in that commands cannot get lost and replies have to come back reliably.
4. Gemini 8m Telescopes have to be restrictions for user access to information
### 3.1.2.1 Data flow
5. Detector data must be acquired and stored in the most effective way technology will allow.
6. Effectiveness should be evaluated in terms of cost, space requirements, longevity, and speed.
7. Intermediate storage of raw data in memory on different nodes and in different formats should be kept to a minimum. There must be at least two copies - one to secure data as acquired and one to do assessment of data quality on-line.
8. The link chosen to transfer data should represent as small a bottleneck as possible for data acquisition.
## 3.1.3 Other Information Flow
9. voice connectivity, perhaps point to point, be available on a permanent connection
10.Other astronomical information such as that coming from sky field monitors, autoguider cameras and sky monitoring devices such as cloud and seeing monitors shall be capable of being available.
   
## 3.2 Operation
### 3.2.1.1 Observing Level
11.Monitoring done in high level.
12.It is anticipated that all user categories have access to observing level.
### 3.2.1.3 Test Level
13.Access to test level will be extremely limited.
## 3.2.2 Privilege and protection levels
14.Privileges and protections are important parameters to define user operations.
### 3.2.2.2 Protections
15.Protections must be enforced among users
16.The operational software should indicate clearly to users the current operation level and check the compatibility between subsystems in different modes.
## 3.2.3 Capacity
17.The capacity of the system can be expressed in terms of nodes.
18.Gemini 8m Telescopes computers and software shall be capable of coping with the load of 10 active nodes, should the case arise.
## 3.2.4 Performance criteria
19.This section is intentionally kept at the level of performance criteria rather than response times
## 3.2.5 Procedures
20.The definition of the observing environments must be dynamic. The same applies to the related light path.

## 3.3 External Interface Requirements
### 3.3.1 User Interface(UIF)
21. Homogeneous user interface can be achieved only by applying the same user interface tools to the whole project, providing the Gemini 8m Telescopes user interface's ‘look and feel’.
22. The user interface should not be seen as a package linked to a specific computer.
23. Given the requirement to be able to access the Gemini 8m Telescopes from several points, the user interface should rather be seen as a package to be callable from a large number of stations, depending on where a user is. It should also be network transparent so that it does not matter where it is being run.
24. The user interface tools shall be based on standards which will be portable across different computer hardware platforms.
### 3.3.2 Hardware interfaces
25. The existence of hardware standards is essential for maintenance and repairs. It is also essential to avoid software duplication, and to simplify the Gemini 8m Telescopes software.
26. The universality of these drivers, stating that they should be used on all Gemini 8m Telescopes software subsystems and instruments.
### 3.3.3 Software interfaces
27. Interfaces are fully part of the Gemini 8m Telescopes software
#### 3.3.3.1 Online image processing interfaces
28. Standard reduction procedures should be available for basic on-line calibrations of the observed data.
29. Near-line processing should be available for simple data reductions required for data integrity validation.
#### 3.3.3.2 Online access to catalogues and previous data
30. The output format of the Gemini 8m Telescopes data must be compatible with the GEMINI archive requirements
### 3.3.4 Communication interfaces
#### 3.3.4.1 Local area network (LAN)
31. LAN must be capable of dealing both with the data band- widths required and with the required response times and synchronization needs.
32. LAN and WAN interfaces shall be homogeneous and shall be based on standards which allow migration on different media.
33. maintenance reasons and hardware independence, a clear hierarchical model must be implemented, supporting separation of logical and physical layers.
34. Network redundancy should also be considered in the design phase as a way to increase reliability and security, in particular for control information.

## 3.4 General Constraints
### 3.4.1 User constraints
35. An operational decision, implying privileges and pri- orities for the various categories of users, and definition of what a given user can actually do.
### 3.4.2 Hardware constraints
36. Computers used at the Gemini 8m Telescopes site, particularly in the test phase when they are outside the control room and near the subsystem under test, shall be checked against altitude and humidity specifications for the Gemini 8m Telescopes site.
37. Common development and implementation tools must be both available and supported.
38. Local processing power must be such that telescope and instrument control does not represent a significant overhead in the whole process of executing an observing pro- gram (the overhead, if any, should be limited by the time it takes for physical devices to act).
39. The choice of a scalable hardware architecture with computers at various performance levels should solve the problem of adequate on-line data assessment.
### 3.4.3 Software constraints
40. There must be easy procedures to reconfigure the system when subsystems are modified or removed.

# Page 54-68

## 3.5.3 Reliability and Availability
1. The downtime should be within the maximum of 15 minutes per night or 1 night per month. 
2. Errors or failures should be reported in a clear form in case of recovery fail. 
3. The system should be able to put itself into a safe state when recovery fails for safety concerns.
4. A measure of fault rates should be done during commissioning to establish baseline rates for system reliability monitoring. 
5. Range checking and validity checking should be supported before inputted command is executed. Which should be possible in advance, in order to prepare for automatic observations and simulating observations to estimate results. 
6. On-line pre-checking of the operational status of equipment should be done prior to sending critical or time consuming commands.
7. The goal for recover and/or reconfiguration is 5 minutes from onset of the error condition to be able to observe again.
   
## 3.5.4 Maintainability
8. Maintenance of commercial software used by this work package is the responsibility of the WPR and the maintenance costs are not covered by the work package budget.
9. Organization level maintenance should be done during an observing session by unit replacement and module replacement. 
10. Intermediate level maintenance should be done at a Gemini 8m Telescopes base facility during the day by module replacement. 
11. Depot level maintenance should be done at a Gemini 8m Telescopes base facility during the day. 
12. Contractor maintenance should be done at the contractor/vendor’s site. 
13. All equipment should support a programmed adjustment and maintenance interval of 30 days or longer.
    
## 3.5.5 Human Engineering
14. All Gemini software must be designed with human engineering requirements under consideration. 
## 3.5.6 Security and Safety
15. The Gemini Control System development effort will obey and abide by both the letter and the spirit of all applicable engineering practices, laws, regulations, and policies.
16. All neccessary safety approvals will be obtained before devices are accepted. 
17. A well designed network gateway acting as a firewall should be implemented to provide intrusion security. 
18. There should be security preventing the intrusion into the system by unauthorized users, or users at unauthorized access levels. 
19. All systems should be appropriately interlocked.
    
## 3.5.7 Testability
20. The failure of a subsystem should be discovered 90% of the time before the failure starts to impacts observing. 
## 3.5.8 Expandability
21. The software should be designed to be easily extended and upgraded with modifications to non-changing components. 
22. The software’s installation process and documentation must be developed with expandability above in mind, using general industry standards. 
## 3.5.9 Modularity
23. All software should be developed using typical modularization and standardization techniques. 
24. No module can rely upon information outside its own defined interface.
25. On-line databases should be able to accessed through their defined interfaces.
26. The software must be strictly modular, functionality of a subsystem should correspond to that which belongs to that subsystem.
27. Due to above requirement, it should be possible to get information about other parts of the system. 
28. There should not be undesired interactions between subsystem, this may enforced at client/server interface or message system level.
    
## 3.5.10 Contingencies
29. The security and safety of the system should be guaranteed even in the event of component failures, including higher-level software. 
30. The system should be able to prevent a single-point failure from the loss of collected data in terms of data redundancy. 
## 3.5.11 Concurrency
31. The system should take advantage of parallel operations to increase efficiency. 
32. The Telescope Control system should be capable of detecting and invoking parallel operations. 
## 3.6 Life Cycle Aspects
33. The Gemini 8m Telescopes software should be developed according to structured and formally defined development model.
## 3.7 Development Environment
34. The choice of using a environment has to be defined, together with the choice of all the Gemini 8m Telescope standards.
35. The environment selection criteria are of following: Emphasis on development and productivity requirements(cross support tools), portability of software(target hardware independance), hardware and vendor independence, and use of industrial and defacto standards.
    
## 3.8 Installation Aspects
36. Test procedures methods should be defined in the Software Test Plan(STP). 
37. A formal release system should exist at package and module level, which should be checkable on-line by the operational procedures for consistency. 
## 4.1.1 Maintenance Attribute
38. The Gemini system maintenance philosophy is described in the Software Management Plan (SMP). 
39. Preventative maintenance is scheduled as specified in the Gemini Design Requirements Specification.
## 4.2.1 On-line database subsystems
40. Access times to the database should be within 2-3 milisecond per access. 
41. Asynchronous writes should be supported to allow concurrent operation. 
42. Time-access critical information should be available in memory.
43. The access method should be consistent and logical.

# Page 69-84

## Remote Operations:
1: Addressing performance degradation due to WAN limitations.
2: Ensuring security and authorized access control.
## Data Framework:
3: Seamless integration with external software for data management.
4: Ensuring data reliability, accessibility, and efficient organization.
## Data Inputs:
5: Maintaining data integrity and system responsiveness.
## Data Outputs:
6: Organized and reliable data storage with efficient debugging support.
## Inter-function Data Definitions:
7: Ensuring data completeness and system reliability in command execution.
## Normal Operation:
8: Optimizing efficiency, reliability, and data management during operations.
## Operation in Failure Mode:
9: Ensuring system resilience and comprehensive error reporting.
## Software Methods:
10: Adherence to best practices in software development and review.
## Operating Systems:
11: Ensuring performance, compatibility, and flexibility of operating systems.
## Software Interfaces:
12: Standardization and performance optimization of communication protocols.
## External Software Packages:
13: Ensuring integration, compatibility, and standardization of external software.
## Databases:
14: Ensuring data security, compliance, and seamless system integration.
## Hardware Requirements:
15: Ensuring performance, compatibility, and future adaptability of hardware.
## Communication Hardware:
16: Compatibility, scalability, and safety of communication hardware.
## EPICS Components:
17: Ensuring scalability, performance, and usability of system components
    
# Page 85-96

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

### 5.5.3 Remote DB Access
41. Remote database Access must be executed swiftly to ensure timely retrieval and updating of data across the system.
42. The system must reliably provide accurate information when accessing remote databases, with minimal errors or downtime.

### 5.6 Command Implementation
43. The system must ensure that commands are structured in a way that allows for interoperability across different subsystems and components within the control system.
44. The command structure and routing should accommodate a potentially large number of subsystems and complex command strings.
45. The use of ASCII strings for commands implies a standard format for command representation across the system.

ITCS431 Software Design and Development (2023)
