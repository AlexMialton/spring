package spring.mapper;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import spring.dto.UserDto;

@RequiredArgsConstructor
@NoArgsConstructor(force = true)
@Setter
@ToString
public class UserMapper {
    private final UserDto userDto;

}
