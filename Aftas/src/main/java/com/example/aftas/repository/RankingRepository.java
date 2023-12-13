package com.example.aftas.repository;

import com.example.aftas.SuppEntity.CompetitionMembres;
import com.example.aftas.entity.Competition;
import com.example.aftas.entity.Ranking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RankingRepository extends JpaRepository<Ranking,Long> {
    List<Ranking> findByCompetition(Competition competition);

}
