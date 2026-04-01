package spring.database.repository;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import lombok.Setter;
import lombok.ToString;

import java.util.List;
import java.util.Map;

@ToString
@AllArgsConstructor
@NoArgsConstructor(force = true) //to make bean creation with [setter] possible
@Setter                          //to make bean creation with [setter] possible
public class UserRepository {
    private String userName;
    private int poolSize;
    private List<Object> args;
    private Map<String, Object> properties;

// Needed for Bean Definition creation

    @PostConstruct // Needed for Bean Definition creation with [annotation]
    public void init(){  // Needed for Bean Definition creation with [xml]
        System.out.println("Init UserRepository");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("Destroy UserRepository");
    }
}
