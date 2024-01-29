# Team Members
1. 6488036 Krittin Kumthornthip
2. 6488075 Jirayu Saejiam
3. 6488092 Thanaphat Sumrith
4. 6488095 Panyaporn Suwannasit
5. 6488123 Kitiphum Mueangthongkham
6. 6488175 Penpitchapa Pantaraksakul

# Functional Requirements
#### Chapter 2: General Description
  1. The system must enable astronomers to define science plans and observations.
  2. The system must enable astronomers to submit observation schedules.
  3. The system must enable astronomers to control the telescope and instruments remotely.
  4. The system must enable astronomers to access and analyze collected data.
  5. The system must enable astronomers to request interactive observing, if needed.
  6. The system must enable communication between astronomers, science observers, telescope operators, and administrators regarding observation needs and progress.
  7. The system must provide updates and notifications about observations to relevant users.
  8. The system must define and implement secure transitions between Observing, Maintenance, and Test levels.
  9. The system must prevent unauthorized level changes.
  10. The system must notify users of the current operational level and potential downtime during transitions.
  11. The system must implement distinct access modes for each use case (Observing, Monitoring, Operation, Planning, Testing, Administrative).
  12. The system must provide granular control of access within each mode (e.g., instrument settings, data manipulation, system utilization data).
  13. The system must prevent unauthorized access mode changes.
  14. The system must clearly indicate the active access mode to users.
  15. The system must authenticate users and verify their roles (Astronomer, Science Observer, Telescope Operator, etc.).
  16. The system must grant access based on user roles and the current operational level/access mode.
  17. The system must log user activity and access attempts for auditing purposes.
  18. The system must allow a single user to access through multiple modes simultaneously as needed (e.g., Telescope Operator).
  19. The system must prevent conflicting actions from overlapping modes that could impact ongoing observations.
  20. The system must implement safeguards to prevent accidental or malicious actions that could harm the system, instruments, or ongoing observations.
  21. The system must securely store and transmit sensitive system data and user credentials.

#### Chapter 3: General Requirements
  1. The system must enable the transfer of control information, such as commands and replies, from users to the telescope and instruments.
  2. Replies must contain status information and data related to instruments and telescopes, to be stored with astronomical data.
  3. All subsystems should provide control information upon request without causing delays in control activities.
  4. Synchronization with the Time Reference System at the Gemini 8m Telescopes site is required in some cases.
  5. Users, subject to restrictions, must have access to control parameters, telescope, and instrument information for monitoring or other purposes.
  6. Meteorological information from a weather station should be available centrally.
  7. Data acquisition and instrument control nodes must support simultaneous operation of up to six active control nodes and up to two monitoring nodes.
  8. Detector data must be acquired and stored efficiently, following the Gemini 8m Telescopes standard.
  9. Raw data should be stored with minimal intermediate storage, with at least two copies for data security.
  10. Astronomical data must be transported between GEMINI and home institutes in FITS format.
  11. Operation can occur at three levels: observing, maintenance, and test, each with specific access parameters.
  12. Observing level allows for normal operational mode and monitoring.
  13. Maintenance level permits the updating of maintenance tables.
  14. Test level enables the installation and testing of new packages or releases.
  15. Users must have different privileges associated with their categories or location.
  16. Protections must be enforced to ensure compatibility between subsystems in different modes.
  17. Every command must be acknowledged positively or negatively within specified response times.
  18. Automatic procedures for startup, shutdown, and reconfiguration of the telescope and instruments must be implemented.
  19. The observing environment and related light path must be dynamically definable without the need for system restart.
  20. A homogeneous user interface must be provided, callable from various stations and network transparent.
  21. User interface tools should be based on standards, portable across different computer hardware platforms.
  22. Standard interfaces must be available for hardware components, control electronics, and software.
  23. The Gemini 8m Telescopes software must interface with external software, including commercial packages and visitor instrumentation.
  24. Internal communication needs, including LAN, WAN, and point-to-point links, must be supported.
  25. Network redundancy should be considered for reliability.
  26. On-line quick-look analysis of astronomical data, with standard reduction procedures, should be available.
  27. On-line access to catalogues and previous data, as well as interfaces with other packages, must be supported.
  28. Data structures should be designed with simplicity.
  29. Retry procedures must be embodied in the software in case of error or failure (e.g. time-out, hardware failure) to achieve recovery.
  30. The system must be possible for the system to reconfigure itself to continue observing.
  31. Preparing observing sequences for automatic observations and simulating observations to estimate results.
  32. The system should be constantly monitoring active subsystems to be sure they are operating correctly before sending commands to each subsystem and this monitoring should continue inactive subsystems.
  33. MTBF and MTTR for the software and controls.
  34. Subsystem software should provide monitor, self-test, and system-level checks for maintenance.
  35. All subsystem software is to include modules to aid in the maintenance and testing of the subsystem.
  36. Obtain all necessary safety approvals before the acceptance of devices to safety requirements.

#### Chapter 4: Specific Requirements
  1. The Gemini system must adhere to the maintenance philosophy outlined in the Software Management Plan (SMP).
  2. Preventative maintenance tasks must be scheduled according to the specifications in the Gemini Design Requirements Specification.
  3. All software development must employ standard modularization and standardization techniques.
  4. Each module must strictly define its environment through its interface with other components.
  5. Module selection must be done logically to minimize the size of interfaces between modules.
  6. On-line databases are part of the interface, with accessibility limitations.
  7. Conduct measurements of fault rates during commissioning to establish baseline rates for system reliability monitoring.
  8. Implement recovery procedures to restart after error failures.
  9. Perform validity and feasibility checks during science planning to ensure effective and efficient use of the telescope.
  10. When appropriate, validity and feasibility checks should be performed during system operation.
  11. Constantly monitor active subsystems to ensure correct operation before sending commands to each subsystem.
  12. Continue monitoring inactive subsystems to identify and address issues.
  13. Ensure all telescope, instrument, and detector control information is accessible at any operation level.
  14. Ensure time-access critical information is available in memory.
  15. Implement a consistent and logical access method, based on names.
  16. Develop the database to support both remote access and distributed data.
  17. The Gemini telescope must fully support remote observing.
  18. Enable remote control of telescope, enclosure, and instruments.
  19. Implement multipoint monitoring during remote operations.
  20. Facilitate remote monitoring of telescope systems.
  21. Allow remote access for testing, development, diagnostics, and maintenance.
  22. Extend all operational capabilities from on-site operations to remote operations.
  23. Acknowledge some degradation in performance due to WAN bandwidth considerations.
  24. Ensure video data signals are digitally encoded and transferred via the WAN to remote sites.
  25. Implement security measures to control access to system features.
  26. Potentially restrict some operations to specific remote sites.
  27. Ensure the on-line data store holds astronomical data for the current observation.
  28. Provide availability of star catalogs in Astronomical object catalogs using external software.
  29. Distribute telescope and instrument parameters across the IOCs for those systems.
  30. Store all additional data not required online (configuration information, detailed documentation, operation logs, etc.) in a relational DBMS (supported software).
  31. Ensure input data, including catalogs, calibrations, and flat fields available in archives, are predefined at operation start.
  32. Ensure these data end up in different databases.
  33. Recognize operational information, such as logging messages, alarms, and errors, as special forms of output data, made available for later inspection and debugging.
  34. Record sufficient information during an observation to recreate the sequence of events.
  35. Operate the Gemini system via a sequence of commands using initially set configuration parameters.
  36. Implement automatic operation as the normal mode, requiring little or no interaction with the observer.
  37. Accomplish science planning and program changes through interactive operation.
  38. Enable normal operation at all levels (observing, maintenance, and test) for various conditions.
  39. Define overall performance as the percentage of viewable time during which exposures have been taken.
  40. Establish start-up and shut-down procedures at different levels.
  41. Log all important events in the system, properly timestamped and indexed.
  42. Report all errors using a common, system-wide procedure.
  43. Categorize errors into Fatal, Serious, and Warning types.
  44. Describe errors resulting in an "alarm," specifying the action required for acknowledgment and resolution.
  45. Differentiate between errors and alarms in the Gemini Control System.
  46. Define well-defined recovery procedures for any subsystem that becomes inoperative.
  47. Include command retries in the system for common timeouts or no-response conditions, occurring automatically in command handling.
  48. Specify performance of error-mode recovery for each subsystem.
  49. Develop Gemini-supported software using a formally defined model, specifically the Ward/Mellor approach for real-time systems
  50. Encourage the use of an object-oriented approach in software development.
  51. Use UNIX System V, Release 4, with POSIX compliant calls for development.
  52. Design embedded software below the IOC level for possible upgrades, typically placed in ROM or FLASH memory.
  53. Ensure that access to embedded software is strictly through software in the IOC.
  54. Host workstation operating system: Unix, currently baselined as Solaris 2.3 or above.
  55. Support the standard ARPA services.
  56. Use DRAMA’s IMP protocol for all control communication, utilizing SDS as the command structure.
  57. Employ the same IMP protocol for interprocess communication.
  58. Workstations provided under contractual agreement: SUN SPARC-10 (model 41) or SPARC Classic with 64MB of dynamic memory.
  59. Internal Gemini software development in a multi-platform environment.
  60. Access to control electronics hardware exclusively through VME IOCs, using the EPICS software.
  61. Communication network enabling IOCs and OPIs to communicate.
  62. EPICS provides a software component, Channel Access, for network-transparent communication.
  63. Memory resident database with an extensible set of record types.
  64. All access to the database, excluding record and device support, is through channel or database access routines.
  65. There is a mechanism for deciding when to process a record.
  66. Record support module for each record type.
  67. Callback mechanism for database value changes.


# Non-functional
#### Chapter 2: General Description
  1. Collected data must be accurate, reliable, and meet scientific needs.
  2. The system must have high uptime and minimal downtime for maintenance.
  3. The system must support various observation types and scientific needs.
  4. The system must have an intuitive interface for defining observation plans and controlling instruments.
  5. The system must provide secure storage and access to collected science data.
  6. Access control operations should not significantly impact system performance or observation execution.
  7. Access control mechanisms should be intuitive and user-friendly for different user roles.
  8. The system must maintain comprehensive logs of user activity and access attempts for security and troubleshooting purposes.
  9. The access control system must be adaptable to accommodate future changes in user roles, operational levels, and system functionalities.
  10. The system must gracefully handle potential errors or failures in the access control mechanisms without compromising system security or ongoing observations.

#### Chapter 3: General Requirements
  1. Control information must be reliable and commands cannot be lost.
  2. Redundancy should be considered for critical communication links.
  3. The system must support multiple users and subsystems simultaneously.
  4. The software and hardware architecture should be scalable for future expansions.
  5. User access to control parameters and sensitive information should be appropriately restricted.
  6. Security measures, as defined in Section 3.5.6, must be enforced.
  7. Software updates and reconfigurations must be possible without affecting operational parts.
  8. On-line version control and consistency checks are essential for maintaining system integrity.
  9. User interfaces and software tools must be portable across different computer hardware platforms.
  10. Hardware and software interfaces should allow migration to different media if required.
  11. Data acquisition and instrument control must not significantly impact the overall processing time.
  12. Response times for commands must meet predefined criteria.
  13. Comprehensive documentation must be provided for user interfaces, hardware, and software interfaces, and procedures.
  14. Documentation should be accessible to users with appropriate privileges.
  15. Data should be easily accessible by different subsystems to facilitate smooth operation.
  16. The error or failure must be reported in a clear form (to identify the cause of the problem) and the system shall put itself into a safe state.
  17. The goal for recovery and/or reconfiguration is 5 minutes from onset of the error condition to observing again.
  18. Design software to be easily upgradable with modifications to non-changing components, considering evolving technology.
  19. Prioritize safety by designing for minimum risk, incorporating safety devices, providing warning devices, and developing procedures and training.
  20. Implement security measures to prevent accidental mix-up of commands and unauthorized intrusion into the system.

#### Chapter 4: Specific Requirements
  1. The fault rate measurement process during commissioning should be efficient and not cause significant system downtime.
  2. The recovery procedures must be reliable and capable of restoring the system to a stable state after error failures.
  3. Validity and feasibility checks during science planning and operation should not hinder the usability of the telescope for effective and efficient use.
  4. The system should maintain high availability by constantly monitoring both active and inactive subsystems.
  5. Maintenance tasks should be manageable and align with the Software Management Plan.
  6. Interfaces between modules and with on-line databases should be well-defined and adhered to during software development.
  7. Implement the internal (within the IOC) database using the EPICS framework.
  8. Specify the implementation within the host workstation as "To Be Determined" (TBD), allowing flexibility in the choice of technology.
  9. Implement access times to the database within the range of 2-3 milliseconds per access.
  10. The system should ensure acceptable performance during remote operations despite potential degradation due to WAN bandwidth considerations.
  11. The security measures should effectively control access to system features during remote operations.
  12. Security measures should allow for the potential restriction of some operations to specific remote sites.
  13. Access times to the on-line data store should be in the range of 2-3 msec per access.
  14. The database must support a consistent and logical (i.e., name-based) access method.
  15. Ensure the database supports both remote access and distributed data.
  16. Ensure time-access critical information is available in memory.
  17. Ensure all input and output data are logged appropriately for later inspection and debugging.
  18. Sufficient information should be logged during an observation to recreate the sequence of events.
  19. The system should ensure seamless automatic operation as the primary mode.
  20. Interactive operation should be responsive and effective for science planning and program changes.
  21. Transition to interactive operation from automatic operation should be smooth and adaptable to exceptional conditions.
  22. Normal operation should be consistent across all operation levels (observing, maintenance, and test) for various conditions.
  23. The system should aim for optimal performance by utilizing all possible concurrencies and efficient use of the Sequencer.
  24. Start-up and shut-down procedures should meet specified time durations for various scenarios.
  25. Logging of important events should be comprehensive, allowing for the recreation of observation steps.
  26. Logging of engineering data should be flexible, supporting high-rate logging for short periods and long-term logging at slower rates.
  27. Engineering logging data should be accessible to external software packages for analysis.
  28. The system should exhibit robust fault-tolerance mechanisms, ensuring smooth recovery from failures.
  29. Error logging should provide comprehensive information for effective tracing and resolution of errors.
  30. Differentiated handling of fatal, serious, and warning errors should align with defined procedures.
  31. Recovery procedures for inoperative subsystems should be well-documented and reliable.
  32. The performance of error-mode recovery should be efficient and specific to each subsystem.
  33. Minimize the impact of errors on overall system performance, allowing for continued operation with necessary adjustments.
  34. The formally defined model should ensure effective analysis, design, and development processes.
  35. Review procedures should contribute to high-quality software development.
  36. Documentation practices should be thorough and accessible.
  37. Encouraging an object-oriented approach should enhance software design and maintainability.
  38. The selection of VxWorks as the real-time operating system ensures reliability and compatibility.
  39. Using Unix for the host workstation and VxWorks with EPICS for the IOC ensures a stable and compatible environment.
  40. Using DARPA TCP/IP for communication hardware independence enhances flexibility
  41. Supporting standard ARPA services and additional interfaces ensures broad compatibility and interoperability.
  42. Utilizing DRAMA’s IMP protocol for communication ensures a standardized and effective interface.
  43. Consistent use of the IMP protocol for interprocess communication promotes standardization and reliability.
  44. Standardizing communication between real-time components on the EPICS Channel Access protocol enhances interoperability.s
  45. Using IMP/SDS for data communications aligns with established standards, ensuring compatibility.
  46. Interface routines for off-line data reduction should have Gemini software standards.
  47. Archiving systems should save astronomical data in FITS format.
  48. Conformance to specified software standards should ensure effective development processes.
  49. Being state-of-the-art allows for adaptation to evolving technology.
  50. Supporting Ethernet and FDDI interfaces ensures compatibility with communication standards.
  51. Selecting workstations under contractual agreement ensures consistency in the development environment.
  52. Adequate disk space on workstations ensures efficient data handling.
  53. Availability of DAT cartridges and CD-ROM supports data acquisition, backups, and software upgrades.
  54. Choosing development systems based on the Motorola MVME-167B platform ensures compatibility with the final target systems.
  55. Delaying the decision on target IOC computer cards allows leveraging technological advancements.
  56. FDDI system recommended for the backbone LAN due to bandwidth requirements.
  57. At least one dedicated link of T1 bandwidth for remote support, development, and testing.
  58. Gemini software should take advantage of existing software wherever possible.
  59. Existing software to be evaluated against specifications to reduce life-cycle costs and maintenance efforts.
  60. VME/VXI-based chassis must include a Motorola 68xxx processor.
  61. Various I/O modules and VME modules should provide access to other I/O buses.
  62. Communication networks should effectively allow IOCs and OPIs to communicate.
  63. Channel Access should facilitate network-transparent communication.
  64. Memory resident database should support an extensible set of record types.
  65. Databases should be efficiently accessible via database access routines.
  66. Scanning mechanism should allow effective processing of records.
  67. The design should effectively remove record-specific knowledge from database access.
  68. Database monitors should provide an effective callback mechanism.
  69. Channel access tools should be real-time, effectively used for monitoring and controlling IOCs.

ITCS431 Software Design and Development (2023)