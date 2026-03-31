package spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.database.repository.UserRepository;
import spring.dto.UserDto;
import spring.ioc.Container;
import spring.mapper.UserMapper;
import spring.service.UserService;

public class SpringRunner {

    public static void main(String[] args) {
//        var userDto = new UserDto();
//        var userRepository = new UserRepository();
//        var userMapper = new UserMapper(userDto);
//        var userService = new UserService(userMapper, userRepository);

        var context = new ClassPathXmlApplicationContext( "application.xml");
//        var userRepository = context.getBean("repo2", UserRepository.class);      // UserRepository.class isn't necessary, but without it an Object is returned
                                                                                    // Instead of repo1 we can use "r1" or "r2"
        var userService = context.getBean("userService", UserService.class);
        System.out.println(userService); // set a debug breakpoint -> right mouse click -> evaluate expression
                                         // -> type "context.getBean(UserDto.class)" -> press evaluate -> every time new id because of scope prototype


    }
}
