package com.example.galaxysafetymanger.controller;

import com.example.galaxysafetymanger.model.OperationRecord;
import com.example.galaxysafetymanger.model.SprinklerSystem;
import com.example.galaxysafetymanger.repository.OperationRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class OperationRecordRestController {

    @Autowired
    OperationRecordRepository operationRecordRepository;

    @GetMapping("/allOr")
    public ResponseEntity<List<OperationRecord>> getOr() {
        List<OperationRecord> or = operationRecordRepository.findAll();
        return new ResponseEntity(or, HttpStatus.OK);
    }
    @PostMapping("/createOR")
    public ResponseEntity<OperationRecord> createOR(@RequestBody OperationRecord newOR) {
        System.out.println("Received OR: " + newOR);
        OperationRecord savedOR = operationRecordRepository.save(newOR);
        return new ResponseEntity<>(savedOR, HttpStatus.CREATED);
    }
}
