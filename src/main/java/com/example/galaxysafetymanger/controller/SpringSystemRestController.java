package com.example.galaxysafetymanger.controller;

import com.example.galaxysafetymanger.model.SprinklerSystem;
import com.example.galaxysafetymanger.repository.SprinklerSystemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
public class SpringSystemRestController {

    @Autowired
    SprinklerSystemRepository sprinklerSystemRepository;


    @GetMapping("/ssor")
    public ResponseEntity<List<SprinklerSystem>> getssor() {
        List<SprinklerSystem> ssor = sprinklerSystemRepository.findAll();
        return ResponseEntity.ok(ssor);
    }

    @PostMapping("/ssor")
    @ResponseStatus(HttpStatus.CREATED)
    public SprinklerSystem postSSOR (@RequestBody SprinklerSystem ssor) {
        System.out.println("gotten ssor" + ssor);
        SprinklerSystem savedssor = sprinklerSystemRepository.save(ssor);
        System.out.println("saved ssor using JPA");
        return savedssor;
    }


}
