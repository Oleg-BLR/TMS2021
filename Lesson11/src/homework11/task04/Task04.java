package homework11.task04;

import java.io.*;

public class Task04 {
    private static String FILE_CAR = "Lesson11/resources/lesson11Car.ser";

    public static void main(String[] args) {
        CarTask11_04 car01 = new CarTask11_04("Mersedes", 300, 35000);
        System.out.println(car01.toString());
        System.out.println("------------");

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(FILE_CAR))) {
            outputStream.writeObject(car01);
        } catch (IOException e) {
            e.printStackTrace();
        }
        CarTask11_04 carFromFile = null;
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(FILE_CAR))) {
            carFromFile = (CarTask11_04) inputStream.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(carFromFile); // подскажите, почему выводит null?
    }
}

