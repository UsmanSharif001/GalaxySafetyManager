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
    private double pressureOverDryValve;
    private double pressureOverWeatValve;
    private double pressureUnderValves;
    private double pressureOnWaterPlug;
    private boolean isElectricPumpStarting;
    private boolean isAlarmToFireDepartmentWorking;
    private double waterStandReservoir;
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

    public double getPressureOverDryValve() {
        return pressureOverDryValve;
    }

    public void setPressureOverDryValve(double pressureOverDryValve) {
        this.pressureOverDryValve = pressureOverDryValve;
    }

    public double getPressureOverWeatValve() {
        return pressureOverWeatValve;
    }

    public void setPressureOverWeatValve(double pressureOverWeatValve) {
        this.pressureOverWeatValve = pressureOverWeatValve;
    }

    public double getPressureUnderValves() {
        return pressureUnderValves;
    }

    public void setPressureUnderValves(double pressureUnderValves) {
        this.pressureUnderValves = pressureUnderValves;
    }

    public double getPressureOnWaterPlug() {
        return pressureOnWaterPlug;
    }

    public void setPressureOnWaterPlug(double pressureOnWaterPlug) {
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

    public double getWaterStandReservoir() {
        return waterStandReservoir;
    }

    public void setWaterStandReservoir(double waterStandReservoir) {
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
