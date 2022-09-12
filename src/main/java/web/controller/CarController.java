package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CarService;
import service.CarServiceImpl;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

	@GetMapping("/cars")
	public String printWelcome(ModelMap model,@RequestParam(name = "count", defaultValue = "5") int count) {
		CarService carsService = new CarServiceImpl();
		model.addAttribute("messages", carsService.getAll());
		return "cars";
	}
}