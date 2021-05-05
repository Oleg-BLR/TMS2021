package homework10_old;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

//        System.out.println("Введите строку");
//        Scanner stringScanner = new Scanner(System.in);
//        String string = stringScanner.nextLine();
//        System.out.println("Вы ввели строку: " + string);
////        string = "rrrrrr";
////        System.out.println(string);
//
//
//        System.out.println("Введите фрагмент строки для поиска");
//        Scanner symbolScanner = new Scanner(System.in);
//        String simbolScanner = symbolScanner.nextLine();
//        System.out.println("Вы ищете фрагмент строки: " + simbolScanner);
//
//        int index = string.indexOf(simbolScanner);
//        if (index != -1) {
//            System.out.println("Искомый фрагмент строки начинается с " + (index + 1) + " символа");
//        } else {
//            System.out.println("Искомого фрагмента в строке нет");
//        }
//
//        // вырезаем подстроку из строки начиная с первого вхождения символа(А) до,
//        //последнего вхождения сивола(B)
//        System.out.println("Введите символ первого вхождения для начала подстроки");
//        Scanner symbolScannerA = new Scanner(System.in);
//        String simbolScannerA = symbolScanner.nextLine();
//        System.out.println("Символ первого вхождения для начала подстроки для вырезки: " + simbolScannerA);
//
//        System.out.println("Введите символ последнего вхождения для окончания подстроки");
//        Scanner symbolScannerB = new Scanner(System.in);
//        String simbolScannerB = symbolScanner.nextLine();
//        System.out.println("Символ последнего вхождения для окончания подстроки для вырезки: " + simbolScannerB);
//
//        int indexA = string.indexOf(simbolScannerA);
//        System.out.println(indexA);
//        int indexB = string.lastIndexOf(simbolScannerB);
//        System.out.println(indexB);
//
//        String cutStringAB = string.substring(indexA, indexB + 1);
//        System.out.println("Вырезанная подстрока: " + cutStringAB);
//
//        // Заменить все вхождения символа стоящего в позиции (3) на сивол стоящий в
//        // позиции 0
//        char charToReplace = string.charAt(3);
//        char charReplacement = string.charAt(0);
//        System.out.println("Символ для замены: " + charToReplace);
//        System.out.println("Символ заменитель: " + charReplacement);
//        String stringReplacement3to0 = string.replace(charToReplace, charReplacement);
//        System.out.println("Измененная строка: " + stringReplacement3to0);

        //Работа с массивом строк
        String[] stringArray = new String[7];
        stringArray[0] = "table";
        stringArray[1] = "abcba";
        stringArray[2] = "gfhjdjs";
        stringArray[3] = "vav";
        stringArray[4] = "fgh2hcc";
        stringArray[5] = "Алла";
        stringArray[6] = "Саша Ашас";

        // Добавление к строке с помощью StringBuilder и append
        System.out.println("Добавление в строку с помощью StringBuilder и append");
        String stringAppend = null;
        for (int i = 0; i < stringArray.length; i++) {
            stringAppend = null;
            stringAppend = new StringBuilder(stringArray[i]).append('s').append(125).append("s").toString();
            System.out.printf("%-30s", ("Исходная строка: " + stringArray[i]));
            System.out.printf("%-30s%n", ("Добавленная строка: " + stringAppend));
        }
        System.out.println();

        // реверс строки с помощью StringBuilder и reverse
        System.out.println("Реверс строки с помощью StringBuilder и reverse");
        String stringReverse = null;
        for (int i = 0; i < stringArray.length; i++) {
            stringReverse = null;
            stringReverse = myMethodReverseString(stringArray[i]);
            System.out.printf("%-30s", ("Исходная строка: " + stringArray[i]));
            System.out.printf("%-30s", ("Обратная строка: " + stringReverse));
            System.out.println("Строка \"" + stringArray[i] + "\"" + " является палиндромом - " +
                    stringArray[i].equalsIgnoreCase(stringReverse));
        }
        System.out.println();

        // обработка массива на наличие палиндромов и выведение их в
        // массив listPalindromes типа ArrayList
        System.out.println("Обработка массива на наличие палиндромов и выведение их в " +
                "массив listPalindromes типа ArrayList");
        System.out.println(new StringBuilder().append("Обработка массива на наличие палиндромов и выведение их в ").append("массив listPalindromes типа ArrayList").toString());
        ArrayList<String> listInitialStrings = new ArrayList<>();
        ArrayList<String> listPalindromes = new ArrayList<>();
        for (int i = 0; i < stringArray.length; i++) {
            listInitialStrings.add(stringArray[i]);
//            myMethodReverseString(stringArray[i]);
//            System.out.println(myMethodReverseString(stringArray[i]));
            if (stringArray[i].equalsIgnoreCase(myMethodReverseString(stringArray[i])))
                listPalindromes.add(myMethodReverseString(stringArray[i]));
//            String stringReverse = new StringBuilder(stringArray[i]).reverse().toString();
//            if (stringArray[i].equalsIgnoreCase(reverseString(stringArray[i])){
//                listPalindromes.add(stringReverse);
//            }
        }
        System.out.println("Массив ListArray исходных строк: " + listInitialStrings);
        System.out.println("Массив LisrArray палиндромов: " + listPalindromes);
        System.out.println();


//        ArrayList<String> stringArrayPolindrome = new ArrayList<>();
//        for (String s : stringArray) {
//            if (s.equals())
//
//        }
//
//
//    }
//    public String reverseString() {
//        String s = new StringBuilder().reverse().toString();
//        return s;
//    }

//    }
//
//    private static String reverseString(String s) {
//        String srev = new StringBuilder(s).reverse().toString();
//        return srev;
////        return s;
//    }
    }

    private static String myMethodReverseString(String s) {       // как можно этот метод поместить в файл TextFormatter?
        String srev = new StringBuilder(s).reverse().toString();
        return srev;
    }
}
