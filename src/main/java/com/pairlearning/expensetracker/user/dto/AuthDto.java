package com.pairlearning.expensetracker.user.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class AuthDto {

    private String email;

    private String password;
}
