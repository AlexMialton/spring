package spring.service;

import lombok.RequiredArgsConstructor;
import lombok.ToString;
import spring.database.repository.UserRepository;
import spring.mapper.UserMapper;

@RequiredArgsConstructor
@ToString
public class UserService {

    private final UserMapper userMapper;
    private final UserRepository userRepository;
}
