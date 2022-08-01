package co.develhope.FirstApi05.controllers;

import co.develhope.FirstApi05.DTO.CarDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.Valid;

@RestController
public class CarController {

    @GetMapping(value = "/cars")
    public CarDTO getCar(CarDTO carDTO){
        return new CarDTO("34789","Mazda RX-7",50000.00);
    }

    @PostMapping(value = "/cars")
    public String postCar(@Valid @RequestBody CarDTO carDTO){
        System.out.println(carDTO.toString());
        return "Car has been created";
    }
}
