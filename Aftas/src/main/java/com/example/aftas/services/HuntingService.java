package com.example.aftas.services;

import com.example.aftas.dto.Response.HuntingDtoResponse;
import com.example.aftas.entity.Competition;
import com.example.aftas.entity.Hunting;
import com.example.aftas.entity.Member;

import java.util.List;

public interface HuntingService {
    public Hunting addHunting(Hunting hunting);
    public List<HuntingDtoResponse> getAllHunting();
    public List<Hunting> getHuntingByCompetition(Competition competition);
    public Hunting getHuntingOfMember(Competition competition,Member member);
}
