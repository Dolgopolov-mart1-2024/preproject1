package jm.task.core.jdbc;


import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserService userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Антон", "Долгополов", (byte) 37);
        userService.saveUser("Илья", "Плитько", (byte) 32);
        userService.saveUser("Максим", "Корольков", (byte) 27);
        userService.saveUser("Даниил", "Блоцкий", (byte) 23);

        List<User> users = userService.getAllUsers();
        for (User user : users) {
            System.out.println(user);
        }

        userService.cleanUsersTable();

        userService.dropUsersTable();
    }

}