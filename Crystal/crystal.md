# Member
* 6488041	Khasidech	Jiwyam

* 6488096 Peerapong	Tantasilp

* 6488127	Kirati	    Ngampis

* 6488193	Thanapat	Ritiluechai

* 6488204	Pimmada	    Chompurat



# Chapter1,2
### Functional Requirements:

**Access Modes:**

1. The system shall have distinct access levels, including Planning, Observing, Monitoring, Maintenance, Test, Operation, and Administrative.
    
2.  Observing mode provides simple and safe access to the system for the collection of science data, selection of instrument parameters, and quick-look data reduction.
    
3.  Read-only observing mode, can monitor and affect the performance of an ongoing observation (Monitoring mode)
    
4.  Operation mode is direct control of the telescope and instruments, typically during observation-level operation.
    
5.  Users can use a telescope simulator in Planning mode.
    
6.  Users can test to affect the performance of an ongoing observation in Testing mode.
    
7.  Administrative mode grants users to access only status and scheduling information
    
**User-level**

8.  Astronomers can access planning, observing, and monitoring modes.
    
9.  Observers can access observing, and monitoring modes.
    
10.  Telescope Operators can access observing, monitoring, operation, and testing modes.
    
11.  Support can access monitoring, operation, and testing modes.
    
12.  Developers can access monitoring and testing modes
    
13.  Administrators can access monitoring and administrative modes.
    
14.  Observing astronomers can work on the efficient acquisition of astronomical data and online assessment of data quality
    
15.  Observing commands will normally be submitted via the User interface to a queue for later execution.
    
16.  Observing astronomers shall not have direct control privileges over the telescope, ensuring commands are sent through an automatic sequencer.
    
17.  Operations staff will be able to enable direct interactive operation.
    
18.  Operation staff can control the Gemini 8m Telescopes indirectly via a scheduler program or directly via commands.
    
19.  Operations staff shall have privileges to access all commands and maintenance procedures in case of problems.
    
20.  Operation staff can change the operational status of units according to the results of tests performed on such units

**Operational Context**

21.  The Gemini system shall allow the operation of a single active instrument at any given time, feeding two detectors using beam splitters or field splitters, with shared control nodes.
    
22.  Multi-instrument context can take calibration or flat field exposures in parallel access.
    
23.  Inactive instruments shall have the capability to take calibration or flat field exposures in parallel while the active instrument is in use.
    
24.  Inactive instruments shall be able to prepare for exposure to start immediately upon the telescope beam switching back to them, maintaining a hot standby situation.
    
25.  Inactive instruments shall be capable of working at all foreseen operation levels (observing, maintenance, testing)
    
26.  The system shall allow users, based on their privileges, to log in from any location and configure any subsection of the Gemini 8m Telescopes system with a simple logon and configuration operation.
    
27.  The system shall support multiple active user stations simultaneously, enabling different types of users to work with the Gemini 8m Telescopes software at the same time.
    
28.  Users in a multi-user context who want to monitor Gemini 8m Telescope operations must follow the procedures established by Operations and obtain permission to do so.

**Observing Mode:**

29.  The system shall support remote operations, allowing users to access and control the telescope from different sites.
    
30.  Remote users shall interact with the system through operators and the scheduler program, avoiding direct control.
    
31.  Remote operations can control, observe, monitor, access, multipoint monitoring, remote monitoring, and remote access to users.
    

**Observing Support**

33.  The system shall support the execution of planned observing sequences and flexible scheduling.
    
34.  The system shall allow for flexible scheduling, enabling adaptation to changes in weather and other conditions by allocating the telescope's current use to the optimal observing program for those conditions.
    

**General Software:**

35.  Data from detectors must be stored in the most effective method permitted by available technology.
    
36.  The system must have the capability of providing multiple, simultaneous access to data.
    
37.  The system shall support the acquisition of data in an uncompressed format as the default mode.
    
38.  The system must allow for fast transmission of rough images
    

**Operation Privileges, Protection, And Procedure**

39.  The allocation system must ensure that the system cannot remain deadlocked for this resource allocation.
    
40.  The telescope includes start-up and shutdown functions.
    
41.  The telescope must have system self-testing.
    
42.  Instruments can start up and shut down.
    
43.  Instruments must have self-testing and self-diagnosis.
    
44.  Procedures shall be in place to streamline the configuration and reconfiguration processes, allowing for efficient changes to the system setup as needed
    
45.  The control software shall support dynamic reconfiguration of the observing setup, including beam switching, without the need for restarting instruments or the telescope.
    
46.  The control software shall continuously monitor and track the status of installed subsystems
    

**General Performance And Reliability:**

47. The Gemini software shall not have inherent hard restrictions on the number of simultaneous users, ensuring flexibility in user access
    
48.  Response time can display the status update.
    
49.  Every command can be accepted or rejected.
    

**Test And Checkout:**

50.  The telescope and instrument software shall contain built-in test (BIT) facilities for verifying system and software performance.
    

**Contingencies:**

51.  Subsystems must notify the user when faults occur.
    
52.  Subsystems shall notify users of faults, and self-test sequences shall be available for the Gemini 8m Telescope system and subsystems.
    
53.  The notification must also be capable of being electronically logged.
    
54.  A software reconfiguration procedure can transfer control from one user station to another.
    

**Constraints:**

1.  Only policy decisions prevent any user from accessing any part of the Gemini system from any local or remote station
    
2.  Existing external software will be integrated with the Gemini software.
    
3.  Gemini software developers should maintain accurate change logs showing software modifications
    
4.  Gemini software developers should adhere to a standard method for the reporting and recording of errors from both internal and external sources
    
5.  All Gemini subsystem packages should include as part of the software both a simulator module for inclusion in the virtual telescope and user interface modules for the user interface environments that the subsystem will be operating in.
    
6.  All Gemini software is to be fully documented, internally with appropriate comments, and external documentation.
    
7.  External documentation must include Unix-style man pages.
    
8.  All Gemini subsystem packages must provide modules for the testing and diagnosis of the subsystem.
    
9.  All instrumentation control software must provide full access to all instrument functionality.
    
10.  All Gemini software must be version labeled, both in source and binary form.
    
11.  The integrated system can be tested and developed independently of the target hardware.
    
12.  Therefore all hardware subsystems must provide a software simulation module
    
13.  The Gemini subsystem should be as self-contained and autonomous as possible, thereby decreasing the functional width of the interface to the rest of the Gemini system.
    
14.  No subsystem package should make any assumptions about the surrounding environment
    



### Non-Functional Requirements:

**System Users**

1. The system must have a high degree of precision and accuracy for the collection of science data.

**Operational Level**

2. The Gemini system has different levels of operation.

3. Access to the system is restricted based on the current level of operation.

4. System access restriction based on operational level.

5. The system must have the capability for routine maintenance and diagnostic access without interrupting the normal operation level.

6. Daylight hours as typical time for maintenance level operations.

7. Access control and restriction based on the current level of operation.

8. The system must have the capability for subsystem installation and deinstallation without interrupting the normal test level operation.

9. The system must have the capability for full diagnostic and installation calibration activities without interrupting the normal test level operation.
 
**Access Modes:**

10. Security and access control. The software imposes a series of access modes that balance ease and convenience of use against flexibility, control, and the security of the system.

11. The system must have the capability to simulate telescope performance in a realistic and accurate manner for planning observations.

13. The system must have the capability to provide a test access mode that allows full control of subsystems without interrupting ongoing observations.

14. No effect on the performance of ongoing observation during monitoring, testing, and administrative access.

15. The system must have the capability for system utilization and efficiency inquiry using administrative access without affecting ongoing operations.

17. The system must support concurrent access by a single user through multiple modes.

18. The system must support concurrent access through observer, monitor, and operator modes by the Telescope Operator.


**Location of users of the system**

19. The system must be accessible by users at multiple facilities. 

20. The system must have the capability to distinguish and differentiate between the various facilities, such as the Gemini 8m Telescopes site. 

21. The system must refer to the collection of facilities such as the Gemini 8m Telescopes site. 

22. The Gemini 8m Telescopes enclosure must ensure ease of access for maintenance and engineering activities.

23. The Gemini 8m Telescopes control facility must be conveniently located near the enclosure. 

24. The requirement for remote access capability of the system from one or more facilities. 

25. The ability for facilities and the telescope to securely exchange information and data. 

26. The system must have low latency and high availability for remote operations from super sites. 

27. The system must ensure that the remote operations capability is consistent with a predefined level of performance, even if it is lower than super sites. 

28. The system must maintain a predefined level of performance of remote operations capability even when link capacity changes. 

  

**User level requirements**

29. The system must be flexible and customizable to accommodate the diverse requirements of different classes of users.

30. The system has to guarantee in terms of operations that it must fulfill all possible requirements, but it does not mean that all features will be made available to all users at all locations at all times. 

31. Capabilities will have to be adapted to the operational needs both locally and remotely. The system must be able to provide a level of performance and availability that meets the operational needs of both local and remote users. 

32. The system must be able to provide a level of usability and adaptability that meets the needs of users with a wide range of experience levels, both locally and remotely. 

33. The user interface must be simple to learn and use. 

34. The system must offer a user interface that is simple to learn and secure in its use, which is a usability requirement. 

35. The system must have a secure access control mechanism that prevents observing astronomers from having direct control of the telescope. 

36. The system must provide a user-friendly interface for observing astronomers to inquire about the status of the telescope or any subsystem at any time with ease and convenience. 

37. Programs have the capability of direct control of the telescope but not the observer. 

38. The system must provide a user interface that allows observers to create an observing program that requests a telescope control function but prevents them from entering commands to slew the mount. 

39. The system must offer a simple and secure interface for observing astronomers to efficiently acquire astronomical data and assess data quality. 

40. Observing astronomers shall have no direct control of the telescope. 

41. The system must provide support for operation using an automatic sequencer to meet operational needs, including service observing and flexible scheduling. 

42. A certain degree of interaction must be provided, meaning the user will interact with the scheduler program rather than with the control programs directly. 

43. The system must support queued observing commands to be executed through the user interface. 

44. It must be possible to break and resequencing this queue as a result of the quality assessment of previous data. 

45. Direct interactive operation shall not be considered as the normal operation mode. 

46. The existence of the scheduling queue shall be transparent to the on-site observer during the initial phases of telescope operation. 

47. The system must provide an indirect control mechanism for operations staff through a scheduler program. 


**Operational context**

48. The Gemini 8m Telescope system shall have the capability for seamless integration with other telescopes on the same site for potential future interferometry applications, with minimal impact on overall performance. 

49. The system to be designed with the potential for multi-telescope context in mind, even though there are currently no plans to support concurrent use of the two telescopes in the Gemini system. 

50. The Gemini 8m Telescope system must have the capability to efficiently switch between multiple scientific instruments while ensuring optimal performance and responsiveness. 

51. The system can handle the complexity of operating multiple instruments in parallel and the user has the flexibility to switch between them as needed. 

52. The visitor instruments interface must provide smooth and accurate support for coordinate transforms between the visitor instrument and the Gemini system. 

53. The visitor instruments interface must ensure reliable and efficient archiving of visitor instrument data. 

54. Visitor instruments must have the capability to maintain operation tables, such as filter lists, as part of an observation's permanent record. 

55. Due to the nature of visitor instrumentation, it is unlikely that more complicated functionality can be supported. 

56. The Gemini system components with those of the visitor instrument (other than simple raster scans) will not be supported. 

57. Compatibility with the standardized interfaces for the Gemini instruments. 

58. Adaptability for visitor instruments to the internal standard for more complicated functionality, such as coordinated motions. 

59. Difficulty in offering external standard services as it can impact external users. 

60. Joint effort is required from Gemini and the visitor instrument team for more complicated functionality. 

61. Visitor instrument interfaces are stable and long-lived, as the time between successive uses of the same visitor instrument can be as long as one or two years. 

62. The support of visitor instrumentation is made simpler if the visitor equipment adheres to the Gemini standards. 

63. Adherence to Gemini standards for visitor instrumentation simplifies support but may not be cost-effective for some instruments. 

64. Gemini standards will evolve, which may require existing visitor instruments to rewrite or rework large areas of their control system. 

65. The system must accommodate changes in Gemini standards and support the integration of newer visitor instruments that may use alternative or cost-effective technology. 

66. The system must provide a consistent and standardized interface for visitor instruments to access necessary functionality. 

67. The system must enable visitor instruments to operate efficiently in a server mode. 

68. The system must provide support for complex functionality, including coordinated motions of the Gemini system components and visitor instrument. 

69. The system must accommodate differences in technology and cost constraints for visitor instruments that may not meet Gemini standards. 

70. The system must provide reliable and stable interfaces for visitor instruments to access necessary Gemini facilities. 

71. The system must provide a Gemini observatory simulator that enhances the support for both Gemini and visitor instruments. 

72. The system must provide remote access and control capabilities for users based on their privileges. 

73. Multi-point monitoring capability, allowing others to follow the actions of an active user and obtain expert advice remotely. 

74. The system must provide a centralized display of status information at multiple locations and allow remote access to necessary status information. 

75. Monitoring should not affect the performance of ongoing observations. 

**Observing mode requirements**

76. The Observatory Control System (OCS) must support interactive operation. 

77. The OCS must have a visually appealing user interface.

78. The capability for multiple stations to participate in the observation must be supported. 

79. The software design must support remote operations with robust and secure connectivity. 

80. The observing facilities must be able to function seamlessly in both on-site and off-site environments with reliable connectivity. 

81. The system must facilitate seamless collaboration and support team observation, allowing multiple observers at different locations to work together effectively. 

82. The system must have the capability to enforce access controls and restrict specific operations to authorized remote sites. 

83. It is assumed that the hardware involved in remote operations has been specified with sufficient bandwidth to support remote operations. 

84. The system must provide a consistent and uniform user experience, regardless of the location of use (local or remote). 

85. The system must have a comprehensive security strategy that takes into account different levels of security concerns and operation privileges across different sites. 

86. The software design for the Gemini 8m Telescopes must take into account the requirements for remote operations from the outset. 

87. The safety measures for the telescope operation must ensure real-time monitoring with audio and video capabilities, and provide immediate access to a physically hard-wired emergency stop button for authorized staff members. 

88. The system must enforce restrictions on remote control access, limiting it to the designated Gemini 8m Telescopes Enclosure and Gemini 8m Telescopes Control Facility. 

89. Transparency in the system design to minimize the impact of link bandwidth on transparency. 

90. The system must ensure secure operations with a comprehensive security strategy that takes into account different levels of security concerns and operation privileges across different sites.

91. The software design for the system should aim for efficiency and maintain compatibility with remote operations, and consider remote operations requirements from the outset to minimize the need for specialized software. 

92. The system should prevent the remote monitor's keyboard from affecting the observer's environment. 

93. The software should support remote monitoring, also known as "eavesdropping". 

94. The system must have a responsive and smooth interface for multipoint monitoring with the capability for the remote user to customize the display on their screen. 

95. The remote screen does not need to have the exact same appearance as the local screen. 

96. The remote keyboard operation must not interfere or have any unintended impact on the local user's environment. 


**Observing support**

97. The capability to automatically perform observations following pre-defined sequences.

98. Competent monitoring at the Gemini 8m Telescopes site or remotely. 

99. Allowance for interaction at the desired level (for example, only on error conditions, any time the user is allowed to break a sequence, etc.). 

100. Fast and efficient switching capability of telescope scheduling, allowing for seamless exchange of observing programs. 

101. Ease of use and understanding of expert scheduling software through clear and concise presentation of information. 

102. The ability to switch during the night among telescope modes and instruments (typically 2 times per night).

**General software requirements**

103. System-wide data capacity limited by transfer methods and technology, and archiving capacity on site, capable of retaining 7 days of data produced by the largest instrument with the last 3 days available interactively from hard disk or similar medium. 

104. Fast transmission of rough images every 0.5 sec, possibly assisted by data-loss compression techniques. 

105. Time requirement for high-quality image transmission matching the original resolution, with the aid of lossless compression. 

106. System of privileges established at each operating level of the system.

107. Protection against accidental interference through Access Mode Allocation system. 

108. Procedures for convenience and system integrity, including telescope start-up and shutdown, self-testing, and instrument start-up and shut-down. 

109. Configuration and reconfiguration of the system. 

110. The system must allow for dynamic reconfiguration of observing configuration with minimal impact on ongoing operations. 

111. The control software must have real-time monitoring capabilities to maintain constant awareness of the status of all installed subsystems. 

  

**General performance and reliability requirements**

112. The system should have no hard restrictions on the number of simultaneous users, but should allow for policy decisions that do restrict the amount of simultaneous access. 

113. Every command must be accepted/rejected within 2 sec and before the corresponding action occurs. (This is different from the ACK/NAK response of the communications protocol - here, the target system must have examined the command and verified its validity. 

114. Status display update must be within 4 sec at the local stations (certain functions, such as telescope position, may have tighter constraints). Remote station update response is given in the Requirements for Remote Operations section. 

115. Requests of subsystems for status information must be answered within 5 sec and be possible in maintenance level operation. 

116. Requirements for response times within the user interfaces are given in the User Interface requirements section. 

117. Software bugs should be logged and fixed as soon as possible after detection. 

118. Goal to have restart conditions occur only on hardware failure. 

119. Use of fault recovery, exception handling, fail-safe checks to improve reliability. 

  

**Test and checkout requirements**

120. the telescope and instrument software shall contain built-in test (BIT) facilities to verify Gemini 8m Telescopes system and Gemini 8m Telescopes software performances. 

121. All Gemini 8m Telescopes software modules must have comprehensive test specifications to verify correct functioning of releases, to be used for both acceptance testing and online testing procedures. 

122. The Gemini 8m Telescopes control software shall provide for self-test sequences of the system and subsystems, exercising all present subsystems in a given operational configuration. 

123. Regression tests should be a part of every Gemini 8m Telescopes software package. 

  

**Contingencies**

  

124. subsystems must notify the user when faults occur. 

125. Notification must be specific as to origin and problem. 

126. Notification must be capable of being electronically logged.  

127. Multiple levels of fault notification (e.g. detailed, verbose, short) to aid in tracking down problems. 

128. Should a subsystem fail (e.g. one detector, one instrument) predefined procedures must exist to redefine the environment in such a way that operation can restart with the remaining equipment.

129. In case of computer hardware failure concerning the user station equipment, a simple software reconfiguration procedure should be in place to transfer control from one user station to another. 

130. In the case of IOC failure, no transfer of control to another IOC will be possible, due to the local connections and interfaces to the control electronics. In this case there shall be a procedure to replace faulty cards and/or assemblies. If it is possible to observe with that particular IOC in a failed state then it must be possible to reconfigure the system to do so. 

131. Full redundancy is not a requirement of the Gemini 8m Telescopes and it will be acceptable to have to replace units in case of failure. 

132. Procedures for switching to the backup system will be established for each area where redundancy is decided to be cost effective. 

133. There is no requirement for automatic switching to the backup system. 

134. All communication shall be based on the use of standard communication protocols with retry procedures applied as part of the protocol. 

135. Certain network concepts may be preferable as they offer intrinsic redundancy (e.g. double loops) and re-routing possibilities in case of node failures (single point failure protection). 

**Constraints**

1. There should be no restrictions imposed by the software on users. Only policy decisions (permissions, access privileges, etc.) should prevent any user from accessing any part of the Gemini system from any local or remote station. 

2. Similar functionality should be presented to the users using similar user interfaces. However, user interfaces should clearly reflect access modes and operating levels. 

3. Commercial packages, off-the-shelf public domain software, and standards are to be used whenever feasible. 

4. The Gemini software will integrate with existing external software, with the interfaces treated as part of the Gemini software system. 

11. The Gemini software must have clear version labeling for both source and binary forms, accessible through control commands when the software is running. 

12. The hardware subsystems must have a software simulation module that emulates the hardware response, enables independent testing and development, facilitates science planning and maintenance, and operates within a standard environment like VxWorks, EPICS, or VME crate/cpu, without requiring any application-specific hardware. 

13. The Gemini subsystem must have a minimal interface with the rest of the Gemini system to enhance its self-containment and autonomy. 

14. No subsystem package should make any assumptions about the surrounding environment beyond that provided in the interface specifications.
    

# Chapter 3

### Functional Requirements:

**Control Information Flow :**

1. Users can provide feedback or issue commands to regulate the flow of information.

**Data Transfer :**

2. FITS format astronomical data needs to be transferred between GEMINI and the home institutes of visiting astronomers.

**Continuous Voice Connection :**

3. A continuous voice connection is required.

**Observing Level :**

4. Observing Level is a standard operational mode that allows embedded tests and monitoring.

5. All user categories have access to observing levels.

**Maintenance Level :**

6. Maintenance level allows updating of maintenance tables, mainly accessed by operations and development staff.

7. Operations and development staff can access Maintenance level.

**Test Level :**

8. Test level allows installation and testing of new packages, with any low-level tests feasible.

9. All non-protected parameter values can be updated.

**User Privileges:**

10. User privileges can be further refined based on categories or user station locations.

**Protections :**

11. Protections are enforced to ensure users know the operation level and subsystem compatibility.

**Data Acquisition and Control Node :**

12. The system will include one auxiliary data acquisition and instrument control node.

13. Off-site observing modes are supported.

14. A single off-site data acquisition and instrument control node will be located at the Gemini 8m Telescopes Site Support or Base Facility.

15. One supervisor, along with local and remote monitoring nodes, will monitor the system.

16. The Gemini 8m Telescopes control software allows simultaneous operation.

**Command Acknowledgment :**

17. Acknowledgment of commands is required within specified response times.

**Startup and Shutdown Procedures :**

18. Automatic procedures for telescope and instrument startup and shutdown are necessary.

19. Instrument startup and shutdown must be independent of the telescope operation.

20. Reconfiguration procedures are needed to change the observing environment.

21. Operations staff have privileges to change the observing environment.

**Software Interfaces :**

22. The Gemini 8m Telescopes software covers control, data acquisition, and operational aspects.

23. The software interfaces with external software, and the interfaces are integral to the Gemini 8m Telescopes software.

24. Standard reduction procedures, quick-look data processing, near-line processing, and data output formats are defined.

**Network and Communication :**

25. The LAN is supplemented with Local Time Bus, digital reflective memory bus, and analog event-based bus.

26. A hierarchical model supporting logical and physical layers is implemented.

27. Essential tasks occur on project-controlled resources.

**User Constraints :**

28. User constraints enable centralized support and coordination of operations.

**Hardware Support :**

29. Computer hardware supports the Gemini 8m Telescopes software environment.

30. Common development and implementation tools are available and supported.

31. dentical network access is supported.

32. Sufficient local computing power is required for telescope and instrument control without significant overhead.

33. The software is designed to handle large amounts of data efficiently with minimal latency.
    
35. Remote operation includes monitoring from base facilities with diagnostic and test tools.

36. Computers at the Gemini 8m Telescopes site must meet altitude and humidity specifications.

**Software Maintenance and Extensibility :**

37. Individual instruments can run independently.

38. Telescope software at both telescopes is maintained to be identical in upper layers.

39. Software is designed for easy extensibility for adding new instruments.

40. Switching configurations, reconfiguration procedures, and easy procedures for system modification are defined.

41. The number of main software packages is kept to a minimum for easier maintenance.

42. All software not directly controlling hardware is written as machine-independent, portable code.

43. Standards are defined for on-line software and development environment.

44. On-line version control and consistency checking are implemented.

**System Monitoring and Recovery :**

45.  Retry procedures, reconfiguration after the failure of a single non-critical subsystem, and range checking are included.

46. Fault rate measurements, recovery procedures, and constant monitoring of active and inactive subsystems are defined.

47. Maintenance requirements, upgrades, and resource estimates are provided.

**Safety and Risk Prevention :**

48. The Gemini system is self-monitoring for safety and risk prevention.

49. The software can quickly bring the system to a safe state upon notification of danger.

50. Subsystems can detect and report danger appropriately.

51. Subsystems can move into safe states if the risk persists.

52. Safety protection is applied to prevent actions that could endanger people or subsystems.

53. Unsafe actions are rejected, and the system will halt if necessary.

54. The software will allow movement off soft limits but halts on reaching hard limits.
      Watchdog mechanisms are implemented.

**Security:**

55. Security measures are implemented to prevent command mix-ups and intrusion from the wide area network.

56. The astronomical database is protected from intrusion.

57. Security prevents unauthorized intrusion or access at unauthorized levels.

**System Design and Development :**

58. The software is designed for easy extension and upgrade with modifications to non-changing components.

59. The software, installation process, and documentation are developed with expandability using industry standards.

60. The software is strictly modular, allowing independent installation and maintenance of different subsystems.

**Reliability and Data Redundancy :**

61. Security and safety are guaranteed even in the event of component failure, including higher-level software.

62. Data redundancy requirements prevent loss of data due to a single failure.

63. Data redundancy minimizes the impact of single-point errors throughout the system.

**Parallel Operation :**

64. The Telescope Control System can detect and invoke parallel operation for control of all subsystems.

**Development Environment :**

65. The development environment includes computer hardware and system software optimized for the development model.

**System Information:**

66. Each system can provide its current version upon request.



### Non-Functional Requirements:

**Response Times :**

1. Acknowledgment of commands is required within specified response times.

**Real-time Requirements :**

2. The standard software must meet real-time requirements and offer drivers for standard electronics.

**Data Specifications :**

3. Links between electronics interfaces and main processors must meet data specifications.

**Efficiency and Latency :**

4. The software is designed to handle large amounts of data efficiently with minimal latency.

**Hardware Constraints :**

5. Computers at the Gemini 8m Telescopes site must meet altitude and humidity specifications.

**Safety Aspects Analysis :**

6. Safety aspects are analyzed during the functional specification phase.

**Upgrade Effort and Resources :**

7. Areas anticipating upgrades are identified with estimates of effort and resources.

**Security Measures :**

8. Security measures are implemented to prevent command mix-ups and intrusion from the wide area network.

9. The astronomical database is protected from intrusion.

10. Security prevents unauthorized intrusion or access at unauthorized levels.

**Expandability :**

11. The software is designed for easy extension and upgrade with modifications to non-changing components.

12. The software, installation process, and documentation are developed with expandability using industry standards.

**Modularity :**

13. The software is strictly modular, allowing independent installation and maintenance of different subsystems.

**Reliability :**

14. Security and safety are guaranteed even in the event of component failure, including higher-level software.

15. Data redundancy requirements prevent loss of data due to a single failure.

16. Data redundancy minimizes the impact of single-point errors throughout the system.

**Parallel Operation :**

17. The Telescope Control System can detect and invoke parallel operation for control of all subsystems.

**Optimized Development Environment:**

18. The development environment includes computer hardware and system software optimized for the development model.

**Documentation :**

19. Each system can provide its current version upon request.

    

# Chapter4

### Functional Requirements


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
    
**EPICS System Components:**

10.  Hardware and software components for creating a control system, including the OPI, IOC, and LAN.

**Database Management in EPICS:**

11.  Access, scanning, and monitoring mechanisms within the EPICS database.

**Record Support and Device Drivers:**

12.  Modules for record support and device support, and their separation from database access.

**Channel Access and OPI Tools in EPICS:**

13.  Tools provided by EPICS for monitoring, controlling IOCs, and database configuration.

**Development and Applications Work in EPICS:**

14.  Categories of development work within EPICS, including both internal and applications work.

**Skills Required for EPICS Developers:**

15.  Specific skill sets required for different classes of developers working on EPICS.

**Community Contribution to EPICS Development:**

16.  The role of the High Energy Physics community and others in enhancing EPICS software.

**Collaborative Access Teams at APS:**

17.  The involvement of APS Collaborative Access Teams in EPICS development, focusing on client applications and high-level sequencing.
  

### Non-functional Requirements

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

**Security Control:**

13.  Restrictions on system feature access, possibly limited to specific remote sites.

**Data Storage and Management:**

14.  Management of various data types and their final storage locations across different databases.

**Data Input and Output:**

15.  Management of input data and handling of output data, including observing commands and replies to commands.

**System Operation Sequencing:**

16.  Use of predefined data and catalogs in system operation.

**Modes of Operation:**

17.  Automatic and interactive operation modes for various operational scenarios.

**Performance Metrics:**

18.  Definition of overall performance based on exposure times and viewable times.

**Startup and Shutdown Procedures:**

19.  Specific procedures and time requirements at various levels.

**System Logging:**

20.  Detailed system logging requirements for observation recreation.

**Fault Tolerance and Error Logging:**

21.  Procedures for error reporting and categorization.

**Error Handling and Alarms:**

22.  Grouping of errors and alarm conditions, including automatic and manual clearance.

**Recovery Procedures:**

23.  Defined recovery procedures for subsystem failures and error mode performance.

**Development Standards and Tools:**

24.  Standards for software development and specific tools required.

**Realtime Operating Environment Requirements:**

25.  Specification for real-time support at the IOC level.

**Communication Hardware and Software:**

26.  Standards for communication hardware and software, including protocols and interfaces.

**Data Reduction and Archiving:**

27.  Facilities and procedures for offline data reduction, quick look analysis, and archiving.

**Development Hardware Specifications:**

28.  Requirements for workstations, peripherals, and communication interfaces.

**istributed Network and Microprocessor Standards:**

29.  Guidelines for implementing standard subnetworks and controlling commercial equipment.

**Communication Infrastructure:**

30.  Requirements for LAN, WAN, routers, and gateways.

**Software Lifecycle and EPICS Toolkit:**

31.  Emphasis on existing software evaluation and the adoption of the EPICS toolkit.

    
# Chapter5

### Functional requirements

 **Time Synchronization:**
 
1. The system must support time synchronization among control subsystems using IRIG-B format as UTC. This ensures that time-sensitive operations across the Gemini system are coordinated and accurate.

**Self-Testing:**

2. The system must be capable of running self-tests and reporting the results as OK, BAD, or WARNING. This functionality allows subsystems to detect problems that may affect their operation and report their status accordingly.

**Logging:**

3. The system must support logging at specified levels. Logging is essential for recording system activities, errors, and important events, providing valuable information for troubleshooting and analysis. 

**Asynchronous Communication:**

4. Communication via a route must be asynchronous, with commands available to establish synchronization as needed. Asynchronous communication allows for flexibility and responsiveness in data transmission and command execution.

**Command Implementation:**

5. Commands must be represented as ASCII strings, and procedures must be provided for constructing/deconstructing/routing command strings. This requirement ensures that commands are transmitted and processed in a standardized and efficient manner.


## Non-functional requirements

**IOC Commands:**

1. The Gemini system must support various IOC commands, including AwaitItem, SetCallback, ClearCallback, LocateItem, GetValue, PutValue, StartStream, StopStream, SetEvent, and ClearEvent. These commands are essential for interacting with the Input/Output Controller (IOC) subsystems and accessing the local databases within the system.

**Data Communications:**

2. The system must be capable of transmitting commands and data across the network using different methods:

* 2.1 Direct Transmission: The most common means of command transfer from the Observatory Control System to the subsystems.

* 2.2 Channel Routing: Commands and data may be routed through a channel, which may involve intelligent channels responsible for data conversion. Channels may have multiple sources, multiple targets, or both, and may use separate physical routes to prevent interference with normal command streams.

* 2.3 Broadcast Signals: Some commands and data signals are broadcast across the control system, allowing any subsystem to examine and respond as appropriate. For example, critical system failures might trigger a broadcast ShutDown command.

**General purpose command:**

3. The system must support a range of general-purpose commands, including GetState, GetID, GetConfiguration, SetStatus, and SetLogging. These commands are crucial for obtaining the internal state of subsystems, retrieving unique identification tags, obtaining detailed configuration information, and setting the status and logging levels of subsystems.

**Command Structure**

4. All commands must adhere to a specific structure, including unique identification, source, target, opcode, and parameter set. This structured approach ensures consistency and traceability in command execution.

ITCS431 Software Design and Development (2023)


  
