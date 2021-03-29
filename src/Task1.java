public class Task1 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < args.length; i++) //вывод введенных значений в консоль
            System.out.println(args[i]);      // Подскажите, как сделать через цикл FOREACH
        for (int i = 0; i < args.length; i++){
            int n = Integer.parseInt(args[i]);
            if (n > 0){
                count +=1;
            }
        }
            System.out.println("Количество положительных чисел = " +count);
    }
}
