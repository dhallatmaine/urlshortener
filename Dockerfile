FROM java:8
VOLUME /tmp
ADD target/url-shortener-dhall-0.1.0.jar target/app.jar
RUN bash -c 'touch target/app.jar'
ENTRYPOINT ["java","-jar","-Dspring.profiles.active=local","target/app.jar"]