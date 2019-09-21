package com.cherry.prospring5.ch11.services;

import com.cherry.prospring5.ch11.Car;

import java.util.List;

public interface CarService {
    List<Car> findAll();
    Car save(Car car);
    void updateCarAgeJob();
    boolean isDone();
}
