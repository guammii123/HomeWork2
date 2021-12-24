package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println(number(generateRandomAge(),15));
        System.out.println(number(23, 16));
        System.out.println(number(18, 32));
        System.out.println(number(75, 22));
        System.out.println(number(33, 12));
    }
        public static String number (int agePerson, int temperature) {
        if (agePerson >= 20 && agePerson <= 45 && temperature >= -20 && temperature <= 30){
            return "можно идти гулять";
        } else if (agePerson < 20 && temperature >=0 && temperature <= 28) {
          return "можно идти гулять";
        }
         else if (agePerson >=45 && temperature <= -10 && temperature <= 25 ) {
             return "можно идти гулять";
        } else {
             return "оставайтесь дома";
        }
        }

    public static int generateRandomAge() {
        Random random = new Random();
        int age = random.nextInt(65);
        return age;
    }
}


