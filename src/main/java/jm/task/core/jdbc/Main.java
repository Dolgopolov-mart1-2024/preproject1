package jm.task.core.jdbc;


import jm.task.core.jdbc.util.Util;
import org.postgresql.Driver;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        try (Connection connection = Util.getConnection()) {
            if (connection != null) {
                System.out.println("Соединение с базой данных установлено успешно.");
            } else {
                System.out.println("Не удалось установить соединение с базой данных.");
            }
        } catch (Exception e) {
            System.out.println("Произошла ошибка при попытке подключения к базе данных:");

        }

    }
}

