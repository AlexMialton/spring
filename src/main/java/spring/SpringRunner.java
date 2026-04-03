package spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.config.ApplicationConfiguration;
import spring.database.repository.UserRepository;

public class SpringRunner {

    public static void main(String[] args) {
//        var userDto = new UserDto();
//        var userRepository = new UserRepository();
//        var userMapper = new UserMapper(userDto);
//        var userService = new UserService(userMapper, userRepository);
        var context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);  //for java based bean definition
//      var context = new ClassPathXmlApplicationContext("application.xml");                    //for xml -and annotation based bean definition
        var userRepository = context.getBean(UserRepository.class);      // UserRepository.class isn't necessary, but without it an Object is returned
                                                                          // Instead of repo1 we can use "r1" or "r2"
//      var userService = context.getBean("userService", UserService.class);
        System.out.println(userRepository); // set a debug breakpoint -> right mouse click -> evaluate expression
                                         // -> type "context.getBean(UserDto.class)" -> press evaluate -> every time new id because of scope prototype

        context.close(); // for init/destroy methods to work, we could also set the context in the try-with-resources clous [xml]
    }
}
