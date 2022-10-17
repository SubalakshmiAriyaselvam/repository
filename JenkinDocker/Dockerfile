FROM openjdk:8
EXPOSE 8088
ADD target/JenkinDocker-0.0.1-SNAPSHOT.war JenkinDocker-0.0.1-SNAPSHOT.war
ENTRYPOINT [ "java","-jar","/JenkinDocker-0.0.1-SNAPSHOT.war" ]