public class Homework3 {
    public static void main(String[] args) {
        int mass[] = {2, 3, 4, 5, 6};
        int count = 0;
        int sum = 0;
        int i;
        for (i = 0; i < mass.length; i++){ // не получилось с циклом FOREACH
            count ++;
            sum =+mass [i];
            System.out.println(mass); //выводит [I@568db2f2 на каждое значение. Почему?
        }
        System.out.println("количество элементов массива 'mass' = " + count); // подсчет элементов проходит
        System.out.println("сумма элементов массива 'mass' = " + sum); // сумму не считает
        double AVR = sum/count;
        System.out.println("среднее значение элементов массива 'mass' = " + AVR); // соответственно среднее не считает также
    }
}
