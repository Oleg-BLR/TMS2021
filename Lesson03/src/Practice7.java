import java.util.Scanner;

public class Practice7 {
    static int mm; // Что это? Это мы объявляем переменную mm типа int? static что означает?

    /**
     * объявнение
     * https://metanit.com/java/tutorial/2.4.php
     **/
    public static void main(String[] args) {
        //поговорим про массивы
        int count = 0;
        System.out.println(count);
        System.out.println(mm);
        boolean[] array = {true, false, true};
        boolean[] array3 = new boolean[4];
        array3[0] = true;
        array3[3] = true;
        boolean[] array2; // объявляем сылку на массив
        array2 = new boolean[5];
        array2[0] = true;
        for (Object i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (Object j : array2) { // почему здесь Object, а в 30 строке boolean, а работает и здесь и там? В чем разница?
            System.out.print(j + " ");
        }
        System.out.println();
        for (boolean j : array2) {
            System.out.print(j + " ");
        }
        System.out.println();
        for (boolean b : array3) {
            System.out.print(b + " ");
        }
    }

    public static void mm() { // Это ни с чем не связанный метод (или класс) mm, который выводит пустую строку?
        System.out.println();

    }

}
