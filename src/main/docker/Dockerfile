FROM anapsix:8_server-jre
VOLUME /tmp
ADD content-service-1.0.0.jar /app.jar
RUN bash -c 'touch /app.jar'
EXPOSE 8000
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
