#build
FROM maven:3.9.9 AS build
COPY  . .
RUN mvn clean package -Dmaven.skip.test=true

#run

FROM amazoncorretto:23
COPY --from=build target/demo-0.0.1-SNAPSHOT.jar demo.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","demo.jar"]
