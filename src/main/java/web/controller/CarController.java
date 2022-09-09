package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarsServiece;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

	@GetMapping("/cars")
	public String printWelcome(ModelMap model,@RequestParam(name = "count", defaultValue = "5") int count) {
		CarsServiece carsServiece = new CarsServiece();
		List<Car> cars = new ArrayList<>();
		cars.add(new Car("color_1","model_1",100));
		cars.add(new Car("color_2","model_2",200));
		cars.add(new Car("color_3","model_3",300));
		cars.add(new Car("color_4","model_4",400));
		cars.add(new Car("color_5","model_5",500));
		model.addAttribute("messages", carsServiece.getCarsByQuantity(cars,count));
		return "cars";
	}
}