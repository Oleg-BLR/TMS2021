package com.home.homework6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        new Person("Alex", 23, "male", new Address("Belarus", "Minsk"))


        Address address01 = new Address("Belarus", "Minsk");
        Address address02 = new Address("Belarus", "Vitebsk");
        Person person01 = new Person("Alex", 25, "male", address01, 1);
        Person person02 = new Person("Nikolay", 19, "male", address02, 2);
        Person person03 = new Person("Nikolay", 26, "male", address01, 3);
        Person person04 = new Person("Valeryi", 28, "male", new Address("Belarus", "Polotsk"), 4);
        Person person07 = new Person("Igor", 23, "male", address01, 7);
        Person person08 = new Person("Misha", 22, "male", new Address("Belarus", "Grodno"), 8);
//        Person [] persons = new Person[10]{person01, person02}
        Person[] persons = {person01, person02, person03, person04};
        PersonRegistry personRegistry = new PersonRegistry(persons);
        MilitaryOffice militaryOffice = new MilitaryOffice(personRegistry);

        Person person05 = new Person("Oleg", 5);
        Person person09 = new Person("Ilya", 9);
        System.out.println(person05 + "Порядковый номер регистрации - " + Person.count);
//        System.out.println(person01 + Person.count); // почему с person из массива вывод здесь не работает?
        Person person06 = new Person("Vasiliy", 6);
        System.out.println(person06 + "Порядковый номер регистрации - " + Person.count);
        System.out.println(person07 + "Порядковый номер регистрации - " + Person.count);// почему то не меняется порядковый номер регистрации
        System.out.println(person08 + "Порядковый номер регистрации - " + Person.count); // хотя почему-то при перво запуске он мне выдал номера 3 и 4
        System.out.println(person09 + "Порядковый номер регистрации - " + Person.count);
        System.out.println(person05 + "Порядковый номер регистрации - " + Person.count);
        System.out.println("---------------------------------");

        // a) вывести имена всех людей годных к военной службе на текущий момент времени, которые есть в PersonRegistry
        //   T.е нужно написать метод в классе MilitaryOffice, который будет отфильтровывать годных к службе призывников
        //  (годными считать мущин от 18 до 27 лет, проверяем пол и возраст)
        System.out.println("Список годных к службе мужчин");
        militaryOffice.getNamesEligibleForMilitaryService();
        System.out.println("---------------------------------");

        // б) вывести количество годных призывников в городе Минске.
        System.out.println("Список годных к службе мужчин в городе Минске");
//        militaryOffice.getCountOfEligibleForMilitaryServiceFromCity();
        System.out.println("Количество годных к службе мужчин в возрасте 19 лет - " + militaryOffice.getCountOfEligibleForMilitaryServiceFromCity());
        System.out.println("---------------------------------");

        // б) вывести количество годных призывников в возрасте 19 лет.
        System.out.println("Список годных к службе мужчин в возрасте 19 лет");
        militaryOffice.getCountOfEligibleForMilitaryService19();
        System.out.println("Количество годных к службе мужчин в городе Минске - " + militaryOffice.getCountOfEligibleForMilitaryService19());
        System.out.println("---------------------------------");


        // в) вывести количество призывников от 25 до 27 лет
        System.out.println("Список годных к службе мужчин в возрасте от 25 до 27 лет");
//        militaryOffice.getCountOfEligibleForMilitaryServiceFrom25till27();
        System.out.println("Количество годных к службе мужчин в возрасте от 25 до 27 лет - " + militaryOffice.getCountOfEligibleForMilitaryServiceFrom25till27());
        System.out.println("---------------------------------");


//        System.out.println("Кол-во годных к службе мужчин с именем Nikolay");
//        System.out.println(militaryOffice.getCountOfPersonWithName("Nikolay"));
//        System.out.println(Person.infoPerson); // почему не видит метод?

        // г) вывести количество призывников у которых имя Nikolay.
        int countName = militaryOffice.getCountOfPersonWithName("Nikolay");
        System.out.println(countName);
        System.out.println("---------------------------------");

        // г_2) вывести количество призывников у которых имя, введенное с консоли.
        System.out.println("Введите имя призывников, кол-во которых необходимо подсчитать (Alex 1 человек, Nikolay 2 человека или Valeryi 1 человек)");
        Scanner scanner = new Scanner(System.in);
        String nameInput = scanner.nextLine();
//        militaryOffice.getCountOfPersonWithNameFromConsole(nameInput);
        System.out.println("Кол-во призивников с именем " + nameInput + " - " + militaryOffice.getCountOfPersonWithNameFromConsole(nameInput));
        System.out.println("---------------------------------");


//        changeAddress(address01);
//        System.out.println(address01);
//        System.out.println(Arrays.toString(persons));


//        List<Person> personList = new ArrayList<>();
//        personList.add(person01);
//        personList.add(person02);
//        personList.add(person03);
//        for (Person person : personList) {
//            System.out.println(person);
//
//            personList.add(person);
//
//        }

    }

    static void changeAddress(Address address) { // здесь address это произвольное имя аргумента
        address.setCity("Gomel");
        System.out.println(address.getCity());
    }

//    static void showArrayPerson() {
//        for (int i = 0; i < Persons.)
//    }
}
