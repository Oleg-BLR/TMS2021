package com.home.homework6;

public class Address {  // возможно ли создавать базу адресов в этом классе?
    private String country;
    private String city;

    public Address(String country, String city) {
        this.country = country;
        this.city = city;
    }

    public String getCountry() { // это методы, позволяющие достучаться до private переменных
        return country;          // класса Address
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Адрес {" +
                "страна='" + country + '\'' +
                ", город='" + city + '\'' +
                '}';
    }
}
