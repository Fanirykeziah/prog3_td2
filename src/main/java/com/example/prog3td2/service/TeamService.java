package com.example.prog3td2.service;

import com.example.prog3td2.model.Team;
import com.example.prog3td2.repository.TeamRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TeamService {
    private TeamRepository repository;

    public List<Team> getAllTeam(){
        return repository.findAll();
    }
}
