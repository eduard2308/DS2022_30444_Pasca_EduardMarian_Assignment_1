package ro.tuc.ds2020.dtos.builders;

import ro.tuc.ds2020.dtos.UserDTO;
import ro.tuc.ds2020.entities.User;

public class UserBuilder {
    private UserBuilder() {
    }

    public static UserDTO toUserDTO(User user) {
        return new UserDTO(user.getId(), user.getEmail(), user.getPassword(), user.getRole());
    }


    public static User toEntity(UserDTO userDTO) {
        return new User(userDTO.getEmail(),
                userDTO.getPassword(),
                userDTO.getRole());
    }
}
