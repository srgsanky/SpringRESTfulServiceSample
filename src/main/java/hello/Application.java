package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class Application extends SpringBootServletInitializer {

    /* main method is required to execute this web application with deploying to an external instance. Spring has the
    support for embedding the Tomcat servlet container as the HTTP runtime. */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
