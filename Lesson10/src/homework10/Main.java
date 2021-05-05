package homework10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Введите строку");
        Scanner stringScanner = new Scanner(System.in);
        String string = stringScanner.nextLine();
        System.out.println("Вы ввели строку: " + string);
//        string = "rrrrrr";
//        System.out.println(string);


        System.out.println("Введите фрагмент строки для поиска");
        Scanner symbolScanner = new Scanner(System.in);
        String simbolScanner = symbolScanner.nextLine();
        System.out.println("Вы ищете фрагмент строки: " + simbolScanner);

        int index = string.indexOf(simbolScanner);
        if (index != -1) {
            System.out.println("Искомый фрагмент строки начинается с " + (index + 1) + " символа");
        } else {
            System.out.println("Искомого фрагмента в строке нет");
        }

        // вырезаем подстроку из строки начиная с первого вхождения символа(А) до,
        //последнего вхождения сивола(B)
        System.out.println("Введите символ первого вхождения для начала подстроки");
        Scanner symbolScannerA = new Scanner(System.in);
        String simbolScannerA = symbolScanner.nextLine();
        System.out.println("Символ первого вхождения для начала подстроки для вырезки: " + simbolScannerA);

        System.out.println("Введите символ последнего вхождения для окончания подстроки");
        Scanner symbolScannerB = new Scanner(System.in);
        String simbolScannerB = symbolScanner.nextLine();
        System.out.println("Символ последнего вхождения для окончания подстроки для вырезки: " + simbolScannerB);

        int indexA = string.indexOf(simbolScannerA);
        System.out.println(indexA);
        int indexB = string.lastIndexOf(simbolScannerB);
        System.out.println(indexB);

        String cutStringAB = string.substring(indexA, indexB);
        System.out.println("Вырезанная подстрока: " + cutStringAB);

        // Заменить все вхождения символа стоящего в позиции (3) на сивол стоящий в
        // позиции 0
        char charToReplace = string.charAt(3);
        char charReplacement = string.charAt(0);
        System.out.println("Символ для замены: " + charToReplace);
        System.out.println("Символ заменитель: " + charReplacement);
        String stringReplacement3to0 = string.replace(charToReplace, charReplacement);
        System.out.println("Измененная строка: " + stringReplacement3to0);

        //В исходном файле находятся слова, каждое слово на новой стороке. После
        //запуска программы должен создать файл, который будет содержать в себе
        //только полиндромы
        String[] stringArray = new String[5];
        stringArray[0] = "table";
        stringArray[1] = "abcba";
        stringArray[1] = "gfhjdjs";
        stringArray[1] = "vav";
        stringArray[1] = "fgh2hcc";

//        ArrayList<String> stringArrayPolindrome = new ArrayList<>();
//        for (String s : stringArray) {
//            if (s.equals())
//
//        }
//
//
//    }
//    public static String reverseString() {
//        String s = new StringBuilder().reverse().toString();
//        return s;
//    }

    }
}
