package com.ipaye.toyservice.Repository;


import com.ipaye.toyservice.Model.Battery;
import com.ipaye.toyservice.Service.ToyService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BatteryRepository extends JpaRepository<Battery, Long> {

    @Query("SELECT CASE WHEN COUNT(b) > 0 THEN true ELSE false END FROM Battery b WHERE b.power > 0")
    boolean hasPower();


    @Query("SELECT CASE WHEN COUNT(b) > 0 THEN true ELSE false END FROM Battery b WHERE b.power > 0")
    boolean switchedOn();

    @Query("SELECT CASE WHEN COUNT(b) > 0 THEN true ELSE false END FROM Battery b WHERE b.power > 0")
    boolean faulty();
}
