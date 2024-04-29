# Gemini Project
# EsanLamSing Group
This project is part of ITCS431 Software Design and Development.

## Members
| Student ID | Student Name              |
|------------|---------------------------|
| 6488051    | [Purinat Pattanakeaw](https://github.com/Purinat33)       |
| 6488124    | [Sarttra Prasongtichol](https://github.com/therealmysticman)     |
| 6488125    | [Phutthikanj Kitivoranondh]() |
| 6488133    | [Sirasit Puangpathanachai](https://github.com/Hyme1418)  |
| 6488178    | [Thanawat Jarusuthirug](https://github.com/aritsulynn)     |
| 6488217    | [Pattaradanai Kaeodumkoeng]() |

## How to run this project
We seperate Frontend (React.js) and Backend (SpringBoot with Postgresql)
This project requires to run Frontend and Backend seperately with docker command:
- Start server by using `docker-compose up`
- Stop server by using `docker-compose down`

Login use case:
- Starting with register by http://localhost:8080/register to auto create dummy user email and password.
- Email: test@gmail.com password: password role: Astronomer, Email: test1@gmail.com password: password role: Science Observer, Email: test2@gmail.com password: password role: Visitor
- Using these email and password to login according to the role eg. For astronomer, use email: test@gmail.com for submit science plan.

3 assigned use cases:
- Submit Science Plan
- Validate a Science Plan
- Install new configuration
First, you will need to create science plan by using auto-generated function via: http://localhost:3030/autosp/{email}. For example, http://localhost:3030/autosp/test1@gmail.com to generate science plan that created by the owner of email: test1@gmail.com.

## Design Pattern
Model-View-Controller (MVC) pattern
- Model: MySciencePlan, MySpecialEquipment, User
- View: React
- Controller: MySciencePlanController, MySpecialEquipmentController, UserController
