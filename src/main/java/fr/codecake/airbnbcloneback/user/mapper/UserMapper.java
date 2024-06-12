package fr.codecake.airbnbcloneback.user.mapper;

import fr.codecake.airbnbcloneback.user.application.dto.ReadUserDTO;
import fr.codecake.airbnbcloneback.user.domain.Authority;
import fr.codecake.airbnbcloneback.user.domain.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    ReadUserDTO readUserDTOToUser(User user);

    default String mapAuthoritiesToString(Authority authority) {
        return authority.getName();
    }

}
