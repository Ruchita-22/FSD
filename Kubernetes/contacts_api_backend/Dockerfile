FROM openjdk:11-jre
WORKDIR /usr/share/app
COPY ./target/contacts_api_v3-0.0.1-SNAPSHOT.jar myapp.jar
ENTRYPOINT [ "java","-jar","myapp.jar" ]
