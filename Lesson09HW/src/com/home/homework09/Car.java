package com.home.homework09;

import java.util.Random;

public class Car {
    private String brand;
    private int speed;
    private int cost;

    public Car(String brand, int speed, int cost) {
        this.brand = brand;
        this.speed = speed;
        this.cost = cost;
    }

    public Car() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void start() throws StartException, NullDataException {
        Random random = new Random();
        int randomNumber = random.nextInt(21);
        System.out.println("Случайное число: " + randomNumber);
        if (!(brand.equals(null)) || speed != 0 || cost != 0) { // ошибка Cannot invoke "String.equals(Object)" because "this.brand" is null
            // Что делать? Не попадает в "неверные данные"
            if (randomNumber % 2 != 0) {
                System.out.println("Автомобиль: " + brand + " завелся!, прописано в start Car");
            } else {
                throw new StartException(brand + " не смог завестись, прописано в start Car");
            }
        } else {
            throw new NullDataException("неверные данные");
        }
    }
}
