# Requirements of the Gemini Project

This included **Functional Requirements** and **Non-Functional Requirements** of the Gemini Project, written in the form of EARS.

## User-Level Requirements

There are **5 classes of users** with different needs of the system. User interfaces for different access levels should be uniform across all subsystems, though different access levels should present different __‘look-and-feels’__.

|Class	|Operation Level |Access Mode	|User Interface
|-------|------|------------|--------------
|Astronomer|Observing|Planning, observing, monitoring|Simple, safe, controls grouped for convenience of observation activity.
|Science Observer|Observing|Observing, monitoring|Same as for astronomer.
|Telescope Operator|Observing, maintenance, test|Observing, monitoring, operation, testing|Organized for ease of control and quick response to unsafe conditions, ability to monitor all subsystems as needed.
|Support|Maintenance, test|Monitoring, operation, testing|Must allow full access to all subsystems.
|Developer|Maintenance, test|Monitoring, testing|Must allow full access to each subsystem in test.
|Administrator|Observing, maintenance, test|Monitoring, administrative|Simple, safe, status inquiries only.



To fulfill the needs, requirements that needs to be achieved are devided by classes below.

### 1. Astronomers and Science Observer

#### Fuctional Requirements

- The **System** shall facilitate on-line assessment of data quality.
- The **User Interface** shall allow users to acquire astronomical data.
- The **System** shall support an execution queue for scheduling commands, allowing later execution.
- The **User Interface** shall allow users to submit observing commands into the execution queue, including the commands to break or resequence the queue.

#### Non-Funtional Requirements

- **Traditional Interactive Operation** shall be replaced by operation via an automatic sequencer.
- The **Scheduling Queue** shall be transparent to the on-site observer during the initial phases of telescope operation.
- The **User Interface** shall be simple, safe and convenience for observation activities.
- The **System** shall not provide observers the privileges for direct control of the telescope.
- **Certain functions**, like adjusting spectrograph slit width for seeing conditions, must require interactive capability.

### 2. Operations Staff

#### Fuctional Requirements

- The **User Interface** shall allow users to interact with a scheduler program and direct command execution.
- The **System** shall allow users access to operation tables in update mode.
- The **System** shall allow users to change the operational status of units based on test results.
- The **System** shall allow users to monitor general performance and ensure system safety.

#### Non-Funtional Requirements

- While **Subsystems** are in normal operation, the system shall not allow users access to subsystems.
-  The **System** shall provide users privileges to access all commands and maintenance procedures in case of problems.

### 3. Software Developmant and Maintenance Staff

#### Fuctional Requirements

- When there is a major problem to be solved or an upgrade to be installed, the **System** shall allow users to intervene.
- The **System** shall allow users to perform system generation and installation of new software packages or releases.
- The **System** shall allow users to work at the test level for the part of the software under test.
- The **System** shall facilitating integration tests by running relevant parts of the system in test mode.

#### Non-Funtional Requirements

-  The **System** shall provide users the highest privilege to modify everything in the system.
- **Some Commands** are available for testing hardware, which are not accessible to observing astronomers.
- **Configuration Control** must follow a strict guideline to prevent interference with ongoing normal operation.

## Operational Context

The Gemini 8m Telescopes operation must deal with a complex environment produced by: 
- multi-telescope context 
- multi-instrument context
- visitor instrument context 
- multi-user context

### 1. Multi-Telescope Context 

#### Fuctional Requirements

- The **System** shall not support concurrent use of the two telescopes as if they were a single facility.

#### Non-Funtional Requirements

- The **System** shall be designed with the scalability and compatibility necessary to support collaboration with nearby telescopes in the long term.

### 2. Multi-Instrument Context 

#### Fuctional Requirements

- The **System** shall support the configuration of normally three scientific instruments mounted on the cassegrain focus of the telescope.
- **Parallel Access** to all mounted instruments shall be provided, though only one instrument has access to the telescope beam (active instrument).
- **Instruments that feed two detectors** by using beam splitters or field splitters shall be considered as a single active instrument.
- The **System** shall provide functionalities for calibration, hot standby, and operation at different levels for inactive instruments.

#### Non-Funtional Requirements

- The **System** shall ensure consistent operation of instruments across various operational levels (observing, maintenance, test).
-    The **System** shall facilitate efficient transitions between instruments, ensuring smooth switching of the telescope beam.
- **Inactive Instrument** shall not be allowed to adversely impact the active instrument.

### 3. Visitor Instrument Context 

#### Fuctional Requirements

- The **System** shall support the installation, operation, and support of outside instruments brought by the observer (visitor instruments).
- The subset of the **Available Functionality** shall be available through a standardized interface for visitor instruments.
- The **User Interface** for visitor instruments shall support acquisition of status information, preprogrammed observing sequences, and the capability to offset the telescope position and focus.
 - If feasible, the **User Interface** should provide support for coordinate transforms between visitor instrument and the Gemini system, archiving (or archivability) of visitor instrument data, and maintenance of operations tables.

#### Non-Funtional Requirements

- The **stability and long-lived nature** of the visitor instrument interface shall be emphasized to ensure reliable and consistent interactions.

### 4. Multi-User Context 

#### Fuctional Requirements

- The **System** shall allow users to access any part of the Gemini 8m Telescopes system from any location at the telescope site.
- The **System** shall allow multiple users to monitor the Gemini 8m Telescopes system simultaneously, with an active user in control and others observing relevant data.

#### Non-Funtional Requirements

- **Monitoring Activities** shall not adversely affect the performance of ongoing observations or operations.
- **Automatic Displays** of status information at different locations shall exist to facilitate continuous monitoring without explicit user interaction.

## Observing Mode Requirements

### 1. Interactive Observing

#### Fuctional Requirements

- **Observing** shall be executed with the sequencer by providing a computer executable program.
- **Interactive Operation** shall be supported through the Observatory Control System (OCS).
- **User Interface** to the OCS shall allow changes to the viewing program.
- The **System** shall allow more than one station participate in the observing.

#### Non-Funtional Requirements

- **Telescope Operation** in interactive observing mode shall be supported by the software in a smooth and friendly way.
- Interaction via an **Automatic Sequencer** shall be a top priority requirement and its implementation precedes other modes.
- The initial implementation of the **Automatic Sequencer** shall operate in a "pass through" mode with minimal checking and delay.

### 2. Queue-Based

#### Fuctional Requirements

- The **Observing Program** shall be fully automated, requiring minimal human interaction during observation.
- A full **Telescope Simulator** shall be required for testing observing programs for completeness, errors, and functionality.
- All **Control Software** shall provide support for simulated use within the virtual telescope.
- The **Software** shall support flexible scheduling, both manual and via a scheduler, allowing for the interleaving of observing programs.
- The **System** shall be allowed to queue all possible observing with currently available instruments, including preprogrammed observing sequences.

#### Non-Funtional Requirements

- The programming environment for the **Automated Observing Program** shall be visually-oriented, simple, and easy to use for astronomers.
- If a **Scheduler is not included** in the initial system design, the design shall allow for its future implementation.
- **Scheduling** shall allow for the interleaving of observing programs in a manner transparent to individual programs.
- The **System Design** shall allow for the future implementation of a scheduler.

### 3. Remote Operation

#### Fuctional Requirements

- All **Software** shall be developed to permit remote operations with no conceptual difference between on-site and remote operation.
- All **Observing Facilities** should function both on-site and off-site, enabling full remote operations.
- **Team Observing**, involving multiple observers at different sites, shall be supported.
-  When needed, the **System** shall restrict specific operations to designated remote sites.
- **Security Measures**, including different operation levels and privileges at different sites, shall be considered.
- **Remote Users** shall interact with the system through operators at different facilities and via the scheduler program, without direct control over the telescope.

#### Non-Funtional Requirements
- The **System** shall be transparent to both local and remote use, with functionality unaffected by the location.
- **Distributed Access** to the Gemini 8m Telescopes software shall allow local and remote access without extra requirements.

### 4. Service

#### Fuctional Requirements

- The **Observing Program** for service observing shall be automated, requiring minimal human interaction during the observation.
- The **Programming Environment** shall be available concurrently to both the astronomer (for program development) and the observer (for review and adjustment).
- The **Programming Environment** shall allow for the communication of special notes, instructions, and comments from the astronomer to the observer, potentially using multimedia techniques.

#### Non-Funtional Requirements

- The **Gemini Software** shall include a rich programming environment that is visually-oriented, providing a simple and easy-to-use interface for developing observing programs.
- **Service Observing** shall required a suitable organization and considerable experience with a smooth running system.

## Observing Support

#### Fuctional Requirements

- Interaction during **Automatic Sequences** shall be allowed at different levels, such as only on error conditions or any time the user is allowed to break a sequence.
- **Scheduling** shall react to changes in weather and other conditions, allocating the current use of the telescope to the optimal observing program for those conditions.

#### Non-Funtional Requirements

- While achieving efficient service observing, the **System** shall retain the advantages and extra flexibility of ground-based astronomy.

## General Software Requirements

#### Fuctional Requirements

- All subsystems shall respond to a common set of commands to test operational status, inquiries as to version, perform self-tests, etc.
- Timeouts shall be at approximately 500 msec.
- Handshaking of commands between IOCs shall occur within 100-200 msec, signaling acceptance of each command.
- If commands allowing delayed replies, then timeouts for that reply shall be supported.
- Peak control information within the system shall be 100 TPS, assuming bridging between communication sections to isolate traffic in relevant sections only.
- The system shall provide multiple, simultaneous access to data, imposing significant transfer requirements on the LAN, supporting a transfer rate of 20-40 Mbits/second.
- Data from all instruments and detectors shall be stored as compressed data, using a standard format with multiple storage levels within IOCs and on the Gemini system data disk(s).
- Data shall be transmitted between Gemini and home Institutes using a FITS format, including all header information provided with the data.
- The system data capacity shall be limited by transfer methods and technology, capable of retaining 7 days of data produced by the largest instrument, with the last 3 days available interactively from hard disk or similar medium.

#### Non-Funtional Requirements

- The syntax of control flow commands shall be consistent across the system, whether accessing workstation software or IOC software.
- The support structure for communicating commands shall have a uniform ACK/NAK protocol across all systems.
-  The system shall allow for fast transmission of rough images every 0.5 sec, potentially using data-loss compression techniques.
- Transmission of images matching the original resolution shall requiring less than 20 sec, possibly assisted with loss-less compression.
- The LAN shall support a transfer rate of 20-40 Mbits/second for concurrent data access and display.

## Operation Privileges, Protections, and Procedures

#### Fuctional Requirements

- An Access Mode Allocation system shallbe implemented to dynamically identify and assign resources as needed.
- Critical resources supporting a restricted number of simultaneous uses shall be assigned solely through the allocation system, preventing deadlocks.
- Procedures shall be implemented for common tasks, including telescope start-up and shutdown, telescope system self-testing, instrument start-up and shut-down (without interfering with telescope operation), and instrument self-testing and self-diagnosis.
- The control software shall know what subsystems are installed and their status at all times.

#### Non-Funtional Requirements

- The system shall implement privileges, protections, and procedures to preserve its integrity.
- The Access Mode Allocation system shall be reliable and ensure that the system cannot remain deadlocked concerning critical resource allocation.
- Instrument start-up, shut-down, self-testing, and self-diagnosis shall not interfere with telescope operation.

## General Performance and Reliability Requirements

#### Fuctional Requirements

- The Gemini software shall allow for policy decisions to manage the number of simultaneous users, although there should be no hard restrictions.
- Every command shall be accepted or rejected within 2 seconds, and this decision should be made before the corresponding action occurs.
- Status display updates at local stations shall occur within 4 seconds (with possible tighter constraints for specific functions).
- Requests for subsystem status information shall be answered within 5 seconds, and this should be possible during maintenance level operation.
- Response time requirements within the user interfaces shall be provided in the User Interface requirements section.

#### Non-Funtional Requirements

- All software bugs shall be logged and fixed promptly after detection, with the goal of having restart conditions occur only on hardware failure.
- Fault recovery, exception handling, fail-safe checks, etc., shall be employed to improve reliability.

## Test and Checkout Requirements

#### Fuctional Requirements

- The telescope and instrument software shall incorporate built-in test (BIT) facilities to verify the performance of the Gemini 8m Telescopes system and Gemini 8m Telescopes software.
- Every Gemini 8m Telescopes software module shall have corresponding test specifications to check normal operation of releases.
- The Gemini 8m Telescopes control software shall provide for the execution of self-test sequences for the Gemini 8m Telescopes system and subsystems.

#### Non-Funtional Requirements

- Regression tests shall be a part of every Gemini 8m Telescopes software package.

## Contingencies

#### Fuctional Requirements

- When faults occur, the Subsystems shall notify the user, providing specific information about the origin and nature of the problem. The notification shall be capable of electronic logging.
- Multiple levels of fault notification, such as detailed, verbose, short, etc., shall be available to aid in tracking down problems.
- Predefined procedures shall exist to redefine the operational environment in the event of subsystem failure, allowing for the restart of operation with the remaining equipment.
- If there is a computer hardware failure concerning user station equipment, then a simple software reconfiguration procedure shall enable the transfer of control from one user station to another.
- If there is a IOC failure, then the procedures shall be in place for replacing faulty cards and/or assemblies. If possible to observe with a particular IOC in a failed state, the system shall be reconfigurable accordingly.

#### Non-Funtional Requirements

- Redundancy decisions shall be based on cost-effectiveness, and procedures for switching to backup systems should be established where deemed cost-effective.
- All communication shall be based on standard communication protocols with retry procedures, serving as a form of software redundancy.
- Certain network concepts, such as those with intrinsic redundancy (e.g., double loops) and re-routing possibilities in case of node failures, shall be preferable.

## Constrains

#### Fuctional Requirements

- -   Policy decisions, such as permissions and access privileges, shall be the only elements preventing users from accessing any part of the Gemini system from any local or remote station.
- Similar functionality shall be presented to users through similar user interfaces.

#### Non-Funtional Requirements

- If feasible, Commercial packages, off-the-shelf public domain software, and standards shall be used.
- Gemini software developers shall maintain accurate change logs showing software modifications as they are applied to the system software.
- Gemini software shall be developed in an evolutionary fashion, using the CVS version control system.
- All Gemini subsystem packages shall provide modules for the testing and diagnosis of the subsystem.
- All instrumentation control software shall provide full access to all instrument functionality.
- All Gemini software shall be version labeled in both source and binary form, with version information retrievable from executing software via control commands.
- Gemini subsystems shall be as self-contained and autonomous as possible, decreasing the functional width of the interface to the rest of the Gemini system.
- No subsystem package shall make any assumptions about the surrounding environment beyond that provided in the interface specifications.

## General Requirements

### 1. Data Specifications

#### Fuctional Requirements

- The software shall acquire astronomical data in digital form.
- Various data, including parameters, control commands, video, and voice data, shall be exchanged between different processing units for telescope and instrument setup and control.
- Control parameters, telescope and instrument information, and meteorological data shall be available to the Gemini 8m Telescopes software and accessible to all users, subject to defined restrictions.
- Astronomical data shall be transported between GEMINI and home institutes of visiting astronomers in FITS format, as defined by NOST 100-1.0.
- TV data related to site monitoring and voice data shall be available at all operations facilities.
- Information from sky field monitors, autoguider cameras, sky monitoring devices (e.g., cloud and seeing monitors) shall be available.
- Voice connectivity should be available on a permanent connection.

#### Non-Funtional Requirements

- Delay times for the exchange of control information shall stay within precise time limits.
- The protocol shall be predictable, with commands unable to get lost and replies required to come back reliably.
- The link chosen to transfer data shall represent as small a bottleneck as possible for data acquisition.

### 2. Operation

#### Fuctional Requirements

- Normal operational mode shall allows maintenance tables (e.g., instrument parameters) to be updated.
- The system shall supports off-site observing modes with a dedicated data acquisition and instrument control node, located at either the Gemini 8m Telescopes Site Support or Base Facility.
- The system shall supports local and remote monitoring nodes for supervisor and user monitoring purposes.
- The Gemini 8m Telescopes control software shall allows simultaneous operation of up to six active control nodes and up to two monitoring nodes without appreciable degradation of performance.
- Automatic procedures shall be in place to implement startup and shutdown of the telescope and instruments

#### Non-Funtional Requirements

- Every command shall be acknowledged positively or negatively before the occurrence of the corresponding action within specified response times.
- Operational software shall know which subsystems are installed and operational at any given time.

### 3. External Interface Requirements

#### Fuctional Requirements

- The user interface shall provide a homogeneous look and feel across different stations and instruments.
- The user interface shall be network-transparent, callable from various stations without dependency on a specific computer.
- Standard interfaces to control electronics, including standard bus systems, interface cards, and software skeletons, shall be available.
- Gemini 8m Telescopes software shall interface with external software, including commercial packages, preexisting software, and software associated with visitor instrumentation.
- On-line quick-look analysis capabilities shall be provided for monitoring the quality of astronomical data, with standard reduction procedures for basic calibrations.
- Gemini 8m Telescopes software shall be able to interface with all commercial software packages integrated into the operation.
- The LAN shall support required data bandwidths and response times for internal communication needs.

#### Non-Funtional Requirements

-  User interface tools shall be based on standards, offering portability across different computer hardware platforms.
-  The output format of Gemini 8m Telescopes data shall be compatible with the GEMINI archive requirements.
- Quick-look data processing shall be synchronous and usable within exposure sequences without manual intervention.
- Off-line pixel processing for full data reduction shall exist at the Gemini 8m Telescopes site, but without direct interface to the Gemini 8m
- On-line interactive access to the data archiving system shall exist, allowing users to access the database for Gemini 8m Telescopes data.
- Network redundancy shall be considered to increase reliability and security, especially for control information.
- LAN and WAN interfaces shall be homogeneous and based on standards allowing migration on different media.
- Peer-to-peer connectivity and bypassing the hierarchy shall be limited to overcoming demonstrated performance problems and specific data transmission needs.

### 4. General Constraints

#### Fuctional Requirements

- The software must support access to the system from any user station.
- User stations should be software-configurable and identical in principle.
- Computers used at the Gemini 8m Telescopes site, especially during the test phase, shall be checked against altitude and humidity specifications.
- Identical network access must be supported.

#### Non-Funtional Requirements

- Computer hardware must be compatible with the Gemini 8m Telescopes software environment and scalable in performance.
- Local processing power must be sufficient for telescope and instrument control without significant overhead.
- Individual instruments must be able to run fully independently.
- Telescope software at the two telescopes must be maintained to be identical in the upper layers.
- All software not directly controlling specific hardware must be written as machine-independent, portable code.

### 5. Attributes

#### Fuctional Requirements

- Subsystem software should include modules for self-checking at different levels, such as monitor level, self-test level, and system level.

#### Non-Funtional Requirements

- The software aims to achieve simplicity according to complexity criteria provided by Rick.
- Fault tolerance and redundancy shall are emphasized.
- The software must be designed with expandability and modularity in mind, utilizing standard industry practices.
- Software must be designed with human engineering requirements, considering stress effects, feedback, interfaces, procedures, training, and experience.


## Specific Requirements

### 1. Attributes

#### Fuctional Requirements

- The system shall continuously monitor active and inactive subsystems for correct operation.
- No module can rely upon information outside of its defined interface.

#### Non-Funtional Requirements

- All software is to be developed using typical modularization and standardization techniques.
-  A measure of fault rates should be done during commissioning to establish baseline rates for system reliability monitoring.
- Validity and feasibility checks during science planning will be needed to ensure effective and efficient use of the telescope.

### 2. Other Control and Software Requirements

#### Fuctional Requirements

- All telescope and instrument parameters are kept in an online database to permit easy implementation of table-driven applications.
    -   Telescope, instrument, and detector control information available at any operation level.
    -   Access times to the database in the range of 2-3 msec per access.
    -  Support for asynchronous writes, allowing for concurrent operation.
    -  Time-access critical information available in memory.
    -  Consistent and logical (name-based) access method.
    -  Support for both remote access and distributed data.
- The internal implementation of the database within the IOC shall based on EPICS.
- Gemini telescope operation supports a full implementation of remote operations, including remote observing, remote control of telescope, enclosure, and instruments, multipoint monitoring, remote monitoring, and remote access for testing, development, diagnostics, and maintenance.
    -   Video data signals encoded digitally and transferred via the WAN to remote sites.
    -   Security measures for controlling access to system features, possibly restricting some operations to specific remote sites.
 - Start-up, shut-down, and logging procedures.
    -   Start-up and shut-down procedures at various levels.
    -   Logging of system events, including engineering logging.
    -   Fault-tolerance and recovery procedures.
    -   Error logging for fatal, serious, and warning conditions.
  - Development environment for Gemini software.
    -   Development operating system is UNIX System V, Release 4.
    -   Use of X-windows (X11R5 or X11R6) for GUI systems.
    -   Use of the GNU software tool suite and CVS for version control.

#### Non-Funtional Requirements

- Specifies requirements for development system hardware.
    -   Workstations conform to specified software standards.
    -   Workstations are state-of-the-art systems with scalability.
    -   Support for Ethernet IEEE-802.3 and FDDI interfaces.

### 3. User Requirements for EPICS Developers

#### Fuctional Requirements

- The system must be built on the Experimental Physics and Industrial Control System (EPICS) toolkit, which serves as the foundation of the Gemini control system.
- The system must include an Operator Interface (OPI) running on a UNIX-based workstation capable of running various EPICS tools.
- The system must include Input Output Controllers (IOCs), which are VME/VXI based chassis containing a Motorola 68xxx processor, various I/O modules, and VME modules providing access to other I/O buses such as GPIB.
- A communication network (LAN) must be established to facilitate communication between IOCs and OPIs.
- EPICS must provide a software component, Channel Access, ensuring network-transparent communication between a Channel Access client and an arbitrary number of Channel Access servers.
- The system must have a memory resident database with various record types (e.g., ai, ao) and extensible fields.
- All access to the database, except for record and device support, must be through channel or database access routines.
- The system must allow for record-specific knowledge removal through record support modules, device support modules, and device drivers.
- Callback mechanisms for database value changes must be provided, allowing notification without constant polling.
- The system must provide OPI tools, divided into Channel Access tools (e.g., MEDM, DM, ALH, AR, Sequencer) for real-time monitoring and control of IOCs.
- Additional OPI tools (e.g., DCT, CAPFAST, GDCT, EDD) must be available for database configuration, display editing, and other purposes.
- A mechanism must be in place for managing EPICS components, including core software, optional components, and tools.
- The system must support interoperability with other software systems, such as IDL/PvWave, Mathematica, and WINGZ.

#### Non-Funtional Requirements

- The system must provide real-time performance for monitoring and controlling IOCs.
- The EPICS toolkit must be scalable to accommodate different sets of record types, device types, and drivers.
- The EPICS system must be reliable for use in large accelerator control and diagnostics systems.
- The system should be designed to facilitate maintenance and enhancement of EPICS IOC software.
- OPI tools must be user-friendly, supporting ease of use for both regular users and one-time users.
- EPICS must integrate seamlessly with other components of the Gemini control system, including work packages and future developments.
- The EPICS system must be flexible to accommodate new record types without impacting existing software.
- Clear and comprehensive documentation must be provided for EPICS developers, differentiating between 'Internals' and 'Applications' work.
- Training classes must be available to developers, covering the nature of 'Internals' and 'Applications' work within the EPICS community.
