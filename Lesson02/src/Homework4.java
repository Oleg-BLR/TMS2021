public class Homework4 {
    public static void main(String[] args) {
//      int mass[] = {}; // если сделать так, то пишет Index 0 out of bounds for length 0
        int mass[] = {-1000, 1, 2, 0, 3, 400, 5, -100, 99};
        int i = 0;
        int max; // для справки
        max = mass[0];
        for (int mass1 : mass) { // а здесь обходится без i++ почему-то по сравнению с 1 и 3 задачей?
            if (mass[i] > max) max = mass[i];
        }
        System.out.println("максимальное значение элементов массива 'mass' = " + max);
    }
}
