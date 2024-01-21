# Member



# Chapter1,2
**Functional Requirements:**
**Access Levels and Modes:**

1.  The system shall have distinct access levels, including Planning, Observing, Monitoring, Maintenance, Test, Operation, and Administrative.
    
2.  Each access level shall provide specific modes such as Planning mode, Observing mode, Monitoring mode, Maintenance mode, Testing mode, Operation mode, and Administrative mode.
    
3.  Interactive operation is facilitated exclusively through the Observatory Control System (OCS) for standardized and secure user interaction.
    

**Science Plan and Observing:**

4.  The system shall support the creation and execution of science plans for the collection of scientific data.
    
5.  Observing astronomers and Science Observers shall have access to Observing mode, which allows for the collection of science data and quick-look data reduction.
    

**Telescope Control:**

6.  Observing astronomers shall not have direct control privileges over the telescope, ensuring commands are sent through an automatic sequencer.
    
7.  Telescope Operator and Operations staff shall have direct control access at the Operation and Maintenance levels, respectively.
    

**Remote Operations:**

8.  The system shall support remote operations, allowing users to access and control the telescope from different sites.
    
9.  Remote users shall interact with the system through operators and the scheduler program, avoiding direct control.
    

**Scheduler and Queue Management:**

10.  Observing commands shall be submitted via the User interface to a queue for later execution.
    
11.  The scheduler program shall allow for the breaking and resequencing of the queue, considering quality assessments and user-defined rules.
    
12.  The software must support flexible scheduling, allowing both manual and scheduler-driven scheduling operations.
    

**Observing Program Automation:**

13.  The observing program must be fully automated, requiring minimal human interaction during observation.
    
14.  A telescope simulator shall be provided for testing observing programs within the virtual telescope environment.
    

**Data Handling:**

15.  Data from detectors shall be stored efficiently using available technology.
    
16.  The system shall support concurrent data access and display, with a LAN supporting a transfer rate of 20-40 Mbits/second.
    

**Privilege Management:**

17.  A system of privileges shall be established at each operating level, allowing users to access different commands and procedures based on their roles.
    
18.  Access mode allocation shall dynamically identify and assign resources to prevent accidental interference.
    

**Built-in Test Facilities:**

19.  The telescope and instrument software shall include built-in test (BIT) facilities for verifying system and software performance.
    
20.  Subsystems shall notify users of faults, and self-test sequences shall be available for the Gemini 8m Telescope system and subsystems.
    

**Simulated Use and Training:**

21.  All control software must seamlessly support simulated use within the virtual telescope environment for realistic testing and training.
    

**Control Transfer and Reconfiguration:**

22.  It shall be possible to transfer control from one user station to another via a simple software reconfiguration procedure.
    
23.  Procedures must exist to replace faulty cards and/or assemblies.


**Non-Functional Requirements:**

**User Interface Consistency:**

1.  User interfaces for different access levels shall be uniform across all subsystems, maintaining consistency.
    
2.  The user interface must support access levels to subsystems.
    
3.  Similar functionality should be presented using similar user interfaces, reflecting access modes and operating levels.
    

**Security:**

4.  Security measures shall be implemented to ensure the system's secure use, with different operation levels and privileges at different sites.
    

**Remote Operations:**

5.  There should be no conceptual difference between on-site and remote operations, supporting full operations remotely.
    
6.  Remote monitoring should be user-friendly to enhance the user experience.
    

**Performance:**

7.  Handshaking of commands between IOCs must occur within 100-200 msec, with a peak control information of 100 TPS.
    
8.  The LAN must support a transfer rate of 20-40 Mbits/second for data transfer.
    
9.  Every command must be accepted/rejected within 2 sec before the corresponding action occurs.
    
10.  Status display update must be within 4 sec at local stations.
    
11.  Requests of subsystems for status information must be answered within 5 sec, possibly in maintenance-level operation.
    
12.  The system shall respond to user interface commands within specified time frames.
    

**Flexibility and Scheduling:**

13.  The system shall support flexible scheduling, allowing quick changes in telescope scheduling and instrument configurations.
    
14.  The scheduling queue's existence shall be transparent to on-site observers initially and can be revealed later based on experience.
    

**Automation and Efficiency:**

15.  The system shall promote automation, by observing programs submitted to a queue for later execution.
    
16.  Tools for monitoring data acquisition in real time shall be provided to Science Observers.
    

**Fault Tolerance:**

17.  The system shall ensure that faults and failures are notified to users promptly.
    
18.  The allocation system must prevent the system from remaining deadlocked to resource allocation.
    
19.  Software bugs must be logged and fixed promptly after detection.
    
20.  Fault recovery, exception handling, and fail-safe checks should be used to improve reliability.
    
21.  Subsystems must notify users when faults occur, providing specific origin and problem details.
    

**Maintainance:**

22.  The telescope is typically at maintenance level during daylight hours.
    

**Command Communication and Reliability:**

23.  The support structure for communicating commands must exhibit high reliability.
    
24.  A uniform Acknowledge/Not Acknowledge (ACK/NAK) protocol must be consistently adopted across all systems.
    
25.  Timeouts must be supported at approximately 500 milliseconds for a timely response and system efficiency.
    
26.  Handshaking of commands between IOCs must occur within 100-200 msec.
    
27.  The system should have no hard restrictions on the number of simultaneous users.
    

**Communication Protocols:**

28.  All communication shall be based on the use of standard communication protocols.
    
29.  All communication shall be based on standard communication protocols, with retry procedures applied as part of the protocol.
    

**Redundancy:**

30.  The system should not impose restrictions on users; access limitations should be determined by policy decisions (permissions, access privileges, etc.).
    
31.  Full redundancy is not a requirement, but subsystems such as telescope control computers should support redundancy.
    

**User Interfaces:**

32.  Similar functionality should be presented using similar user interfaces, reflecting access modes and operating levels.
    

**Development Approach:**

33.  Gemini software should be developed evolutionarily, using the CVS version control system.
    

**Software Layers:**

34.  Different requirements exist for software running on different layers, with strict real-time control restricted to the IOC layer.
    

**On-site and Off-site Operation:**

35.  All observing facilities should seamlessly operate both on-site and off-site.
    
36.  Team observing with multiple observers at different sites must be supported.

## Chapter 3

**Functional requirements:**
  
**Control Information Flow:**

1.  The system must facilitate the transfer of control information, including commands and replies from users to the telescope and instruments.
    
2.  Replies must contain status information and relevant data concerning instruments and telescopes, to be stored along with astronomical data.
    
3.  The system should be capable of retransmitting commands in case of transmission errors or collisions while ensuring a predictable protocol where commands cannot be lost, and replies are reliably received.
    
4.  All subsystems must provide control information on all controlled variables upon request.
    
5.  Meteorological information from a weather station must be available centrally within the system.
    
6.  The system must support the availability of TV data related to site monitoring at all operations facilities.
    

**Operation Level:**

7.  Different types of users must have specific access rights to parameters at each level of operation.
    

**Privilege and operation levels:**

8.  Privileges should be associated with categories of users and the location of the user station (local or remote).
    
9.  The system must enforce protections among users to prevent unauthorized access and actions.
    

**Capacity:**

10.  The system's capacity will be expressed in terms of nodes, with each node representing the number of workstations.
    

**Procedures:**

11.  The system must have automatic procedures for the startup and shutdown of the telescope and instruments.
    

**Software:**

12.  Table-driven software should be used whenever possible, to avoid unnecessary compilations.
    
13.  At boot time, the Gemini 8m Telescopes software shall check the consistency of versions of all the various software components.
    
14.  Changing system constants, such as arcseconds/bit for an encoder, shall not require recompiling but will be updated as part of system startup.
    

  
  
  
  
  
  
  

**Non-functional requirements:**

  

**Efficient Data Management:**

1.  Ensure optimal storage and processing efficiency to handle large volumes of data.
    

**High System Performance:**

2.  Attain swift response times and high data throughput for seamless operation.
    

**Instrument and User Interface Versatility:**

3.  Accommodate a diverse range of instruments and provide adaptable user interfaces for enhanced usability.
    

**Risk Mitigation and Safety:**

4.  Integrate design elements to minimize risks, implement safety devices, and provide effective warnings and training.
    

**Security Measures:**

5.  Implement robust security protocols to safeguard user access and protect sensitive data.
    

**Compatibility:**

6.  Ensure compatibility with both existing and future systems and software for seamless integration.
    

**Clear Hierarchical Network Model:**

7.  Establish a transparent hierarchical network model to facilitate maintenance and optimize performance.
    

**Homogeneous LAN and WAN Interfaces:**

8.  Utilize standardized interfaces for both local and wide-area networks to enhance flexibility.
    

**Scalability:**

9.  Design control parameters and information access to be scalable, accommodating potential future expansions.
    

**Reliability and Availability:**

10.  Maximize system reliability and availability to ensure consistent and uninterrupted operation.

## Chapter4

**Functional Requirements**

  

**Development Environment:**

1.  Criteria for the development environment include productivity, portability, vendor independence, and support for state-of-the-art user interfaces.
    

**Operating Systems and Interfaces:**

2.  Specifications for the development of operating systems, GUI systems, and database interfaces.
    

**Software below IOC Level:**

3.  Guidelines for software interfacing with the IOC and embedded software standards.
    

**Communication Protocols and Hardware:**

4.  Use of TCP/IP, support for standard ARPA services, and specific protocols for control communication.
    

**Data Management and Archiving:**

5.  Procedures for offline data reduction, quick-look analysis, archiving, and catalog management.
    

**Hardware Specifications:**

6.  Requirements for development workstations, peripherals, and IOC CPUs.
    

**EPICS Toolkit:**

7.  Usage of the EPICS toolkit as the foundation of the control system, encompassing various hardware and software components.
    

**Database Management in EPICS:**

8.  Handling of the IOC database, including access methods and scanning mechanisms.
    

**EPICS Development Tools:**

9.  A range of tools for database configuration, display editing, alarm handling, archiving, and state notation compilation
    

  
  
  
  
  
  
  
  
  
  
  

**Non-functional Requirements**

**Reliability and Availability:**

1.  Measures for fault rates, recovery procedures, and continuous monitoring of active and inactive subsystems.
    

**Database Requirements:**

2.  Includes access times, support for asynchronous writes, and remote and distributed data support.
    

**Remote Operations:**

3.  Full implementation of remote operations with performance considerations due to WAN bandwidth.
    

**Security:**

4.  Control access to system features, possibly restricting operations to specific remote sites.
    

**Data Types and Storage:**

5.  Descriptions of various data types and their storage in different databases.
    

**System Operation Modes:**

6.  Includes automatic and interactive operation modes, observing, standby, maintenance, and testing modes, and performance metrics.
    

**Start-Up and Shut-Down Procedures:**

7.  Specific procedures and time requirements for different system levels.
    

**Logging and Error Handling:**

8.  System logging, error logging, and classification of errors into fatal, serious, and warnings.
    

**Alarms and Recovery:**

9.  Distinction between alarms and errors, and the inclusion of automatic and manual alarm clearances.
    

**Error-Mode Recovery:**

10.  Subsystem-specific performance of error-mode recovery.
    

**System Design and Development Standards:**

11.  Adherence to the Ward/Mellor approach for real-time systems, including analysis, design, development methods, review procedures, and documentation.
    

**Real-time Support:**

12.  Required at the IOC level, with sufficient performance for human interaction and communications at the upper levels.

## Chapter5

**Functional requirements**

  

**Command Implementation:**

1.  The document outlines specific commands such as AwaitItem, SetCallback, ClearCallback, LocateItem, GetValue, PutValue, StartStream, StopStream, SetEvent, and ClearEvent, which are essential for controlling subsystems within the Gemini system.
    

**Data Communications:**

2.  The system must support commands such as SetConfiguration, RunTest, SetLogging, OpenRoute, CloseRoute, ResetRoute, and TestRoute to facilitate data communication and subsystem testing.
    

**Command Structure:**

3.  All commands must follow a specific structure, including Identification (Command_ID, Source, Target) and Instruction (Opcode, Parameter set).
    

**General Purpose Commands:**

4.  The system must support status queries such as GetVersion, GetStatus, GetState, GetID, GetConfiguration, and SetStatus to obtain information about the state of the subsystems.
    

  

**Non-functional requirements**

  

**Communication Mechanisms:**

1.  The system supports various means of transmitting commands and data, including direct, channel, and broadcast methods.
    

**Command Representation:**

2.  All commands are represented as ASCII strings with labeled fields and nesting is permitted using braces.
    

**Time Synchronization:**

3.  The system must support time synchronization among control subsystems, with times provided in IRIG-B format as UTC.
    

**Self-Test Reporting:**

4.  Subsystems must run self-tests and report the results as OK, BAD, or WARNING, providing detailed results through the GetConfiguration command.




