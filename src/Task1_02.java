public class Task1_02 {
    public static void main(String[] args) {
        int count = 0;
        for (String arg : args)
            System.out.println(args);
        for (String arg : args){
            int n = Integer.parseInt(args);
            if (n > 0){
                count +=1;
            }
        }
        System.out.println("Kolichestvo polozhitelnyh chisel = " +count);
    }
}