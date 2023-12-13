package com.example.aftas.dto.Request;

import com.example.aftas.entity.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class HuntingDtoRequest {

    private Integer numberOfFish;
    private String competition_id;
    private Long fish_id;
    public Hunting toModel(){

        Competition competition1= Competition.builder().code(competition_id).build();
        Fish fish1= Fish.builder().id(fish_id).build();

        return Hunting.
                builder()
                .competition(competition1)
                .fish(fish1)
                .build();
    }
}
