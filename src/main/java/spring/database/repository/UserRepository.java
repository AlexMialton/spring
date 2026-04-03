package spring.database.repository;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.ToString;
import spring.bpp.InjectBean;
import spring.database.repository.pool.ConnectionPool;


@ToString
public class UserRepository {
    //@InjectBean // the same as @Autowire
    private ConnectionPool connectionPool;


}
