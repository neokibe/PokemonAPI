FROM amazoncorretto:1.8
# copy application WAR (with libraries inside)
COPY target/spring-boot-*.war /app.war
# specify default command
CMD ["/usr/bin/java", "-jar", "-Dspring.profiles.active=test", "/app.war"]