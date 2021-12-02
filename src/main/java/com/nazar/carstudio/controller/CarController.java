package com.nazar.carstudio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nazar.carstudio.entity.Car;
import com.nazar.carstudio.service.CarService;

@RestController
@RequestMapping("/cars")
public class CarController {
    
    @Autowired 
    private CarService carService;
    
    @GetMapping("/getAll")
    public ResponseEntity<List<Car>> getAllCars(){
        List<Car> allCars = carService.getAllCars();
        return ResponseEntity.ok(allCars);
    }
    
    // getCars by id (use PathVariable)

    // getCats by Name (use queryParams)
}
