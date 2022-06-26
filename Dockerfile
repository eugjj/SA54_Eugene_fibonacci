FROM openjdk:11-jdk-slim
EXPOSE 8080
ADD out/artifacts/SA54_Eugene_fibonacci_jar/SA54_Eugene_fibonacci.jar SA_54_Eugene_fibonacci
ENTRYPOINT ["java","-jar","/SA54_Eugene_fibonacci.jar"]