package com.home.homework09;

public class Main {

    public static void main(String[] args) {

        Car car01 = new Car("AUDI", 250, 30000);
        Car car02 = new Car("MERCEDES", 260, 50000);
        Car car03 = new Car("TOYOTA", 220, 250000);
        Car car04 = new Car();

        Car[] cars = {car01, car02, car03, car04};
        for (int i = 0; i < cars.length; i++) {
            System.out.println("Заводим автомобиль " + cars[i].getBrand() + " ....");
            try {
                cars[i].start();
            } catch (StartException | NullDataException e) {
                System.out.println(e);
            }
            System.out.println();
        }
//        car02.start();
//        car03.start();
//        car04.start();
//


    }
}
