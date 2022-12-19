package com.example.prog3td2.controller;

import com.example.prog3td2.controller.mapper.TeamRestMapper;
import com.example.prog3td2.controller.response.TeamResponse;
import com.example.prog3td2.service.TeamService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class TeamController {

    private final TeamService service;

    private final TeamRestMapper mapper;

    @GetMapping("/teams")
    public List<TeamResponse> getAllTeam() {
        return service.getAllTeam().stream()
                .map(mapper::toRest)
                .toList();
    }
}
