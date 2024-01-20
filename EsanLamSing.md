# Team Members
1. 6488051	Purinat	Pattanakeaw
2. 6488124	Sarttra	Prasongtichol
3. 6488125	Phutthikanj	Kitivoranondh
4. 6488133	Sirasit	Puangpathanachai
5. 6488178	Thanawat	Jarusuthirug
6. 6488217	Pattaradanai	Kaeodumkoeng

# Functional
1. The system must define operation levels, privilege and protection levels, capacity, performance criteria, and specific procedures.
2. At any level, but particularly during observing level operation, the software imposes on the Gemini system a series of access modes. These access modes balance ease and convenience of use against flexibility, control, and the security of the system. The access modes provided by the Gemini system are: 
A.Observing.
B.Monitoring. 
C.Operation. 
D.Planning. 
E.Testing. 
F.Administrative. 
3. It is entirely possible for a single user to be accessing the system through several modes simultaneously. This is the typical situation with the Telescope Operator, who is often concurrently accessing the system through the observer, monitor, and operator modes. There are times when an astronomer might be using both observer and monitor modes.
4. the system must offer to a user an interface which, while fulfilling the various operational requirements in the different modes and offering status information both automatically and on request at any required level, is still simple to learn and secure in its use.
5. Observing commands will normally be submitted via the User interface to a queue for later execution
6. Observing astronomers shall have no privileges as far as the direct control of the telescope is concerned. They shall not be able to send control commands directly but they must be able to enquire about the status of the telescope or any subsystem at any time. 
7. Operations staff will control the Gemini 8m Telescopes indirectly via a scheduler program or directly via commands.
8. Operations staff shall have privileges to access all commands and maintenance procedures in case of problems.
9. Operations staff shall have access to operation tables in update mode, while observing astronomers will have access to them only in read mode (for example the list of filters mounted on an instrument).
10. The software will not allow unsafe actions; the command will be rejected.
11. The system must support various observing modes including interactive, queue-based, remote-operations, and service.
12. The system is responsible for effectively controlling, managing, and facilitating the flow of control information, astronomical data, and video information.
13. The system is designed to meet the specific requirements of various user groups, including astronomers, telescope operators, and developers, ensuring that each group's unique needs are addressed.
14. The system must handle control information flow, astronomical data flow, and other information flows as part of its data specification and operational requirements.
15. All relevant information, including control parameters, must be available to the Gemini 8m Telescopes software.
16. Users must have access to control parameters, telescope and instrument information for monitoring or other purposes.
17. The system should monitor the rate of warning messages since an increase might indicate that some tuning or maintenance is appropriate.
18. The system should be constantly monitoring active subsystems to be sure they are operating correctly before sending command to each subsystem. This monitoring should continue on inactive subsystems.
20. The Gemini system must be self-monitoring to invoke safety monitoring to prevent risk to people or damage to equipment.
21. The system must log all input and output data appropriately to recreate the sequence of events that occurred during the observation.
22. The software should be able to quickly bring the Gemini system to a safe state upon notification of such danger.


# Non-functional
1. The software should include built-in test facilities to verify system performance, with each software module having corresponding test specifications.
2. The software should be developed to permit remote operations, with no conceptual difference between on-site and remote software functioning.
3. The user interface should be designed to meet a variety of software requirements across different layers, with a focus on accommodating access modes and operating levels.
4. The software must fulfill security and safety criteria, which include actions including protecting the system when detecting potential dangers and fortifying it against external intrusions.
5. The system should prioritize maintainability and supportability, with a specific focus on maintenance requirements such as specifying the mean and maximum time for repair at each maintenance level and the allocation of preventative maintenance hours annually.
6. The software should have security to control access to system features, possibly restricting some operations to specific remote sites.
7. It must be possible to log engineering data at up to 200 Hz rates for short periods of time.
8. It must be possible for the system to reconfigure itself in order to continue observing, in a different mode if required, given the failure of a single non-critical subsystem to avoid unnecessary downtime.
9. The system must aim to minimize downtime resulting from maintenance activities, ensuring that the impact on system availability is kept to a minimum.
10. For the database package, the access times to the database are to be in the range of 2-3 msec per access.
11. Identical network access must be supported in hardware constraints aspect
12. The software must be strictly modular, i.e. the functionality of a subsystem should correspond to that which belongs to that subsystem and only to that.
13. Every command must be accepted/rejected within 2 sec and before the corresponding action occurs.
14. Status display update must be within 4 sec at the local stations (certain functions, such as telescope position, may have tighter constraints).


