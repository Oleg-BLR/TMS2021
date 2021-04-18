package com.home.homework6;

public class Person {
//    public String infoPerson;
//    public String infoPerson;
private String name;
    private int age;
    private String sex;
    private Address address;
    private int number;
    public static int count = 0;

    public Person(String name, int age, String sex, Address address, int number) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.address = address;
        this.number = number;
        count++;
    }

    public Person(String name, int number) {
        this.name = name;
        this.number = number;
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return //"Запись №" + count + //
                " {" +
                        "Имя='" + name + '\'' +
                        ", Возраст=" + age +
                        ", пол='" + sex + '\'' +
                        ", адрес=" + address +
                        ", номер регистрации=" +
                        number +
                        '}';
    }

    public String infoPerson() {   // почему то не видит этот метод
        String s = "Запись № -" + count +
                "Имя - " + name +
                "Возраст - " + age +
                "Город - " + address.getCity();
        return s;
    }
}
