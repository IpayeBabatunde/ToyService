package com.ipaye.toyservice.Model;


import jakarta.persistence.*;

@Entity
@Table(name= "Batteries")
public class Battery {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false)
    private String type;

    @Column(nullable=false)
    private int power;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id=id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type=type;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power=power;
    }
}
