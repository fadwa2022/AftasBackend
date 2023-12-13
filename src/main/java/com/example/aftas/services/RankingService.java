package com.example.aftas.services;

import com.example.aftas.entity.Ranking;

import java.util.List;

public interface RankingService {
    public List<Ranking> calculeScors(String compititionCode);
    public List<Ranking> calculeRanking (String compititionCode);
}
