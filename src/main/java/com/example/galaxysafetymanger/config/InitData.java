package com.example.galaxysafetymanger.config;

import com.example.galaxysafetymanger.model.OperationRecord;
import com.example.galaxysafetymanger.model.SprinklerSystem;
import com.example.galaxysafetymanger.repository.OperationRecordRepository;
import com.example.galaxysafetymanger.repository.SprinklerSystemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class InitData implements CommandLineRunner {

    @Autowired
    SprinklerSystemRepository sprinklerSystemRepository;

    @Autowired
    OperationRecordRepository operationRecordRepository;

    @Override
    public void run(String... args) throws Exception {

        loadall();
    }

    private void loadall() {

        SprinklerSystem sprinkler1 = new SprinklerSystem();
        sprinkler1.setDate(LocalDate.of(2024, 12, 1));
        sprinkler1.setPressureOverDryValve(75);
        sprinkler1.setPressureOverWetValve(80);
        sprinkler1.setPressureUnderValves(60);
        sprinkler1.setPressureOnWaterPlug(70);
        sprinkler1.setAlarmToFireDepartmentWorking(true);
        sprinkler1.setComments("All systems are operational.");
        sprinkler1.setSignature("ERL");
        sprinklerSystemRepository.save(sprinkler1);

        SprinklerSystem sprinkler2 = new SprinklerSystem();
        sprinkler2.setDate(LocalDate.of(2024, 12, 2));
        sprinkler2.setPressureOverDryValve(68);
        sprinkler2.setPressureOverWetValve(72);
        sprinkler2.setPressureUnderValves(58);
        sprinkler2.setPressureOnWaterPlug(65);
        sprinkler2.setAlarmToFireDepartmentWorking(false);
        sprinkler2.setComments("Electric pump failed to start, alarm system offline.");
        sprinkler2.setSignature("JKS");
        sprinklerSystemRepository.save(sprinkler2);

        OperationRecord operationRecord1 = new OperationRecord();
        operationRecord1.setEscapeRouteClear(true);
        operationRecord1.setEscapeRouteClear2(true);
        operationRecord1.setEmergencyDoorsVisible(true);
        operationRecord1.setEmergencyLightsWork(true);
        operationRecord1.setWarningSystemWork(true);
        operationRecord1.setMaxCapasitiesIsVisible(true);
        operationRecord1.setInventoryComplieswithFloor(true);
        operationRecord1.setFireExtinguisherIsCorrect(true);
        operationRecord1.setEmployeeInstruction(true);
        operationRecord1.setEvacuationPlanForEmployee(true);
        operationRecord1.setDateTime(LocalDate.now());
        operationRecord1.setSignature("ZLY");
        operationRecordRepository.save(operationRecord1);

    }
}
