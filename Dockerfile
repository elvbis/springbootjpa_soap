FROM elvbisdocker/serverapi:v1
MAINTAINER pe.com
EXPOSE 8080
COPY ./target/springJPA-0.0.1-SNAPSHOT.jar message-server-1.0.0.jar
ENTRYPOINT ["java","-jar","/message-server-1.0.0.jar"]