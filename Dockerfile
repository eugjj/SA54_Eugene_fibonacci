FROM azul/zulu-openjdk-alpine:17.0.2-jre
ADD target/FibonacciApp.jar FibonacciApp.jar
ENTRYPOINT ["java", "-jar", "FibonacciApp.jar"]