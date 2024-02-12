## Team Member

| ID | Name | 
| ------------- |-------------
| 6488056 | Tanapat Klipkamrai
| 6488088 | Ittikorn Suksai      |
| 6488104 | Punnaruj Wuthijariyasak |
| 6488177 | Jedsada Meenoi |

## Table of Contents
- [General Description](https://github.com/ICT-Mahidol/Gemini-2023/blob/idk/idk.md#general-description)
- [General Requirements](https://github.com/ICT-Mahidol/Gemini-2023/blob/idk/idk.md#general-requirements)
- [Specific Requirements](https://github.com/ICT-Mahidol/Gemini-2023/blob/idk/idk.md#specific-requirements)

## General Description

### Functional Requirement

- All software will be maintained under a version control system and must include facilities for easy inclusion into the Gemini software environment.
- When access to the system. It must be restricted according to the current level of operation.
- During observing level operation, the software must impose on the Gemini system a series of access modes (Operation, Monitoring, Operation, Planning, Testing, and Administrative) 
- The system must show the interface status of other operations while fulfilling the various operational requirements in the different modes.
- The system must give selected users privileges for direct control of the telescope and status requests.
- Observing commands will normally be submitted via the User interface to a queue for later execution.
- The system must prevent unauthorized access mode changes.
- The system must have privileges to access all commands and maintenance procedures for operation staff
- Operations staff shall have access to operation tables in update mode while observing astronomers will have access to them only in read mode.
- The response time of every command, status display, and request of the subsystem must be below 5 sec.
- The system should prevent inactive instrument-permitted actions from adversely impacting the active instrument.
- The system should allow the Visitor instrument to acquire status information of the instrument by other systems.
- The system should be set to Multi-user when instruments are operated as single units when several user stations are active at the same time.
- The system should allow users to access (according to their privileges) any part of the setup with a simple login and configuration operation.
- The multi-monitoring system should allow users to follow directly the results of tests performed and investigate how the system is working.
- The Interactive operation system should always be supported through the Observatory Control System(OCS).
- OCS interface should allow users to change in viewing programs.
- The observing program must be fully automated.
- All control software must provide support for simulated use within the virtual telescope
- The system must be able to restrict specific operations to specific remote sites.
- Remote users should be able to remote control telescopes via facilities but cannot control part of them directly.
- Subsystems must notify the user when faults occur. This notification must be specific as to the origin and problem.
- The system must have predefined procedures when subsystems fail so it can restart the system.


### Non-functional Requirement

- The Gemini system when powered on will exist in one of several disjoint operational levels.
- Users of the system will be located at one or more facilities. These are referred to in general as Gemini 8m Telescopes operations facilities.
- Collected data must be accurate, reliable, and meet scientific needs.
- Operation staff shall be able to change the operational status of units according to the results of tests performed on such units.
- Software development staff should get the highest privilege for modifying everything in the system.
- The instrument shall be able to work at all foreseen operation levels (observing, maintenance, testing).
- The visitor instrument should coordinate transforms between the visitor instrument and the Gemini system.
- All other users wishing to monitor Gemini 8m Telescopes operations have to go through the procedures set up by Operations and get permission to do so.
- Multi-point monitoring should allow a local observer to be monitored and advised by a remote supervisor user.
- Interaction observing will normally be via an automatic sequencer.
- All software should be developed to permit remote operations
- Remote operations software must be considered working from the beginning before other software
- Users shall be able to observe from a remote site.
- Security of operation shall be considered and might imply different operation levels and privileges at different sites.
- The support structure for communicating commands must be reliable, with a uniform ACK/NAK protocol adopted across all systems. Timeouts must be supported at approximately 500 msec.
- The syntax of control flow commands is to be consistent across the system, whether accessing workstation software or IOC software.
- The Data format should be transmitted between Gemini and home Institutes using a FITS format and contain all header information provided with the data.
- Procedures must be implemented for convenience and system integrity, to simplify and codify common tasks. 

## General Requirements

### Functional Requirement
- Control information must be transferred, typically in the form of commands and replies from users.
- Control information on all controlled variables must be provided by all subsystems on request.
- A subdivision within the levels must implement privileges associated with categories of users or with the location of the user station.
- The system must enforce protection among users and the operational software.
- The system should provide for one auxiliary data acquisition and instrument control nodes
- The system must have automatic procedures to implement the startup and shutdown of the telescope and instruments.
- The system must have reconfiguration procedures to change the observing environment.
- The user interface should not be seen as a package linked to a specific computer but should rather be seen as a package to be callable from a large number of stations, depending on where a user is.
- The software must be adequate for the real-time requirements and must offer drivers to the standard electronics.
- Telescope software must be able to interface with all commercial software packages available on the Gemini 8m Telescopes.
- The LAN shall support the majority of the Gemini 8m Telescope system's internal communication needs
- The system architecture should be designed to minimize the communication load placed on peer and higher-level networks.
- A clear hierarchical model must be implemented, supporting the separation of logical and physical layers.
- The software shall support access to the system from any user station.
- Switching to different configurations must be possible at any time with appropriate procedures. 
- Changing system constants shall not require recompiling but will be updated as part of the system startup to regain the previous state.
- Conduct range checking and validity checking before executing any input command.
- Check the operational status of equipment before sending critical or time-consuming commands.
- Implement recovery procedures and initiate restart after error failure.
- Include self-monitoring for safety.
- Subsystems should detect and report dangers appropriately.
- Analyze safety aspects of the Gemini 8m Telescopes software during the functional specification phase.
- In Engineering/Maintenance mode, ignore directives from other systems.
- Prevent intrusion by unauthorized users or users at unauthorized access levels.

### Non-Functional Requirement
- Raw data will be acquired and stored as such for quick look evaluations.
- Astronomical data will have to be transported between GEMINI and the home institutes of visiting astronomers in FITS format
- The system must support off-site observing modes.
- Telescope control software shall allow simultaneous operation of up to six active control nodes and up to two more monitoring nodes.
- Each node must have the capability to run at all operation levels.
- The observing environments must be dynamic.
- Network redundancy should increase reliability and security, in particular for control information.
- Existing software packages should be reused wherever possible.
- The control support system should have a supportability influence on design.
- The control support system should provide support at a minimum cost.
- The system shall put itself into a safe state, whenever a safety aspect might be involved.
- Implement retry procedures in case of errors or failures for online recovery whenever possible.
- Put the system into a safe state when recovery is required, reporting the cause of the problem clearly.
- Reconfigure itself to continue observing in a different mode if a single non-critical subsystem fails.
- Apply continuous monitoring to all subsystems upon request, both operational and idle.
- Measure fault rates during commissioning to establish baseline rates for system reliability monitoring.
- Include modules in subsystems to aid in maintenance and testing.
- Achieve quantitative maintenance requirement verification for the system, subsystems, and each component.
- Change to a safe state upon encountering any notification of danger.
- Prevent accidental mix-up of commands from different users on different parts of the system and intrusion from the WAN into the Gemini 8m Telescopes.
- Design for the expandability of newer software and hardware.
- Protect the astronomical database from intrusion.
- Develop subsystems within strict interfaces to other modules.
- Avoid reliance on information from other subsystems in subsystems.
- Select modules logically to minimize the size of interfaces between modules.
- Make the online database accessible through defined interfaces.
- Achieve high cohesion and low coupling in modules.
- Ensure subsystems do not have any undesired interactions among themselves.
- Must be fault-tolerant.
- Guarantee security and safety in the event of failure of any component, including higher-level software.
- Reconfigure the software if one actuator fails.
- Include data redundancy.
- Implement a release system at the package and module level, checkable online by operational procedures for consistency.

## Specific Requirements

### Functional Requirement
- All telescope, instrument, and detector control information is to be available at any operation level.
- Asynchronous writes are to be supported, allowing for concurrent operation.
- There is to be a consistent and logical (i.e. name based) access method
- The database must support both remote access and distributed data.
- Support a full implementation of remote operations, including remote observing, remote control of telescope, enclosure, and instruments, multipoint monitoring, remote monitoring, and remote access for testing, development, diagnostics, and maintenance.
- Extend all operational capability found in on-site operations to remote operations, with some degradation in performance resulting from WAN bandwidth considerations.
- Encode video data signals digitally and transfer them via the WAN to remote sites.
- Implement some form of security to control access to system features, possibly restricting some operations to specific remote sites (e.g., Hale Pohaku or Hilo in Hawaii, Cerro Tololo in Chile, etc.).
- Software below the IOC level should not require downloading, except possibly for upgrades, typically being placed into ROM or FLASH memory.
- The development operating system is UNIX System V, Release 4
- The GUI systems are to use X-windows, version 11, release 5 (X11R5) or release 6 (X11R6).
- The principal language for developing GUIs is Tcl/Tk.
- The communication interface between the IOCs and Unix workstations is to be IMP.
- IOC software development is to be done using a common development environment, as specified in the Software Programming Standards (SPS)
- The host workstation operating system is Unix, currently baselined as Solaris 2.3 or above.
- The communication software must support the standard ARPA services (telnet, FTP, SMTP, etc) as well as NFS, RPC, IPC, and the Unix socket interface library.
- Conformance to specified software standards.
- Well-designed development environment.
- State-of-the-art systems in a scalable family.
- Migration capability to advancing technology.
- Support for Ethernet IEEE-802.3 and FDDI interfaces for communications.
- Compatibility of internal data formats across workstations.
- Availability of SCSI-interface peripherals.
- Reliability, manufacturer support, and upgrade capability.
- Multi-platform development environment for final target selection.
- Workstations with at least 2GB of disk.
- Availability of DDS DAT cartridges for data acquisition, backups, and software transport.
- Presence of a CD-ROM for SUN OS and software upgrades.
- Compression using a standard algorithm for transport, with archives in tar format.
- Use of Motorola MVME-167B (68040@33MHz) with at least 16MB of dynamic memory.
- Definition of IOC computer cards in the ICS work package description.
- Delay in establishing target IOC computer cards to leverage technology advances while staying compatible.
- Based on Ethernet IEEE 802.3.
- Described in the Software Design Description.
- Based on Ethernet for development systems; the solution meets performance requirements for the final system to be decided later.
- FDDI system recommended for the backbone LAN due to bandwidth requirements.
- Cabling shown in Figure 4 - 1 with requirements given in the Electronic Design Specification.
- Interlock connections must be provided for all critical subsystems, and the software interface to the interlock system is defined in the Instrument Control System Infrastructure Work Package Definition.
- UNIX-based workstation capable of running various EPICS (Experimental Physics and Industrial Control System) tools.
- VME/VXI-based chassis containing a Motorola 68xxx processor.
- Inclusion of various I/O modules within the IOC.
- VME modules to provide access to other I/O buses, such as GPIB.
- Use of LAN for local area networking purposes.
- Inclusion of a memory-resident database as the core component of an IOC.
- Utilization of various memory-resident structures to describe the contents of the database.
- Support for a wide range of record types (e.g., ai, ao) with fixed sets of fields.
- Requirement for each record type to have a unique record name.
- Definition of fields, with some common across all record types and others specific to particular types.
- Use of channel or database access routines for all accesses to the database.
- Exception for record and device support, with other software components accessing the database through access routines.
- Implementation of database scanning mechanisms for deciding when to process a record.
- Support for four types of scanning: Periodic, Event, I/O Event, and Passive.
- Periodic scanning allows requests to process a record at specified time intervals.
- Event scanning based on the posting of an event by any IOC software component using the subroutine call post_event(event_num).
- I/O Event scanning processing records based on external interrupts.
- Availability of IOC device driver interrupt routines to accept external interrupts for I/O Event scanning.
- Combines a display manager and display editor.
- Motif version used for creating and managing displays.
- Reads display list files created by EDD (Engineering Display Editor).
- Establishes communication with necessary IOCs.
- Establishes monitors on process variables.
- Accepts operator control requests.
- Updates the display to reflect changes.
- General-purpose alarm handler driven by an alarm configuration file.
- General-purpose tool for acquiring and saving data from IOCs.
- Tool running in an IOC or OPI that emulates a finite state machine.
- Interface pre existing software systems to the channel access library.
- Integration with commercial packages like IDL/PvWave, Mathematica, and WINGZ for accessing and manipulating EPICS process variables.
- Used to create a runtime database for an IOC.
- Display editor tool.
- Generates a C program representing states for the IOC or OPI Sequencer tool.
- Tools available for creating various database components from ASCII definition files.
- EPICS provides a Source/Release mechanism for managing EPICS.
- EPICS core software must includes of the following: 
    - Channel Access - Client and Server software 
    - Database 
    - Scanners 
    - Monitors 
    - DCT 
    - Build Tools 
    - Source/Release 

### Non-Functional Requirement
- Access times to the database are to be in the range of 2-3 msec per access.
- Time-access critical information is available in memory.
- Acknowledges that there may be some degradation in performance resulting from WAN bandwidth considerations during remote operations.
- Specifies the need for security measures to control access to system features.
- The IOCs will use the real-time operating system.
- Reliability of the development systems.
- Manufacturer support for the development systems.
- Upgrade capability of the development systems.
- SUN SPARC-10 (model 41) or SPARC Classic with 64MB of dynamic memory.
- Multi-platform development environment for final target selection.
- Workstations with at least 2GB of disk.
- Availability of DDS DAT cartridges for data acquisition, backups, and software transport.
- Presence of a CD-ROM for SUN OS and software upgrades.
- Compression using a standard algorithm for transport, with archives in tar format.
- Use of Motorola MVME-167B (68040@33MHz) with at least 16MB of dynamic memory.
- Definition of IOC computer cards in the ICS work package description.
- Delay in establishing target IOC computer cards to leverage technology advances while staying compatible.
- Conformance to Ethernet IEEE 802.3 standards.
- Detailed description in the Software Design Description.
- Performance requirements for the final system to be met.
- Selection of FDDI systems for the backbone LAN based on bandwidth requirements.
- Conformance to requirements given in the Electronic Design Specification.
- Provision of interlock connections for all critical subsystems with a defined software interface as per the Instrument Control System Infrastructure Work Package Definition.
- Conformance to UNIX-based standards.
- Capability to run various EPICS tools.
- Compliance with VME/VXI standards.
- Proper functioning and integration of various I/O modules.
- Access to other I/O buses, such as GPIB, through VME modules.
- Adequate performance and reliability for local area networking.
- Efficient access to the database through provided data structures.
- Common awareness of data structures among software components that access the database via database access routines.
- Consistent and reliable channel or database access routines.
- Effective implementation of database scanning mechanisms.
- Reliable and accurate execution of Periodic, Event, I/O Event, and Passive scanning types.
- Support for various time intervals in Periodic scanning.
- Proper handling of external interrupts by IOC device driver interrupt routines for I/O Event scanning.
- Utilizes the Motif version for a graphical and user-friendly interface.
- Efficiently reads and updates display information.
- Provides flexibility through a general-purpose design driven by an alarm configuration file.
- Acts as a versatile tool for acquiring and saving data from IOCs.
- Mimics a finite state machine for effective control.
- Enhances versatility by allowing integration with various pre existing software systems.
- Contribute to ease of use and efficiency in configuring runtime databases and creating database components.
- Contributes to effective management of EPICS through a structured Source/Release mechanism.

### ITCS431 Sofware Design and Development (2023)



