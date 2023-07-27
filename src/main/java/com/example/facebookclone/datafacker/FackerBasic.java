package com.example.facebookclone.datafacker;
import net.datafaker.Faker;

import java.util.Locale;

public class FackerBasic {
    public static void main(String[] args) {


        Faker faker = new Faker(new Locale("vi"));

        String name = faker.name().fullName(); // Miss Samanta Schmidt
        String firstName = faker.name().firstName(); // Emory
        String lastName = faker.name().lastName(); // Barton

        String streetAddress = faker.address().streetAddress(); // 60018 Sawayn Brooks Suite 449
        System.out.println(name);
        System.out.println(firstName+" "+lastName);
        System.out.println(streetAddress);
        var s = faker.avatar().image();
        System.out.println(s);

    }
}
