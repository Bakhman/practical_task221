package com.bakh.hiber.dao;

import com.bakh.hiber.model.Car;
import com.bakh.hiber.model.User;

import java.util.List;

public interface UserDao {
   void add(User user);
   void drop(User user);

   void add(Car car);
   List<User> listUsers();

   List<Car> listCars();

   User userWithCar(String model, int series);
}
