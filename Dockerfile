FROM public.ecr.aws/s6z9r4j9/openjdk:8-jdk-alpine
COPY target/deployment_test-0.0.1-SNAPSHOT.jar deployment_test.jar
ENTRYPOINT ["java","-jar","/deployment_test.jar"]