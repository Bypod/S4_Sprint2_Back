package com.keyin.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class CarController {

    @Autowired
    CarRepo carRepo;

    @GetMapping("/car")
    public List<Car> index(){
        return carRepo.findAll();
    }

//    @GetMapping("/car/{id}")
//    public Optional<Car> show(@PathVariable String id){
//        long carId = Integer.parseInt(id);
//        return  carRepo.findById(carId);
//    }
}

