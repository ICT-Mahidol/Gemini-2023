# Team Member
| Student ID | Student Name              |
|------------|---------------------------|
| 6488051    | Purinat Pattanakeaw       |
| 6488124    | Sarttra Prasongtichol     |
| 6488125    | Phutthikanj Kitivoranondh |
| 6488133    | Sirasit Puangpathanachai  |
| 6488178    | Thanawat Jarusuthirug     |
| 6488217    | Pattaradanai Kaeodumkoeng |
# Use Case Diagram

![Usecase_Diagram](https://github.com/ICT-Mahidol/Gemini-2023/assets/126402828/9a3c288a-db5f-4928-ba43-cd3388204361)

# Use Case Description
1. Having 6 actors consist of Visitor, Astronomer, Science Observer, Telescope Operator, Developer, and Support.
2. Visitors >> Prepare special instruments, Operate special instruments and Participate in software development and maintenance.
3. Visitors have co-related use cases with other actors >> Adapt instrument to Gemini Standards and Integrate Instrument to the system to Support, Collaborate for complicated functionalities and Utilize Gemini Interfaces for instrument control with Telescope Operator.
4. Astronomers >> Create and Test Science Plan.
5. Astronomers have co-related use cases with other actors >> Submit Science Plan to Science Observer. This includes <<include>> use case for the Science Observer
6. Science Observer >> Validate Science Plan that include <<include>> Submit Science Plan use case, Can be able to access scheduling queue, and create, review, and adjustment of the observing program.
7. Support >> Acess to all subsystems which is <<include>> use case for testing subsystems, Generating status reports, and Access mode Allocation
8. Support co-related use cases with other actors >> Test and Monitor Software as well as Monitor System with Developer
9. Telescope Operator co-related use cases with other actors >> Collaborate for complicated functionalities and Utilize Gemini Interfaces for instrument control with Visitor
10. Developer >> Upgrade software, Configure system, Design Software, and Maintenance
11. Developer co-related use cases with other actors >> est and Monitor Software as well as Monitor System with Support
