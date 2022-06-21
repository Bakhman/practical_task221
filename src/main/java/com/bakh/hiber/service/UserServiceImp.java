package com.bakh.hiber.service;

import com.bakh.hiber.dao.UserDao;
import com.bakh.hiber.model.Car;
import com.bakh.hiber.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

   @Autowired
   private UserDao userDao;

   @Transactional
   @Override
   public void add(User user) {
      userDao.add(user);
   }

   @Transactional
   @Override
   public void drop(User user) {userDao.drop(user);}

   @Transactional
   @Override
   public void add(Car car) {
      userDao.add(car);
   }

   @Transactional(readOnly = true)
   @Override
   public List<User> listUsers() {
      return userDao.listUsers();
   }

   @Transactional(readOnly = true)
   @Override
   public List<Car> listCars() {
      return userDao.listCars();
   }
   
   @Transactional
   @Override
   public User userWithCar(String model, int series) {
      User user = null;
      try {
         user = userDao.userWithCar(model, series);
      } catch (NoResultException e){
         System.out.println("There is not a single user with a car of this series and model!");
      }
      return user;
   }
   
   /*@Transactional
   @Override
   public User userWithCar(String model, int series) {
      return userDao.userWithCar(model, series);
   }*/
}
