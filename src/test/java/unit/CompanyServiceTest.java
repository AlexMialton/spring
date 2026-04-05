package unit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.context.ApplicationEventPublisher;
import spring.database.entity.Company;
import spring.database.repository.CompanyRepository;
import spring.dto.CompanyReadDto;
import spring.listener.Event;
import spring.service.CompanyService;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class CompanyServiceTest {
    private static final Integer COMPANY_ID = 1;

   @Mock
   private CompanyRepository companyRepository;
   @Mock
   private ApplicationEventPublisher eventPublisher;
   @InjectMocks // Mocks are going to be injected in the companyService
   private CompanyService companyService;

   @Test
   void findById(){
       Mockito.doReturn(Optional.of(new Company(COMPANY_ID)))   // it won't go to the db and search for the company, it will return the empty Company object as expected result to compare with
               .when(companyRepository).findById(COMPANY_ID);

       var actualResult = companyService.findById((COMPANY_ID));

       assertTrue(actualResult.isPresent());

       var expectedResult = new CompanyReadDto(COMPANY_ID);

       actualResult.ifPresent(actual -> assertEquals(expectedResult, actual));

       verify(eventPublisher).publishEvent(any(Event.class));

   }


}
