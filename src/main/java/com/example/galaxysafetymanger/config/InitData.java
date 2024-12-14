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
        operationRecord1.setDateTime(LocalDate.of(2024, 12, 3));
        operationRecord1.setSignature("ZLY");
        operationRecordRepository.save(operationRecord1);

        OperationRecord operationRecord2 = new OperationRecord();
        operationRecord2.setEscapeRouteClear(true);
        operationRecord2.setEscapeRouteClear2(true);
        operationRecord2.setEmergencyDoorsVisible(false);
        operationRecord2.setEmergencyLightsWork(true);
        operationRecord2.setWarningSystemWork(true);
        operationRecord2.setMaxCapasitiesIsVisible(true);
        operationRecord2.setInventoryComplieswithFloor(true);
        operationRecord2.setFireExtinguisherIsCorrect(true);
        operationRecord2.setEmployeeInstruction(true);
        operationRecord2.setEvacuationPlanForEmployee(true);
        operationRecord2.setErrorDescription("Nødbelysning over branddøren lyser meget svagt");
        operationRecord2.setDateTime(LocalDate.of(2024, 12, 4));
        operationRecord2.setSignature("JS");
        operationRecordRepository.save(operationRecord2);

        OperationRecord operationRecord3 = new OperationRecord();
        operationRecord3.setEscapeRouteClear(true);
        operationRecord3.setEscapeRouteClear2(true);
        operationRecord3.setEmergencyDoorsVisible(true);
        operationRecord3.setEmergencyLightsWork(true);
        operationRecord3.setWarningSystemWork(true);
        operationRecord3.setMaxCapasitiesIsVisible(true);
        operationRecord3.setInventoryComplieswithFloor(true);
        operationRecord3.setFireExtinguisherIsCorrect(true);
        operationRecord3.setEmployeeInstruction(true);
        operationRecord3.setEvacuationPlanForEmployee(true);
        operationRecord3.setDateTime(LocalDate.of(2024, 12, 5));
        operationRecord3.setSignature("EB");
        operationRecordRepository.save(operationRecord3);

        OperationRecord operationRecord4 = new OperationRecord();
        operationRecord4.setEscapeRouteClear(true);
        operationRecord4.setEscapeRouteClear2(true);
        operationRecord4.setEmergencyDoorsVisible(true);
        operationRecord4.setEmergencyLightsWork(true);
        operationRecord4.setWarningSystemWork(true);
        operationRecord4.setMaxCapasitiesIsVisible(true);
        operationRecord4.setInventoryComplieswithFloor(true);
        operationRecord4.setFireExtinguisherIsCorrect(true);
        operationRecord4.setEmployeeInstruction(true);
        operationRecord4.setEvacuationPlanForEmployee(true);
        operationRecord4.setErrorDescription("Branddør i kælderen lukker ikke.");
        operationRecord4.setDateTime(LocalDate.of(2024, 12, 6));
        operationRecord4.setSignature("KB");
        operationRecordRepository.save(operationRecord4);

        OperationRecord operationRecord5 = new OperationRecord();
        operationRecord5.setEscapeRouteClear(true);
        operationRecord5.setEscapeRouteClear2(true);
        operationRecord5.setEmergencyDoorsVisible(true);
        operationRecord5.setEmergencyLightsWork(false);
        operationRecord5.setWarningSystemWork(true);
        operationRecord5.setMaxCapasitiesIsVisible(true);
        operationRecord5.setInventoryComplieswithFloor(true);
        operationRecord5.setFireExtinguisherIsCorrect(true);
        operationRecord5.setEmployeeInstruction(true);
        operationRecord5.setEvacuationPlanForEmployee(true);
        operationRecord5.setErrorDescription("Branddør i kælderen lukker ikke.");
        operationRecord5.setDateTime(LocalDate.of(2024, 12, 7));
        operationRecord5.setSignature("ZLY");
        operationRecordRepository.save(operationRecord5);

        OperationRecord operationRecord6 = new OperationRecord();
        operationRecord6.setEscapeRouteClear(true);
        operationRecord6.setEscapeRouteClear2(true);
        operationRecord6.setEmergencyDoorsVisible(true);
        operationRecord6.setEmergencyLightsWork(true);
        operationRecord6.setWarningSystemWork(true);
        operationRecord6.setMaxCapasitiesIsVisible(true);
        operationRecord6.setInventoryComplieswithFloor(true);
        operationRecord6.setFireExtinguisherIsCorrect(true);
        operationRecord6.setEmployeeInstruction(true);
        operationRecord6.setEvacuationPlanForEmployee(true);
        operationRecord6.setDateTime(LocalDate.of(2024, 12, 8));
        operationRecord6.setSignature("TLS");
        operationRecordRepository.save(operationRecord6);

        OperationRecord operationRecord7 = new OperationRecord();
        operationRecord7.setEscapeRouteClear(true);
        operationRecord7.setEscapeRouteClear2(true);
        operationRecord7.setEmergencyDoorsVisible(true);
        operationRecord7.setEmergencyLightsWork(true);
        operationRecord7.setWarningSystemWork(true);
        operationRecord7.setMaxCapasitiesIsVisible(true);
        operationRecord7.setInventoryComplieswithFloor(true);
        operationRecord7.setFireExtinguisherIsCorrect(true);
        operationRecord7.setEmployeeInstruction(true);
        operationRecord7.setEvacuationPlanForEmployee(true);
        operationRecord7.setDateTime(LocalDate.of(2024, 12, 8));
        operationRecord7.setSignature("KB");
        operationRecordRepository.save(operationRecord7);

    }
}
