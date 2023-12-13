package com.example.aftas.controller.Hunting;

import com.example.aftas.dto.Response.HuntingDtoResponse;
import com.example.aftas.entity.Hunting;
import com.example.aftas.services.HuntingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/hunting")

public class HuntingController {
    private HuntingService huntingService;
    public  HuntingController ( HuntingService huntingService){
        this.huntingService=huntingService;
    }
    @GetMapping
    public List<HuntingDtoResponse> getAll(){
        return this.huntingService.getAllHunting();
    }
}
