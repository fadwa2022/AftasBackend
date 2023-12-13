package com.example.aftas.services.Impl;

import com.example.aftas.dto.Response.HuntingDtoResponse;
import com.example.aftas.entity.Competition;
import com.example.aftas.entity.Hunting;
import com.example.aftas.entity.Member;
import com.example.aftas.mapper.Mapper;
import com.example.aftas.repository.HuntingRepository;
import com.example.aftas.services.HuntingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class HuntingSercviceImpl implements HuntingService {
    private HuntingRepository huntingRepository;
    private Mapper<Hunting, HuntingDtoResponse> mapper;
    @Autowired
    public HuntingSercviceImpl (
            HuntingRepository huntingRepository,
            Mapper<Hunting, HuntingDtoResponse> mapper
    ){
        this.huntingRepository=huntingRepository;
        this.mapper=mapper;
    }
    @Override
    public Hunting addHunting(Hunting hunting) {
        return null;
    }

    @Override
    public List<HuntingDtoResponse> getAllHunting() {
        return huntingRepository.findAll()
                .stream()
                .map(mapper::mapToDto)
                .collect(Collectors.toList());
    }

    @Override
    public List<Hunting> getHuntingByCompetition(Competition competition) {
        return null;
    }

    @Override
    public Hunting getHuntingOfMember(Competition competition, Member member) {
        return null;
    }
}
