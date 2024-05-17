# Gemini Project
# IDK Group
This project is part of ITCS431 Software Design and Development.

## Team Members
| ID | Name | 
| ------------- |-------------
| 6488056 | Tanapat Klipkamrai
| 6488088 | Ittikorn Suksai      |
| 6488104 | [Punnaruj Wuthijariyasak](https://github.com/Faruhiz) |
| 6488177 | Jedsada Meenoi |

## How to run this project
In this project, we have seperated into Frontend (HTML & JS) and Backend (Springboot).

For backend, we have made docker image and pushed into Docker repository.

You can pull the docker image using this command.
```
docker pull faruhiz/gemini-ocs-server:v1
```

then
```
docker run -p 8080:8080 faruhiz/gemini-ocs-server:v1
```

Our assigned usecases for this project are:

- Login
- Create Science Plan
- Test Science Plan
- Submit Science Plan

## Design Pattern
- Interface: HTML & CSS