import java.util.Scanner;

public class Computer {
    String processor;
    int ram;
    int hdd;
    int cycleOnOff;
    Boolean turnedOn = true; // почему по умолчанию значение null?
    Boolean burnedOut = false;

//    public Computer(String processor, int ram, int hdd) { // Почему у вас два конструктора? И, видимо, программа видит только один?
//        this.processor = processor;                       // И почему программа не воспринимает этот конструктор? Потому, что уже есть компьютер с введенным числом циклов?
//        this.ram = ram;
//        this.hdd = hdd;
//    }

    public Computer(String processor, int ram, int HDD, int cycleOnOff) {
        this.processor = processor;
        this.ram = ram;
        this.hdd = HDD;
        this.cycleOnOff = cycleOnOff;
    }

//        @Override
//        public String toString() { // На основе этой генерации я сделал public void computerInfo() ниже. По-другому можно было сделать?
//            return "Computer{" +
//                    "processor='" + processor + '\'' +
//                    ", ram=" + ram +
//                    ", HDD=" + HDD +
//                    ", cycleOnOff=" + cycleOnOff +
//                    ", turnedOn=" + turnedOn +
//                    ", burnedOut=" + burnedOut +
//                    '}';
//        }

    public void computerInfo() {
        System.out.println("Процессор - " + processor + ", Оперативная память, Гб - " + ram + ", Жесткий диск, Тб - " + hdd + ", Ресурс, кол-во включений - " + cycleOnOff + ", Компьютер включен - " + turnedOn + ", Компьютер сгорел - " + burnedOut);

    }

    public boolean on() {
        System.out.println("Включение...");
        if (!burnedOut) {
            if (cycleOnOff != 0 && action()) {
                turnedOn = true;
                System.out.println("Компьютер включен");
                return true;
            } else {
                System.out.println("Компьютер горит");
                burnedOut = true;
                cycleOnOff--;
                return false; //где используются это и другие значения return?
            }
        } else {
            System.out.println("Компьютер сгорел");
            return false;
        }
    }

    public void off() {
        if (turnedOn) {
            turnedOn = false;
            System.out.println("Компьютер выключен");
            cycleOnOff--;
        }
    }

    public boolean action() {
        System.out.println("Внимание! Введите 0 или 1");
        Scanner scan = new Scanner(System.in);
        while (true) {
            if (scan.hasNextLine()) {
                int x = scan.nextInt();
                if (x == 0 || x == 1) {
                    int rand = (int) (Math.random() * 2);
                    System.out.println("Случайное число - " + rand);
                    if (x == rand) {
                        System.out.println("action = true");
                        return true;
                    } else {
                        System.out.println("action = false");
                        return false;
                    }
                }
            }
        }
    }

    public void numberOfCycles() {
        System.out.println("Осталось циклов - " + cycleOnOff);
    }

}
