package com.example.aftas.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Generated;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder

public class Hunting {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

   private Integer numberOfFish;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "memberofhunting")
    private Member membre;

    @ManyToOne
    @JoinColumn(name = "competitionofhunting")
    private Competition competition;

    @OneToOne
    @JoinColumn(name = "fishofhunting")
    private Fish fish;
}
