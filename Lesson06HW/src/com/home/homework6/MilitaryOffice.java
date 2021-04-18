package com.home.homework6;

import java.util.ArrayList;
import java.util.List;

public class MilitaryOffice {
    private PersonRegistry personRegistry; //глобальная переменная класса MilitaryOffice,
    // класс, отвечающий за регистрацию людей
    // если объявим String, то хранить будем только одну строку

    public MilitaryOffice(PersonRegistry personRegistry) {
        this.personRegistry = personRegistry; // конструктор
    }

    public PersonRegistry getPersonRegistry() {
        return personRegistry;
    }

    public void setPersonRegistry(PersonRegistry personRegistry) {
        this.personRegistry = personRegistry;
    }

    public int getCountOfPersonWithName(String name) {
        Person[] persons = personRegistry.getPersons();
        int count = 0;
        for (Person person : persons) {
            if (person.getName().equals(name)) {
                count++;
            }
        }
        return count;
    }

    public void getNamesEligibleForMilitaryService() {
        Person[] persons = personRegistry.getPersons();
        List<Person> personListEligibleForMilitaryService = new ArrayList<>();
        for (Person temp : persons) {
            if (temp.getAge() >= 18 && temp.getAge() <= 27 && temp.getSex() == "male") {
                personListEligibleForMilitaryService.add(temp);
            }
        }
        for (Person person : personListEligibleForMilitaryService)
            System.out.println(person);
//        personList.add(person01);
//        personList.add(person02);
//        personList.add(person03);
//        for (Person person : personList) {
//            System.out.println(person);
//
//            personList.add(person);

//        int count = 0;
//        for (Person person : persons) {
//            if (person.getName().equals(name)) {
//                count++;
//            }
//        }
//        return count;
    }

    public int getCountOfEligibleForMilitaryService19() {
//        List(getNamesEligibleForMilitaryService();)
//        Person[] persons = personRegistry.getPersons();

        Person[] persons = personRegistry.getPersons();
        List<Person> personListEligibleForMilitaryService = new ArrayList<>();
        for (Person temp : persons) {
            if (temp.getAge() >= 18 && temp.getAge() <= 27 && temp.getSex() == "male") {
                personListEligibleForMilitaryService.add(temp);
            }
        }
        List<Person> personListOfEligibleForMilitaryService19 = new ArrayList<>();
//        for (Person person : personListEligibleForMilitaryService) {
//            System.out.println(person);
//        }
//        personListEligibleForMilitaryService.forEach(System.out::println);
        int count = 0;
        for (Person person : personListEligibleForMilitaryService) {
            if (person.getAge() == 19) {
                personListOfEligibleForMilitaryService19.add(person);
                count++;
            }
        }
        personListOfEligibleForMilitaryService19.forEach(System.out::println);
        return count;

    }

    public int getCountOfEligibleForMilitaryServiceFrom25till27() {
        Person[] persons = personRegistry.getPersons();
        List<Person> personListEligibleForMilitaryService = new ArrayList<>();
        for (Person temp : persons) {
            if (temp.getAge() >= 18 && temp.getAge() <= 27 && temp.getSex() == "male") {
                personListEligibleForMilitaryService.add(temp);
            }
        }
        List<Person> personListOfEligibleForMilitaryServiceFrom25till27 = new ArrayList<>();
        int count = 0;
        for (Person person : personListEligibleForMilitaryService) {
            if (person.getAge() >= 25 && person.getAge() <= 27) {
                personListOfEligibleForMilitaryServiceFrom25till27.add(person);
                count++;
            }
        }
        personListOfEligibleForMilitaryServiceFrom25till27.forEach(System.out::println);
        return count;
    }

    public int getCountOfPersonWithNameFromConsole(String nameInput) {
        Person[] persons = personRegistry.getPersons();
        int count2 = 0;
        for (Person person : persons) {
            if (person.getName().equals(nameInput)) {
                count2++;
            }
        }
        return count2;

    }

    public int getCountOfEligibleForMilitaryServiceFromCity() {
        Person[] persons = personRegistry.getPersons();
        List<Person> personListEligibleForMilitaryService = new ArrayList<>();
        for (Person temp : persons) {
            if (temp.getAge() >= 18 && temp.getAge() <= 27 && temp.getSex() == "male") {
                personListEligibleForMilitaryService.add(temp);
            }
        }
        List<Person> personListOfEligibleForMilitaryServiceFromCity = new ArrayList<>();
        int count = 0;
        for (Person person : personListEligibleForMilitaryService) {
            if (person.getAddress().getCity() == "Minsk") {
                personListOfEligibleForMilitaryServiceFromCity.add(person);
                count++;
            }
        }
        personListOfEligibleForMilitaryServiceFromCity.forEach(System.out::println);
        return count;


    }
}
