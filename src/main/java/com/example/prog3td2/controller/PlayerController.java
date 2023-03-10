package com.example.prog3td2.controller;

import com.example.prog3td2.controller.mapper.PlayerRestMapper;
import com.example.prog3td2.controller.response.PlayerResponse;
import com.example.prog3td2.model.Player;
import com.example.prog3td2.service.PlayerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class PlayerController {
    private final PlayerService service;

    private final PlayerRestMapper mapper;

    @GetMapping("/players")
    public List<PlayerResponse> getAllPlayers() {
        return service.getAllPlayers().stream()
                .map(mapper::toRest)
                .toList();
    }
}
