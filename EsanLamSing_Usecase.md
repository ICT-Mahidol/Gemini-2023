# Team Member
# Use Case Diagram

![Use Case Diagram](https://github.com/ICT-Mahidol/Gemini-2023/assets/59379348/bc9fc716-f7db-4fd4-b1c1-5fd92ca1bc59)
# Use Case Description
1. Having 6 actors consist of Visitor, Astronomer, Science Observer, Telescope Operator, Developer, and Support.
2. Visitors >> Prepare special instruments, Operate special instruments and Participate in software development and maintenance.
3. Visitors have co-related use cases with other actors >> Adapt instrument to Gemini Standards and Integrate Instrument to the system to Support, Collaborate for complicated functionalities and Utilize Gemini Interfaces for instrument control with Telescope Operator.
4. Astronomers >> Create and Test Science Plan.
5. Astronomers have co-related use cases with other actors >> Submit Science Plan to Science Observer. This includes <<include>> use case for the Science Observer
6. Science Observer >> Validate Science Plan that include <<include>> Submit Science Plan use case
7. Support >> Acess to all subsystems which is <<include>> use case for testing subsystems, Generating status reports, and Access mode Allocation
8. Support co-related use cases with other actors >> Test and Monitor Software as well as Monitor System with Developer
9. Telescope Operator co-related use cases with other actors >> Collaborate for complicated functionalities and Utilize Gemini Interfaces for instrument control with Visitor
10. Developer >> Upgrade software, Configure system, Design Software, and Maintenance
11. Developer co-related use cases with other actors >> est and Monitor Software as well as Monitor System with Support
