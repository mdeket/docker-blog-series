FROM zenika/alpine-maven:3-jdk8
COPY . /var/www/app
WORKDIR /var/www/app
RUN mvn package -DskipTests
EXPOSE 8080
ENTRYPOINT ["java","-jar","target/vega-0.0.1-SNAPSHOT.jar"]
