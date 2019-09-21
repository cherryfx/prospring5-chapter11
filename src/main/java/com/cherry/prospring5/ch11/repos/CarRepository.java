package com.cherry.prospring5.ch11.repos;

import com.cherry.prospring5.ch11.Car;
import org.springframework.data.repository.CrudRepository;

public interface CarRepository extends CrudRepository<Car, Long> {
}
