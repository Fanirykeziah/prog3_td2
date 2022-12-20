package com.example.prog3td2.controller.response;

import com.example.prog3td2.model.Player;
import com.example.prog3td2.model.Sponsor;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class TeamResponse {
    private String name ;

    private List<Player> players;

    private List<Sponsor> sponsors;
}
