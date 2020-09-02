package com.accounts.deduplicate.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

public class UserDto {
    private Long id;
    private String userName;
    private String firstName;
    private String lastName;
    private String password;

    public UserDto(Long id, String userName, String firstName, String lastName, String password) {
        this.id = id;
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPassword() {
        return password;
    }
}
