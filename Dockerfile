FROM openjdk:17
EXPOSE 8084
ADD target/finalproject.jar finalproject.jar
ENTRYPOINT ["Java,"-jar","/finalproject.jar"]