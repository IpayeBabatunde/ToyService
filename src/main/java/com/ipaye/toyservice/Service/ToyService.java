package com.ipaye.toyservice.Service;


import com.ipaye.toyservice.Repository.BatteryRepository;
import org.springframework.stereotype.Service;

@Service
public class ToyService {

    private final BatteryRepository batteryRepository;

    public ToyService(BatteryRepository batteryRepository) {
        this.batteryRepository=batteryRepository;
    }
    
    public String play(){
        if(batteryRepository.hasPower()){
            return "Toy is playing";
        }
        else
            return "No Power";
    }

    public String switchedOn(){
        if (batteryRepository.switchedOn()){
            return "Toy is switched on";
        }
        else
            return "Toy is switched off";
    }

    public String faulty(){
        if(batteryRepository.faulty()){
            return "Toy is faulty";
        }
        else
            return "Toy is working fine";
    }

    public String needRepair(){
        if(batteryRepository.needRepair()){

            return "Toy needs repair";
        }
        else
            return "Toy is ok";
    }
}
