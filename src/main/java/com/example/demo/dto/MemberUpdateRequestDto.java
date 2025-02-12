package com.example.demo.dto;

import lombok.Getter;

@Getter
public class MemberUpdateRequestDto {
    private final String username;
    private final String email;

    public MemberUpdateRequestDto(String username, String email) {
        this.username = username;
        this.email = email;
    }
}
