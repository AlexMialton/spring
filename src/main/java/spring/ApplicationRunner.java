package spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

//Spring-boot can dynamically enable/disable of module-autoconfigurations

public class ApplicationRunner { // This class has to be on the top in the folder hierarchy, so that it can scan all the packages beneath it

    public static void main(String[] args) {
        SpringApplication.run(ApplicationRunner.class, args);
    }
}