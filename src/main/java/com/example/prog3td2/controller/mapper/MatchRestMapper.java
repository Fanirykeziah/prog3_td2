package com.example.prog3td2.controller.mapper;

import com.example.prog3td2.controller.response.MatchResponse;
import com.example.prog3td2.model.Match;
import org.springframework.stereotype.Component;

@Component
public class MatchRestMapper {
    public MatchResponse toRest(Match domain) {
        return MatchResponse.builder()
                .team1(domain.getTeam1())
                .team2(domain.getTeam2())
                .DateTime(domain.getDateTime())
                .build();
    }
}
