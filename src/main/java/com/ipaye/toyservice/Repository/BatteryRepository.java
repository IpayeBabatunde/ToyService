package com.ipaye.toyservice.Repository;


import com.ipaye.toyservice.Model.Battery;
import com.ipaye.toyservice.Service.ToyService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BatteryRepository extends JpaRepository<Battery, Long> {

    boolean hasPower();
}
