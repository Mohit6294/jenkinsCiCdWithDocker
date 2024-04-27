FROM openjdk:21
WORKDIR /app
COPY ./target/jenkinsCiCdDocker.jar /app
EXPOSE 2020
CMD ["java","-jar","jenkinsCiCdDocker.jar"]