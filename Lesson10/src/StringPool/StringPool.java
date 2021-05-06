package StringPool;

public class StringPool {
    public static void main(String[] args) {
        String a = "string a";
        String b = new String("string a");
        String c = b.intern();

        System.out.println("String a = \"string a\": " + a);
        System.out.println("String b = new String(\"string a\"): " + b);
        System.out.println("String c = b.intern(): " + c);
        System.out.println();

        System.out.println(a == b); //false
        System.out.println(b == c); //false
        System.out.println(a == c); //true
        System.out.println();

        System.out.println("a == b: " + a == b); //?? где "a == b: " ???  false
        System.out.println("b == c: " + b == c); //?? где "b == c: " ???  false
        System.out.println("a == c: " + a == c); //?? где "a == c: " ???  false !!!???????
    }
}
