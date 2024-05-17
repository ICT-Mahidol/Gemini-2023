Design Pattern:
Facade Pattern: Make the java easier to adapt in OCS<br>
<br>Step to run:<br>
<br>Without docker<br>
1.Open build.gradle, to build project<br>
2.Run GeminiApplication.java to Start Program<br>
3.Access in localhost:8080<br>
<br>WithDocker<br>
1.Open build.gradle, to build project<br>
2.Click on Views -> tool windows -> Gradle
3.On the right side click Crytal -> tasks -> build -> bootjar
<br>![image](https://github.com/ICT-Mahidol/heroes-backend/assets/143877039/9a828fae-2261-49c3-9309-ba2d0a0f918f)<br>
4.Run Dockerfile<br>
5.Open cmd and change directory to the folder of the project<br>
6.Run this command<br>
   docker run -p 9090:8080 -v C:/Users/fcbar/Downloads/Crystal/build/libs/Crystal-Gemini.jar:/app/Crystal-Gemini.jar openjdk:17 java -jar /app/Crystal-Gemini.jar *change the directory to ur location <br>
7.Access with the localhost 9090
