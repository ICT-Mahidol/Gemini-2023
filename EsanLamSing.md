# Team Members
1. 6488051	Purinat	Pattanakeaw
2. 6488124	Sarttra	Prasongtichol
3. 6488125	Phutthikanj	Kitivoranondh
4. 6488133	Sirasit	Puangpathanachai
5. 6488178	Thanawat	Jarusuthirug
6. 6488217	Pattaradanai	Kaeodumkoeng

# Functional
1. The Gemini system, when powered on, exists in one of several disjoint operational levels. Access to the system is restricted according to the current level of operation. The operational levels are: 
A.Observing level. The observing level is the “normal” operational mode of the system. 
B.Maintenance level. The maintenance level permits access to all subsystems for routine maintenance and diagnostic work. The telescope is typically at maintenance level during daylight (non-observing) hours. 
C.Test level. The most primitive operational level, test level operation is used for installation/de-installation of subsystems, including full diagnostics and installation calibration activities.
2. At any level, but particularly during observing level operation, the software imposes on the Gemini system a series of access modes. These access modes balance ease and convenience of use against flexibility, control, and the security of the system. The access modes provided by the Gemini system are: 

A.Observing. This mode provides simple and safe access to the system for the collection of science data, selection of instrument parameters, and quick-look data reduction. Access to the system is through the sequencer with no direct control of the telescope and instruments 
B.Monitoring. This is a special, read-only case of the observing mode that can be invoked on a subsystem basis. Under no circumstances should monitoring affect the performance of an ongoing observation. 
C.Operation. This is the access used for direct control of the telescope and instruments, typically during observation-level operation. It is normally available only to the Telescope Operator and the science program sequencer when at the operation level. 
D.Planning. Access to the Gemini system is provided during science planning. Actual access to the telescope is not permitted in this mode, but the virtual telescope capability of the Gemini system provides a telescope simulator that is useful for planning observations, as are online databases. 
E.Testing. Test access allows full, direct control of any subsystem. All features of the subsystem are available in this mode. Under no circumstances should testing affect the performance of an ongoing observation. 
F.Administrative. It is possible to inquire about system utilization, efficiency, etc. using administrative access. No control is available in this mode, only status and scheduling information is accessible. Under no circumstances should administrative access affect the performance of an ongoing observation. 

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
15. The system must define operation levels, privilege and protection levels, capacity, performance criteria, and specific procedures.

# Non-functional
