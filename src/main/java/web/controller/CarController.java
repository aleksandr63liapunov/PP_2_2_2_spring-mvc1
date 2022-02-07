package web.controller;

import model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.Service;

import java.util.ArrayList;
import java.util.List;

@Controller

public class CarController {
    public List<Car> cars(){
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("qq", "r",1));
        cars.add(new Car("ww", "w",2));
        cars.add(new Car("ee", "e",3));
        cars.add(new Car("rr", "g",4));
        cars.add(new Car("tt", "p",5));
        return cars;
    }
    @GetMapping("/cars")
    public String carsShow(@RequestParam(value = "count", required = false) Integer count, Model model){

        Service carService = new Service();
        model.addAttribute("Cars",carService.getCars(count));
        return "Car";
    }

    }

