package com.example.aftas.dto.Response;

import com.example.aftas.entity.Competition;
import com.example.aftas.entity.Fish;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class HuntingDtoResponse {
    private Long id;
    private Integer numberOfFish;
    private Competition competition;
    private Fish fish;
}
