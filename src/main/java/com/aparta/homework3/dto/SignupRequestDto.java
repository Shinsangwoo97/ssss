package com.aparta.homework3.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SignupRequestDto {
    private String username;
    private String password;
    private String repassword;
    private String email;
//    private boolean user = false;
}
