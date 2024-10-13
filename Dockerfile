FROM openjdk:21
EXPOSE 8081
ADD target/scm.jar scm.jar
ENTRYPOINT ["java","-jar","/scm.jar"]