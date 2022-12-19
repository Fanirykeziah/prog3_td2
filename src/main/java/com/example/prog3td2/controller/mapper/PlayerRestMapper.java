package com.example.prog3td2.controller.mapper;

import com.example.prog3td2.controller.response.PlayerResponse;
import com.example.prog3td2.model.Player;
import org.springframework.stereotype.Component;

@Component
public class PlayerRestMapper {
    public PlayerResponse toRest(Player domain) {
        return PlayerResponse.builder()
                .id(domain.getId_player())
                .name(domain.getName())
                .build();
    }
}
