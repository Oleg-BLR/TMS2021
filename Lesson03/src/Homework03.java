import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Homework03 {

    public static void main(String[] args) {
        //Некоторые тесты для проверки задач. Можно также написать свои тесты.
//        printArray();
//        System.out.println(operation(1));
//        System.out.println(operation(0));
//        System.out.println();
//        System.out.println("Задача про количество нечетных элементов массива");
//        System.out.println(" - Количество нечетных элементов массива " + calculateCountOfOddElementsInMatrix(new int[]{1, 2, 3, 4, 5, 6}));
//        System.out.println();
//        System.out.println("Задача про склонение программистов");
//        countDevs(103);
//        countDevs(20);
//        countDevs(21);
//        countDevs(55);
//        countDevs(11);
//        countDevs(9);
//        countDevs(2);
//        countDevs(1);
//        countDevs(111);
//        countDevs(1001);
//        countDevs(1011);
//        countDevs(1003021);
//        countDevs(1004);
//        countDevs(121);
//        countDevs(124);
//        countDevs(125);
//        System.out.println();
//        System.out.println("Задача про foobar (деление на 3 и на 5)");
//        foobar(6);
//        foobar(10);
//        foobar(15);
//        foobar(17);
//        foobar(22);
//        System.out.println();
//        System.out.println("Задача про сумму диагональных элементов матрицы");
//        calculateSumOfDiagonalElements();
//        System.out.println();
//        System.out.println("Задача про замену элементов матрицы");
//        printMatrix();
        printPrimeNumbers();
        printPrimeNumbers3();
        printPrimeNumbers2();
    }

//    /**
//     * Необходимо прочитать с консоли значение числа типа int,
//     * далее создать одноменрый массив типа int размера прочитаного с консоли
//     * далее заполнить массив случайными значениями
//     * далее вывести массив на консоль
//     */
//    private static void printArray() {
//        Scanner scan = new Scanner(System.in);
//        Random rand = new Random();
//        System.out.println("Введите длину массива:");
//        int n = scan.nextInt();
//        System.out.println();
//        Integer arr[] = new Integer[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = rand.nextInt(100000);
//        }
//        for (int i = 0; i < n; i++) {
//            System.out.println(arr[i]);
//        }
//        System.out.println();
//        for (int i = 0; i < n; i++) {
//            System.out.print(arr[i] + " ");
//        }
//    }
//
//    /**
//     * Метод должен выполнять некоторую операцию с int "number" в зависимости от некоторых условий:
//     * - if number положительное число, то необходимо number увеличить на 1
//     * - if number отрицательное - уменьшить на 2
//     * - if number равно 0 , то замените значение number на 10
//     * вернуть number после выполнения операций
//     */
//    public static int operation(int number) {
//        System.out.println();
//        System.out.println();
//        System.out.println("Введите целое число");
//        Scanner scan = new Scanner(System.in);
//        number = scan.nextInt();
//        if (number > 0) {
//            ++number;
//        } else {
//            if (number < 0) {
//                --number;
//            } else {
//                number = 10;
//            }                           // Почему-то программа не останавливается, два раза просит ввести число.
//        }
////        switch (number) {             //  почему-то со switch case не получилось. Почему?
////            case (number > 0):
////                ++number;
////                break;
////            case (number < 0):
////                --number;
////                break;
////            case (number == 0):
////                number = 10;
////                break;
//        return number;
//    }
//
//    /**
//     * На вход приходит массив целых чисел типа int
//     * Необходимо найти количество нечетных элементов в массиве и вернуть значение в метод main,
//     * в котором это значение распечатается на консоль.
//     */
//    public static int calculateCountOfOddElementsInMatrix(int[] ints) {
//        for (int i : ints) {
//            System.out.print(i + " ");
//        }
//        int count = 0;
//        for (int i : ints) {
//            if (i % 2 != 0) {
//                ++count;
//            }
//        }
//        return count;
//    }
//
//    /**
//     * На вход приходит число.
//     * Вывести в консоль фразу из разряда "_COUNT_ программистов",
//     * заменить _COUNT_ на число которое пришло на вход в метод и заменить окончание в слове "программистов" на
//     * уместное с точки зрения русского языка.
//     * Пример: 1 программист, 42 программиста, 50 программистов
//     *
//     * @param count - количество программистов
//     */
//    public static void countDevs(int count) {
////        Scanner scan = new Scanner(System.in);
////        System.out.println("Введите целое положительное число:");
////        count = scan.nextInt();
////        System.out.println();
//        if (count % 100 > 20) {
//            if (count % 10 == 1) {
//                System.out.println(count + " программист");
//            } else {
//                if (count % 10 == 2 || count % 10 == 3 || count % 10 == 4) {
//                    System.out.println(count + " программиста");
//                } else {
//                    System.out.println(count + " программистов");
//                }
//            }
//        } else {
//            if (count % 100 == 1) {
//                System.out.println(count + " программист");
//            } else {
//                if (count % 10 == 2 || count % 10 == 3 || count % 10 == 4) {
//                    System.out.println(count + " программиста");
//                } else {
//                    System.out.println(count + " программистов");
//                }
//            }
//        }
//    }
//
//
//    /**
//     * Метод должен выводить разные строки в консоли в зависимости от некоторых условий:
//     * - если остаток от деления на 3 равен нулю - выведите "foo" (example of number - 6)
//     * - если остаток от деления на 5 равен нулю - вывести "bar" (example of number - 10)
//     * - если остаток от деления на 3 и 5 равен нулю 0 ,то вывести "foobar" (example of number - 15)
//     */
//    public static void foobar(int number) {
//        System.out.print(number);
//        if (number % 3 == 0 && number % 5 == 0) {
//            System.out.println(" - foobar");
//        } else {
//            if (number % 3 == 0) {
//                System.out.println(" - foo");
//            } else {
//                if (number % 5 == 0) {
//                    System.out.println(" - foo");
//                } else {
//                    System.out.println(" - не делится без остатка ни на 3, ни на 5");
//                }
//            }
//        }
//    }
//
//    /**
//     * заполнить рандомно 2-х мерный массив и посчитать сумму элементов на диагонали
//     */
//    public static void calculateSumOfDiagonalElements() {
//        Scanner scan = new Scanner(System.in);
//        Random rand = new Random();
//        System.out.println("Введите количество строк массива:"); // по идее матрица должна быть квадратная n=m
//        int n = scan.nextInt();
//        System.out.println("Введите количество столбцов массива:");
//        int m = scan.nextInt();
//        System.out.println();
//        Integer arr[][] = new Integer[n][m];
//        for (int i = 0; i < n; i++) {
//            System.out.println();
//            for (int j = 0; j < m; j++) {
//                arr[i][j] = rand.nextInt(100);
//                System.out.print(arr[i][j] + " ");
//            }
//        }
//        System.out.println();
//        int sumDiag = 0;
//        if (n > m) {
//            for (int i = 0; i < m; i++) {
//                sumDiag += arr[i][i];
//            }
//        } else {
//            for (int i = 0; i < n; i++) {
//                sumDiag += arr[i][i];
//            }
//        }
//        System.out.println("Сумма диагональных элементов матрицы = " + sumDiag);
//    }
//
//
//        /**
//         * Шаги по реализации:
//         * - Прочитать два int из консоли
//         * - Создайте двумерный массив int (используйте целые числа, которые вы читаете по высоте и ширине консоли)
//         * - Заполнить массив случайными значениями (до 100)
//         * - Вывести в консоль матрицу заданного размера, но:
//         * - Если остаток от деления элемента массива на 3 равен нулю - выведите знак "+" вместо значения элемента массива.
//         * - Если остаток от деления элемента массива на 7 равен нулю - выведите знак "-" вместо значения элемента массива.
//         * - В противном случае выведите "*"
//         * <p>
//         * Example:
//         * - Значения с консоли - 2 и 3
//         * - Массив будет выглядеть так (значения будут разными, потому что он случайный)
//         * 6 11 123
//         * 1 14 21
//         * - Для этого значения вывод в консоли должен быть:
//         * <p>
//         * + * *
//         * * - +
//         * <p>
//         * Обратите внимание, что 21% 3 == 0 и 21% 7 = 0, но выводить надо не +-, а +
//         */
//        public static void printMatrix () {
//            Scanner scan = new Scanner(System.in);
//            Random rand = new Random();
//            System.out.println("Введите количество строк массива:");
//            int n = scan.nextInt();
//            System.out.println("Введите количество столбцов массива:");
//            int m = scan.nextInt();
//            System.out.println();
//            Integer arr[][] = new Integer[n][m];
//            System.out.println("Исходная матрица случайных значений");
//            for (int i = 0; i < n; ++i) {
//                for (int j = 0; j < m; j++) {
//                    arr[i][j] = rand.nextInt(22);
//                    System.out.print(arr[i][j] + " ");
//                }
//                System.out.println();
//            }
//            System.out.println();
//            System.out.println("Модифицированная матрица");
//            for (int i = 0; i < n; i++) {
//                for (int j = 0; j < m; j++) {
//                    if (arr[i][j] % 3 == 0) {
//                        System.out.print("+ ");
//                    } else {
//                        if (arr[i][j] % 7 == 0) {
//                            System.out.print("- ");
//                        } else {
//                            System.out.print("* ");
//                        }
//                    }
//                }
//                System.out.println();
//            }
//        }
//
//        /**
//         * Задача со звездочкой!
//         * Метод должен печатать все простые числа <1000
//         * что такое просто число (https://www.webmath.ru/poleznoe/formules_18_5.php)
//         */
////        public static void printPrimeNumbers () {
////            // тут пишем логику
////        }
//        * что такое просто число (https://www.webmath.ru/poleznoe/formules_18_5.php)
//            */
            public static void printPrimeNumbers() {
        for (int i = 2; i < 1000; i++) {
            boolean isPrimeNumber = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }
            if (isPrimeNumber) {
                System.out.print(i + " ");
            }
        }
                System.out.println();
            }

    public static void printPrimeNumbers3() { // этом методе не выводится 2, можно ли для этого метода что-то сделать?
        int count = 0;
        for (int i = 2; i < 1000; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    break;
                }
                if (i == j + 1) {
                    count++;
                    System.out.print(i + " ");
                }
            }
        }
        System.out.println();
        System.out.println(count);
    }

    public static void printPrimeNumbers2() {
        int currentNumber = 1;
        ArrayList<Integer> foundPrimes = new ArrayList<Integer>();
        checkingPrimes:
        while (currentNumber < 1000) {
            currentNumber++;
            for (int prime : foundPrimes) { // здесь непонятно, почему prime это первое значение массива простых чисел
                                            // или это потому, что данный тип цикла предназначен для прохода по каждому
                                            // значению массива foundPrime, которое присваивается переменной prime
                                            // на каждом шаге итерации? Я правильно понял?
                if (currentNumber % prime == 0) {
                    continue checkingPrimes;
                }
            }
            foundPrimes.add(currentNumber);
        }
        System.out.println(foundPrimes.toString());
    }
}
