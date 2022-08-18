package com.ugraya.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private String username;
    private String password;
    private String email;
    private String enabled;
    private String accountNonExpired;
    private String credentialsNonExpired;
    private String accountNonLocked;
}