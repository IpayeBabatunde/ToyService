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
            return "Toy is working";
        }
        else
            return "No Power";
    }
}
