package com.carsApp.carsStore.service;

import com.carsApp.carsStore.exception.CarNotFoundException;
import com.carsApp.carsStore.model.Car;
import com.carsApp.carsStore.repository.CarsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CarsService {
    private final CarsRepo carsRepo;

    @Autowired
    public CarsService(CarsRepo carsRepo) {
        this.carsRepo = carsRepo;
    }

    public Car addCar(Car car){
        car.setCarCode(UUID.randomUUID().toString());
        return carsRepo.save(car);
    }

    public List<Car> findAllCars(){
        return carsRepo.findAll();
    }

    public Car updateCar(Car car){
        return carsRepo.save(car);
    }

    public Car findCar(Long id){
        return carsRepo.findCarById(id)
                .orElseThrow(() -> new CarNotFoundException("Car by id " + id + " was not found"));
    }

    public void deleteCar(Long id){
        carsRepo.deleteCarById(id);
    }

}
