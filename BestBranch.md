# Gemini Functional, Non-Functional Requirement

## **User requirement (p.17 - p.38)**

### Functional

  

****2.5 User-level requirements****

  

- Observing commands will normally be submitted via the User interface to a queue for later execution.

- The system allows astronomers and observers to ask the system about the status of the telescope or any subsystem at any time.

- The system allows astronomers and observers to access the operation table in read mode.

- The system allows operations staff access to operation tables in update mode.

- The system allows astronomers and observers can access and get information about the efficient acquisition of astronomical data and online assessment of data quality

- The system must support queued observing commands to be executed through the user interface.

- The system must be able to break and resequenced this queue as a result of the quality assessment of previous data.

- The system must allow observers to create an observing program that requests a telescope control function but prevents them from entering commands to slew the mount.

- The system allows operations staff to enable direct interactive operation. 

- The system allows operations staff can access all commands and maintenance procedures in some cases.

- The system does not allow operations staff to access subsystems while these are in normal operations.

- The system must provide an indirect control mechanism for operations staff through a scheduler program.

- The system allows operations staff to control the Gemini 8m Telescopes indirectly via a scheduler program or directly via commands.

- The system allows operations staff shall be able to change the operational status of units according to the results of tests performed on such units.

- The system allows software development and maintenance staff to use system generation and installation of new software packages or new releases, according to established test and validation procedures.

- The system allows software development and maintenance staff to need the highest privilege in order to be able to modify everything in the system.

- The system allows software development and maintenance staff to usually work at the test level.

- The system must have strict configuration control guidelines to prevent interference with ongoing normal operation.

  

****2.6 Operational context****

  

- The system allows two telescopes as part of the Gemini system can be capable of being used in conjunction with nearby, perhaps non-Gemini, telescopes on the same site (for instance for interferometry).

- The instruments need to allow parallel access, meaning multiple instruments can be accessed simultaneously.

- Instruments feeding two detectors using beam splitters or field splitters are considered as a single active instrument.

- The system ensure that inactive instruments have the capability to ready themselves for an exposure promptly upon the telescope beam being switched back to them.

- Inactive instruments should be able to work at all foreseen operation levels, including observing, maintenance, and testing.

- The system has the requirement to provide for support, installation, and operation of outside instruments.

- Visitor instruments must have the capability to maintain operation tables, such as filter lists, as part of an observation's permanent record.

- The system should enable visitor instruments to acquire and provide status information that can be accessed by other systems.

- The interface must support the ability of visitor instruments to enter preprogrammed observing sequences.

- The interface must facilitate visitor instruments in offsetting the telescope position and adjusting the focus.

- The system should acknowledge limitations, prioritizing support for straightforward functionalities and recognizing that more complex features may not be feasible.

- The system must provide remote access and control capabilities for users based on their privileges.

  

****2.7 Observing mode requirement****

  

- The Observatory Control System (OCS) must support interactive operation.

- The system shall support the capability for multiple stations to participate in observations.

- The observing program must have a low requirement for human intervention during execution.

- The system must provide a simulated environment that allows for the testing of observing programs in a virtual telescope setting.

- The system allows the remote control of the telescope, enabling the function typically associated with a local Telescope Operator from a remote site.

- The system allows remote control to be restricted to specific locations, namely the Gemini 8m Telescopes Enclosure and Gemini 8m Telescopes Control Facility.

- The system allows telescope control commands that can only be issued when a staff member with direct access to specific safety features is present.

- The system design for Gemini 8m Telescopes should consider remote operations requirements from the outset.

- During remote observing, user interaction with the system should occur through operators and the scheduler program, rather than direct remote control.

- The remote user interface should display a replicated version of the observer's screen.

- The software should support remote monitoring, also known as eavesdropping.

- The remote screen does not need to replicate the exact appearance of the local screen.

- The system must Gemini 8m Telescopes support, base, and remote operation locations.

  

****2.8 Observing support****

  

- Allowance for interaction at the desired level (for example, only on error conditions, any time the user is allowed to break a sequence, etc.).

- The system should automate observations following predefined sequences.

- The system must have ability to switch during the night among telescope modes and instruments (typically 2 times per night).

- The system must provide service and/or remote observing options.

- The system enable remote monitoring for users on standby at a suitably equipped remote site.

  

****2.9 General software requirement****

  

- The system use the syntax of control flow commands is to be consistent across the system.

- All subsystems must respond to a common set of commands to test operational status, inquiries as to version, perform self-tests, etc.

- All IOC subsystems must respond to additional common commands for such activities as _start, stop, initialize, reset parameters,_ etc.

- The system must get video information originates from target acquisition, guiding, and site monitoring cameras.

  

****2.10 Operation privileges, protections, and procedures****

  

- There must be a system of privileges established at each operating level of the system during logging into the system.

- The systems must use an Access Mode Allocation system that dynamically identifies and assigns resources as needed. Critical resources (those that can support only a restricted number of simultaneous uses) are assigned solely through this allocation system.

- The tasks that require such procedures in Telescope and Instrument include start-up and shutdown, self-testing and self-diagnosis, and Dynamic reconfiguration of observing configuration.

- The control software should know what subsystems are installed and their status at all times.

  

****2.11 General performance and reliability****

  

- All software bugs should be logged as soon as possible after detection.

  

****2.13 Contingencies****

  

- The subsystem must notify the user when a fault occurs which specific to the origin and problem.

- The subsystem notification must also be capable of being electronically logged.

- The subsystem notification is preferred to have multiple levels of fault notification such as detailed, verbose, short.

  

### ****Non-functional****

  

****2.5 User-level requirements****

  

- The system must be able to provide a level of performance and availability that meets the operational needs of both local and remote users.

- All features will not be made available to all users at all locations at all times.

- The system must be flexible and customizable to support the diverse requirements of different classes of users.

- All requirements and modes presented are intended to be available to all users of the system, and adapted to operational needs both locally and remotely.

- Interactive operation be operated via an automatic sequencer.

- The user interface must be simple for observing astronomers to learn and use.

- The system must have a secure access control mechanism to prevent direct control of the telescope.

- A user-friendly interface should allow observing astronomers to inquire about the telescope or subsystem status easily.

- Programs can directly control the telescope, but not the observer.

- The scheduling queue's existence should be transparent to on-site observers during initial telescope operation phases.

- The system must be able to provide a level of usability and adaptability that meets the needs of users with a wide range of experience levels, both locally and remotely.

- The system must provide support for operation using an automatic sequencer to meet operational needs, including service observation and flexible scheduling.

- The system allow operations staff monitors general performance and system safety.

- Secure access controls allow operations staff to perform necessary maintenance during incidents.

- Access restrictions for operations staff on subsystems are maintained during normal operation.

- A set of test commands is available for hardware testing, not accessible to observing astronomers.

  

****2.6 Operational context****

  

- The Gemini 8m Telescope system have the capability for seamless integration with other telescopes on the same site for potential future interferometry applications, with minimal impact on overall performance.

- The system to be designed with the potential for multi-telescope context in mind

- The system can efficiently operate multiple instruments in parallel, allowing the user to switch between them as needed.

- Instruments must operate independently without causing any negative effects on the active instrument through their permitted actions.

- The need for a subset of available functionality to be made available through a standardized interface.

- The system must ensure that visitor instruments have the necessary capability to operate in the required mode, and provide adequate support in a stable and efficient manner.

- Visitor instruments must provide timely and accurate status information to other systems in a consistent and efficient manner.

- Visitor instruments must have the capability to enter pre-programmed observing sequences in a reliable and efficient manner.

- Ensure compatibility with standardized interfaces for Gemini instruments.

- Multi-point monitoring capability, allowing others to follow the actions of an active user and obtain expert advice remotely.

- The system must provide centralized display of status information at multiple locations and allow remote access to necessary status information.

- The system ensure that the ongoing observations remain unaffected by monitoring activities.

  

****2.7 Observing mode requirement****

  

- The automatic sequencer should be prioritized, operating initially in a "pass through" mode with minimal checking and delay.

- The OCS must have a visually appealing user interface.

- Efficient software for object selection must consider target positions, weather conditions, and instrument configurations.

- The system should support scheduling flexibility with options for manual and scheduler-based scheduling to allow interleaving of observing programs.

- Efficiently manage the observation queue, storing and sorting all possible observations based on predetermined rules in a timely manner.

- The system must provide a reliable and accurate full telescope simulator for testing and evaluating the performance of observing programs within the virtual environment of the Gemini system.

- The system ensure observing facilities function seamlessly in both on-site and off-site environments with reliable connectivity.

- The system should design transparency to minimize the impact of link bandwidth.

- Safety measures for telescope operation must ensure real-time monitoring with audio and video capabilities, providing immediate access to a physically hard-wired emergency stop button for authorized staff members.

- The system must accurately simulate real-life observing conditions, considering available bandwidth.

- The available link bandwidth will influence the extent to which realistic observing conditions can be reproduced.

- The system should prevent the remote monitor's keyboard from affecting the observer's environment.

- The system ensure that remote keyboard operation does not interfere with or have unintended impacts on the local user's environment.

- The system must provide reliable and efficient real-time video and voice communication between the remote observer and the operator in the control room, ensuring optimal performance and stability.

- The system must provide reliable and secure remote access for monitoring and diagnostic purposes with optimal performance and stability.

  

****2.8 Observing support****

  

- The system can competently monitor at the Gemini 8m Telescopes site or remotely.

- The system ensure fast and efficient switching of telescope scheduling for seamless exchange of observing programs.

- Simplify expert scheduling software for ease of use through clear and concise information presentation.

  

****2.9 General software requirement****

  

- The system must establish a reliable support structure for communicating commands, adopting a uniform ACK/NAK protocol across all systems. Timeouts must be supported at approximately 500 msec.

- The system must ensure handshaking of commands between IOCs occurs within 100-200 msec, signaling acceptance of each command.

- The system must support timeouts for delayed replies to commands.

- The system must assume a peak control information rate of 100 TPS, with traffic isolation between communication sections.

- *_Data flow :_* Data from detectors must be stored in the most effective method permitted by available technology. Astronomical data is often detector readout limited so that disk access and data transfer times are not significant.

- Define maximum acceptable readout times based on detector type, size, and application:

- For focusing and related activities, aim for a maximum detector readout time of about 0.1 sec, focusing on a portion of the detector.

- For mosaicked, large optical detectors, ensure a full readout is completed in about 2 or 3 minutes.

- *_Concurrent data access and display :_* Since the Gemini system supports monitoring of operation, there must be the capability of providing multiple, simultaneous access to data.

- *_Data acquisition format._* Data is normally acquired as uncompressed data, but may be compressed using a *_loss-less_* compression technique for transmission from the Gemini system or across the system LAN.

- The system implement data storage using compressed format for all instruments and detectors.

- The system transmit data between Gemini and home institutes using the FITS format, including all header information.

- The system ensure system-wide data capacity for retaining 7 days of data from the largest instrument, with the last 3 days available interactively from a hard disk or similar medium.

- Specify LAN transfer rate requirements of 20-40 Mbits/second for data transfer between the virtual telescope system and attached workstations.

- The system must allow for fast transmission of rough images every 0.5 sec. This may be assisted through the use of data-loss compression techniques (e.g. JPEG, MPEG, etc).

- This high-quality transmission must require less than 20 sec, and can only be assisted with loss-less compression.

  

****2.11 General performance and reliability****

  

- The system should have no hard restrictions on the number of simultaneous users, but should allow for policy decisions that do restrict the amount of simultaneous access.

- Every command must be accepted/rejected within 2 sec and before the corresponding action occurs. (This is different than the ACK/NAK response of the communications protocol - here, the target system must have examined the command and verified its validity.

- Status display update must be within 4 sec at the local stations (certain functions, such as telescope position, may have tighter constraints). Remote station update response is given in the Requirements for Remote Operations section.

- Requests of subsystems for status information must be answered within 5 sec and be possible in maintenance level operation.

- Fault recovery, exception handling, fail-safe checks, etc. should be used to improve reliability.

  

****2.12 Test and Checkout requirements****

  

- The telescope and instrument software should contain built-in test (BIT) facilities to verify Gemini 8m Telescopes system and Gemini 8m Telescopes software performances.

- Gemini 8m Telescopes software module should have test specifications to check normal operation of releases, to be used both for acceptance tests and as an on-line test procedure.

- Gemini 8m Telescopes software package should apply regression tests.

  

****2.13 Contingencies****

  

- The subsystem should not allow to transfer of control to another IOC when IOC failure occur.

- The subsystem should have a procedure to replace faulty cards or assemblies when IOC failure occur and allow to observe with that particular IOC in a failed state.

- The system should allow to have a replacement units in case of failure, full redundancy is not allowed.

- In case of subsystem which each area where redundancy is decided to be cost effective, the system should establish procedures for switching to the backup system, automatic switching to the backup system is not allowed.

- In case of node failures, the system should allow certain network concept as the offered redundancy and re-routing possibilities.

- The system should use standard communication protocols as a base for all communication, where retry procedures are applied as part of the protocol.

  

****2.14 Constrains****

  

- System interfaces should clearly reflect access modes and operating levels.

- Gemini software should  maintain accurate *_change logs_* showing software modifications which they are applied to the software.

- Gemini software should be developed in *_evolutionary_* fashion, using the CVS version control system.

- All Gemini subsystem packages should include as part of the software both a *_simulator_* module and user *_interface_* modules.

- The system must be version labeled, both in source and binary form.

- The version information of the system should be retrievable from executing software via control commands.

- The simulation of hardware subsystems require a standard environment, such as VxWorks, EPICS, and VME crate/cpu.

- The simulation of hardware subsystems cannot require any hardware specific to the application.

- The subsystem should be as self-contained and autonomous as possible.

- No subsystem package should make any assumptions about the surrounding environment beyond that provided in the interface specifications.

## **General Requirements (p.39 - 66)**

  

### Functional

  

****3.1 Data Specification****

  

- The system must allow users to control the telescope and instruments by command.

- The system must be capable of receiving reply commands from the user.

  

****3.2 Operation****

  

- The system must have privileges system associated with categories of users or with the location of the user station.

- The system must allow the Supervisor to monitor, and other users must be capable of observing the program locally or remotely.

  

****3.3  External Interface Requirements****

  

- The system must support different modes of image processing (observing modes).

- The system should allow online access to the data archiving system.

- The system output format must be compatible with the GEMINI archive requirements.

  

****3.4 General Constraints****

  

- The system must allow switching to different configurations must be possible at any time with appropriate procedures.

- The system standards must be defined for the online software and the development environment to allow for expansion and maintenance.

  

****3.5 Attributes****

  

- The system must check range checking and validity checking before execution of any input command.

- The system requires checking the operational status of equipment before sending critical or time-consuming commands.

- The system requires recovery procedures and initiates restart after error failure.

- The system must have self-monitoring to involve safety monitoring.

- Subsystems must be capable to detect such danger and report it appropriately.

- The system’s safety aspects of the Gemini 8m Telescopes software are required to be analyzed during the functional specification phase of the software.

- The system that is operating in Engineering/Maintenance mode must ignore directives from other systems.

- The system must prevent intrusion into the system by unauthorized. users, or users at unauthorized access levels.

  

### Non-Functional

  

****3.1 Data Specification****

  

- The system must use astronomical data in digital form.

- The system’s telescope and instrument data can be stored with astronomical data.

- The system’s control information from the user must be responded to immediately by all subsystems. Regardless of the availability or faulty of the subsystem.

- The system’s delay time of control information transmission must be under 100-200 msec.

- The system’s transmission error or collision is acceptable, but the protocol must be predictable and reply reliably.

- The system should not allow Transmission loss.

- The system should allow Access to control parameters, telescope, and instrument information for monitoring or other uses to make a significant contribution to the control flow and should be logged at high rates for short periods.

- The system should ensure that all information is accessible by GEMINI software.

- The system’s information should be capable of access by all users, with writing restrictions. It must also be possible to restrict user access to such information.

- The system should make The meteorological information coming from a weather station to be available centrally.

- The system’s data flow must be as effective as technology could allow.

- The system’s storage that is kept in the memory of different nodes should be kept to a minimum.

- The system’s raw data must have at least two copies, one to secure data as acquired, and another one to assess data quality online.

- The system must acquire and store raw data as such for quick look evaluations. However, in some cases that require preprocessing, raw data will not be stored but be in preprocessed format instead.

- The system must transport Astronomical data between GEMINI and Home institutes visiting astronomers in FITS format.

  

****3.2 Operation****

  

- The system should restrict the level of operation based on user level.

- The system should have a single operator node for the telescope and two control nodes for data acquisition and instrument control while In the normal observing mode.

- The system must provide auxiliary data acquisition and instrument control nodes while running some tests that work in parallel and require a light beam at the moment.

- The system must support off-site observing mode. Located in either Gemini 8m Telescopes site support or Base Facility.

- The system must provide a local monitoring node and a remote monitoring node.

- The system must have automatic procedures for startup and shutdown of the telescope and instrument.

- The system must have reconfiguration procedures, to change the observing environment.

- The operational software should know which subsystems are installed and operational at any given time.

  

****3.3  External Interface Requirements****

  

- The system must have an interface with a homogeneous design throughout the system.

- The system’s user interface should not be package linked to a specific computer.

- The system’s user interface should be callable from a large number of stations.

- The system’s user interface should be network transparent.

- The system’s user interface tools shall be based on standards.

- The system must interface with the external software.

- The system shall be able to monitor the quality (image quality, spectral resolution, signal to noise, etc.) of the astronomical data.

- The system should provide quick-look data processing.

- The system’s quick-look acquired data must be made available as directly as possible in a common format.

- The system’s quick-look additional data related to exposure and logging information must be available online simultaneously.

- The system’s Quick-look should be usable within exposure sequences.

- The system should allow Near-line processing for simple data reductions.

- The system should allow data acquisition to take over near-line data reduction.

- The system must have offline pixel processing for full data reduction.

- The system’s offline pixel processing must not interface with the system.

- The system should support the astronomical community's image-processing packages.

- The system’s subsystem or instruments should allow special software if needed such as online pixel processing.

- The system should support specific types of data established by the Gemini Archiving Requirement.

- The system should make data available within a specific period established by the Gemini Archiving Requirement.

- The system should have access to the star catalogs.

- The system should be capable of following the automatic selection of candidate guides and standard stars.

  

****3.4 General Constraints****

  

- The system should support access to the system from any user station.

- The system’s instruments must be able to run fully independently.

- Telescope software at the two telescopes must be identical in the upper layers even if the hardware is differ.

- The system's new instruments should not modify already operational parts.

- The system modifications should be confined to the operational procedures and should not affect the bulk of the existing software.

- The system must be easy to procedures reconfigure the system when subsystems are modified or removed.

- The system number of main packages must be kept to a minimum.

- The system must allow Commercial and public domain packages to be used whenever possible.

- The system must allow existing packages to be reused or consulted wherever possible.

- The system’s subsystems that do not directly control specific hardware must be written as machine-independent, portable code. Even for microprocessor software, the software should be hardware-independent, to allow a later choice of the target microprocessors.

- The system must implement an online version control system that ensures availability for recovering/restoring versions at all times.

- The system must check the consistency of versions of all the various software components every time it starts.

- The system status parameters must be maintained to an extent that will allow restarting the system and regaining the previous state. The extent of duplication of the previous state will be dictated by safety and practical considerations.

- The system startup intrusion should allow for changing system constants.

- The system startup intrusion must have arcseconds/bit for an encoder.

- The system should allow changing constants during operation.

  

****3.5 Attributes****

  

- The system must have retry procedures in case of error or failure to achieve recovery online whenever possible.

- The system must put itself into a safe state whenever it requires recovery of fail or error in the system, and the system should report in a clear form to identify the cause of the problem.

- The system must be capable of reconfiguring itself to continue observing, in a different mode if required, given the failure of a single non-critical subsystem.

- The system must be capable of applying continuous monitoring to all subsystems on request, both operational and idle.

- The system requires the measurement of fault rates during commissioning to establish baseline rates for system reliability monitoring.

- The system’s subsystems are required to have modules to aid in the maintenance and testing of the subsystem.

- The system, subsystem, and each component must be able to achieve Quantitative maintenance requirement verification.

- The system must be able to change itself to a safe state if encounters any notification of such danger.

- The system must prevent accidental mix-up of commands from different users on different parts of the system and prevent intrusion from the wide area network (WAN) into the Gemini 8m Telescopes.

- The system must be designed to support the expandability of newer software and hardware.

- The system must protect the astronomical database from intrusion.

- The system’s subsystem must developed within a strict interface to other modules.

- The system’s subsystem must not rely on other subsystem’s information.

- The system’s module selection should be done logically to minimize the size of the interfaces between modules.

- The system’s online database should be accessible through its defined interfaces.

- The system’s module should have high cohesion and low coupling.

- The system mandates that subsystems must not have any undesired interactions among themselves.

- The system must be fault-tolerant.

- The system must be capable of guaranteeing security and safety in the event of failure of any component, including the higher-level software.

- The system should be able to reconfigure the software if one actuator fails.

- The system must have data redundancy.

- The release system should exist at the package and module level, which should be checkable online by the operational procedures for consistency.

## **Specific Requirements (p.67 - 90)**

  

### Functional

  

****4.2 Other controls and software requirements****

  

- The system should support asynchronous writes, enabling concurrent operations.

- The system's online data store should be responsible for retaining astronomical data pertinent to the current observation.

- The system should automatically archive astronomical data onto external storage media through dedicated software.

- The system should distribute telescope and instrument parameters across databases within the IOCs for those systems. Additionally, the OCS maintains a central repository where these databases are available for download to the IOCs using developed software.

- The system should store all non-essential data, such as configuration information, detailed documentation, and operation logs, in a relational database management system (DBMS) using supported software.

- The system should process observing commands, whether entered interactively or via the Sequencer, treating them as input data that informs the course of the operation and initiates events.

- The system should operate based on an initial set of configuration parameters, following a sequence of commands. Utilizing previously stored data, calibrations, and star catalogs is a complement to this operation.

- The system should operate in automatic mode as the default setting, where observations are carried out through a preplanned program, minimizing the need for interaction with the observer.

- The system should allow for the transition from automatic operation to interactive operation to manage exceptional conditions.

- The system should support interactive operation, allowing for science planning and program changes to be accomplished through interactive means.

- The system should designed to support normal operation at all operation levels (observing, maintenance, and testing) under various conditions for any subsystem, including observing, stand-by, and maintenance and testing

- The system is expected to achieve a cold start-up, initiating the system from scratch (including the time required for downloading all software).

- The system is designed to achieve a warm start-up, initiating from scratch but excluding software download time.

- The system should target instrument start-up, measured from the end of telescope start-up.

- The system should provide a mechanism for shutting down all subsystems, including both hardware and software.

- The system is required to log comprehensive information on all significant events, ensuring proper timestamps and indexing.

- The system should report all errors using a standardized, system-wide procedure for error logging.

- The system should classify errors as fatal when no acceptable recovery procedure is available to resume normal operation.

- The system transitions to a secure 'backup' state, necessitating human intervention for restart in the event of fatal errors.

- The system should designate errors as serious when they do not force the system offline, but the current operation cannot be completed.

- The system should mandate that all subsystems categorize errors into specified categories.

- The system should provide a clearly description when errors triggering an 'alarm' condition, along with the appropriate action required for acknowledgment and resolution of the alarm condition.

- The system's error logging, in addition to the time-stamp, should furnish sufficient information to trace the condition back to its apparent source, encompassing both equipment and event sequence

- The system should require well-defined recovery procedures for any subsystem that becomes inoperative, in addition to the start-up procedures.

- The system should distribute IOC control databases across the IOC subsystems, providing downloadable initialization copies available on the Gemini disks.

- The system should store configuration, logging, maintenance schedules, and subsystem documentation in the commercial relational database.

- Critical subsystems should provide interlock connections.

  

### Non-Functional

  

****4.1 Attributes****

  

- The system should consider the online databases as part of this interface, but access is limited to ensure reliability and availability.

- The system should conduct a measure of fault rates during commissioning to establish baseline rates for system reliability monitoring.

- The system should incorporate validity and feasibility checks during science planning and operation.

- The system should continuously monitor active subsystems to ensure correct operation before issuing commands to each subsystem. This monitoring should also persist for inactive subsystems.

  

****4.2 Other controls and software requirements****

  

- The system should ensure that all telescope, instrument, and detector control information is accessible at any operation level.

- The system should aim for database access times to fall within the range of 2-3 milliseconds per access.

- The system should ensure that time-access critical information is available in memory.

- The system should implement a consistent and logical (i.e., name-based) access method.

- The system should require the database to support both remote access and distributed data.

- It is expected that all operational capability found in onsite operations is extended to remote operations, with some degradation in performance resulting from WAN bandwidth considerations.

- The system should be designed to extend all operational capabilities present in on-site operations to remote operations, acknowledging potential performance degradation due to WAN bandwidth considerations.

- The system should incorporate security measures to regulate access to its features, potentially limiting certain operations to specific remote sites, such as Hale Pohaku or Hilo in Hawaii, Cerro Tololo in Chile, etc.

- The system should utilize astronomical object catalogs, which are available through external software.

- The system must meet the criterion of recording sufficient information during an observation to recreate the sequence of events accurately. This necessitates appropriately logging all input and output data.

- The system should define the overall performance of the Gemini telescope as the percentage of viewable time during which exposures have been taken, calculated as the sum of all exposure times over the available time for exposures.

- The system is expected to achieve a cold start-up, initiating the system from scratch (including the time required for downloading all software), in approximately 5 minutes. This duration does not encompass the time required for starting up the telescope or instruments.

- The system is designed to achieve a warm start-up, initiating from scratch but excluding software download time, in approximately 1 minute.

- The system targets instrument start-up, measured from the end of telescope start-up, to be completed in 2 minutes or less.

- The system should automatically log start-ups and shut-downs with timestamps to facilitate the collection of statistics on system availability.

- The system must have the capability to log engineering data at rates of up to 200 Hz for short durations. This data should be accessible to external software packages for analysis.

- The system must support long-term logging of engineering data at slower rates (1 Hz or less), using a common format baselined as SYBASE.

- The system must logs warnings for all other unexpected conditions and continues operation, albeit possibly with reduced efficiency.

- The system should provide tools available for extracting error (and other) logging information based on subsystem components, time-sequence, previous events, and other relevant criteria.

- The system includes two types of alarms: the first type consists of automatically monitored alarms that persist as long as errors exist and are then automatically cleared, while the second type requires human acknowledgement for clearance.

- The system should incorporate command retries for common timeouts or no-response conditions. These retries should be handled automatically in the command processing to prevent unnecessary error conditions.

- The system's error-mode recovery performance is subsystem-specific and defined in the Functional specification for each respective subsystem.

- The system assesses real-time operating systems and cross-development system software for compatibility with the goals of the Gemini Project. The selection process takes into account both the suitability of real-time operating systems and the availability of cross-support development environments.

- The system should consider the offline data reduction facility as separate from the Gemini software. However, the system allows for the connection of such software into the Gemini system if interface routines are developed for integration.

- The system must requires compatibility of internal data formats across workstations used for development.

- The system must ensures the availability of SCSI-interface peripherals.

- The system should take into account reliability, manufacturer support, and upgrade capability when selecting the final target systems for development.

- The system must maintain a memory-resident database at the core of each Input/Output Controller (IOC).

- The system’s components must interact with the database through designated database access routines.

- The system’s components must remain unaware of the underlying data structures of the database.

- The system should provide a high-level abstraction through database access routines.

- The system should provide a user-friendly interface for configuring and managing records within the database.

- Database access should be optimized for efficiency to ensure fast and responsive interactions with the system.

## Command

  

### Functional

  

****5.2 Command Structure****

  

- The general command structure in the system should contain of Command_ID which is an identification that is unique to that specific instance of each command, source, and target which indicate the originator and the recipient for the command.

- The source command structure in the system must contain of Opcode and Parameter set.

  

****5.3 General purpose commands****

  

- The system should have the following command to obtain the information about the state of the subsystem.

	- *_GetVersion_* The subsystem returns its version identification as a string value.

	- *_GetStatus_* The subsystem reports its current status. It should contain the status with the following meaning

		- DOWN - the subsystem is not operational

		- BOOTED - the subsystem has been booted, but not yet configured

		- CONFIGURING - the system is in the process of configuring (Steven).

		- CONFIGURED - the subsystem is configured, but not yet initialized

		- INITIALIZING - the subsystem is doing initialization actions

		- RUNNING - the subsystem is running at observing level

		- MAINTENANCE - the subsystem is running at maintenance level

		- SIMULATION - the subsystem is running in simulation mode

		- DISABLED - the subsystem is functional, but has been commanded to ignore control commands

		- SHUTDOWN - the subsystem is in the process of shutting down

		- LOCKED - an interlock exists on this subsystem.

	- *_GetState_* The internal state of the subsystem will returned as one of:

		- READY - the subsystem is fully operational, but currently idle.

		- BUSY_ON command - the subsystem is working, and currently processing the indicated command.

		- NOT_READY - the subsystem is not responding to commands at this time.

	- *_GetID_* The subsystem reports its unique identification tag.

	- *_GetConfiguration_* for detailed configuration information and detailed results of self-tests.

- Configuration information from *_GetConfiguration_* should ****includes details of any settings internal configurations (filters, positions, etc.) and, if requested, the detailed results of any self-tests.**

- The system should have following generic commands

	- *_SetStatus_* The target subsystem is to enter the state associated with the specified status argument

	- *_SetConfiguration_* This command directs the downloading of a configuration from the host to the target subsystem.

	- *_RunTest_* The subsystem runs a self-test and reports the result as one of

		- OK - the subsystem has detected no problems, it is running within specifications

		- BAD - the subsystem has detected problems that prevent its successful operation

		- WARNING - the subsystem has detected a problem that may prevent it from operating to full specification, but does not prevent it from functioning at this time

	- *_SetLogging_* Logging by the indicated subsystem is set to occur at the specified level.

- The system should be able to operate the command *_SetConfiguration_* with *_GetConfiguration_* to provide 'sequencing points' for subsystem restarts or roll backs.

- The system should have an argument describing a particular self-test when running the specific subsystem, the argument are given in Work Package Description.

  

****5.4 Data communications commands****

  

- The system should have the following communication commands

	- *_OpenRoute_* A route of the indicated class is being established for some item. The command includes sufficient information on the route to permit the IOC to communicate through the route.

	- *_CloseRoute_* A previously-opened route is being closed. Modules at either end of the channel are notified and take appropriate action.

	- *_ResetRoute_* The route is to be reinitialized. Modules receiving this command are to flush buffers associated with this route and reset operating parameters to initial conditions.

	- *_TestRoute_* A test message is transmitted across the route. All receivers on the route are to respond with an identification.

	- *_AwaitItem_* The module sending this command is blocked until information is received via the indicated route, or a timeout occurs.

	- *_SetCallback_* A callback is established to process data across the indicated route.

	- *_ClearCallback_* A previously established callback is removed.

  

****5.5 IOC commands****

  

- The system should have the following commands for IOC-based subsystems

	- *_LocateItem_* If the IOC local database contains the requested item, it responds with an identification sufficient for establishing a route to that item.

	- *_GetValue_* The value of the specified item is obtained.

	- *_PutValue_* A value is transmitted for the specified item.

	- *_StartStream_* A stream of data is transmitted through the indicated route. The IOC system continues to transmit data values until a StopStream command is received.

	- *_StopStream_* The indicated data stream is terminated.

	- *_SetEvent_* An event is established as a monitor of some database entry. Appropriate changes to that entry are to result in the indicated event being transmitted.

	- *_ClearEvent_* A previously set event is terminated.

  

### Non-functional

  

****5.1 Command routing****

  

- The system should allow commands and data routed through a channel which might be a conversion module.

  

****5.4 Data communications****

  

- Communication of information in the system is via routes, which may be a specific subsystem, channel, or broadcast.

  

****5.5 IOC commands****

  

- IOC crates in the Gemini system should have local databases.

- *_LocateItem_* command should be broadcast through the IOC network.

- Time format in the system should be in IRIG-B format as UTC.

- Control subsystems require time synchronization.

  

****5.6 Command implementation****

  

- *_Work Package Descriptions_* should include *_baseline_* command descriptions.

- The system should map the specific IOC command between ASCII strings and EPICS channel.
