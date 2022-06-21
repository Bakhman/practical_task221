package com.bakh.hiber;



import com.bakh.hiber.config.AppConfig;
import com.bakh.hiber.model.Car;
import com.bakh.hiber.model.User;
import com.bakh.hiber.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



import java.sql.SQLException;
import java.util.List;

public class MainApp {
   public static void main(String[] args) throws SQLException {
      AnnotationConfigApplicationContext context = 
            new AnnotationConfigApplicationContext(AppConfig.class);

      UserService userService = context.getBean(UserService.class);

      User user = userService.userWithCar("BMW", 557);

      System.out.println(user);

     /* userService.add(new Car("BMW",557));
      userService.add(new Car("BMW",55));
      userService.add(new Car("AUDI",44));

      Car car1 = userService.listCars().get(0);
      Car car2 = userService.listCars().get(1);
      Car car3 = userService.listCars().get(2);
      userService.add(new User("User1", "Lastname1", "user1@mail.ru",car2));
      userService.add(new User("User2", "Lastname2", "user2@mail.ru"));
      userService.add(new User("User3", "Lastname3", "user3@mail.ru",car3));
      userService.add(new User("User4", "Lastname4", "user4@mail.ru",car1));
*/


      /*List<User> usersL = userService.listUsers();
       for(User user1 : usersL){
         System.out.println(user1);
      }*/
      /*for (User user : users) {
         System.out.println("Id = "+user.getId());
         System.out.println("First Name = "+user.getFirstName());
         System.out.println("Last Name = "+user.getLastName());
         System.out.println("Email = "+user.getEmail());
         System.out.println();
      }*/
      context.close();
   }

}
