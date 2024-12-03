package com.example.galaxysafetymanger.config;

import com.example.galaxysafetymanger.model.SprinklerSystem;
import com.example.galaxysafetymanger.repository.SprinklerSystemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class InitData implements CommandLineRunner {

    @Autowired
    SprinklerSystemRepository sprinklerSystemRepository;

    @Override
    public void run(String... args) throws Exception {
        SprinklerSystem ssor1 = new SprinklerSystem();
        ssor1.setDate(LocalDate.of(2024,11,24));
        ssor1.setPressureOverDryValve(20.1);
        ssor1.setPressureOverWeatValve(12.11);
        ssor1.setPressureUnderValves(863.44);
        ssor1.setPressureOnWaterPlug(96.67);
        ssor1.setElectricPumpStarting(false);
        ssor1.setElectricPumpStarting(true);
        ssor1.setWaterStandReservoir(654);
        ssor1.setComments("Look alright to me!");
        ssor1.setSignature("Usman Sharif");
        sprinklerSystemRepository.save(ssor1);

    }

}
