package spring.service;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import spring.database.repository.CompanyRepository;
import spring.dto.CompanyReadDto;
import spring.listener.AccessType;
import spring.listener.Event;

import javax.swing.text.html.Option;
import java.util.Optional;

@Service
public class CompanyService {
    private CompanyRepository companyRepository;
    private final ApplicationEventPublisher applicationEventPublisher;

    public CompanyService(CompanyRepository companyRepository, ApplicationEventPublisher applicationEventPublisher) {
        this.companyRepository = companyRepository;
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public Optional<CompanyReadDto> findById(Integer id){
        return companyRepository.findById(id).map(entity -> {
            applicationEventPublisher.publishEvent(new Event(entity, AccessType.READ));
            return new CompanyReadDto(entity.id());
        });
    }
}
