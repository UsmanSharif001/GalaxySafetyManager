package com.example.galaxysafetymanger.controller;

import com.example.galaxysafetymanger.model.OperationRecord;
import com.example.galaxysafetymanger.model.SprinklerSystem;
import com.example.galaxysafetymanger.repository.OperationRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @GetMapping("/selectedOperationRecord/{id}")
    public ResponseEntity<OperationRecord> getSelectedOperationRecord(@PathVariable int id) {
        Optional<OperationRecord> opRecord = operationRecordRepository.findById(id);
        return opRecord.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).body(null));
    }


    @PostMapping("/createOR")
    public ResponseEntity<OperationRecord> createOR(@RequestBody OperationRecord newOR) {
        System.out.println("Received OR: " + newOR);
        OperationRecord savedOR = operationRecordRepository.save(newOR);
        return new ResponseEntity<>(savedOR, HttpStatus.CREATED);
    }

    @PutMapping("/updateOperationRecord/{id}")
    public ResponseEntity<OperationRecord> updateOperationRecord(@PathVariable int id, @RequestBody OperationRecord updatedOR) {
        Optional<OperationRecord> existingRecord = operationRecordRepository.findById(id);
        if (existingRecord.isPresent()) {
            updatedOR.setOrId(id);
            OperationRecord savedRecord = operationRecordRepository.save(updatedOR);
            return new ResponseEntity<>(savedRecord, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


    @DeleteMapping("/deleteOperationRecord/{id}")
    public ResponseEntity<Void> deleteOperationRecord(@PathVariable int id) {
        if (operationRecordRepository.existsById(id)) {
            operationRecordRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}


