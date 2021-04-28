package com.home.homework6;

public class PersonRegistry {
    private Person[] persons; // глобальная переменная массив людей, называемая persons

    public PersonRegistry(Person[] persons) {
        this.persons = persons;
    }

    public Person[] getPersons() {
        return persons;
    }

    public void setPersons(Person[] persons) {
        this.persons = persons;
    }
}
