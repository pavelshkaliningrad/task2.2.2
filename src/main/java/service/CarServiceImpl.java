package service;

import dao.CarDao;
import dao.CarDaoImpl;
import web.model.Car;

import java.util.List;

public class CarServiceImpl implements CarService {
    CarDao carDao = new CarDaoImpl();
    @Override
    public List<Car> getAll() {
        return carDao.getAll();
    }
}
