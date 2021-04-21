import java.util.Arrays;

public class Homework {

    public static void main(String[] args) {
        //Некоторые тесты для проверки задач.
        System.out.println(sum(2147483000, 647));
        System.out.println(sum(2147482999, 648));
        System.out.println(sum(2147483000, 648));
        System.out.println(sum(Integer.MAX_VALUE, Integer.MAX_VALUE));
        boolean d = nn(true, false);
        System.out.println(d);
        System.out.println(str(2147483000, 648));
        checkValue(d);
        System.out.println(" ");
        System.out.println(max(56, 349));
        System.out.println(" ");
        System.out.println(average(new int[]{6, 2, 3, 1, 5, 6, 7}));
        System.out.println(average(null));
        System.out.println(average(new int[]{}));
        System.out.println(average(new int[0]));
        System.out.println(" ");
        System.out.println(max(new int[]{-1, 0, -3, -4, -5, -100, -99}));
        System.out.println(max(null));
        System.out.println(max(new int[0]));
        System.out.println(" ");
        System.out.println(calculateHypotenuse(3,4));
    }


    /**
     * 1. Метод должен вернуть сумму двух чисел a и b
     * 2. Дополнительно: сделать проверку если сумма a и b больше чем максимальное значение int то вернуть -1
     **/
    public static int sum(int a, int b) {
        int sum = a + b;
//        if (a > Integer.MAX_VALUE - b) { // с таким условием работает все отлично
        if (a + b > Integer.MAX_VALUE) { // почему с этим условием для sum(2147483000, 648) выводит -2147483648, а не -1 (или -2)
            // а при sum(Integer.MAX_VALUE, Integer.MAX_VALUE) выводит -2, а не -1
            return -1;
        }
        return a + b;
    }

    public static boolean nn(boolean a, boolean b) {
        return a || b;
    }

    public static String str(int a, int b) {
        int sum = a + b;
        if (a > Integer.MAX_VALUE - b) {
            return "out of INT range"; // возможен ли в данной строке вывод типа "значение а + значение и b out of INT range"
            // или например "значение суммы out of INT range"???
        }
        return "ok";
    }

    private static boolean checkValue(boolean d) {
        System.out.println(d);
        return d;
    }

    //    /**
//     *
//     * Метод должен вернуть максимальное значение из двух чисел
//     *
//     * <p>
//     * Example1:
//     * a = 4,
//     * b = 5
//     * <p>
//     * Метод должен вернуть 5
//     * Example2:
//     * a = 10,
//     * b = 10
//     * <p>
//     * Метод должен вернуть 10
//     */
    public static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    //    /**
//     * Метод должен вернуть среднее значение из массива чисел
//     * (необходимо сумму всех элеменов массива разделить на длину массива)
//     * <p>
//     * Example:
//     * array = {1,2,3,4,5}
//     * Метод должен return 3.0
//     */
    public static double average(int[] array) {
        if (array != null && array.length > 0) {
//            int sum = 0;
            double sum = 0;
            for (int i : array) {
                sum += i;
            }
            return (double) sum / array.length;
//            return sum / array.length;
        }
        return 0;
    }

    //
//    /**
//     * Метод должен вернуть максимальый элемент массива. Пример: array = {1,2,10,3} метод возвращает 10
//     **/
    public static int max(int[] array) {
//        int max = Integer.MIN_VALUE;
//        for (int i : array) {
//            if (i > max) {
//                max = i;
//            }
//        }
//        return max;

        if (array != null && array.length > 0) {
            return Arrays.stream(array).max().orElse(-100); // в чем смысл двойного else и можно ли без второго else?
        } else {
            return 0;
        }

    }

    //
//    /**
//     * Используя теорему Пифагора, вычислите значение гипотенузы. Квадрат гипотенузы = сумме квадратов катетов
//     *
//     * Example1:
//     * 3
//     * 4
//     * return 5
//     * <p>
//     * Example2:
//     * 12
//     * 16
//     * return 20
//     */
    public static double calculateHypotenuse(int a, int b) {
        return Math.hypot(a, b);
    }
}