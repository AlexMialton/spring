package spring.service;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Service;
import spring.database.repository.UserRepository;
import spring.mapper.UserMapper;

@ToString
@RequiredArgsConstructor
@NoArgsConstructor(force = true)
@Setter //to make bean creation with [setter] possible
public class UserService {

    private final UserMapper userMapper;
    private final UserRepository userRepository;
}
