FROM openjdk:11-jre
WORKDIR /usr/share/app
COPY ./target/basic-rest-api-2.0.jar myapp.jar
EXPOSE 9000
ENTRYPOINT [ "java", "-jar", "myapp.jar" ]