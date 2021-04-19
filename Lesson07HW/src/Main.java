public class Main {

    public static void main(String[] args) {
        Car car01 = new Car(120, 250, 1500, "Audi", 4, 11, "Crossover", 5);


        System.out.println(car01); // не выводит всю информацию

        // не цепляет метод displayInfo, почему?
    }
}
