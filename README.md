# Sample RESTful Web Service using Spring.

This application is based on the tutorial [Building a RESTful web service](https://spring.io/guides/gs/rest-service/).

## Deployment
You can run the application by deploying to a Tomcat instance or using Spring Boot run.

### Run on external Tomcat instance
Just deploy the application to the Tomcat instance using your IDE or by copying the war file to ``webapps`` directory of your Tomcat installation.

### Run using Spring Boot without an external Tomcat instance
```bash
./gradlew bootRun
```

You should be able to access the resources at [http://localhost:8080/greeting](http://localhost:8080/greeting)

## Notes
If you only want to deploy the application to an external Tomcat instance, you don't need the ``main`` method. But you still need a class annotated with ``@SpringBootApplication`` and must extend ``SpringBootServletInitializer``.  You can go with a minimal class of

 ```java
 @SpringBootApplication
 public class Application extends SpringBootServletInitializer {
 }
 ```

If you only want to run your application using the Spring Boot run, you need a ``main`` method. The minimal class in this case will be

 ```java
 @SpringBootApplication
 public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
 }
 ```
 