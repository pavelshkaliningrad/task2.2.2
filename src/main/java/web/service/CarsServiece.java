package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarsServiece {

    public List <Car> getCarsByQuantity (List<Car> cars, int quantity) {
        if (quantity < 5) {
            return cars.subList(0,quantity);
        } else {
            return cars.subList(0,5);
        }
    }
}
