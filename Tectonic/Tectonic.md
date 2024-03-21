# Team Members
1. 6488073 Chalisa Sae-ngow [(GitHub)](https://github.com/NiChalii)
2. 6488089 Pattaravit Suksri [(GitHub)](https://github.com/patchyysuk)
3. 6488100 Jiraruch Tantiyavarong [(GitHub)](https://github.com/JaJiraruch)
4. 6488105 Kantinan Yontawil [(GitHub)](https://github.com/Nnsdiia)
5. 6488128 Thanapat Nonpassopon [(GitHub)](https://github.com/thanapattar)
6. 6488134 Jirateep Rudeerudchanawong [(GitHub)](https://github.com/kikikieieiei)

# Chapter 1
### FUNCTIONAL REQUIREMENTS
1.The software programs provide tools for directing the creation of controls and data gathering systems inside the Gemini System.
2.The development of the Gemini Control System must comply with all relevant engineering standards, laws, rules, and guidelines.
3.Standard development environments and processes must be used to create all Gemini software.
4.The Gemini software must develop in an evolutionary fashion, using the CVS version control system.
5.Gemini software must be fully documented, both externally and internally, with the relevant comments included.
6.Gemini subsystem packages have to include modules for the subsystem's testing and diagnostics.
7.Gemini program must have a version label and be available for download from executing software via control commands.
8.Various user interface modules should show the user different parts of the instrument's functionality 
9.Every hardware subsystem needs to provide a software simulation module that can reasonably react to commands delivered to the hardware. 
10.The Gemini software must exhibit numerous common attributes, as described in the document
### NON-FUNCTIONAL REQUIREMENTS
1.The Gemini Control System software is oriented toward the developers of control and data acquisition systems, not toward the science user of the Gemini telescopes.
2.The Gemini software must be designed with human engineering requirements under consideration, including provisions for minimizing stress effects and fatigue, feedback on operation on specific tasks, people and machine interfaces, procedures, training and experience, interaction with team members, and management and organizational behavior.
3.All necessary safety approvals must be obtained before devices will be accepted, and safety precedents and requirements are detailed in the document .
4.The Gemini software must be developed using typical modularization and standardization techniques, with each module's environment strictly defined by its interface to other components .

# Chapter 2 
### 2.1 System Users
### FUNCTIONAL REQUIREMENTS
- Data Collection: The system must be capable of collecting science data as per the astronomer's plan, which may include interactive observing.
- Data Monitoring and Validation: The system should allow the science observer to monitor data acquisition and validate the integrity of the data being collected.
- Telescope and Instrument Control: The system should enable the Telescope Operator to control the telescope and its instruments effectively.
- Maintenance and Configuration: Support staff should be able to maintain the system, both hardware and software, and handle installation and configuration changes.
- Subsystem Design and Upgrades: Developers need to design, test, configure, and upgrade subsystems.
- Integrated System Control: Administrators require functionality to control the Gemini system holistically, including scheduling observations, maintenance, and system modifications.
### NON-FUNCTIONAL REQUIREMENTS
- Usability: The system must be user-friendly for various types of users, such as astronomers, science observers, telescope operators, etc.
- Reliability: The system needs to function accurately and reliably, particularly during observations.
- Maintainability: Maintenance of both hardware and software should be feasible without excessive downtime or complexity.
- Scalability: The system should be capable of handling upgrades and expansions as required.
- Performance: The system should have high performance to handle real-time data collection and processing efficiently.
- Security: Data integrity and system security must be ensured to protect sensitive scientific data.
- Flexibility: The system should be flexible to accommodate different science plans and observational needs.
- Compatibility: The system should be compatible with various subsystems and technologies used for astronomy.

### 2.2 Operational Levels
### FUNCTIONAL REQUIREMENTS
- Operational Modes: The system must support different operational levels – Observing, Maintenance, and Test.
- Access Control: The system should restrict access based on the current operational level.
- Subsystem Management: Capability to manage subsystems during Maintenance and Test levels, including installation, deinstallation, diagnostics, and calibration.
### NON-FUNCTIONAL REQUIREMENTS
- Security: The system must ensure secure access control at different operational levels to protect sensitive operations and data.
- Reliability: The system should reliably operate in different modes without failures, particularly during critical operations like observing and testing.l
- Usability: The interface for switching between different operational levels and managing them should be user-friendly and intuitive.

### 2.3 Access Modes
### FUNCTIONAL REQUIREMENTS
- Access Modes: The system must support multiple access modes, including Observing, Monitoring, Operation, Planning, Testing, and Administrative.
- Mode-Specific Capabilities: Each access mode should offer distinct functionalities:
    Observing: Facilitates collection of science data and selection of instrument parameters.
    Monitoring: Provides read-only access to subsystems for observation oversight.
    Operation: Enables direct control of the telescope and instruments for operational tasks.
    Planning: Offers tools for science planning, including a virtual telescope simulator.
    Testing: Allows comprehensive control for subsystem testing.
    Administrative: Provides access to system utilization, efficiency, and scheduling information.
- Simultaneous Access: The system should allow users to access multiple modes concurrently without compromising system performance or observation integrity

### NON-FUNCTIONAL REQUIREMENTS
- System Performance: The system must ensure high performance and stability, particularly during critical observing operations and when multiple access modes are used simultaneously.
- Security and Access Control: Robust security measures should be in place to manage the different access modes and ensure the safety and integrity of the system.
- User Interface and Usability: The system should have an intuitive and user-friendly interface for seamless switching and operation across different access modes.

### 2.4 Location of users of the system
### FUNCTIONAL REQUIREMENTS
- Remote Accessibility: The system must be accessible to users at multiple facilities, ensuring consistent and effective operation across different locations.
- Site Management: It should manage operations at the Gemini 8m Telescopes site, which includes both the enclosure and the control facility.
- Multi-Site Coordination: The system must effectively coordinate between the Gemini 8m Telescopes operations facilities and the Gemini 8m Telescopes site, ensuring seamless integration    of activities.
### NON-FUNCTIONAL REQUIREMENTS
- Scalability: The system must be scalable to support operations across multiple facilities without degradation in performance.
- Reliability: High reliability is required to ensure continuous and effective telescope operations across all sites.
- Network Performance: Efficient network performance is essential for real-time communication and data exchange between the Gemini 8m Telescopes site and other operations facilities.

### 2.5 User-Level Requirements
### FUNCTIONAL REQUIREMENTS
- User Interface: The system must offer an interface that is simple to learn and secure for observing astronomers, providing operational information automatically and on request.
- Access Control: Observing astronomers should not have direct control over the telescope but must be able to enquire about its status or any subsystem.
- Operation Mode: The system should predominantly operate via an automatic sequencer, with a provision for interaction with the scheduler program rather than direct control programs. It    should also allow resequencing of observing commands.
### NON-FUNCTIONAL REQUIREMENTS
- Usability: The interface should be user-friendly and intuitive for astronomers with varying levels of experience.
- Security and Safety: The system must ensure safe operation by restricting direct telescope control and maintaining a single point of control and responsibility.
- Flexibility and Adaptability: The system should be adaptable to different operational needs and capable of evolving with gained experience, particularly in managing the scheduling        queue.
### 2.6 Operational Context
### FUNCTIONAL REQUIREMENTS
- Multi-Telescope Integration: The system should support integration with nearby telescopes for operations like interferometry.
- Multi-Instrument Operation: Provide parallel access to multiple scientific instruments mounted on the telescope, including capabilities for calibration, hot standby, and operation in different modes.
- Visitor Instrument Support: The system must support outside instruments with a standardized interface for status acquisition, preprogrammed sequences, and telescope offsetting.
- Multi-User Access: Allow multiple users to operate instruments simultaneously, ensuring accessibility and control from different user stations.
## NON-FUNCTIONAL REQUIREMENTS
- Flexibility: The system should adapt to evolving Gemini standards and be flexible enough to support various visitor instruments.
- Stability and Longevity: The interface for visitor instruments should be stable and long-lived.
- Security and Safety: Maintain security and safety while providing multi-point access and monitoring capabilities.
- Performance: Ensure that monitoring and multi-user operations do not affect the performance of ongoing observations.

### 2.7 Observing Mode Requirements
### FUNCTIONAL REQUIREMENTS
- Sequencer-Driven Operation: The system should operate primarily through a sequencer for efficient use of the telescope.
- Interactive Operation Support: Interactive operations must be enabled through the Observatory Control System (OCS) with a visual user interface.
- Multi-Station Participation: The system must allow multiple stations to participate in observing, with capabilities like automatic sequencing and queue-based observing.
### NON-FUNCTIONAL REQUIREMENTS
- Usability: The system should offer a user-friendly interface for astronomers, particularly in automatic and interactive modes.
- Flexibility: The system must be adaptable for various types of observing, including automated and manual scheduling.
- Remote Operation Capability: The software should support remote operations seamlessly, ensuring no difference in functionality between on-site and off-site operations.

### 2.8 Observing Support
### FUNCTIONAL REQUIREMENTS
- Automated Observations: The system should support automated observations using predefined sequences, akin to space observatories.
- Competent Monitoring: Ensure effective monitoring capabilities, both onsite and remotely.
- Flexible Scheduling: The system must allow for dynamic scheduling changes in response to varying conditions, including weather.
### NON-FUNCTIONAL REQUIREMENTS
- Flexibility: The system should maintain the advantages and flexibility of ground-based astronomy, even with automated sequences.
- Adaptability: It should adapt quickly to changes in scheduling and switch between telescope modes and instruments efficiently.
- Decision Support: The system needs to assist the operations team in decision-making, especially for expert scheduling.

### 2.9 General Software Requirements
### FUNCTIONAL REQUIREMENTS
- Standardized Command Syntax: Uniform command syntax across all subsystems, including workstations and IOCs.
- Common Command Set: A set of common commands for checking operational status and performing self-tests, with additional commands for IOCs like start, stop, initialize, and reset parameters.
- Reliable Communication Protocol: A reliable support structure for command communication with uniform ACK/NAK protocols and timeouts.
- Data Handling and Transfer: Efficient data flow from detectors, concurrent data access and display capabilities, and specific data acquisition and storage formats.
### NON-FUNCTIONAL REQUIREMENTS
- Consistency and Standardization: Consistent command syntax and responses across different subsystems.
- System Performance: The system must handle peak control information and support high data transfer rates.
- Reliability in Data Storage and Transmission: Secure data storage at multiple levels and reliable data transmission using standardized formats.
- Capacity and Bandwidth Management: Adequate system data capacity to handle

### 2.10 Operation Privileges, Protections and procedures
### FUNCTIONAL REQUIREMENTS
- Privilege System: Implement a privilege system at each operating level, determining user privileges during login.
- Access Mode Allocation: Develop an allocation system to dynamically assign resources, especially for critical resources, to prevent deadlocks.
- Procedure Implementation: Establish procedures for common tasks like telescope and instrument startup/shutdown, self-testing, configuration, and dynamic reconfiguration.
### NON-FUNCTIONAL REQUIREMENTS
- System Integrity and Security: Ensure system integrity by protecting against accidental interference and managing resource allocation securely.
- Simplicity and Usability: The privilege system and procedure implementation should be simple and user-friendly.
- Resource Management: Efficiently manage system resources to prevent deadlocks and ensure smooth operation.
### 2.11 General Performance and reliability requirements
### FUNCTIONAL REQUIREMENTS
- Command Handling: The system must be able to accept or reject commands within 2 seconds.
- Status Information: It should provide status updates within 4 seconds at local stations and respond to subsystem status requests within 5 seconds during maintenance operations.
### NON-FUNCTIONAL REQUIREMENTS
- Capacity Management: There should be no hard restrictions on the number of simultaneous users, with policy decisions guiding access.
- System Availability: Software bugs must be logged and fixed promptly, with restarts primarily due to hardware failures.
- Reliability: The system should include robust fault recovery, exception handling, and fail-safe checks to improve reliability.

### 2.12 Test and Checkout requirements
### FUNCTIONAL REQUIREMENTS
- Built-in test (BIT) facilities within the telescope and instrument software to verify system and software performance.
- Test specifications for every software module to check normal operation for acceptance tests and on-line procedures.
- Execution of self-test sequences by the control software to automatically exercise all subsystems in the operational configuration.
### NON-FUNCTIONAL REQUIREMENTS
- Inclusion of regression tests in every software package to ensure updates do not introduce new faults.
- Reliability of the software through comprehensive testing protocols.
- Maintainability, ensuring the software continues to perform correctly as it is modified

### 2.13 Contingencies
### FUNCTIONAL REQUIREMENTS
- Fault Notification: Subsystems must provide specific fault notifications to users and log these electronically.
- Fault Tolerance: Predefined procedures must be in place to manage subsystem failures and allow for system reconfiguration.
### NON-FUNCTIONAL REQUIREMENTS
- Reliability: The system should be reliable in detecting and notifying faults.
- Maintainability: It must allow for easy maintenance through electronic logging and structured fault notification levels.
- Robustness: The system design must prevent total failure in case of individual component failures, ensuring continuous operation.

### CONSTRAINTS
### User Constraints
- There should be no restrictions imposed by the software on users. Only policy decisions (permissions, access privileges, etc.) should prevent any user from accessing any part of the Gemini system from any local or remote station.
- Similar functionality should be presented to the users using similar user interfaces. However, user interfaces should clearly reflect access modes and operating levels.

### Hardware Constraints
- Hardware constraints are covered in the individual chapters the Software Design Description.

### Software Constraints
-Commercial packages, off-the-shelf public domain software, and standards are to be used whenever feasible.
- Existing external software will be integrated with the Gemini software. The interfaces involved in this integration are considered part of the Gemini software system. 
All Gemini software is to be developed using standard methodologies and development environments. One of the goals of Gemini software is that all components be easily (preferably - automatically) combined into an integrated system. 
- Gemini software developers should maintain accurate change logs showing software modifications as they are applied to the system software.
- Gemini software developers should adhere to a standard method for the reporting and recording of errors from both internal and external sources
- Gemini software should be developed in evolutionary fashion, using the CVS version control system.
- All Gemini subsystem packages should include as part of the software both a simulator module for inclusion in the virtual telescope (see Design constraints, below), and user interface modules for the user interface environments that the subsystem will be operating in. The interfaces required of these user interface modules are described in Section 3.3 on page 3-6. 
- All Gemini software is to be fully documented, internally with appropriate comments, and external documentation. External documentation must include Unix-style man pages.
- All Gemini subsystem packages must provide modules for the testing and diagnosis of the subsystem. 
- All instrumentation control software must provide full access to all instrument functionality. It is likely that different user interface modules (see above) would present different portions of this functionality to the user. The information required of each interface module is found in the Functional Requirements specifications for each instrument.
- All Gemini software must be version labeled, both in source and binary form. The version information is to be retrievable from executing software via control commands.

### Design Constraints
A.There are different requirements for software running on different layers. For example, strict real-time control is restricted to the IOC layer.
B.Also, the use of a virtual-telescope model in the Gemini system means that the integrated system can be tested and developed independently of the target hardware. This is useful not only in the use of the telescope simulator during science planning, but in maintenance and testing as well. Therefore all hardware subsystems must provide a software simulation module (as stated earlier) that responds in reasonable fashion to commands directed at that hardware. This simulation may require a standard environment, such as VxWorks, EPICS, and VME crate/cpu, but it cannot require any hardware specific to the application.
C.Gemini subsystem should be as self-contained and autonomous as possible, thereby decreasing the functional width of the interface to the rest of the Gemini system. 
D.No subsystem package should make any assumptions about the surrounding environment beyond that provided in the interface specifications.

# 3. General Requirements
### FUNCTINAL REQUIREMENTS
DATA SPECIFICATION (3.1)
- Control information must be transferred, typically in the form of commands and replies from users, to telescopes and instruments.
- Control information on all controlled variables must be provided by all subsystems on request.
- The meteorological information coming from a weather station should be available centrally.
- It is explicitly required that all such information is available to the Gemini 8m Tele- scopes software and is capable of being available to all users of the Gemini 8m Tele- scopes, subject only to restrictions with respect to updating.
- Intermediate storage of raw data must be at least two copies - one to secure data as acquired and one to do assessment of data quality online.
- Replies might contain status information and, in general, data concerning instruments and telescopes, to be stored together with the astronomical data.
OPERATION (3.2)
- A further subdivision within the levels can be achieved by implementing privileges associated with categories of users or with the location of the user station
- The operational software should indicate clearly to users the current operation level and check the compatibility between subsystems in different modes.
- Each node will have the capability to run at all operation levels.
- Reconfiguration procedures must exist, to change the observing environment.
- Operations staff have privileges to change the environment, meaning selecting a suitable combination of instruments.
EXTERNAL INTERFACE REQUIREMENTS (3.3)
- Standard reduction procedures should be available for basic on-line calibrations of the observed data.
- Computer access to star catalogs is also required, so that an automatic selection of candidate guide and standard stars can be made.
GENERAL CONSTRAINTS (3.4)
- Switching to different configurations must be possible at any time with appropriate procedures.
- The number of main packages of software must be kept to a minimum to facilitate maintenance, but compatible with the need to have the right degree of modularity.
- All software which does not directly control specific hardware must be written as machine independent, portable code. 
ATTRIBUTE (3.5)
- Monitor level. Each subsystem should have a background task running whenever that subsystem is operational, performing such tasks as checking power supply lev- els, temperatures, performance, and correct responses to commands. The OCS is to be notified of any detected problems.
- Self-test level. Each subsystem should provide a module for fully exercising all sub- system components, both hardware and software. This module is executed automatically during start-up and on demand through the defined interface. Problems are to be automatically reported to the OCS via the defined interface.
- System level. There are also software modules for testing the subsystem as an integrated portion of the entire system. This software would be executed on demand during maintenance operation level.
- The Telescope Control System should be capable of detecting and invoking parallel operation as it is responsible for control of all of the telescope and enclosure subsystems.

### NON-FUNCTIONAL REQUIREMENTS
DATA SPECIFICATION (3.1)
- No request for information shall produce a delay of control activities or locking, even if the corresponding equipment is not available or faulty.
- The link chosen to transfer data should represent as small a bottleneck as possible for data acquisition.
- Intermediate storage of raw data in memory on different nodes and in different for- mats should be kept to a minimum.
- Astronomical data will have to be transported between GEMINI and the home institutes of visiting astronomers in FITS format.
- TV data concerning site monitoring and voice need to be capable of being available at all operations facilities.
- Other astronomical information such as that coming from sky field monitors, autoguider cameras and sky monitoring devices such as cloud and seeing monitors shall also be capable of being available.
OPERATION (3.2)
- Protections must also be enforced among users.
- The Gemini 8m Telescopes control software shall allow simultaneous operation of up to six active control nodes and up to two more monitoring nodes (one local and one remote) without appreciable degradation of performance.
- The Gemini 8m Telescopes computers and software shall be capable of coping with the load of 10 active nodes.
- Every command must be acknowledged in a positive or negative way before the occurrence of the corresponding action within given response times.
- There must be automatic procedures to implement startup and shutdown of the telescope and instruments.
- These must allow startup and shutdown of instruments independently of the telescope and without affecting the telescope operation.
EXTERNAL INTERFACE REQUIREMENTS (3.3)
- A homogeneously designed interface is a requirement for the entire system.
- The user interface should not be seen as a package linked to a specific computer.
- The user interface should rather be seen as a package to be callable from a large number of stations.
- It should also be network transparent.
- The image preprocessing system shall be able to monitor the quality (image quality, spectral resolution, signal to noise, etc.) of the astronomical data as it comes in.
- It will be interfaced to the Gemini 8m Telescopes, and is referred to as external.
- The output format of the Gemini 8m Telescopes data must be compatible with the GEMINI archive requirements.
- The system will be established by the Gemini Archiving Requirements.
- The Gemini 8m Telescopes software must be able to interface with all commercial soft- ware packages available on the Gemini 8m Telescopes and integrated into the Gemini 8m Telescopes operation.
- Quick-look data processing should be provided on the Gemini 8m Telescopes, with procedures suitable for fast on-line data preprocessing
- Quick-look should be usable within exposure sequences to provide results and feed- back parameters to the control software in a programmed way, without the need for manual intervention.
- Near-line processing should be available for simple data reductions required for data integrity validation
GENERAL CONSTRAINTS (3.4)
- The software shall support access to the system from any user station.
- Individual instruments must be able to run fully independently.
- Telescope software at the two telescopes must be maintained to be identical in the upper layers (even if hardware should differ).
- Additions of new instruments should aim, as a goal, at introducing no modification to already operational parts. Modifications should be confined to the operational procedures and should not affect the bulk of the existing software.
- There must be easy procedures to reconfigure the system when subsystems are modified or removed.
- Existing software packages should be reused wherever possible.
- Commercial and public domain packages should be used whenever possible.
- Existing software packages should be reused wherever possible.
- All software which does not directly control specific hardware must be written as machine independent, portable code. Even for microprocessor software, the software should be hardware independent, to allow a later choice of the target microprocessors.
- On-line version control must be implemented. That is, the version control system must be available to recover/restore versions at all times.
ATTRIBUTE (3.5)
- The system’s retry procedures must be embodied in the software in case of error or failure.
- All subsystem software is to include modules to aid in the maintenance and testing of the subsystem.
- All equipment shall support a programmed adjustment and maintenance interval of 30 days or longer.
- Data redundancy is also a requirement, to prevent a single failure from causing the loss of collected data.

# Chapter 4 -Specific Requirements
Attributes
Maintenance
### FUNCTIONAL REQUIREMENTS
- The Gemini system maintenance philosophy is described in the Software Management Plan (SMP).
### NON-FUNCTIONAL REQUIREMENTS
- Preventative maintenance is scheduled as specified in the Gemini Design Requirements Specification.

Modularity
### FUNCTIONAL REQUIREMENTS
- All software is developed using typical modularization and standardization techniques.
- Each module's environment is strictly defined by its interface to other components.
- No module can rely upon information outside of this interface.
- Module selection should be done in logical fashion to minimize the size of the interfaces between modules.
- The on-line databases can be considered part of this interface, but are only accessible through the defined interfaces.
- There are recovery procedures to restart after error failure.
- During science planning, there should be validity and feasibility checks to help ensure effective and efficient use of the telescope. Where appropriate, these checks should also be performed during operation.

### NON-FUNCTIONAL REQUIREMENTS
- Reliability and availability: A measure of fault rates should be done during commissioning to establish baseline rates for system reliability monitoring.
- The system should be constantly monitoring active subsystems to be sure they are operating correctly before sending commands to each subsystem. 

Other Control anSoftware Requirements
On-line database subsystems
### FUNCTIONAL REQUIREMENTS
- Store all telescope, instrument, and detector control information.
- Provide access to information at all operation levels.
- Offer a consistent and logical (name-based) access method.

### NON-FUNCTIONAL REQUIREMENTS
- Access times are between 2-3 milliseconds per access.
- Support asynchronous writes for concurrent operation.
- Cache time-access critical information in memory.
- Support both remote access and distributed data.
- Internal (within the IOC) implementation based on EPICS.
- Host workstation implementation to be determined.


Communication subsystems
Remote Operations
### FUNCTIONAL REQUIREMENTS
- Support full implementation of remote operations.(Remote observing,Remote control of telescope, enclosure, and instruments.Multipoint monitoring,Remote monitoring,Remote access for testing, development, diagnostics, and maintenance)
- Extend all operational capability found in on-site operations to remote operations.
- Encode video data signals digitally and transfer via WAN to remote sites.
- Implement security to control access to system features.
- Possibly restrict some operations to specific remote sites.

### NON-FUNCTIONAL REQUIREMENTS
- some form of security to control access to system features

Data Specification
Data Framework
### FUNCTIONAL REQUIREMENTS
- Store astronomical data for the current observation in the on-line data store.
- Automatically store astronomical data onto the Archive medium (external software).
- Provide access to astronomical object catalogs (external software).
- Distribute telescope and instrument parameters in databases across the IOCs for those systems.
- Maintain a central repository for telescope and instrument parameter databases in the OCS (developed software).
- Store all additional data not required online (configuration, documentation, logs) in a relational DBMS.
### NON-FUNCTIONAL REQUIREMENTS
- Availability of current observation data in the on-line data store.
- Automatic transfer of astronomical data to the Archive medium.
- Access to astronomical object catalogs.
- Distribution of telescope and instrument parameters across IOCs.
- Central repository for parameter databases in the OCS for download to IOCs.
- Storage for non-essential data in a relational DBMS.

Data inputs
### FUNCTIONAL REQUIREMENTS
- The system should have the capability to access and utilize predefined catalogs for input data, ensuring the availability of relevant information for operations.

Data output
### FUNCTIONAL REQUIREMENTS
- Provide replies to commands, including status information, updates to parameters, and video data.

Inter-function data definitions
### FUNCTIONAL REQUIREMENTS
- The system must record all input and output data (commands, replies, status updates, etc.) appropriately to recreate the observation sequence.
- Given configuration parameters, the system operates by receiving and executing a sequence of commands.
- The system incorporates previously stored data, calibrations, and star catalogs during operation.

### NON-FUNCTIONAL REQUIREMENTS
- The logged data must be sufficient to accurately reconstruct the observation sequence. This implies a requirement for data completeness and relevance.

Normal Operations
### FUNCTIONAL REQUIREMENTS
- Support automatic operation for preplanned observations.
- Enable interactive operation for science planning and program changes.
- Allow switching between automatic and interactive modes during observation for handling exceptional conditions.
- Ensure normal operation is possible at all operation levels (observing, maintenance, and test) for relevant subsystems
- Define overall telescope performance as the percentage of viewable time spent taking exposures.
- Maximize system concurrency to improve performance, particularly with the Sequencer.
- Include a shut-down procedure for all hardware and software.
- Automatically log all start-ups and shut-downs with timestamps for availability statistics.
- Log all important events with timestamps and indexes for recreating observation sequences
- High-frequency (200 Hz) logging of engineering data for short periods.
- Low-frequency (1 Hz or less) long-term logging of engineering data in a common format (SYBASE baseline)

### NON-FUNCTIONAL REQUIREMENTS
- Data sufficiency of logs: Logged data should be sufficient to accurately reconstruct observations.
- System responsiveness and concurrency: The system should react quickly to commands and utilize concurrency effectively to maximize performance.
- Start-up and shut-down reliability: Ensure consistent and timely completion of start-up and shut-down procedures.
- Logging efficiency and accessibility: System and engineering logs should be efficiently recorded and readily accessible for analysis.

Operations in failure mode
### FUNCTIONAL REQUIREMENTS
- Specifies a generic requirement for the system to handle faults and recover from them.
- Define three error types (fatal, serious, warning) and establish a standard logging procedure for all errors.
- Implement recovery procedures for each subsystem that becomes inoperative, including command retries for timeouts or no-response conditions.
- Define specific recovery performance expectations for each subsystem in its functional specification.
- Allow rescheduling observations to utilize different instruments if the primary instrument fails.
- Enable continued operation with reduced functionality in case of certain errors.
- Prevent failures in one subsystem from cascading to other functioning subsystems and communication links.

### NON-FUNCTIONAL REQUIREMENTS
- Logged error information should be detailed enough to identify the source and sequence of events leading to the error.
- Error logs should be efficiently recorded and easily accessible for analysis and troubleshooting.
- Recovery procedures should be effective and complete within appropriate timeframes for each error type.
- The system should strive for minimal warning messages, with an increase in warnings potentially indicating the need for maintenance or tuning.
- Define two types of alarms (automatic and manual) and specify procedures for acknowledgement and clearing each type.

Software standards
Software methods
### NON-FUNCTIONAL REQUIREMENTS
- All Gemini supported software must be developed using the Ward/Mellor approach for real-time systems, encompassing:
    - Review procedures 
    - Analysis, design, and development methods 
    - Documentation 
    - Coding and debugging 
    - Simulation 
    - Testing and integration 
- Functional analysis tool: Functional analysis must be performed using a CASE tool compatible with Ward/Mellor techniques (e.g., TSEE).
- Design documentation and review: Design should employ techniques and diagrams introduced by Ward and Mellor and be reviewed by the Gemini staff.
- Development standards: While not explicitly defined, detailed design and development standards are expected to conform to system goals and established best practices.
- Object-oriented approach: An object-oriented approach is encouraged but not mandatory.

Operating System
### FUNCTIONAL REQUIREMENTS
- User-interface and OCS levels have sufficient performance for human interaction and communication.
- IOC level requires real-time support.
- Development environment supports:
    - Productivity and development tools
    - Software portability and hardware independence
    - Vendor independence
    - Industry and de-facto standards
    - State-of-the-art user interfaces
    - Distributed environments
- Use UNIX System V, Release 4 with POSIX-compliant calls.
- Discuss special needs with GPO if not met by OS calls.
- Use higher-level OS interfaces for packages with higher portability requirements.
- Use X-windows v11R5 or v11R6 for GUIs and Tcl/Tk as the principal language.
- Use GNU software tools where possible.
- Use Imake or GNU's autoconfigure for build tools.
- Use CVS for version control.
- IOCs use VxWorks real-time operating system.
- Use IMP for communication between IOCs and Unix workstations.
- Develop IOC software on Unix workstations using a windowed development environment.
- Use the GNU cc compiler with VxWorks for cross-compiling IOC software.
- Use a common development environment for IOC software development.
- Embedded software below IOC level doesn't require downloading (except for upgrades), stored in ROM or FLASH memory.
- Access embedded software through IOC software.
- Host workstation OS is Unix (Solaris 2.3 or above).
- Installed target IOC OS is VxWorks with EPICS interface.
### NON-FUNCTIONAL REQUIREMENTS
- Performance sufficient for human interaction and communication at User-interface and OCS levels.
- Real-time support at IOC level.
- Productivity and ease of development in chosen environments.
- Portability and hardware independence of developed software.
- Vendor independence to avoid vendor lock-in.
- Compatibility with industry and de-facto standards for easier integration.
- Ability to support state-of-the-art user interfaces for optimal user experience.
- Support for distributed environments for potential future expansion.
- Security and stability of chosen development environment and tools.
- Scalability and performance of chosen real-time OS for IOCs.
- Efficiency and reliability of communication interface between IOCs and Unix workstations.
- Consistency and ease of use across development environments (Unix workstations and IOC cross-compilation).
- Maintainability and upgradeability of embedded software.
- Security and robustness of host workstation OS and installed target IOC OS.

Language and coding standards
Software configuration and  tools
Software communication standards
### FUNCTIONAL REQUIREMENTS
- Communication hardware independence: Achieved by using DARPA TCP/IP protocol over both LANs and WANs.
- Support for standard ARPA services: telnet, FTP, SMTP, etc.
- Support for additional protocols: NFS, RPC, IPC, and Unix socket interface library.
Software interfaces
### FUNCTIONAL REQUIREMENTS
- Workstation-IOC communication: All control communication will use DRAMA's IMP protocol with SDS command structure.
- Host workstation interprocess communication: Uses the same IMP protocol.
- Real-time component communication: Based on the EPICS Channel Access protocol.
- Data communication: Primarily through IMP/SDS.

### NON-FUNCTIONAL REQUIREMENTS
- Same protocol (IMP) used for workstation-IOC communication and host workstation interprocess communication.

External software packages
### FUNCTIONAL REQUIREMENTS
- Interface routines must be developed to connect external software to the Gemini system.
- These routines must conform to the specified standards.
- PV-Wave/IDL must be used for quick-look analysis.
- All astronomical data must be saved in the Archiving system.
- Data storage and transport must use FITS format.
- On-line access to the Archiver must be through STARCAT.

### NON-FUNCTIONAL REQUIREMENTS
- Interface routines should be flexible and support various external software packages (ADAM, IRAF, Midas, IDL, Khoros).
- Interface routines should be well-documented and easy to use.

Database
### FUNCTIONAL REQUIREMENTS
- Data must be stored in both the Archiving system and the data storage subsystem.
- IOC control databases are distributed across IOC subsystems with downloadable initialization copies available on Gemini disks.
- Configuration, logging, maintenance schedules, and documentation be stored in the commercial relational database.

Hardware Standards
  Hardware requirements
### FUNCTIONAL REQUIREMENTS
- Workstations adhere to software standards.
- Workstations provide a well-designed development environment.
- Workstations offer cross-support for VxWorks development (if needed).
- Workstations support Ethernet IEEE-802.3 and FDDI interfaces for communications.
- Internal data formats remain compatible across workstations used for development.
- SCSI-interface peripherals are available.

	

### NON-FUNCTIONAL REQUIREMENTS

- Workstations are state-of-the-art systems (CPU, communications support).
- Workstations are part of a scalable family (facilitates migration to newer technology).
- Development systems are reliable and have strong manufacturer support.
- Development systems offer upgrade capabilities.

Development computers
### FUNCTIONAL REQUIREMENTS
- the developmental workstations are to be SUN SPARC-10 (model 41) or SPARC Classic with 64MB of dynamic memory and at least 2GB of disk storage ,CD-ROM drive
- IOCs (provided by Gemini): Motorola MVME-167B (68040@33MHz) with at least 16MB of dynamic memory , Specific IOC computer cards defined in ICS work package
- DDS DAT cartridges (optional),Standard compression algorithm and tar format for archives
### NON-FUNCTIONAL REQUIREMENTS

- Internal Gemini software development is done in a multi-platform environment and flexibility to choose final target platform based on development experience
- Flexibility to adopt new technologies while maintaining compatibility with development systems.Defined baseline system for initial development

Electronics hardware interfaces
### FUNCTIONAL REQUIREMENTS
- All control electronics hardware must be accessed through VME IOCs using the EPICS software. 

### NON-FUNCTIONAL REQUIREMENTS

- No other control interfaces are permitted. This restricts the flexibility of control methods and enforces a standardized approach.

Subnetwork
### FUNCTIONAL REQUIREMENTS
- The standards for the interface between the IOC level and lower-level software are not part of this specification.
- In cases with a distributed network of target microprocessors, a standard sub-network (Fieldbus) should be provided.
- In cases with commercial equipment, it is recommended to use an ALAN/BRADLEY system for manual control and interface it to the IOC using RS-422 or similar connection.

### NON-FUNCTIONAL REQUIREMENTS

- The use of software below the IOC level and its interface need to be explained and discussed on a case-by-case basis.
- The Fieldbus should be an ALAN/BRADLEY bus, ProfiBus, or other approved type.
- The preferred interface for commercial equipment is RS-422 or similar connection to an IOC.

Communication Hardware
### FUNCTIONAL REQUIREMENTS
Network Hardware:
- All communication hardware must meet data flow and software protocol requirements defined in the document.
- Control LAN, detector LAN (for development systems), and interlock connections are based on Ethernet (IEEE 802.3).
- Time distribution systems are described in the Software Design Description.
- Backbone LAN uses FDDI due to bandwidth requirements.

Cabling:
- LAN cabling and requirements are specified in Figure 4-1 and the Electronic Design Specification.

Interlock System:
- Interlock connections for critical subsystems are required.
- Software interface to the interlock system is defined in the Instrument Control System Infrastructure Work Package Definition.

Routers, Gateways:
- Required routers, gateways, etc. are defined in the Electronic Design Specification 
WAN Links:
- WAN links are defined in the Electronic Design Specification and shown in Figure 4-1.10.At least one dedicated T1 bandwidth link is required for remote support, development, and testing.
### NON-FUNCTIONAL REQUIREMENTS

- Systems should be adaptable to changes in communication technology for future improvements.
- A final solution for the detector LAN must meet performance requirements for the final system.
- Interlock system should be secure and reliable for critical subsystem protection.

User requirements for EPICS developers
EPICS Components
Hardware components
Software components
	- IOC Software
### FUNCTIONAL REQUIREMENTS
Database storage:
- Memory-resident database with various structures for efficient access.
- Extensible set of record types (ai, ao, etc.) with fixed fields.
- Unique record names across connected IOCs.
Database access:
- Channel and database access routines provide controlled access.
Database scanning:
- Four types of scanning available (periodic, event, I/O event, passive).
Record support:
- Record support modules handle record-specific logic.
Device support:
- Device support modules handle device-specific interactions.
- Optional device drivers for complex hardware access.
Record processing:
- Record processing routines handle changes and updates.
Database monitors:
- Callbacks notify interested programs about value changes (used by channel access).
### NON-FUNCTIONAL REQUIREMENTS
- Data structures and access routines optimize database access.
- Extensible record types and pluggable record/device support allow customization.
- Design allows choosing record/device types and drivers for each installation/IOC.

	- Channel access
### FUNCTIONAL REQUIREMENTS
- Network transparent access to IOC databases: Clients can remotely access data in IOC databases regardless of specific network details.
- Client-server model: IOCs act as servers and OPIs or other IOCs can be clients.
- Multiple clients per server: A single IOC server can communicate with many clients simultaneously.
- Multiple servers per client: A single client can communicate with multiple IOC servers simultaneously.
- Support for arbitrary record types: New record types can be added without affecting existing client software.
- Communication across servers with different record types: Clients can interact with multiple IOCs even if they have different record types.

### NON-FUNCTIONAL REQUIREMENTS
- Channel access allows easy integration of new record types and clients without code changes.
- The architecture supports multiple clients and servers simultaneously, suitable for large systems.

	- OPI Tools
### FUNCTIONAL REQUIREMENTS
- Channel Access Tools:
- Monitor and control IOCs in real-time.
- Display data and accept operator control requests (MEDM, DM).
- Handle alarms and archive data (ALH, AR).
- Emulate finite state machines for control logic (Sequencer).
- Allow integration with existing software packages (IDL/PvWave, Mathematica, WINGZ).

### NON-FUNCTIONAL REQUIREMENTS
- Channel access tools support live monitoring and control.
- Tools can handle databases with diverse record types and multiple clients.
- Tools can handle databases with diverse record types and multiple clients.
- Integration with existing software and configuration file support promotes customization.

	- EPICS core software
### NON-FUNCTIONAL REQUIREMENTS
- Core components like Channel Access, Database, Scanners, Monitors, DCT, Build Tools, and Source/Release ensure basic system operation.
- Tools like MEDM, EDD/DM, record/device support, and most OPI tools provide additional features but are not critical for basic operation.


Gemini breakdown of tasks
Not covered by any work packages
SIC Work packages only
### FUNCTIONAL REQUIREMENTS
- Record Support, Device Support, and Device Drivers For Gemini this entails support for new devices: PMAC, VMIC5578, BANCOMM

OCS and DHS work packages only
### FUNCTIONAL REQUIREMENTS
- The OCS may need a CA client that implements the OCS Attribute/Value protocol

Realtime (IOC-based) work packages
Gemini Definitions
Requirements Developer skills
Application developer
### NON-FUNCTIONAL REQUIREMENTS
- Application developer need to have knowledge of VME and other I/O electronics , EPICS Database design techniques , SNC programming ,Use of standard EPICS OPI tools ,UNIX and VxWorks as development environments

Internals developers
### NON-FUNCTIONAL REQUIREMENTS
- Internal developer need to have knowledge of Advanced C/C++ programming techniques ,UNIX internals  , VxWorks internals  ,Real-time programming techniques , Motif application development skills , Networking skills: TCP/P and UDP/IP sockets

expected distributions of developer classes
	- Current distributions within the high Energy Physics Community
### FUNCTIONAL REQUIREMENTS
- The system must support diverse applications across at least 20 programs in High Energy Physics.
- Core system functionalities (interfacing with I/O hardware, data acquisition and processing, user interface tools) are expected.
- Custom modifications, record types, device support, and driver layers might be implemented for specific applications.

	- The APS CATS Experience
	- Planned Distribution within The Gemini Projects
### NON-FUNCTIONAL REQUIREMENTS
- The Standard Instrument Controller prioritizes building application functionalities using existing core EPICS components.
- Only essential IOC-related tasks, like record, device, and driver support for specific VME cards, are included.
- Future Internals work, if needed, would be handled by separate development teams instead of the Standard Instrument Controller team.







# Chapter 5 - Commands
5.1 Command Routing
### FUNCTIONAL REQUIREMENTS
- A command source should be able to directly specify the target subsystem for command transfer.
- The system should allow commands and data to be routed through a channel.
- Allowing data conversion during transmission
- Use a separate physical route to prevent interference with normal command streams.
- The system should support broadcasting of commands and data signals. 
### NON-FUNCTIONAL REQUIREMENTS
- The system ensures secure transmission of commands and data.
- The system guarantees reliable and consistent transmission of commands and data.
- Designed to handle various types of transmission efficiently (speed, latency, throughput)
- Mechanisms scale to accommodate potential increase in the number of subsystems or the volume of data being transmitted.
- Flexible enough to accommodate different types of channels.
- Easy maintenance and updates.
5.2 Command Structure
### FUNCTIONAL REQUIREMENTS
- Each command must have an Identifier(Command_ID) that is unique to the specific instance of the command.
- “Command_ID” includes monotonically added segments for recording and tracking.
- Specifies the creator and recipient of the order.
- Commands must include an Opcode.
### NON-FUNCTIONAL REQUIREMENTS
- The “Command_ID” must be generated and maintained in a way that is unique to each instance of the command.
- The command structure and interpretation of Opcode and parameter sets designed for efficient processing and operation.
- The command structure must be scalable to support increasing numbers and different types of Opcodes and parameters.
- The command structure should be flexible enough to accommodate a variety.
- It must be protected against unauthorized duplication or modification to maintain the integrity of the “Command_ID”.

5.3 General Purpose Commands
Status Commands
### FUNCTIONAL REQUIREMENTS
- The subsystem must support the “GetVersion” command.
- When receiving the “GetVersion”, the subsystem should return as a string value.
- The subsystem must implement the “GetStatus” command.
- The “GetStatus” command should provide information about the current status of the subsystem.
- The "GetState" command should return the internal state of the subsystem, indicating whether it is READY, BUSY_ON command, or NOT_READY.
- The subsystem must support the “GetID” command.
- When receiving the "GetID" command, the subsystem should report its unique identification tag.
- The subsystem must be able to process the “GetConfiguration” command.
- The “GetConfiguration” command should provide details including internal settings and if requested, the detailed results of any self-tests.
### NON-FUNCTIONAL REQUIREMENTS
- The response time for the "GetVersion," "GetStatus," "GetState," "GetID," and "GetConfiguration" commands should be within acceptable limits to ensure timely retrieval of information.
- The response state of the subsystem to queries should be reliable. By providing correct information
- The subsystem should be available to process status queries regularly.
- Accessing certain status queries It must be limited to authorized users only.
Generic Commands
### FUNCTIONAL REQUIREMENTS
- The system must support the “SetStatus” command, allowing a target subsystem to enter a specific state associated with the provided status argument.
- The status SHUTDOWN should disable the targeted subsystem.
- Not all status levels are reachable through “SetStatus”.
- The system must implement the “SetConfiguration” command to facilitate the downloading of a configuration from the host to the target subsystem.
- This command can work with the GetConfiguration command to establish 'sequencing points' for subsystem restarts or rollbacks.
- The RunTest commands the subsystems to perform a self-test and report the result.
- The command may have arguments that describe the specific self-test to run.
- The system must include the “SetLogging” command to enable logging by the specified subsystem at the specified level.

### NON-FUNCTIONAL REQUIREMENTS
- The “SetStatus”, “SetConfiguration”, “RunTest”, and “SetLogging” commands must be reliable.
- The system must implement security measures to prevent unauthorized access to the “SetStatus”, “SetConfiguration”, “RunTest”, and “SetLogging” commands.
- The execution of “SetStatus”, “SetConfiguration”, “RunTest”, and “SetLogging” commands should be efficient to minimize any impact on the overall system performance.
- The system must handle errors When the “SetStatus”, “SetConfiguration”, “RunTest”, or “SetLogging” have issues.
5.4 Data Communications
### FUNCTIONAL REQUIREMENTS
- The system must support communication via various routes.
- Communication through a route is typically asynchronous.
- The system must be capable of establishing a route of a specified class for a particular item.
- OpenRoute : The OpenRoute command should include sufficient information for the Input/Output Controller (IOC).
- CloseRoute : The system must allow the closure of a previously opened route.
- CloseRoute : Modules at either end of the channel appropriate actions must be taken.
- ResetRoute : The system should support the reinitialization of a route.
- ResetRoute : Modules receiving this command must flush buffers.
- TestRoute : The system must be capable of transmitting a test message across a route.
- TestRoute : All receivers must respond with an identification.
- AwaitItem : The system should allow a module to send a command and be blocked until information is received or a timeout.
- SetCallback : The system must support the creation of callbacks to process data across specified paths.
- ClearCallback : The system should allow deletion of previously defined callbacks.
### NON-FUNCTIONAL REQUIREMENTS
- Communication via routes must be asynchronous.
- The system must guarantee reliable communication over the path.
- Must be effective in reducing delays in the communication process. Including opening, closing and resetting routes.
- Supports an increased number of routes and guarantees maximum efficiency
- Communication paths must be secure to prevent unauthorized access or interference with data.
- The system should have a low response time to create, close, or reset routes.
- Callback creation and deletion must be processed efficiently.
5.5 IOC Commands
Local Database Access
### FUNCTIONAL REQUIREMENTS
- The system must support commands for accessing and managing the local database in the IOC box.
- LocateItem commands may be broadcast over the IOC network.
- The command named “GetValue” must be specified to retrieve values from the local database.
- The system must support the “PutValue” command to send values for the specified items to the local database.
- The “StartStream” command should be available to start streaming.
- The IOC system should continue sending data until a “StopStream”.
- The “SetEvent” command must be specified to create a monitor event for a specific database entry.
- The system must support the “ClearEvent” command to end monitoring of previously set events.
### NON-FUNCTIONAL REQUIREMENTS
- The system should be designed to handle database commands efficiently, minimizing latency in accessing and transmitting data.
- The database command and engine should scale to accommodate the increase in the number of IOC boxes.
- Local databases and related commands must prevent unauthorized manipulation of sensitive data.
- The system should handle various events. For timely submission of information in the database items that have been verified.
- Broadcast command It should be effective and not have a negative effect on the overall system.
Time Handling
### FUNCTIONAL REQUIREMENTS
- The system must support commands related to proper time synchronization between subsystems.
- Times provided must be in the IRIG-B format and expressed in Coordinated Universal Time (UTC).
### NON-FUNCTIONAL REQUIREMENTS
- The time synchronization mechanism should guarantee a high level of accuracy.
- The time synchronization process should be performed in real time.
- The system should be flexible enough to adapt to time synchronization requirements. and supports future improvements.
- To Be Defined (TBD) specifies specific details about the time synchronization command.
Remote DB Access
### FUNCTIONAL REQUIREMENTS
- The subsystem must have the ability to receive information from other systems within the Gemini control system.
- The system should support communication and data exchange between subsystems.
- The system must support database access commands to retrieve data from the database within the Gemini control system.
### NON-FUNCTIONAL REQUIREMENTS
- The information retrieval process should be efficient.
- Communication commands and database access must be reliable.
- Data access between subsystems must be secure to prevent unauthorized access or data breaches.
- Commands should be compatible with the various subsystems within the Gemini control system.
- The system must ensure data integrity during the data retrieval process to avoid corruption or data loss.
- Reduces latency and increases the overall responsiveness of the Gemini control system.
5.6 Command Implementation
### FUNCTIONAL REQUIREMENTS
- All commands within the OCS must be represented as ASCII strings.
- Commands should follow a structured format where fields are labeled.
- Work Package Descriptions contain a description of the basic commands required for a specific work package.
### NON-FUNCTIONAL REQUIREMENTS
- The system's handling of ASCII strings should be efficient to avoid delays in command processing.
- Clear documentation must be provided for the steps involved in generating, decoding, and routing command strings.
- System architecture Including substituting orders It should be scalable to accommodate increases in complexity or order volume.

## ITCS431 Software Design and Development (2023)
