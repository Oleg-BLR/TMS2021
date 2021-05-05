package TryFinally;

public class TryFinallyReference {

    public static void main(String[] args) {
        System.out.println("start");
        Person person = method();
        System.out.println(person);//Three
    }

    private static Person method() {
        Person person = new Person();
        person.setName("One");
        try {
            person.setName("Two");
            return person;
        } finally {
            person.setName("Three");
        }
    }

}
