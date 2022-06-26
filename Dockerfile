FROM openjdk:11-jdk-slim
EXPOSE 8080
ADD target/SA54_Eugene_fibonacci.jar SA54_Eugene_fibonacci.jar
ENTRYPOINT ["java","-jar","/SA54_Eugene_fibonacci.jar"]