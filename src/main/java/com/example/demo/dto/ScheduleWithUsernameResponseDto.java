package com.example.demo.dto;

import lombok.Getter;

@Getter
public class ScheduleWithUsernameResponseDto {

    private final String title;

    private final String contents;

    private final String username;

    public ScheduleWithUsernameResponseDto(String title, String contents, String username) {
        this.title = title;
        this.contents = contents;
        this.username = username;
    }
}
