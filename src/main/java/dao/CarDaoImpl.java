package dao;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarDaoImpl implements CarDao {
    List<Car> cars = new ArrayList<>();
    {
        cars.add(new Car("color_1","model_1",100));
        cars.add(new Car("color_2","model_2",200));
        cars.add(new Car("color_3","model_3",300));
        cars.add(new Car("color_4","model_4",400));
        cars.add(new Car("color_5","model_5",500));
    }
    @Override
    public List<Car> getAll() {
        return cars;
    }
}
