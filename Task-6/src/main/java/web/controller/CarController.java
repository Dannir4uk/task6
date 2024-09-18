package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarsListService;

@Controller
public class CarController {

    private final CarsListService carsListService;

    public CarController(CarsListService carsListService) {
        this.carsListService = carsListService;
    }

    @GetMapping(value = "/cars")
    public String listCars(
            @RequestParam(value = "count", defaultValue = "5") int count, Model model) {
        model.addAttribute("cars", carsListService.getSizeCars(count));
        return "cars";
    }
}
