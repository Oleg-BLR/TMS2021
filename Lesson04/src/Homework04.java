import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Homework04 {
    public static void main(String[] args) {

        System.out.println(summ(4, 3));
        System.out.println(summ(10, 12));
        System.out.println();
        task04 ();

//        Задачи:
//         1) Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,
//   сколько амеб будет через 3, 6, 9, 12,..., 24 часа
        System.out.println();
        System.out.println("Задача 1");
        int cells = 1;
        int hours = 0;
        while (hours <= 24) {
            if (hours % 3 == 0 && hours != 0) {
                cells = cells * 2;
                System.out.println("Количество клеток после " + hours + "ч. равно " + cells);
            }
            hours++;
        }

//        2) Напишите реализацию метода summ(int a, int b), вычисляющий a*b, не пользуясь операцией
//        умножения, где a и b целые числа, вызовите метод summ  в методе main и распечатайте на консоль.

//        System.out.println(summ(4, 3));               // Почему метод summ программа не видит,
//                                                      // если расположить вот так, с 24 по 34 строки,
//                                                      // а работает, если как у меня сейчас расположено
//                                                      // в 4,5 и 86-92 строках???
//        private static int summ(int n, int m) {
//            int mult = 0;
//            for (int i = 0; i < m; i++) {
//                mult += n;
//            }
//            return mult;
//        }


//        3) Дан двухмерный массив размерностью 4 на 4, необходимо нарисовать четыре треугольника вида

//        a)                  b)
//              *        *
//            * *        * *
//          * * *        * * *
//        * * * *        * * * *
//
//        c)                  d)
//        * * * *        * * * *
//          * * *        * * *
//            * *        * *
//              *        *

        String arr[][] = new String[4][4];
        System.out.println();
        System.out.println("Задача 3-а)");
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                if (i + j < arr.length - 1) {
                    arr [i][j] = " ";
                } else {
                    arr [i][j] = "*";
                }
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Задача 3-б)");
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                if (i >= j) {
                    arr [i][j] = "*";
                } else {
                    arr [i][j] = " ";
                }
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Задача 3-c)");
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                if (i <= j) {
                    arr [i][j] = "*";
                } else {
                    arr [i][j] = " ";
                }
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Задача 3-d)");
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                if (i + j > arr.length - 1) {
                    arr [i][j] = " ";
                } else {
                    arr [i][j] = "*";
                }
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }




//        4)В переменную записываем число.
//        Надо вывести на экран сколько в этом числе цифр и положительное оно или отрицательное.
//        Например, Введите число: 5
//        "5 - это положительное число, количество цифр = 1"

//        5) Создайте массив из всех нечётных чисел от 1 до 100, выведите его на экран в строку,
//        а затем этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 ... 7 5 3 1).

        reverseOddsArray();

//        6) Создайте массив из int[] mass = new int[12]; Рандомно заполните его значениями от 0 до 15.
//        Определите какой элемент является в этом массиве максимальным и сообщите индекс его последнего вхождения в массив.
//        Пример: {3,4,5,62,7,8,4,-5,7,62,5,1} Максимальный элемент 62, индекс его последнего вхождения в массив = 10

        maxElementAndIndex();

//        7) Создайте массив размера 20, заполните его случайными целыми чиселами из отрезка от 0 до 20.
//        Выведите массив на экран в строку. Замените каждый элемент с нечётным индексом на ноль.
//        Снова выведете массив на экран на отдельной строке.

        oddIndexConvertToZero();

//        8) Найти максимальный элемент в массиве {4,5,0,23,77,0,8,9,101,2} и поменять его местами с нулевым элементом

        maxZeroExchange();

//        9) Проверить, различны ли все элементы массива, если не различны то вывести элемент повторяющийся
//        Пример: {0,3,46,3,2,1,2}
//        Массив имеет повторяющиеся элементы 3, 2
//        Пример: {0,34,46,31,20,1,28}
//        Массив не имеет повторяющихся элементов

//        10) Создаём квадратную матрицу, размер вводим с клавиатуры.
//        Заполняем случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде матрицы).
//        Далее необходимо транспонировать матрицу(1 столбец станет 1-й строкой, 2-й столбец - 2-й строкой и т. д.)
//        Пример:
//          1 2 3 4      1 6 3 1
//          6 7 8 9      2 7 3 5
//          3 3 4 5      3 8 4 6
//          1 5 6 7      4 9 5 7

}

    private static void maxZeroExchange() {
        System.out.println();
        System.out.println("Задача 8");
        int arr[] = {4, 5, 0, 23, 77, 0, 8, 9, 101, 2};
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%4d",arr[i]);
        }
        System.out.println();

            int max = Integer.MIN_VALUE;
        int iMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                iMax = i;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = max;
            }
        }
            arr[iMax] = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%4d",arr[i]);
        }

    }

    private static void oddIndexConvertToZero() {
        System.out.println();
        System.out.println("Задача 7");
        int[] arr = new int[20];
        Random rand = new Random();
        System.out.printf("%33s","Индексы элементов матрицы");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(21);
            System.out.printf("%4d",i);
        }
        System.out.println();
        System.out.printf("%33s","Элементы исходной матрицы");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(21);
            System.out.printf("%4d",arr[i]);
        }
        System.out.println();
        System.out.printf("%33s","Элементы модифицированной матрицы");
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 !=0){
                arr[i] = 0;
//                System.out.print(arr[i] + ", ");
            }
            System.out.printf("%4d",arr[i]);
        }
        System.out.println();
    }

    private static void maxElementAndIndex() {
        System.out.println();
        System.out.println("Задача 6");
        int[] arr = new int[12];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(16);
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
        int max = Integer.MIN_VALUE;
        int indexMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
                indexMax = i;
            }
        }
        System.out.println("Максимальный элемент - " + max);
        System.out.println("Индекс максимального элемента - " + indexMax);
    }

    private static void reverseOddsArray() {
        System.out.println();
        System.out.println("Задача 5");
        ArrayList<Integer> oddsArray = new ArrayList<>();
        ArrayList<Integer> reverseOddsArray = new ArrayList<>();
        for (int i = 1; i < 100; i+=2){
            oddsArray.add(i);
        }
        System.out.println(oddsArray);
        for(int i = oddsArray.size() - 1; i >= 0; i--){
            reverseOddsArray.add(oddsArray.get(i));
        }
        System.out.println(reverseOddsArray);
    }

    private static void task04() {
        System.out.println();
        System.out.println("Задача 4:");
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите целое число:");
//        n = scan.nextInt();
        long n = scan.nextInt();
//        long n = -623598;
        float div;
        int divider = 10;
        int digit = 0;
        String posOrNeg;

        if (n == 0) {
            posOrNeg = ",";
        } else {
            if (n > 0) {
                posOrNeg = " - это положительное число,";
            } else {
                posOrNeg = " - это отрицательное число,";
            }
        }
        do {
            div = n / divider;
            divider *= 10;
            digit++;
        } while (Math.abs(div) >= 1);
        System.out.println(n + posOrNeg + " количество цифр = " + digit);
    }

    private static int summ(int n, int m) {
        System.out.println();
        System.out.println("Задача 2");
        int mult = 0;
        for (int i = 0; i < m; i++) {
            mult += n;
        }
        return mult;
    }

}

