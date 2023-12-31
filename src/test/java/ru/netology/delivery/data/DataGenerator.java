package ru.netology.delivery.data;

import com.github.javafaker.Faker;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Random;

public class DataGenerator {
    private DataGenerator() {
    }

    public static String generateDate(int days) {
        // TODO: добавить логику для объявления переменной date и задания её значения, для генерации строки с датой
        // Вы можете использовать класс LocalDate и его методы для получения и форматирования даты
        return LocalDate.now().plusDays(days).format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));

    }

    public static Info generateInfo(String locale) {
        // TODO: добавить логику для объявления переменной city и задания её значения, генерацию можно выполнить
        // с помощью Faker, либо используя массив валидных городов и класс Random
        Faker faker = new Faker(new Locale(locale));
        String[] cities = {"Екатеринбург", "Уфа", "Пермь", "Челябинск", "Красноярск"};
        Random random = new Random();

        return new Info(cities[random.nextInt(cities.length)],
        faker.name().fullName(),
                faker.phoneNumber().phoneNumber() );
    }
}


