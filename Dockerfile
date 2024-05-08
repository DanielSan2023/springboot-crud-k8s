FROM openjdk:21
EXPOSE 8080
ARG JAR_FILE=target/*.jar
COPY ./target/springboot-crud-k8s.jar springboot-crud-k8s.jar
ENTRYPOINT ["java","-jar","/springboot-crud-k8s.jar"]