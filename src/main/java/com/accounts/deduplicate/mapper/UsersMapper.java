package com.accounts.deduplicate.mapper;

import com.accounts.deduplicate.domain.User;
import com.accounts.deduplicate.domain.UserDto;
import com.accounts.deduplicate.domain.deduplicated.DeduplicatedUser;
import org.springframework.stereotype.Component;

@Component
public class UsersMapper {

    public User mapToUser(UserDto userDto) {
        return new User(userDto.getId(), userDto.getUserName(), userDto.getFirstName(), userDto.getLastName(),
                userDto.getPassword());
    }

    public UserDto mapToUserDto(User user) {
        return new UserDto(user.getId(), user.getUserName(), user.getFirstName(), user.getLastName(), user.getPassword());
    }

    public DeduplicatedUser mapToDeduplicatedUser(User user) {
        return new DeduplicatedUser(user.getId(), user.getUserName(), user.getFirstName(), user.getLastName(), user.getPassword());
    }

}
