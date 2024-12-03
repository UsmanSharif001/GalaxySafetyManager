package com.example.galaxysafetymanger.controller;

import com.example.galaxysafetymanger.model.OperationRecord;
import com.example.galaxysafetymanger.repository.OperationRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
public class OperationRecordRestController {

    @Autowired
    OperationRecordRepository operationRecordRepository;

    @PostMapping("/createOR")
    public ResponseEntity<OperationRecord> createOR(@RequestBody OperationRecord newOR) {
        System.out.println("Received OR: " + newOR);
        OperationRecord savedOR = operationRecordRepository.save(newOR);
        return new ResponseEntity<>(savedOR, HttpStatus.CREATED);
    }
}
