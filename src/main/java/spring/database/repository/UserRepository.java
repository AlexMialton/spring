package spring.database.repository;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.annotation.Resource;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.annotation.Autowire;
import spring.bpp.InjectBean;
import spring.database.repository.pool.ConnectionPool;

import java.util.List;


@ToString
public class UserRepository {
    @Autowired                              // (required=true): zu injectende Odjekt muss in dem Map vorhanden sein bevor Injection und wir kriegen einen Fehler
                                            // bei (required=true) ist es nicht voraugesetzt, ein Objekt im Map zu haben, es gibt keinen Fehler
//  @Qualifier("ConnectionPool1")           // Bei @Autowire können wir keinen Bean identifizieren falls wir mehrere haben, also wir brauche die Annotation
    private ConnectionPool connectionPool1; // oder wir können einfach den Nahmen hier eingeben, dann brauchen wir kein @Qualifier("ConnectionPool1")
//  @Resource(name="ConnectionPool1")        Oder wir können @Resource anwenden, wird aber selten benutzt

    @Value("${db.poolsize}")
    private Integer poolSize;

    @Autowired
    private List<ConnectionPool> connectionPools; // Repository hat dann die beiden connectioPool1 und -2

}
