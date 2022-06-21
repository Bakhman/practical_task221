package com.bakh.hiber.service;

import com.bakh.hiber.model.Car;
import com.bakh.hiber.model.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserService {
    void add(User user);

    void drop(User user);

    void add(Car car);
    List<User> listUsers();

    List<Car> listCars();


    User userWithCar(String model, int series);
}
