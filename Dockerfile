FROM openjdk:17-jdk-slim
LABEL authors="ThalesNishida"

WORKDIR /app

COPY .mvn .mvn
COPY mvnw pom.xml ./

RUN chmod +x ./mvnw

RUN ./mvnw dependency:resolve

COPY src src

EXPOSE 8080

CMD ["./mvnw", "spring-boot:run"]