package com.example.prog3td2.controller.response;

import com.example.prog3td2.model.Team;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class MatchResponse {

    private Team team1;

    private Team team2;

    private LocalDateTime DateTime;
}
