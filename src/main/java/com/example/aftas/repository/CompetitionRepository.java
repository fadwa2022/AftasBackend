package com.example.aftas.repository;

import com.example.aftas.entity.Competition;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CompetitionRepository extends JpaRepository<Competition,Long> {

    Optional<Competition> findByCode(String code);
}
