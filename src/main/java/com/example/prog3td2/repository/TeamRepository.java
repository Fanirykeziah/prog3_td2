package com.example.prog3td2.repository;

import com.example.prog3td2.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team , Long> {
}
