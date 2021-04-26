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
            } catch (NullDataException message) {
                System.out.println("вывод message в catch NullDataException:::___ " + message.getMessage());
            } catch (StartException message2) {
                System.out.println("вывод message2 в catch Start Exception:::___ " + message2);
                System.out.println("вывод результата исключения Start Exception:::___ " + message2.getMessage());
                System.out.println("вывод причины исключения Start Exception:::___ " + message2.getCause()); // не выводит первую часть строки из просто message2
            }
            System.out.println();
        }

//        System.out.println("Отдельные запуски");
//        car02.start();
//        car03.start();
//        car04.start();
//


    }
}
