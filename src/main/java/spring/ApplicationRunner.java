package spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.core.SpringProperties;
import spring.config.DataBaseProperties;

@SpringBootApplication
@ConfigurationPropertiesScan // to use the DataBaseProperties class with mapped yml properties

//Spring-boot can dynamically enable/disable of module-autoconfigurations

public class ApplicationRunner { // This class has to be on the top in the folder hierarchy, so that it can scan all the packages beneath it

    public static void main(String[] args) {
        var context = SpringApplication.run(ApplicationRunner.class, args);
        System.out.println(SpringProperties.getProperty("test.msg"));
        System.out.println(context.getBean("ConnectionPool"));
        System.out.println(context.getBean(DataBaseProperties.class));
    }
}