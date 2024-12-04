package com.example.galaxysafetymanger.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.core.SpringVersion;

import java.time.LocalDate;

@Entity
public class OperationRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orId;
    private String orName;
    private String orAddress;
    private String orPhoneNumber;
    private boolean isEscapeRouteClear;
    private boolean isEscapeRouteClear2;
    private boolean isEmergencyDoorsVisible;
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

    public int getOrId() {
        return orId;
    }

    public void setOrId(int orId) {
        this.orId = orId;
    }

    public String getOrName() {
        return orName;
    }

    public void setOrName(String orName) {
        this.orName = orName;
    }

    public String getOrAddress() {
        return orAddress;
    }

    public void setOrAddress(String orAddress) {
        this.orAddress = orAddress;
    }

    public String getOrPhoneNumber() {
        return orPhoneNumber;
    }

    public void setOrPhoneNumber(String orPhoneNumber) {
        this.orPhoneNumber = orPhoneNumber;
    }

    public boolean isEscapeRouteClear() {
        return isEscapeRouteClear;
    }

    public void setEscapeRouteClear(boolean escapeRouteClear) {
        isEscapeRouteClear = escapeRouteClear;
    }

    public boolean isEscapeRouteClear2() {
        return isEscapeRouteClear2;
    }

    public void setEscapeRouteClear2(boolean escapeRouteClear2) {
        isEscapeRouteClear2 = escapeRouteClear2;
    }

    public boolean isEmergencyDoorsVisible() {
        return isEmergencyDoorsVisible;
    }

    public void setEmergencyDoorsVisible(boolean emergencyDoorsVisible) {
        isEmergencyDoorsVisible = emergencyDoorsVisible;
    }

    public boolean isEmergencyLightsWork() {
        return emergencyLightsWork;
    }

    public void setEmergencyLightsWork(boolean emergencyLightsWork) {
        this.emergencyLightsWork = emergencyLightsWork;
    }

    public boolean isWarningSystemWork() {
        return warningSystemWork;
    }

    public void setWarningSystemWork(boolean warningSystemWork) {
        this.warningSystemWork = warningSystemWork;
    }

    public boolean isMaxCapasitiesIsVisible() {
        return maxCapasitiesIsVisible;
    }

    public void setMaxCapasitiesIsVisible(boolean maxCapasitiesIsVisible) {
        this.maxCapasitiesIsVisible = maxCapasitiesIsVisible;
    }

    public boolean isInventoryComplieswithFloor() {
        return inventoryComplieswithFloor;
    }

    public void setInventoryComplieswithFloor(boolean inventoryComplieswithFloor) {
        this.inventoryComplieswithFloor = inventoryComplieswithFloor;
    }

    public boolean isFireExtinguisherIsCorrect() {
        return fireExtinguisherIsCorrect;
    }

    public void setFireExtinguisherIsCorrect(boolean fireExtinguisherIsCorrect) {
        this.fireExtinguisherIsCorrect = fireExtinguisherIsCorrect;
    }

    public boolean isEmployeeInstruction() {
        return employeeInstruction;
    }

    public void setEmployeeInstruction(boolean employeeInstruction) {
        this.employeeInstruction = employeeInstruction;
    }

    public boolean isEvacuationPlanForEmployee() {
        return evacuationPlanForEmployee;
    }

    public void setEvacuationPlanForEmployee(boolean evacuationPlanForEmployee) {
        this.evacuationPlanForEmployee = evacuationPlanForEmployee;
    }

    public String getErrorDescription() {
        return errorDescription;
    }

    public void setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
    }

    public LocalDate getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDate dateTime) {
        this.dateTime = dateTime;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}
