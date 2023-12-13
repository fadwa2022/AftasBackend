package com.example.aftas.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder

public class Fish {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String name;
    private Double averageWeight;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "leveloffish")
    private Level level;
    @OneToMany
    private List<Hunting> hunting;
}
