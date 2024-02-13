# Team Members
1. 6488005 Sirawich Anantapong
2. 6488017	Thanatip	Chawalitporn
3. 6488058	Rawiporn 	Lertjanphen
4. 6488071	Isariya	Rassameererkset
5. 6488087	Thanatchaya	Suajrit

# Functional requirement
1. Users should be able to operate instruments as single units.
2. Multiple user stations can be active simultaneously.
3. Users, based on their privileges, should be able to access any part of the system with a simple logon and configuration operation.
4. Normally executed with the sequencer by providing a computer executable program, in order to make efficient use of the Gemini telescope.
5. There is a visual user interface to the OCS to allow for changes to the viewing program.
6. It is possible to have more than one station participate in the observing.
7. Software is required to assist in object selection within and across observing programs.
8. Optimization of observing efficiency by considering target positions, weather conditions, and instrument configurations is essential.
9. There should be a full telescope simulator within the virtual telescope environment of the Gemini system to test observing programs.
10. Gemini software should have a rich programming environment and a visually-oriented interface for astronomers.
11. The observing program must be fully automated with minimal human interaction.
12. There must be software to support flexible scheduling, both manual and via a scheduler.
13. The software should allow for interleaving observing programs transparently and manage various types of data.
14. To maximize observing time, there should be software to queue all possible observing with currently available instruments.
15. The system should support preprogrammed observing sequences in the queue.
16. It should allow resorting the queue based on properties of individual observing sequences, current site conditions, and rules established by the observatory directorate.
17. All observing facilities should work both on-site and off-site.
18. Full operations should be possible remotely.
19. Team observing with multiple observers at different sites should be supported.
20. It must be possible to restrict specific operations to specific remote sites.
21. The method used to restrict such operations should be independent of the operations themselves and dynamic.
22. This remote observing capability needs to be provided on the Gemini 8m Telescopes.
23. Users should be able to observe remotely from sites such as Cerro Tololo, Hilo, or home institutes.
24. Remote control is restricted to the Gemini 8m Telescopes Enclosure and Gemini 8m Telescopes Control Facility.
25. Telescope control commands, typically associated with a local Telescope Operator, should be available from a remote site.
26. The observing program must be automated, requiring little human interaction during the observation.
27. The Gemini software must include a rich programming environment to support automation.
28. The programming environment should provide a visually-oriented interface for astronomers.
29. The programming environment should be available to both the astronomer (for program development) and the observer (for review and adjustment).
30. Access may or may not be concurrent in a shared environment.
31. The programming environment should allow for the communication of special notes, instructions, and comments from the astronomer to the observer.
32. The communication may involve multimedia techniques.
33. The use of this feature should be discouraged for queue-based observing.
34. It requires also that the observing program is so well specified that it can be executed by someone else. In other words, it requires a computer executable observing program.
35. Observations should be carried out automatically, following predefined sequences of exposures.
36. This aligns with planned observing, similar to practices in space observatories.
37. Competent monitoring is required at the Gemini 8m Telescopes site or remotely, even during planned observing.
38. Interaction shall be allowed at the desired level, such as only on error conditions or any time the user is allowed to break a sequence.
39. Flexible scheduling involves reacting to changes in weather and other conditions by allocating the current use of the telescope to the optimal observing program for those conditions.
40. Flexible scheduling necessitates the use of service and/or remote observing since users cannot wait indefinitely for the required conditions.
41. Remote monitoring is mentioned as a potential complement to flexible scheduling, allowing users to be on standby at a suitably equipped remote site.
42. The possibility to change telescope scheduling quickly, exchanging observing programs, is required for flexible scheduling.
43. Appropriate scheduling software is needed to advise the operations team on the best choice, considering relative priorities of various observing programs.
44. The mention of 'expert scheduling' software, though not currently existing, should be a requirement. It should have an operational mode supporting decision-making by presenting appropriate information.
45. Flexible scheduling requires switching during the night among telescope modes and instruments, typically twice per night.
46. The syntax of control flow commands should be consistent across the system, whether accessing workstation software or IOC (Input/Output Controller) software.
47. All subsystems must respond to a common set of commands to test operational status, inquire about versions, perform self-tests, etc. These common commands are described in Section 5.3 on page 5-2.
48. All IOC subsystems must respond to additional common commands for activities such as start, stop, initialize, reset parameters, etc. These IOC common commands are also described in Section 5.3 on page 5-2.
49. Data from detectors must be stored in the most effective method permitted by available technology.
50. Maximum acceptable readout time for detector data depends on the detector type and size, as well as the intended application.
51. The system must support multiple, simultaneous access to data for monitoring operations.
52. The LAN must support a transfer rate of 20-40 Mbits/second for data transfer between the virtual telescope system and attached workstations.
53. Data is normally acquired as uncompressed data but may be compressed using a loss-less compression technique for transmission or storage.
54. Compression aims to minimize bandwidth impact on the LAN and WAN and save space on removable media.
55. For data that requires preprocessing, only the preprocessed data is stored.
56. Data from all instruments and detectors is stored as compressed data using a standard format.
57. There is a first level of storage within IOCs to secure data in the event of link failures.
58. A second level of storage is on the Gemini system data disk(s), possibly also on removable media. Quick-look data quality assessment is done using this level.
59. Data is transmitted between Gemini and home Institutes using a FITS format.
60. The transmitted data contains all header information provided with the data.
61. The system must allow for fast transmission of rough images every 0.5 seconds.
62. Data-loss compression techniques (e.g., JPEG, MPEG, etc.) may be used to assist in achieving this requirement.
63. There is a need for the transmission of images matching the original resolution.
64. High-quality transmission must require less than 20 seconds.
65. Only loss-less compression can be used to assist in achieving this requirement.
66. The telescope and instrument software shall contain built-in test (BIT) facilities to verify Gemini 8m Telescopes system and Gemini 8m Telescopes software performances.
67. Every Gemini 8m Telescopes software module shall have corresponding test specifications to check normal operation of releases, to be used both for acceptance tests and as an on-line test procedure.
68. The Gemini 8m Telescopes control software shall also provide for execution of self-test sequences of the Gemini 8m Telescopes system and subsystems. These shall automatically exercise all subsystems present in a given operational configuration.
69. There should be no restrictions imposed by the software on users.
70. Only policy decisions (permissions, access privileges, etc.) should prevent any user from accessing any part of the Gemini system from any local or remote station.
71. Similar functionality should be presented to the users using similar user interfaces.
72. User interfaces should clearly reflect access modes and operating levels.
73. All Gemini subsystem packages should include, as part of the software, both a simulator module for inclusion in the virtual telescope and user interface modules for the user interface environments that the subsystem will be operating in.
74. All instrumentation control software must provide full access to all instrument functionality. Different user interface modules may present different portions of this functionality to the user.
75. There are different requirements for software running on different layers. Strict real-time control is restricted to the IOC (Input/Output Controller) layer.
76. The use of a virtual-telescope model in the Gemini system allows the integrated system to be tested and developed independently of the target hardware.
77. All hardware subsystems must provide a software simulation module that responds in a reasonable fashion to commands directed at that hardware.
78. Gemini subsystems should be as self-contained and autonomous as possible, decreasing the functional width of the interface to the rest of the Gemini system.
79. Detector data must be acquired and stored in the most effective way technology will allow. Effectiveness should be evaluated in terms of cost, space requirements, longevity, and speed. This shall lead to the definition of a Gemini 8m Telescopes standard, used on all instruments.
80. Astronomical data will have to be transported between GEMINI and the home institutes of visiting astronomers in FITS format (as defined by NOST 100-1.0, “Definition of the Flexible Image Transport System (FITS)”, NASA Science Office of Standards and Technology).
81. TV data concerning site monitoring and voice need to be capable of being available at all operations facilities.
82. It allows a certain number of embedded tests, normally at a fairly high level.
83. This allows maintenance tables (for example, with instrument parameters) to be updated.
84. It is anticipated that the majority of parameters at this level will be accessed by operations and development staff.
85. This allows the installation and testing of new packages or new releases.
86. Any low-level test can be performed in this mode.
87. It shall be possible to update all non-protected parameter values, i.e., those not used by operations at observing level.
88. A further subdivision within the levels can be achieved by implementing privileges associated with categories of users or with the location of the user station (local or remote). For example, some users might only be allowed monitoring as a subsystem is in use by someone else.
89. Protections must also be enforced among users, and the operational software should indicate clearly to users the current operation level and check the compatibility between subsystems in different modes.
90. It is essential for operational and maintenance reasons that, in spite of the obvious differences of the setups and commands available, the same philosophy is applied throughout.
91. This calls for a homogeneous user interface, which can be achieved only by applying the same user interface tools to the whole project, providing the Gemini 8m Telescopes user interface's ‘look and feel’.
92. Given the requirement to be able to access the Gemini 8m Telescopes from several points, the user interface should be seen as a package to be callable from a large number of stations, depending on where a user is.
93. It should also be network transparent so that it does not matter where it is being run.
94. The Gemini 8m Telescopes software covers all aspects of control and data acquisition related to the telescope, instruments, and auxiliary instrumentation.
95. It also covers all the operational aspects of the Gemini 8m Telescopes, including on-line scheduling and rescheduling.
96. Quick-look data processing should be provided on the Gemini 8m Telescopes, with procedures suitable for fast on-line data preprocessing.
97. Acquired data should be made available as directly as possible in a common format.
98. All additional data related to an exposure and logging information should be made available on-line at the same time.
99. Quick-look should be usable within exposure sequences to provide results and feedback parameters to the control software in a programmed way, without the need for manual intervention.
100. Near-line processing should be available for simple data reductions required for data integrity validation.
101. This data reduction proceeds sequentially through requests but asynchronously from data acquisition.
102. Data acquisition takes precedence over near-line data reduction.
103. Off-line pixel processing for full data reduction should exist at the Gemini 8m Telescopes site.
104. Compatibility with and adaptations to existing image processing software used by the astronomical communities must be sought.
105. Some Gemini 8m Telescopes subsystems, such as adaptive optics, may require their own special on-line pixel processing software.
106. Specific observer support software has to be foreseen for on-line use in instruments where needed.
107. The specific on-line (quick-look) software development shall be seen as a subset of the development for the off-line data reduction system to avoid duplication of development effort.
108. The output format of the Gemini 8m Telescopes data must be compatible with the GEMINI archive requirements.
109. On-line interactive access to the data archiving system should exist, allowing access for Gemini 8m Telescopes users.
110. Specific types of data available, the amount of a specific exposure available, and the time frame within which such data will be made available will be established by the Gemini Archiving Requirements.
111. Computer access to star catalogues is required so that an automatic selection of candidate guide and standard stars can be made.
112. The Gemini 8m Telescopes software must be able to interface with all commercial software packages available on the Gemini 8m Telescopes and integrated into the Gemini 8m Telescopes operation.
113. A relevant example of such a package is a general database management system (DBMS), where operational information should be kept.
114. LAN and WAN interfaces shall be homogeneous and shall be based on standards that allow migration on different media, if required during the Gemini 8m Telescopes project life.
115. For maintenance reasons and hardware independence, a clear hierarchical model must be implemented, supporting separation of logical and physical layers (e.g., ISO/OSI model).
116. Recognizes that this hierarchy may need to be violated for performance reasons, resulting in point-to-point connections between peer systems or direct connections bypassing the hierarchy.
117. Network redundancy should be considered in the design phase as a way to increase reliability and security, especially for control information.
118. The software shall support access to the system from any user station.
119. User stations should be identical and software configurable as the user station of a specific subsystem.
120. Should recovery also fail, the error or failure has to be reported in a clear form.
121. All telescope, instrument, and detector control information is to be available at any operation level.
122. Asynchronous writes are to be supported, allowing for concurrent operation.
123. There is to be a consistent and logical (i.e. name based) access method.
124. The on-line data store holds astronomical data for the current observation.
125. Astronomical data are automatically stored onto the Archive medium (external software).
126. Star catalogs are available in Astronomical object catalogs (external software).
127. elescope and instrument parameters are distributed in databases across the IOCs for those systems. There is also a central repository maintained by the OCS that holds these databases for down-loading to the IOCs. (developed software)

# non-functional requirement
1. Access to different parts of the system should have protection measures to ensure security and safety.
2. Monitoring shall not affect the performance of ongoing observations.
3. Users, regardless of their location at the telescope site, should be able to access any part of the system.
4. Access to status information should be available from any point.
5. Interactive operation is supported, but always through the Observatory Control System (OCS).
6. All control software must provide support for simulated use within the virtual telescope environment.
7. All software should be developed to permit remote operations.
8. There should be no conceptual difference between software working on-site and remotely.
9. The extent to which realistic observing conditions can be reproduced depends largely on the link bandwidth available.
10. The support structure for communicating commands must be reliable.
11. A uniform ACK/NAK (acknowledge/not-acknowledge) protocol should be adopted across all systems.
12. Timeouts must be supported at approximately 500 milliseconds.
13. Handshaking of commands between IOCs must occur within 100-200 milliseconds, signaling acceptance of each command.
14. For commands allowing delayed replies, timeouts for that reply must be supported.
15. This is a non-functional requirement specifying a characteristic related to the system's responsiveness and handling of delayed replies.
16. Peak control information within the system is expected to be 100 TPS (Transactions Per Second).
17. This is a non-functional requirement specifying a performance characteristic, particularly the expected rate of control information flow within the system.
18. The data capacity of the system is limited by transfer methods, technology, and archiving capacity on-site.
19. The system data capacity is capable of retaining 7 days of data produced by the largest instrument.
20. The last 3 days of data must be available interactively from a hard disk or a similar medium.
21. Every command must be accepted or rejected within 2 seconds and before the corresponding action occurs.
22. The target system must have examined the command and verified its validity.
23. Status display updates must be within 4 seconds at the local stations.
24. Certain functions, such as telescope position, may have tighter constraints.
25. Requests of subsystems for status information must be answered within 5 seconds.
26. This should be possible in maintenance level operation.
27. Requirements for response times within the user interfaces are given in the User Interface requirements section.
28. Regression tests should be a part of every Gemini 8m Telescopes software package.
29. Commercial packages, off-the-shelf public domain software, and standards are to be used whenever feasible.
30. Existing external software will be integrated with the Gemini software, and the interfaces involved in this integration are considered part of the Gemini software system.
31. All Gemini software is to be developed using standard methodologies and development environments. The goal is to have all components easily, preferably automatically, combined into an integrated system.
32. Gemini software developers should maintain accurate change logs showing software modifications as they are applied to the system software.
33. Gemini software developers should adhere to a standard method for the reporting and recording of errors from both internal and external sources.
34. Gemini software should be developed in an evolutionary fashion, using the CVS version control system.
35. All Gemini software is to be fully documented, internally with appropriate comments, and externally with documentation. External documentation must include Unix-style man pages.
36. All Gemini subsystem packages must provide modules for the testing and diagnosis of the subsystem.
37. All Gemini software must be version labeled, both in source and binary form. The version information is to be retrievable from executing software via control commands.
38. No subsystem package should make any assumptions about the surrounding environment beyond that provided in the interface specifications.
39. In general, operational overheads must be kept as low as possible to maximize actual observing times.
40. Intermediate storage of raw data in memory on different nodes and in different formats should be kept to a minimum. However, there must be at least two copies—one to secure data as acquired and one to do assessment of data quality on-line (this last copy preferably on removable media).
41. The link chosen to transfer data should represent as small a bottleneck as possible for data acquisition.
42. Normally, raw data will be acquired and stored as such for quick look evaluations.
43. There might, however, be cases (for example, infrared detectors) where fast preprocessing is needed, and where, therefore, raw data will not be stored as such but in a preprocessed format.
44. It will be a question of interfacing and bandwidth costs whether such information is actually available at a specific location.
45. It is not a requirement that point-to-point video be available between Gemini 8m Telescopes operations facilities.
46. It is a requirement that voice connectivity, perhaps point to point, be available on a permanent connection.
47. Other astronomical information such as that coming from sky field monitors, autoguider cameras, and sky monitoring devices such as cloud and seeing monitors shall also be capable of being available.
48. The capacity of the system can be expressed in terms of nodes, which is defined as the number of workstations, or in terms of users, which is defined as the sum total of users at all the nodes.
49. The capacity requirements will be expressed in terms of nodes.
50. Each node will have the capability to run at all operation levels.
51. When the Gemini 8m Telescopes telescope is used in its normal observing mode, there will be a single operator node for the telescope and two data acquisition and instrument control nodes.
52. The user interface should not be seen as a package linked to a specific computer.
53. The user interface tools shall be based on standards, which will be portable across different computer hardware platforms (Portable User Interface Toolkit).
54. The intent of a portability requirement is to facilitate migrating existing and future Gemini systems to different hardware as the need arises.
55. It is the current intent to limit the selection of computer hardware platforms to as few as is practical.
56. Due to the uncertain future of the Internet, only non-essential tasks may employ it.
57. All essential tasks, excluding remote observing, must take place on resources controlled by the project (such as leased lines).
58. Operational decisions, including privileges and priorities for various categories of users, will determine what a given user can actually do.
59. Access from any user station will make user stations identical and simplify coordination among simultaneous users.
60. Computers used at the Gemini 8m Telescopes site, especially during the test phase, shall be checked against altitude and humidity specifications for the site.
61. Computer hardware must be able to run the Gemini 8m Telescopes software environment and provide compatibility in data format (identical internal data representation).
62. Common development and implementation tools must be both available and supported.
63. Identical network access must be supported.
64. Local processing power must be sufficient so that telescope and instrument control do not represent a significant overhead in executing an observing program.
65. The choice of a scalable hardware architecture with computers at various performance levels should solve the problem of adequate on-line data assessment. 
66. Due to the limited bandwidths which may be available remotely, there will be constraints on the functionality of remote operations and access. 
67. Individual instruments must be able to run fully independently. 
68. Telescope software at the two telescopes must be maintained to be identical in the upper layers (even if hardware should differ).
69. Additions of new instruments should aim, as a goal, at introducing no modification to already operational parts. Modifications should be confined to the operational procedures and should not affect the bulk of the existing software. 
70. Switching to different configurations must be possible at any time with appropriate procedures. 
71. There must be easy procedures to reconfigure the system when subsystems are modified or removed. 
72. The number of main packages of software must be kept to a minimum to facilitate maintenance, but compatibly with the need to have the right degree of modularity. 
73. Commercial and public domain packages should be used whenever possible.
74. Existing software packages should be reused wherever possible. 
75. Existing software expertise should be consulted whenever possible.
76. All software which does not directly control specific hardware must be written as machine independent, portable code. Even for microprocessor software, the software should be hardware independent, to allow a later choice of the target microprocessors. 
77. To allow for expansion and maintenance, Gemini 8m Telescopes standards must be defined for the on-line software and the development environment. 
78. On-line version control must be implemented. That is, the version control system must be available to recover/restore versions at all times. 
79. At boot time, the Gemini 8m Telescopes software shall check the consistency of versions of all the various software components. 
80. Table-driven software should be used whenever possible, to avoid unnecessary compilations. 
81. The design of the Gemini 8m Telescopes software should have supportability considerations influencing the design process. 
82. Translate availability and readiness requirements into supportability requirements.
83. Identify and plan for necessary support to ensure the effective functioning of the system.
84. Provide support at a minimum cost, taking into account operating and support cost constraints.
85. Consider maintenance personnel availability and work hour constraints, as well as personnel skill level constraints.
86. Address operating and support cost constraints to ensure cost-effective support processes.
87. Define target failures correctable at each maintenance level to facilitate efficient troubleshooting and resolution.
88. Define allowable downtime at the site to manage disruptions and minimize impact on observations.
89. Define turnaround time to fix and maintain the system, ensuring timely resolution of issues.
90. Adhere to standardization requirements to promote consistency and interoperability in maintenance practices.
91. Implement effective maintenance planning to streamline support processes.
92. Consider manpower and personnel requirements in supportability planning and execution.
93. Define measurable and realistic reliability needs, specifying the expected level of system reliability.
94. Establish performance criteria for the system, including response times, throughput, and other relevant performance metrics.
95. Clearly define what constitutes a failure in the context of the Gemini 8m Telescopes system.
96. Specify the conditions of use and environments under which the system is expected to operate, considering factors such as temperature, humidity, and altitude.
97. Identify and define the means of verification for reliability and performance requirements.
98. Define the period of time during the system's life for which reliability and performance requirements are applicable.
99. Define measurable and realistic reliability needs, specifying the expected level of system reliability.
100. Establish performance criteria for the system, including response times, throughput, and other relevant performance metrics.
101. Clearly define what constitutes a failure in the context of the Gemini 8m Telescopes system.
102. Specify the conditions of use and environments under which the system is expected to operate, considering factors such as temperature, humidity, and altitude.
103. Identify and define the means of verification for reliability and performance requirements.
104. Define the period of time during the system's life for which reliability and performance requirements are applicable.
105. Access times to the database are to be in the range of 2-3 msec per access
106. Time-access critical information is available in memory.
107.  The database must support both remote access and distributed data.


 # ITCS431 Software Design and Development (2023)
