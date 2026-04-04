package spring.config;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.*;
import spring.database.repository.UserRepository;
import spring.database.repository.pool.ConnectionPool;
import web.WebConfiguration;

//Add the bean in application.xml so that other classes know about it

@Import(WebConfiguration.class)  //you can connect other configuration java classes. They will be just copy pasted into tjis one
//@ImportResource("classpath:application.xml")
@Configuration
@ComponentScan("spring") //instead of <context:component-scan base-package="spring" />
@PropertySource("classpath:application.properties") //so we can now remove the <context:property-placeholder location="classpath:application.properties"/> from xml
public class ApplicationConfiguration {

    @Bean
    @Scope(BeanDefinition.SCOPE_SINGLETON)
    public ConnectionPool connectionPool() {
        return new ConnectionPool("aleksandramialton", "root", 20, "url");
    }

//    @Bean
//    @Profile("prod") //@Profile("!prod&web") - not prod and web
//    public ConnectionPool connectionPool1() { //the method name of the bean should be the same as the variable name or use @Qualifier/@Autowired if they are not identical
//        return new ConnectionPool("mysql", "123", 200, "---");
//    }

//    @Bean
//    public UserRepository userRepository(){
//        return new UserRepository(connectionPool1());
//    }
}