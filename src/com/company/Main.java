package com.company;

import java.util.Random;

public class Main {
    //Hello Sensey!

    public static void main(String[] args) {
        conditions(18, 9);
        conditions(78, -12);
        conditions(45, 27);
        conditions(12, 19);
        conditions(3, 25);

        System.out.println("-----Результаты задания на собразительность-----");

        conditions(generateRandomAge(), 9);
        conditions(generateRandomAge(), -12);
        conditions(generateRandomAge(), 27);
        conditions(generateRandomAge(), 19);
        conditions(generateRandomAge(), 25);
    }

    public static int conditions(int age, int temperature) {
        String positive = "Можно идти гулять";
        String negative = "Оставайтесь дома";
        if (age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) {
            System.out.println(positive);
            return age + temperature;
        } else if (age < 20 && temperature >= 0 && temperature <= 28) {
            //По идеи здесь нужно поставить ограничения в возрасте, типо обязательно больше нуля, так как возраст не может быть минусовым
            System.out.println(positive);
            return age + temperature;
        } else if (age > 45 && temperature >= -10 && temperature <= 25) {
            System.out.println(positive);
            return age + temperature;
        } else {
            System.out.println(negative);
            return age + temperature;
        }

    }

    public static int generateRandomAge() {
        Random random = new Random();
        int randomAge = random.nextInt(100);
return randomAge;
    }
}
