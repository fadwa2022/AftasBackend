package com.example.aftas.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Level {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long code;
    private String description;
    private Integer points;

    @OneToMany( cascade = CascadeType.ALL)
    private List<Fish> fish;

}
