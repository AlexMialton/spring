package spring.database.repository;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.annotation.Resource;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.stereotype.Repository;
import spring.bpp.InjectBean;
import spring.database.repository.pool.ConnectionPool;

import java.util.List;

@Repository
@ToString
public class UserRepository {
    @Autowired

    private ConnectionPool connectionPool1;
    @Value("${db.poolsize}")
    private Integer poolSize;

    @Autowired
    private List<ConnectionPool> connectionPools;

    public UserRepository(ConnectionPool connectionPool1){
        this.connectionPool1 = connectionPool1;
//        this.poolSize = poolSize;
//        this.connectionPools = connectionPools;
    }
}
