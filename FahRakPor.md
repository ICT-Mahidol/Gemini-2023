# Team members
1. 6488001 Napat Boongaree
2. 6488072 Pachanitha Saeheng
3. 6488081 Pittinunt Sirigittikul
4. 6488086 Chutweeraya Sriwilailuk
5. 6488099	Yotsapat	Tanprathumwong
6. 6488149	Kongphob	Wutthiumphol

# Functional Requirement
1. The system is able to receive and keep the astronomical data from the Gemini telescopes. 
2. The system needs to be able to receive data and figure out what it means by interpreting it. 
3. The system should have tools for analyzing processed data.
4. Astronomers have to be able to schedule their observations in advance.
5. The system must allow real-time monitoring of the telescopes' status. 
6. The system must send alarms if anomalies are discovered in the data or during telescope operation. 
7. The system should allow monitoring of the telescopes’ status in real time and can detect and report unsafe conditions or errors. 
8. The system should allow the developer to have full access to each subsystem in the test. 
9. The system should allow the support team to have full access to all subsystems in the test and maintenance. 
10. Configuration, logging, maintenance schedules, and subsystem documentation are to be kept in the commercial relational database.
11. This requirement states that the system should support asynchronous writes to the database, enabling multiple operations to be performed concurrently without blocking each other.
12. This requirement indicates that critical information that requires fast access should be stored in memory to ensure quick retrieval and processing.
13. The system should implement secure user authentication and authorization mechanisms to control access to sensitive astronomical data and system functionalities. 
14. The system must include robust mechanisms for regular data backups to prevent data loss, and it should provide efficient data recovery options in case of system failures or unexpected events. 
15. The system should be capable of seamless integration with external systems or data sources, allowing astronomers to incorporate data from other observatories or sources for comprehensive analysis. 
16. The system must have to be transported between GEMINI and the home institutes of visiting astronomers in FITS format only and contains all header information provided with the data.
17. The system must be able to support a full implementation of remote operations. This includes remote observing, remote control of telescope, enclosure, and instruments, multipoint monitoring, remote monitoring, remote access for testing, development, diagnostics, and maintenance.
18. The system must be the capability of providing multiple, simultaneous access to data. Data transfer between the virtual telescope system and attached workstations.

# Non-Functional Requirement
1. The system should handle large amounts of data quickly. 
2. The system should have excellent availability because astronomical events might happen at any time and data collection should not be disrupted. 
3. The system should be easy to use, as it can be used by researchers with different levels of technical competence.
4. The system should be able to handle increased workloads by adding resources. 
5. The system should keep the data safe from people who shouldn't be able to see it and make sure that the data is correct. 
6. It should be simple to keep the system running and add additional functions. 
7. The system should be able to be portable across different platforms and operating systems. 
8. The system should be capable of a data capacity so great as to store 7 days of the largest instrument’s data load, the last 3 days of which must be available interactively from a hard disk or similar medium.
9. The system should store data from all instruments and detectors as compressed data, using a standard format. 
10. The operating environment at the upper levels (User-interface and OCS) is expected to provide sufficient performance for both human interaction and communications. 
11. Existing software packages and expertise should be reused whenever possible. 
12. The software should be structured and formally defined to make the development process visible, avoid incomplete specifications, discover errors early, secure structured and maintainable software, guarantee software quality, and improve and ease cooperation. 
13. All software that does not directly control specific hardware must be written as machine independent, portable code.
14. The system should support interoperability with other astronomical data systems  and tools, allowing seamless collaboration and data sharing among observatories and research institutions. 
15. The system's user interfaces and data processing components should provide low-latency response times to ensure that researchers can interact with the system efficiently and obtain results on time. 
16. The system should maintain comprehensive audit logs, tracking all user interactions, data modifications, and system activities. This ensures traceability, accountability, and the ability to investigate unauthorized or anomalous activities. 
17. The system should minimize bandwidth impact on the LAN and WAN and to save space on removable media.
18. The system should be developed using typical modularization and standardization techniques.In each module’s environment is strictly defined by its interface to other components. No module can rely upon information outside of this interface.
 
