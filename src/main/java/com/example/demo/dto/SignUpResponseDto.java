package com.example.demo.dto;

import lombok.Getter;

@Getter
public class SignUpResponseDto {

    private final long id;

    private final String username;

    private final String email;

    public SignUpResponseDto(long id, String username, String email) {
        this.id = id;
        this.username = username;
        this.email = email;
    }
}
