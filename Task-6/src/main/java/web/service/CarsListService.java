package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarsListService {
    public List<Car> cars;

    public CarsListService() {
        cars = new ArrayList<>();
        cars.add(new Car("BMW", "Black", 2024));
        cars.add(new Car("Audi", "White", 2023));
        cars.add(new Car("MB", "Orange", 2022));
        cars.add(new Car("Kia", "Yellow", 2021));
        cars.add(new Car("Lada", "Red", 2020));
    }

    public List<Car> getSizeCars(int count) {
        if (count >= cars.size()) { //если 5 и больше весь список авто, если меньше 5 сначала до числа
            return new ArrayList<>(cars);
        } else {
            return new ArrayList<>(cars.subList(0, count));
        }
    }
}

