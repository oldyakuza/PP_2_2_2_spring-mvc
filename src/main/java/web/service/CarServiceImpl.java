package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private final List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("Ford", "Red", 1L));
        cars.add(new Car("Lada", "Black", 12L));
        cars.add(new Car("Toyota", "White", 103L));
        cars.add(new Car("BMW", "Blue", 1004L));
        cars.add(new Car("Opel", "Yellow", 10005L));
    }

    public List<Car> listCars(String countNum) {
        int count = Integer.parseInt(countNum);
        if (count >= cars.size()) { return cars; }
        return cars.subList(0, count);
    }
}
