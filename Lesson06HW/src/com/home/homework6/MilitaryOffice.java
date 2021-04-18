package com.home.homework6;

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
}
