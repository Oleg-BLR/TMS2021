public class Homework4 {
    public static void main(String[] args) {
        int mass[] = {1000, 1, 2, 0, 3, 4, 5, -100, 99};
        int i;
        int MAX; // для справки
        MAX = mass[0];
        System.out.println(MAX);
        for (i = 1; i < mass.length; i++) { // не получилось с циклом FOREACH
            if (mass[i] > MAX) MAX = mass[i];
        }
        System.out.println("максимальное значение элементов массива 'mass' = " + MAX);
    }
}
