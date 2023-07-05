package org.example;

import java.util.Random;

public class Main {
    public static String ageTemperature(int age,int temperature){
       if(age>=20 && age<=45 && temperature>=-20 && temperature<=30){
           return "Можно идти гулять";
       }
       else if(age<20 && temperature>=0 && temperature<=28){
           return "Можно идти гулять";
       }
       else if(age>45 && temperature>=-10 && temperature<=25){
           return "Можно идти гулять";
       }
       else
        return "Оставайтесь дома";
    }


    public static void main(String[] args) {
        System.out.println(ageTemperature(generateRandomAge(),14));
        System.out.println(ageTemperature(generateRandomAge(),25));
        System.out.println(ageTemperature(generateRandomAge(),-1));
        System.out.println(ageTemperature(generateRandomAge(),2));
        System.out.println(ageTemperature(generateRandomAge(),55));
    }
// Дз на сообразительность
    public static int generateRandomAge(){
        Random  random = new Random();
        int x = random.nextInt(101);
        return x;

    }
}