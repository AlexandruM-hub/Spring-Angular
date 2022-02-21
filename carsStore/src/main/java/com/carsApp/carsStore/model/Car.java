package com.carsApp.carsStore.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Car implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String brand;
    private String model;
    private Long maxSpeed;
    private Long gearsNumber;

    @Column(nullable = false, updatable = false)
    private String carCode;

    public Car(){}

    public Car(long id, String brand, String model, long maxSpeed, long gearsNumber, String carCode) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.gearsNumber = gearsNumber;
        this.carCode = carCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Long getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(Long maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Long getGearsNumber() {
        return gearsNumber;
    }

    public void setGearsNumber(Long gearsNumber) {
        this.gearsNumber = gearsNumber;
    }

    public String getCarCode() {
        return carCode;
    }

    public void setCarCode(String carCode) {
        this.carCode = carCode;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", gearsNumber=" + gearsNumber +
                ", carCode='" + carCode + '\'' +
                '}';
    }
}
