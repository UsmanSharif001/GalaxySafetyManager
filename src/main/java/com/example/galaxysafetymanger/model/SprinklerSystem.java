package com.example.galaxysafetymanger.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class SprinklerSystem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ssorid;
    private LocalDate date;
    private int pressureOverDryValve;
    private int pressureOverWeatValve;
    private int pressureUnderValves;
    private int pressureOnWaterPlug;
    private boolean isElectricPumpStarting;
    private boolean isAlarmToFireDepartmentWorking;
    private int waterStandReservoir;
    private String comments;
    private String signature;


    public int getSsorid() {
        return ssorid;
    }

    public void setSsorid(int ssorid) {
        this.ssorid = ssorid;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getPressureOverDryValve() {
        return pressureOverDryValve;
    }

    public void setPressureOverDryValve(int pressureOverDryValve) {
        this.pressureOverDryValve = pressureOverDryValve;
    }

    public int getPressureOverWeatValve() {
        return pressureOverWeatValve;
    }

    public void setPressureOverWeatValve(int pressureOverWeatValve) {
        this.pressureOverWeatValve = pressureOverWeatValve;
    }

    public int getPressureUnderValves() {
        return pressureUnderValves;
    }

    public void setPressureUnderValves(int pressureUnderValves) {
        this.pressureUnderValves = pressureUnderValves;
    }

    public int getPressureOnWaterPlug() {
        return pressureOnWaterPlug;
    }

    public void setPressureOnWaterPlug(int pressureOnWaterPlug) {
        this.pressureOnWaterPlug = pressureOnWaterPlug;
    }

    public boolean isElectricPumpStarting() {
        return isElectricPumpStarting;
    }

    public void setElectricPumpStarting(boolean electricPumpStarting) {
        isElectricPumpStarting = electricPumpStarting;
    }

    public boolean isAlarmToFireDepartmentWorking() {
        return isAlarmToFireDepartmentWorking;
    }

    public void setAlarmToFireDepartmentWorking(boolean alarmToFireDepartmentWorking) {
        isAlarmToFireDepartmentWorking = alarmToFireDepartmentWorking;
    }

    public int getWaterStandReservoir() {
        return waterStandReservoir;
    }

    public void setWaterStandReservoir(int waterStandReservoir) {
        this.waterStandReservoir = waterStandReservoir;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}