package service;

import model.Car;
import web.controller.CarController;

import java.util.List;

public class Service {

    private CarController carController = new CarController();

    public List<Car> getCars(Integer count) {
       int number=count != null&&count< carController.cars().size() ? count : carController.cars().size();


        return carController.cars().subList(0, number);

      }


}
