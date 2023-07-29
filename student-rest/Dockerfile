# Use Java 11
FROM openjdk:11-jdk

#COPY JAR FILE
COPY target/student-rest-0.0.1-SNAPSHOT.jar student-rest-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","/student-rest-0.0.1-SNAPSHOT.jar"]
