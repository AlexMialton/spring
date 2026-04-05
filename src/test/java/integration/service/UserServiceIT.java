package integration.service;

import annotation.IT;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import spring.database.repository.pool.ConnectionPool;
import spring.service.UserService;

@IT
@RequiredArgsConstructor
public class UserServiceIT {

    private final UserService userService;

//    @MockitoBean(name = "ConnectionPool")
//    private ConnectionPool pool;           now 2 contexts are being created, so we move this block of code to the TestApplicationRunner


    @Test
    void findById(){

    }
}
