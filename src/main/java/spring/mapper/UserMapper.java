package spring.mapper;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import spring.dto.UserDto;

@Component  //[new xml]
@ToString
public class UserMapper {
    @Autowired
    private UserDto userDto;

}
