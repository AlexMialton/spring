package annotation;

import integration.TestApplicationRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import spring.ApplicationRunner;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//@ExtendWith(SpringExtension.class)
//@ContextConfiguration(classes = ApplicationRunner.class)    -those two annotations are included in @SpringBootTest
@SpringBootTest(classes = {TestApplicationRunner.class, ApplicationRunner.class})
@ActiveProfiles("test") // so that application-test.yml properties will be used
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface IT {
}
