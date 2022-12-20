package com.example.prog3td2.controller.mapper;

import com.example.prog3td2.controller.response.TeamResponse;
import com.example.prog3td2.model.Team;
import org.springframework.stereotype.Component;

@Component
public class TeamRestMapper {
    public TeamResponse toRest(Team domain) {
        return TeamResponse.builder()
                .players(domain.getPlayers())
                .sponsors(domain.getSponsor())
                .build();
    }
}
