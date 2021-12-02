package com.nazar.carstudio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nazar.carstudio.entity.Car;
import com.nazar.carstudio.repository.CarRepository;

@Service
public class CarService {
    
    @Autowired
    private CarRepository carRepository;
    
    public List<Car> getAllCars(){
        List<Car> cars = carRepository.findAll();
        return cars;
    }
    
}
