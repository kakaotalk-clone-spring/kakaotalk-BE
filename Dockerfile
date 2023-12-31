FROM openjdk:17-alpine

WORKDIR /usr/src/app

ARG JAR_FILE=/build/libs/*.jar

COPY ${JAR_FILE} app.jar

ENTRYPOINT [                                               \
   "java",                                                 \
   "-jar",                                                 \
   "-Dspring.profiles.active=local",                       \
   "app.jar"                          \
]
