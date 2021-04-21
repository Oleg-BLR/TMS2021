public class ComputerTest {
    public static void main(String[] args) {

        Computer computer01 = new Computer("Intel(R) Core(TM) i5-7300HQ", 16, 2, 5);
        Computer computer02 = new Computer("Intel(R) Core(TM) i7-7300HQ", 32, 4, 15);
//        Computer computer01 = new Computer("Intel(R) Core(TM) i5-7300HQ", 16, 2, 2000);
        computer01.computerInfo();
        for (int i = 1; i < computer01.cycleOnOff + 1; i++) {
            computer01.on();
            if (computer01.burnedOut) {
                break;
            }
            computer01.off();
            computer01.numberOfCycles();
//            computer01.action();
//        System.out.println(computer01.action()); Как можно вывести результат метода action?

        }
        System.out.println("Компьютер сгорел");
        ; // я добавил, иначе на включении с action false мне кажется никогда не дойдет до "Компьютер сгорел"
        computer01.numberOfCycles();

        computer02.computerInfo();

    }
}

/*

 */