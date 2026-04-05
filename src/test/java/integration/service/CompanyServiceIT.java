package integration.service;

import annotation.IT;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestConstructor;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import spring.config.DataBaseProperties;
import spring.dto.CompanyReadDto;
import spring.service.CompanyService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@IT // we put all annotation into one annotation, so we can use it for every test without having a lot of code
@RequiredArgsConstructor
@TestConstructor(autowireMode = TestConstructor.AutowireMode.ALL) // dependency injection over constructor. Is better than to put @Autowired over fields
                                                                  // or add "spring.test.constructor.autowire.mode=all" property
public class CompanyServiceIT {
    private static final Integer COMPANY_ID = 1;

    private final CompanyService companyService; //is important to set on final for @RequiredArgsConstructor to work
    private final DataBaseProperties dataBaseProperties;

    @Test
    void findById(){
        var actualResult = companyService.findById((COMPANY_ID));

        assertTrue(actualResult.isPresent());

        var expectedResult = new CompanyReadDto(COMPANY_ID);

        actualResult.ifPresent(actual -> assertEquals(expectedResult, actual));

    }
}
