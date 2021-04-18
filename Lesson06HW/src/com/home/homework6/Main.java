package com.home.homework6;

public class Main {
    public static void main(String[] args) {
//        new Person("Alex", 23, "male", new Address("Belarus", "Minsk"))
        Address address01 = new Address("Belarus", "Minsk");
        Address address02 = new Address("Belarus", "Vitebsk");
        Person person01 = new Person("Alex", 23, "male", address01);
        Person person02 = new Person("Nikolay", 19, "male", address02);
        Person person03 = new Person("Nikolay", 21, "male", address01);
        Person person07 = new Person("Igor", 23, "male", address01);
        Person person08 = new Person("Misha", 22, "male", new Address("Belarus", "Grodno"));
//        Person [] persons = new Person[10]{person01, person02}
        Person[] persons = {person01, person02, person03};
        PersonRegistry personRegistry = new PersonRegistry(persons);
        MilitaryOffice militaryOffice = new MilitaryOffice(personRegistry);

        Person person05 = new Person("Oleg");
        Person person09 = new Person("Ilya");
        System.out.println(person05 + "Порядковый номер регистрации - " + Person.count);
//        System.out.println(person01 + Person.count); // почему с person из массива вывод здесь не работает?
        Person person06 = new Person("Vasiliy");
        System.out.println(person06 + "Порядковый номер регистрации - " + Person.count);
        System.out.println(person07 + "Порядковый номер регистрации - " + Person.count);// почему то не меняется порядковый номер регистрации
        System.out.println(person08 + "Порядковый номер регистрации - " + Person.count); // хотя почему-то при перво запуске он мне выдал номера 3 и 4
        System.out.println(person09 + "Порядковый номер регистрации - " + Person.count);
        System.out.println(person05 + "Порядковый номер регистрации - " + Person.count);


        System.out.println(militaryOffice.getCountOfPersonWithName("Nikolay"));
//        System.out.println(Person.infoPerson); // почему не видит метод?

        // г) вывести количество призывников у которых имя Александр.
        int countName = militaryOffice.getCountOfPersonWithName("Nikolay");
        System.out.println(countName);


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
