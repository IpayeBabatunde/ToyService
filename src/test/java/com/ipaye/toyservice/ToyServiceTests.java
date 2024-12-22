package com.ipaye.toyservice;

import com.ipaye.toyservice.Repository.BatteryRepository;
import com.ipaye.toyservice.Service.ToyService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
class ToyServiceTests {

    @Mock
    private BatteryRepository batteryRepository;

    @InjectMocks
    private ToyService toyService;

    @Test
    void TestToysPlayedWhenPowered(){

        //Tell the mock what to do
        when(batteryRepository.hasPower()).thenReturn(true);

        // call the method
        String result = toyService.play();

        // check the result
        assertEquals("Toy is playing", result);
    }

    @Test
    void TestToysIsSwitchedOn(){

        // tell mock what to do
        when(batteryRepository.switchedOn()).thenReturn(true);

        // call method
        String result = toyService.switchedOn();

        // check the result
        assertEquals("Toy is switched on", result);
    }

    @Test
    void TestToysIfFaulty(){

        // tell mock what to do
        when(batteryRepository.faulty()).thenReturn(true);

        // call method
        String result = toyService.faulty();

        // check the result
        assertEquals("Toy is faulty", result);
    }

    @Test
    void TestToyNeedsRepair(){

        // tell mock what to do
        when(batteryRepository.needRepair()).thenReturn(true);

        // call method
        String result = toyService.needRepair();

        // check the result
        assertEquals("Toy needs repair", result);
    }



}
