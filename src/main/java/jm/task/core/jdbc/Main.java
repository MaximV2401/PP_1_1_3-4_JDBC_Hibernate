package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Max", "Yakovlev", (byte) 42);
        System.out.println();
        userService.saveUser("Artur", "Yakovlev", (byte) 15);
        userService.saveUser("Vlad", "Yakovlev", (byte) 12);
        userService.saveUser("Eugenia", "Yakovleva", (byte) 39);
        userService.getAllUsers().forEach(System.out::println);
        userService.cleanUsersTable();
        userService.dropUsersTable();

        // реализуйте алгоритм здесь
    }
}
