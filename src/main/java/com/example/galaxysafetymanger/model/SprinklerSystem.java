package com.example.galaxysafetymanger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class SprinklerSystem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("ssorid")
    private int ssorid;

    @JsonProperty("date")
    private LocalDate date;

    @JsonProperty("pressureOverDryValve")
    private double pressureOverDryValve;

    @JsonProperty("pressureOverWetValve")
    private double pressureOverWetValve;

    @JsonProperty("pressureUnderValves")
    private double pressureUnderValves;

    @JsonProperty("pressureOnWaterPlug")
    private double pressureOnWaterPlug;


    @JsonProperty("alarmToFireDepartmentWorking")
    private boolean isAlarmToFireDepartmentWorking;

    @JsonProperty("comments")
    private String comments;

    @JsonProperty("signature")
    private String signature;

    public SprinklerSystem() {

    }
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
    public double getPressureOverWetValve() {
        return pressureOverWetValve;
    }

    public void setPressureOverWetValve(double pressureOverWeatValve) {
        this.pressureOverWetValve = pressureOverWeatValve;
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


    public boolean isAlarmToFireDepartmentWorking() {
        return isAlarmToFireDepartmentWorking;
    }

    public void setAlarmToFireDepartmentWorking(boolean alarmToFireDepartmentWorking) {
        isAlarmToFireDepartmentWorking = alarmToFireDepartmentWorking;
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