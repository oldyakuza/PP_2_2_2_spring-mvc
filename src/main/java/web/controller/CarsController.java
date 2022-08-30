package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
@RequestMapping("/cars")
//@RequestMapping(value = "/cars", method = RequestMethod.GET, params = {"count"})
public class CarsController {
    private final CarService carService;

    public CarsController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping()
    public String listCars(@RequestParam(defaultValue = "100") String count, Model model) {
        model.addAttribute("cars", carService.listCars(count));
        return "cars";
    }
}
