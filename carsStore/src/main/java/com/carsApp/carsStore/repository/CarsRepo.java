package com.carsApp.carsStore.repository;

import com.carsApp.carsStore.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CarsRepo extends JpaRepository<Car,Long> {

    void deleteCarById(Long id);
    Optional<Car> findCarById(Long id);
}
