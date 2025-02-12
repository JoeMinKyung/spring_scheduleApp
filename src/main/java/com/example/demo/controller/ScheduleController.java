package com.example.demo.controller;

import com.example.demo.dto.ScheduleRequestDto;
import com.example.demo.dto.ScheduleResponseDto;
import com.example.demo.dto.ScheduleWithUsernameResponseDto;
import com.example.demo.entity.Schedule;
import com.example.demo.service.ScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/schedules")
@RequiredArgsConstructor
public class ScheduleController {

    private final ScheduleService scheduleService;

    @PostMapping
    public ResponseEntity<ScheduleResponseDto> save(@RequestBody ScheduleRequestDto requestDto) {

        ScheduleResponseDto scheduleResponseDto =
                scheduleService.save(
                        requestDto.getTitle(),
                        requestDto.getContents(),
                        requestDto.getUsername()
                );

        return new ResponseEntity<>(scheduleResponseDto, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<ScheduleResponseDto>> findAll() {

        List<ScheduleResponseDto> scheduleResponseDtoList = scheduleService.findAll();

        return new ResponseEntity<>(scheduleResponseDtoList, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ScheduleWithUsernameResponseDto> findById(@PathVariable Long id) {
        ScheduleWithUsernameResponseDto scheduleWithUsernameResponseDto = scheduleService.findById(id);
        return new ResponseEntity<>(scheduleWithUsernameResponseDto, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ScheduleResponseDto update(@PathVariable Long id, @RequestBody ScheduleRequestDto dto) {
        return scheduleService.update(id, dto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {

        scheduleService.delete(id);

        return new ResponseEntity<>(HttpStatus.OK);
    }
}
