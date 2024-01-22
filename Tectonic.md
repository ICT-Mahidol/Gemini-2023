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
DATA SPECIFICATION
CONTROL INFORMATION FLOW
### FUNCTIONAL REQUIREMENTS
- Control information must be transferred, typically in the form of commands and replies from users, to telescopes and instruments.
- Replies might contain status information and, in general, data concerning instruments and telescopes, to be stored together with the astronomical data. 
- Control information on all controlled variables must be provided by all subsystems on request.
### NON-FUNCTIONAL REQUIREMENTS
- No request for information shall produce a delay of control activities or locking, even if the corresponding equipment is not available or faulty. 
- Delay times for the exchange of control information must stay within precise time limits to be defined in 'General Description' in Chapter 2. 
- One can afford to retransmit commands in case of transmission error or collision.
- The protocol has to be predictable in that commands cannot get lost and replies have to come back reliably. 

ASTRONOMICAL DATA FLOW
### FUNCTIONAL REQUIREMENTS
- System must be at least two copies.
- The first copy is to secure data as acquired.
- Raw data will be acquired and stored as such for quick look evaluations.
- There may be conditions (like infrared detectors) in which quick preprocessing is required.
- Preprocessed data will be stored instead of raw data as such.
- Astronomical data will have to be transported between GEMINI and the home institutes of visiting astronomers.
- Data must be in FITS format


### NON-FUNCTIONAL REQUIREMENTS
- Detector data must be acquired and stored in the most effective way technology will allow; effectiveness should be evaluated in terms of cost, space requirements, longevity, and speed.
- Operational overheads must be kept as low as possible, to maximize actual observing times.
- Intermediate storage of raw data in memory on different nodes and in different formats should be kept to a minimum.
- The link chosen to transfer data should represent as small a bottleneck as possible for data acquisition.
- The last copy, used for assessment, should preferably be on removable media.
- Fast preprocessing is needed.
- Compliance with MOST 100-1.0, which is a standard defined by NASA.

OTHER INFORMATION FLOW
### FUNCTIONAL REQUIREMENTS
- TV data concerning site monitoring and voice need to be capable of being available at all operations facilities.
- Other astronomical information such as that coming from sky field monitors, autoguider cameras, and sky monitoring devices such as cloud and seeing monitors shall also be capable of being available.

### NON-FUNCTIONAL REQUIREMENTS
- Point-to-point video connectivity between the operations centers of the Gemini 8m Telescopes is not necessary.
- Voice connectivity, perhaps point to point, be available on a permanent connection.

OPERATION
OPERATION LEVELS
### FUNCTIONAL REQUIREMENTS
- This is the normal operational mode. It allows a certain number of embedded tests, normally at a fairly high level. Monitoring is also done at this level.
- It is anticipated that all user categories have access to this level.
### NON-FUNCTIONAL REQUIREMENTS
- This allows maintenance tables (for example, with instrument parameters) to be updated.
- It is anticipated that the majority of parameters at this level will be accessed by operations and development staff.
- This allows the installation and testing of new packages or new releases. Any low level test can be performed in this mode.
- Access to this level will be extremely limited.

PRIVILEGE AND PROTECTION LEVELS
### FUNCTIONAL REQUIREMENTS
- A further subdivision within the levels can be achieved by implementing privileges associated with categories of users or with the location of the user station.
- The system or software must enforce protections.
- The operational software must clearly indicate to users the current operation level.
### NON-FUNCTIONAL REQUIREMENTS
- The operational software should check compatibility between subsystems when operating in different modes.

CAPACITY
### FUNCTIONAL REQUIREMENTS
- When the Gemini 8m Telescopes telescope is used in its normal observing mode, there will be a single operator node for the telescope and two data acquisition and instrument control nodes.
- Some tests might be run in parallel on instruments that do not have the light beam at that moment, so in principle additional nodes might be working at the same time.
- The system will provide for one auxiliary data acquisition and instrument control nodes.
- The system will provide for a single off-site data acquisition and instrument control node - to be located at either the Gemini 8m Telescopes Site Support or Base Facility.
- One supervisor will monitor the system.
- Other users might need to monitor the running of observing programs, locally or remotely.
- The system will provide for a single local monitoring node and a single remote monitoring node.
- The Gemini 8m Telescopes control software shall allow simultaneous operation of up to six active control nodes and up to two more monitoring nodes (one local and one remote) without appreciable degradation of performance.
### NON-FUNCTIONAL REQUIREMENTS
- Each node will have the capability to run at all operation levels.
- The system must support off-site observing modes.
- The Gemini 8m Telescopes computers and software shall be capable of coping with the load of 10 active nodes, should the case arise.

PERFORMANCE CRITERIA
### NON-FUNCTIONAL REQUIREMENTS
- Every command must be acknowledged in a positive or negative way before the occurrence of the corresponding action within given response times.

PROCEDURES
### FUNCTIONAL REQUIREMENTS
- The system must have automatic procedures to implement startup and shutdown of the telescope and instruments.
- The startup and shutdown procedures for instruments should be independent of the telescope operation, and their execution should not affect the ongoing operation of the telescope.
- The system must have procedures in place to reconfigure and change the observing environment.
- Observing environments and related light paths should be dynamically definable without the need for a complete system restart.
- Operations staff have privileges to change the environment, meaning selecting a suitable combination of instruments.
- The operational software should know which subsystems are installed and operational at any given time.

EXTERNAL INTERFACE REQUIREMENTS
USER INTERFACES (UIF)
### FUNCTIONAL REQUIREMENTS
- It is essential for operational and maintenance reasons that, in spite of the obvious differences of the setups and commands available, the same philosophy is applied throughout.
- This calls for a homogeneous user interface, which can be achieved only by applying the same user interface tools to the whole project, providing the Gemini 8m Telescopes user interface's ‘look and feel’.
- The user interface should not be seen as a package linked to a specific computer.
- Given the requirement to be able to access the Gemini 8m Telescopes from several points, the user interface should rather be seen as a package to be callable from a large number of stations, depending on where a user is.
### NON-FUNCTIONAL REQUIREMENTS
- It should also be network transparent so that it does not matter where it is being run.
- The user interface tools shall be based on standards, defined in Section 4.2.5 on page 4-7, which will be portable across different computer hardware platforms (Portable User Interface Toolkit).
- The intent of a portability requirement is to facilitate migrating existing and future Gemini systems to different hardware as the need arises.
- It is the current intent to limit the selection of computer hardware platforms to as few as is practical..

HARDWARE INTERFACES
### FUNCTIONAL REQUIREMENTS
- Standard interfaces to the control electronics shall be available, in the form of standard bus systems, a standard set of interface cards to be used on all the subsystems and instruments, a standard software skeleton running on the control electronics
### NON-FUNCTIONAL REQUIREMENTS
- The existence of hardware standards is clearly essential for maintenance and repairs.
- The standard software must be adequate for the real-time requirements.
- Must offer drivers to the standard electronics to be used on all the Gemini 8m Telescopes software subsystems and instruments.

SOFTWARE INTERFACES
### FUNCTIONAL REQUIREMENTS
- The Gemini 8m Telescopes software covers all aspects of control and data acquisition related to the telescope, instruments, and auxiliary instrumentation.
- It also covers all the operational aspects of the Gemini 8m Telescopes, including online scheduling and rescheduling.
- There is also software which, although it will be interfaced to the Gemini 8m Telescopes, is referred to as external.
- The external software must interface with the Gemini 8m Telescopes software.
- It shall be possible to monitor the quality (image quality, spectral resolution, signal to noise, etc.) of the astronomical data as it comes in.
- Standard reduction procedures should be available for basic on-line calibrations of the observed data.
- One would like to have fully reduced and calibrated data at the end of the observations.
- Quick-look data processing should be provided on the Gemini 8m Telescopes, with procedures suitable for fast on-line data preprocessing.
- Quick-look should be usable within exposure sequences to provide results and feedback parameters to the control software in a programmed way, without the need for manual intervention.
- Near-line processing should be available for simple data reductions required for data integrity validation.
- The output format of the Gemini 8m Telescopes data must be compatible with the GEMINI archive requirements.
- Online interactive access to the data archiving system should exist, so that access to this database is possible for Gemini 8m Telescopes users.
- The specific types of data available; flat fields, calibrations, science exposures, etc.
- Computer access to star catalogs is also required, so that an automatic selection of candidate guide and standard stars can be made.
- The Gemini 8m Telescopes software must be able to interface with all commercial software packages available on the Gemini 8m Telescopes and integrated into the Gemini 8m Telescopes operation.
### NON-FUNCTIONAL REQUIREMENTS
- The external software consists of commercial software integrated into the Gemini 8m Telescopes software (e.g. DBMS).
- Pre Existing software used in the Gemini 8m Telescopes (e.g. image processing systems, star catalogs).
- The above statements define the goal of quick-look analysis for the Gemini 8m Telescopes.
- This document does not try to be specific about the requirements for Quick-look other than that it should be synchronous.
- This data reduction proceeds sequentially through requests but asynchronously from data acquisition.
- Data acquisition takes precedence over near-line data reduction.
- Off-line pixel processing for full data reduction should also exist at the Gemini 8m Telescopes site, but does not have any interface to the Gemini 8m Telescopes software.
- Compatibility with and adaptations to these packages must be sought.
- The same situation might also occur with other instruments, where specific observer support software has to be foreseen for on-line use.

COMMUNICATION INTERFACES
### FUNCTIONAL REQUIREMENTS
- Local coordination and synchronization needs within a subsystem (for example, coordination of active support system for primary mirror, bi-directional traffic of commands/replies).
- Global synchronization needs, such as the universal time synchronization requirement.
- Exchange of control information, in the form of commands and status information.
- Collection and transfer (for archiving or remote access) of raw astronomical data.
- Access from Wide Area Network (WAN) for remote diagnostics and monitoring from operations facilities.
### NON-FUNCTIONAL REQUIREMENTS
- This LAN must be capable of dealing both with the data bandwidths required (at peak and on average) and with the required response times and synchronization needs.
- For maintenance reasons and hardware independence, a clear hierarchical model must be implemented, supporting separation of logical and physical layers, e.g. ISO/OSI model.
- Network redundancy should also be considered in the design phase as a way to increase reliability and security, in particular for control information.
- Due to the uncertain future of the Internet, only non-essential tasks may employ it.
- Violation of the hierarchical nature of the system can lead to testing and maintenance problems.

### GENERAL CONSTRAINTS
### USER CONSTRAINTS
### FUNCTIONAL REQUIREMENTS
- The software shall support access to the system from any user station.
- It will then be an operational decision, implying privileges and priorities for the various categories of users, and definition of what a given user can actually do.
### NON-FUNCTIONAL REQUIREMENTS
- This will allow centralized support and coordination of their operations, providing both operations support for individual instruments and supervision for all of them."
- However, even at the Gemini 8m Telescopes site there will be users (e.g. software development and maintenance staff) installing or enhancing other parts of the system, possibly working directly at the telescope.
- Finally, in the case of remote operations, other users (e.g. support staff) might be on Cerro Tololo or in Hilo.
- Access from any user station will make user stations in principle identical and software configurable as the user station of this or that subsystem.
- This should greatly simplify the coordination problem posed by the large number of simultaneous users (as already described in the Capacity requirements, Section 3.2.2).

### HARDWARE CONSTRAINTS
### FUNCTIONAL REQUIREMENTS
- Computers used at the Gemini 8m Telescopes site, particularly in the test phase when they are outside the control room and near the subsystem under test, shall be checked against altitude and humidity specifications for the Gemini 8m Telescopes site. 
- Computer hardware must be able to run the Gemini 8m Telescopes software environment (operating systems, Gemini 8m Telescopes software) and provide compatibility in data format (identical internal data representation).
- Common development and implementation tools must be both available and supported.
- Identical network access must be supported.
- Local processing power must be such that telescope and instrument control does not represent a significant overhead in the whole process of executing an observing program (the overhead, if any, should be limited by the time it takes for physical devices to act).
### NON-FUNCTIONAL REQUIREMENTS
- During the next 5 to 10 years, new hardware will be available with features and costs that could benefit the project.
- The hardware chosen as the standard at this point in time may be no longer available at some point in the future.

### SOFTWARE CONSTRAINTS 
### FUNCTIONAL REQUIREMENTS
- Individual instruments must be able to run fully independently.
- Telescope software at the two telescopes must be maintained to be identical in the upper layers (even if hardware should differ).
- Switching to different configurations must be possible at any time with appropriate procedures.
- There must be easy procedures to reconfigure the system when subsystems are modified or removed.
- To allow for expansion and maintenance, Gemini 8m Telescopes standards must be defined for the on-line software and the development environment.
- Table-driven software should be used whenever possible, to avoid unnecessary compilations.
### NON-FUNCTIONAL REQUIREMENTS
- Additions of new instruments should aim, as a goal, at introducing no modification to already operational parts. Modifications should be confined to the operational procedures and should not affect the bulk of the existing software.
- The number of main packages of software must be kept to a minimum to facilitate maintenance, but compatible with the need to have the right degree of modularity.
- Commercial and public domain packages should be used whenever possible.
- Existing software packages should be reused wherever possible.
- All software which does not directly control specific hardware must be written as machine independent, portable code. Even for microprocessor software, the software should be hardware independent, to allow a later choice of the target microprocessors.
- Online version control must be implemented. That is, the version control system must be available to recover/restore versions at all times.
- At boot time, the Gemini 8m Telescopes software shall check the consistency of versions of all the various software components.
- System constants, such as arcseconds/bit for an encoder, shall not require recompiling but will be updated as part of system startup, and, for some constants, will be modifiable during operation.
- System status parameters will be maintained to an extent that will allow restarting the system and regaining the previous state. The extent of duplication of the previous state will be dictated by safety and practical considerations.
- Strict checking should be applied on this to preserve maintainability and reconfiguration of the system.

ATTRIBUTES
SIMPLICITY
	—

SUPPORTABILITY 
### NON-FUNCTIONAL REQUIREMENTS
- The system should have supportability influence design

RELIABILITY AND AVAILABILITY 
### FUNCTIONAL REQUIREMENTS
- The system shall incorporate retry procedures in the software to facilitate recovery on-line in the event of errors or failures (e.g., time-out, hardware failure) to ensure maximum availability of the control system.
- In case recovery fails, the error or failure has to be reported in a clear form (to identify the cause of the problem)
- To avoid unnecessary downtime, the system must be capable of reconfiguring itself to continue observing in a different mode if required, given the failure of a single non-critical subsystem.
- Software robustness shall be enhanced through range checking and validity checking before the execution of any input command. These checks must be possible ahead of time for preparing observing sequences and simulating observations.
- The system shall implement recovery procedures to restart after error failures.
- The system shall constantly monitor active subsystems to ensure they are operating correctly before sending commands. This monitoring shall also continue on inactive subsystems.
### NON-FUNCTIONAL REQUIREMENTS
- The system shall put itself into a safe state, whenever a safety aspect might be involved.
- The goal for recovery and/or reconfiguration from the onset of the error condition to observing again shall be 5 minutes.

MAINTAINABILITY 
### FUNCTIONAL REQUIREMENTS
- Subsystem software must include modules for maintenance and testing, including a simulator for each subsystem. 
- Mechanisms should exist for easily replacing a subsystem with its simulation.
- Each subsystem should have a background task running, checking power supply levels, temperatures, performance, and correct responses to commands. Detected problems should be reported to the OCS (Observatory Control System).
- Each subsystem should provide a module for fully exercising all subsystem components, automatically executed during start-up and on demand. Problems are to be automatically reported to the OCS.
- There should be software modules for testing the subsystem as an integrated portion of the entire system.
### NON-FUNCTIONAL REQUIREMENTS
- The system must include a detailed plan for maintenance and periodic upgrades throughout its lifetime.
- The maintenance plan must include considerations for maintenance requirements, along with an estimate of the required resources
- The plan must outline the method for upgrading the system to add capabilities and performance. It should identify areas where upgrades are anticipated, providing estimates of the required effort and resources.
- This software would be executed on demand during maintenance operation level.

HUMAN ENGINEERING 
### NON-FUNCTIONAL REQUIREMENTS
- All Gemini Software must be designed with human engineering requirements under consideration that including:
    - provisions for minimizing stress effects and fatigue
    - feedback on operation on specific tasks
    - people and machine interfaces
    - procedures
    - training and experience
    - interaction with team members G.management and organizational behavior

SECURITY AND SAFETY
### FUNCTIONAL REQUIREMENTS
- The Gemini system must be self-monitoring to invoke safety monitoring and prevent risk to people or damage to equipment.
- The software should be able to quickly bring the Gemini system to a safe state upon notification of such danger.
- Subsystems must be able to detect danger and report it appropriately. If the risk persists, subsystems must move into safe states to protect people and equipment.
- Safety protection must be applied whenever there is a risk that the control software could endanger people or cause damage to any subsystem or cause damage to any Gemini 8m Telescopes sub- system (this protection, where implemented, must be independent of the software.)
- Specifies the order in which safety systems should work, including software limits, soft limit switches, watch dogs, hard limit switches, hardware interlocks, and hard stops.
- The software must not allow unsafe actions, and commands violating safety limits will be rejected.
- The software should detect unsafe areas, halt the system, and allow movement off of soft limits.
- The software must halt if its watchdog has not been reset.
- The system will halt if its hardware watchdog has not been reset.
- Hard limit switches should remove power from the actuator when beyond soft limits; the software/electrical systems will allow movement off of hard limits.
- Hardware interlocks should prevent both software and hardware from action and there must be no bypass of these systems.
- The mechanism should not move beyond a certain point due to mechanical limits. Hard stops should use dampers to avoid damage to equipment.
- The Gemini 8m Telescopes software must be able to bring the system quickly to a safe state upon detection of danger.
- A system that is operating in Engineering/Maintenance mode must ignore directives from other systems, though status information should still be provided for use by other systems.
- All systems must be appropriately interlocked, and the interlock system must not depend on any software for reliable operation.
### NON-FUNCTIONAL REQUIREMENTS
- The development for the Gemini Control System must comply with applicable engineering practices, laws, regulations, and policies.
- All necessary safety approvals must be obtained before accepting devices.
- Security must be provided in order to both prevent accidental mix-up of commands from different users on different parts of the system and to prevent intrusion from the wide area network into the Gemini 8m Telescopes.
- The system should be security preventing the intrusion into the system by unauthorized users, or users at unauthorized access levels.
- The interlock must follow this philosophy:
    - All hazards capable of causing death and/or loss of irreplacable equipment shall be passively interlocked.
    - All hazards capable of causing injury and/or severe damage to equipment shall be actively interlocked (severe damage implies that repairs are not repairable at the depot level.
    - All other hazards may be interlocked via software.
- The system must follow the general safety requirements:
    - eliminate hazards through design, including material selection 
    - isolate hazardous substances from people
    - minimize hazard to people during operation and maintenance from high voltage, electro- magnetic radiation, sharp edges, hot surfaces, chemicals, etc.
    - minimize risks due to environmental conditions, such as temperature, noise, vibration, etc.
    - minimize risks created by human error
    - use interlocks and other protective devices when hazards cannot be eliminated G.provide distinctive markings and warnings to protect people

TESTABILITY
### FUNCTIONAL REQUIREMENTS
- A control test plan must address all areas of testing from design, acceptance, commissioning through to hand-over.
- The capability of mission equipment must have built-in-test capability, providing onboard, automated testing for the detection, diagnosis, or isolation of system failures.
### NON-FUNCTIONAL REQUIREMENTS
- The design of the system should incorporate testability as a characteristic, allowing for the confidently determined in a timely fashion.
- The major objectives of Controls Test Plan should be:
    - test effectively with minimum effort and cost
    - reduce maintenance induced problems
    - reduce the cost of test equipment and programming
    - reduce cost of documentation
    - testability requirements

EXPANDABILITY 
### NON-FUNCTIONAL REQUIREMENTS
- The software must be designed to be easily extended and upgraded with modifications to non-changing components.
- The software, its installation process, and its documentation must be developed with expandability in mind, using general industry standards.

MODULARITY
### FUNCTIONAL REQUIREMENTS
- The system must have the capability to acquire information about other parts of the system, such as telescope coordinates.
### NON-FUNCTIONAL REQUIREMENTS
- All software must be developed using modularization and standardization techniques.
- Each module's environment must be strictly defined by its interface to other components, and no module can rely on information outside of this interface.
- Module selection should be done in logical fashion to minimize the size of the interfaces between modules.
- Online databases are part of the interface, but access is restricted to their defined interfaces.
- The software must be strictly modular, and the functionality of a subsystem should be isolated, allowing independent installation and maintenance.
- There should be no undesired interactions between subsystems, and enforcement can occur at the client/server interface or at the message system level.

CONTINGENCIES 
### FUNCTIONAL REQUIREMENTS
- The system should have the ability to reconfigure the software if one actuator fails.
### NON-FUNCTIONAL REQUIREMENTS
- The security and safety of the system should be guaranteed even in the event of failure of any component, including the higher-level software.
- Data redundancy must be a requirement to prevent a single failure from causing the loss of collected data and minimize the effects of single-point errors throughout the system.

CONCURRENCY
### FUNCTIONAL REQUIREMENTS
- The Telescope Control System must have the capability to detect and initiate parallel operation, given its responsibility for controlling all telescope and enclosure subsystems.
### NON-FUNCTIONAL REQUIREMENTS
- The system should maximize the use of parallel operation to enhance efficiency.

LIFE CYCLE ASPECTS
### NON-FUNCTIONAL REQUIREMENTS
- The software must be developed following a structured and formally defined development model.						
    - make the development process visible (for quality and maintenance reasons)
    - avoid incomplete specifications
    - discover errors early (via review and audit procedures)
    - secure structured, maintainable software
    - guarantee software quality
    - improve and ease cooperation. 
and should cover:
    - Development methods
    - Formal approval, review and audit procedures
    - Documentation
    - Coding and debugging
    - Simulation
    - Component and integration-verification and testing
    - Configuration and version management. 

DEVELOPMENT ENVIRONMENT
### NON-FUNCTIONAL REQUIREMENTS
- The development environment for the Gemini 8m Telescopes software must consist of the computer hardware and system software (operating system, languages and tools) chosen optimally to support the development model presented in the previous section on life-cycle aspects.
- The selection of the development environment must consider specific criteria such as development including
    - Emphasis on development and productivity requirements, including cross support tools.
    - Portability of software (target hardware independence) 			
    - Hardware and vendor independence	
    - Use of industrial and de facto standards. 

INSTALLATION ASPECTS
### FUNCTIONAL REQUIREMENTS
- Every system must be capable of providing its current version upon request.
### NON-FUNCTIONAL REQUIREMENTS
- The test procedure methods must be defined in the Software Test Plan (STP)
- The test plans shall be written for all individual software packages and modules comprising the Gemini 8m Telescopes software.
- A formal release system should exist at package and module level, which should be checkable online by the operational procedures for consistency. 


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
