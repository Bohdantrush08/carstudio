package com.nazar.carstudio.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nazar.carstudio.entity.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
    
    public List<Car> findAllByName(String name);
    
    public List<Car> findAllByColorAndName(String color, String name);
    
}
