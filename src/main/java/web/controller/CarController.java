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


    @GetMapping("/cars")
    public String carsShow(@RequestParam(value = "count", required = false) Integer count, Model model){

        Service carService = new Service();
        model.addAttribute("Cars",carService.getCars(count));
        return "Car";
    }

    }

