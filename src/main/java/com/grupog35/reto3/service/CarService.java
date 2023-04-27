package com.grupog35.reto3.service;


import com.grupog35.reto3.model.CarModel;
import com.grupog35.reto3.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {
    @Autowired
    CarRepository carRepository;

    public  List<CarModel> obtener(){
        return carRepository.findAll();

    }
    public void Crear(CarModel car){
        System.out.println(car.toString());
        if(!carRepository.existsById(car.getIdCar())) {
            carRepository.save(car);
        }
    }
}
