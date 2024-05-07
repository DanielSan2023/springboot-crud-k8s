FROM openjdk:8
EXPOSE 8080
ADD target/springboot-crud-k8s-0.0.1-SNAPSHOT.jar springboot-crud-k8s.jar
ENTRYPOINT ["java","jar","/springboot-crud-k8s.jar"]