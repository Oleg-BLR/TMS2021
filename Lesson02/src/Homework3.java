public class Homework3 {
    public static void main(String[] args) {
        int mass[] = {6, 3, 4, 4, 5, 6, 10};
        int count = 0;
        int sum = 0;
        int i = 0;
        for (int mass1 : mass) { // iter выдал мне такой код, что такое mass1?
            count ++;
            sum += mass[i];
            System.out.println(mass[i]);
            i ++; // почему здесь нужна эта строка, ведь в другой задаче работало без нее?

//            public class Task1_02 {
//                public static void main(String[] args) {
//                    int count = 0;
//                    for (String arg : args)
//                        System.out.println(arg);
//                    for (String arg : args){
//                        int n = Integer.parseInt(arg);
//                        if (n > 0) count +=1;
//                    }
//                    System.out.println("Kolichestvo polozhitelnyh chisel = " +count);
//                }
//            }

        }
        System.out.println("количество элементов массива 'mass' = " + count);
        System.out.println("сумма элементов массива 'mass' = " + sum);
        double avr = sum/count;
        System.out.println("среднее значение элементов массива 'mass' = " + avr); // почему не считает точное значение, надо все переменные объявить double?
    }
}
