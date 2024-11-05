# use the jdk image
FROM openjdk:17
# set the working dir inside of container
WORKDIR /app
# copy compliked java application jar file in the container
COPY ./target/aws-ci-cd-0.0.1-SNAPSHOT.jar /app/book-service.jar
EXPOSE 8080
# command to run the application
CMD [ "java", "-jar", "book-service.jar"]