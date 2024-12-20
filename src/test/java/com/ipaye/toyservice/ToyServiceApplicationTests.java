package com.ipaye.toyservice;

import com.ipaye.toyservice.Repository.BatteryRepository;
import com.ipaye.toyservice.Service.ToyService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
class ToyServiceApplicationTests {

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


}