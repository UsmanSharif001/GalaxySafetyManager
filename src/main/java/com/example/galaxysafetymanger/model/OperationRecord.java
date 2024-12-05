package com.example.galaxysafetymanger.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class OperationRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orId;
    private boolean escapeRouteClear;
    private boolean escapeRouteClear2;
    private boolean emergencyDoorsVisible;
    private boolean emergencyLightsWork;
    private boolean warningSystemWork;
    private boolean maxCapasitiesIsVisible;
    private boolean inventoryComplieswithFloor;
    private boolean fireExtinguisherIsCorrect;
    private boolean employeeInstruction;
    private boolean evacuationPlanForEmployee;
    private String errorDescription;
    private LocalDate dateTime;
    private String signature;


    public LocalDate getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDate dateTime) {
        this.dateTime = dateTime;
    }

    public boolean isEmergencyDoorsVisible() {
        return emergencyDoorsVisible;
    }

    public void setEmergencyDoorsVisible(boolean emergencyDoorsVisible) {
        this.emergencyDoorsVisible = emergencyDoorsVisible;
    }

    public boolean isEmergencyLightsWork() {
        return emergencyLightsWork;
    }

    public void setEmergencyLightsWork(boolean emergencyLightsWork) {
        this.emergencyLightsWork = emergencyLightsWork;
    }

    public boolean isEmployeeInstruction() {
        return employeeInstruction;
    }

    public void setEmployeeInstruction(boolean employeeInstruction) {
        this.employeeInstruction = employeeInstruction;
    }

    public String getErrorDescription() {
        return errorDescription;
    }

    public void setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
    }

    public boolean isEscapeRouteClear2() {
        return escapeRouteClear2;
    }

    public void setEscapeRouteClear2(boolean escapeRouteClear2) {
        this.escapeRouteClear2 = escapeRouteClear2;
    }

    public boolean isEscapeRouteClear() {
        return escapeRouteClear;
    }

    public void setEscapeRouteClear(boolean escapeRouteClear) {
        this.escapeRouteClear = escapeRouteClear;
    }

    public boolean isEvacuationPlanForEmployee() {
        return evacuationPlanForEmployee;
    }

    public void setEvacuationPlanForEmployee(boolean evacuationPlanForEmployee) {
        this.evacuationPlanForEmployee = evacuationPlanForEmployee;
    }

    public boolean isFireExtinguisherIsCorrect() {
        return fireExtinguisherIsCorrect;
    }

    public void setFireExtinguisherIsCorrect(boolean fireExtinguisherIsCorrect) {
        this.fireExtinguisherIsCorrect = fireExtinguisherIsCorrect;
    }

    public boolean isInventoryComplieswithFloor() {
        return inventoryComplieswithFloor;
    }

    public void setInventoryComplieswithFloor(boolean inventoryComplieswithFloor) {
        this.inventoryComplieswithFloor = inventoryComplieswithFloor;
    }

    public boolean isMaxCapasitiesIsVisible() {
        return maxCapasitiesIsVisible;
    }

    public void setMaxCapasitiesIsVisible(boolean maxCapasitiesIsVisible) {
        this.maxCapasitiesIsVisible = maxCapasitiesIsVisible;
    }



    public int getOrId() {
        return orId;
    }

    public void setOrId(int orId) {
        this.orId = orId;
    }


    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public boolean isWarningSystemWork() {
        return warningSystemWork;
    }

    public void setWarningSystemWork(boolean warningSystemWork) {
        this.warningSystemWork = warningSystemWork;
    }

    @Override
    public String toString() {
        return "OperationRecord{" +
                ", orId=" + orId +
                ", escapeRouteClear=" + escapeRouteClear +
                ", escapeRouteClear2=" + escapeRouteClear2 +
                ", emergencyDoorsVisible=" + emergencyDoorsVisible +
                ", emergencyLightsWork=" + emergencyLightsWork +
                ", warningSystemWork=" + warningSystemWork +
                ", maxCapasitiesIsVisible=" + maxCapasitiesIsVisible +
                ", inventoryComplieswithFloor=" + inventoryComplieswithFloor +
                ", fireExtinguisherIsCorrect=" + fireExtinguisherIsCorrect +
                ", employeeInstruction=" + employeeInstruction +
                ", evacuationPlanForEmployee=" + evacuationPlanForEmployee +
                ", errorDescription='" + errorDescription + '\'' +
                ", dateTime=" + dateTime +
                ", signature='" + signature + '\'' +
                '}';
    }
}