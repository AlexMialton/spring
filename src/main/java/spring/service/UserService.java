package spring.service;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Service;
import spring.database.repository.UserRepository;
import spring.mapper.UserMapper;

@Service  //[new xml]
@ToString
public class UserService {

    private UserMapper userMapper;
    private UserRepository userRepository;
}
