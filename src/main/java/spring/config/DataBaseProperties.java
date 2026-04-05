package spring.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

@ConfigurationProperties(prefix = "db") //not necessary, but in case we want to restrict the used properties
public record DataBaseProperties(String username,
                                 String passwort,
                                 String driver,
                                 String url,
                                 String hosts,
                                 PoolProperties pool,
                                 List<PoolProperties> pools,
                                 Map<String, Object> properties) {

    public static record PoolProperties(Integer size,
                                        Integer timeout){

    }
}
