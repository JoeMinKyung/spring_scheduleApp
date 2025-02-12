package com.example.demo.dto;

import lombok.Getter;

@Getter
public class SignUpResponseDto {

    private final long id;

    private final String username;

    public SignUpResponseDto(long id, String username) {
        this.id = id;
        this.username = username;
    }
}
