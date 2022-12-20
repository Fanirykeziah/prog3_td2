package com.example.prog3td2.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.ManyToAny;

import java.util.List;

@Entity
@Table(name = "team")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_team;

    private String name;

    @ManyToMany
    @JoinColumn(name = "id_sponsor")
    private List<Sponsor> sponsor;

    @OneToMany
    @JoinColumn(name = "id_player")
    private List<Player> players;
}
