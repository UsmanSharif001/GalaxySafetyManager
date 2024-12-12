package com.example.galaxysafetymanger.controller;

import com.example.galaxysafetymanger.model.SprinklerSystem;
import com.example.galaxysafetymanger.repository.SprinklerSystemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
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

    @PutMapping("/ssor/{id}")
    public ResponseEntity<SprinklerSystem> updateSSOR(@PathVariable int id, @RequestBody SprinklerSystem ssor) {
        System.out.println("Incoming ID: " + id);
        System.out.println("Incoming SSOR: " + ssor);
        Optional<SprinklerSystem> ssorFound = sprinklerSystemRepository.findById(id);
        if (ssorFound.isPresent()) {
            ssor.setSsorid(id);
            sprinklerSystemRepository.save(ssor);
            return new ResponseEntity<>(ssor, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/ssor/remove/{id}")
    public ResponseEntity<SprinklerSystem> deleteSSOR(@PathVariable int id){
        if (sprinklerSystemRepository.existsById(id)) {
            sprinklerSystemRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }


}
