FROM eclipse-temurin:17
COPY target/jenkins.jar jenkinsHub.jar
CMD ["java", "-jar", "jenkinsHub.jar"]
