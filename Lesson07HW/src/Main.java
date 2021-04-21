import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Car tr01 = new Car(120, 250, 1.5, "Audi", 4, 11, "Crossover", 5);
        Track tr02 = new Track(450, 200, 4, "MAN", 6, 20, 20);
        CivilAir tr03 = new CivilAir(1000, 800, 10, "Embrier", 20, 3, 50, true);
        MilitaryAir tr04 = new MilitaryAir(2000, 2300, 30, "SU", 15, 1, true, 10);


        System.out.println();
        System.out.println("Вывод System.out.println(tr01)");
        System.out.println(tr01); // Почему не выводит всю информацию?
        System.out.println();
        System.out.println("Вывод String s1 = tr01.toString()");
        String s1 = tr01.toString();
        System.out.println(s1); // Почему также не выводит всю информацию?

        System.out.println();
        System.out.println("Вывод displayInfo()");
        tr01.displayInfo();
        tr02.displayInfo();
        tr03.displayInfo();
        tr04.displayInfo();

        System.out.println();
        System.out.println("Перевод мощности легкового автомобиля в кВт");
        String s = tr01.displayInfo2();
        System.out.print("Мощность автомобиля " + s + " в кВт = ");
//        System.out.println("Перевод мощности в кВт автомобиля " + );
        System.out.println(tr01.kVtCoversion());

        System.out.println();
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("Задача легкового автомобиля");
        System.out.println("Введите количество часов езды легкового автомобиля");
        Scanner scanner = new Scanner(System.in);
        int hourInput = scanner.nextInt();
        Car.distanceFuelconsumptionCalculation(hourInput);
//
//    }
    }
}
