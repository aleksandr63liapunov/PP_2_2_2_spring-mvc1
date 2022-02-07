package service;

import model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Service {
    public List<Car> cars() {
        final List<Car> car = new ArrayList<>();
        car.add(new Car("qq", "r", 1));
        car.add(new Car("ww", "w", 2));
        car.add(new Car("ee", "e", 3));
        car.add(new Car("rr", "g", 4));
        car.add(new Car("tt", "p", 5));
        return car;
    }

    public List<Car> getCars(Integer count) {
        if ((count == null) || (count > 5)) {
            count = 5;
        }


        return cars().subList(0, count);

    }


}



