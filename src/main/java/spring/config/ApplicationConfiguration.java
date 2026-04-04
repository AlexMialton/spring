package spring.config;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.*;
import spring.database.repository.pool.ConnectionPool;


@Configuration
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