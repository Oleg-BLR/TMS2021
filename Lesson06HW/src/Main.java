public class Main {

    public static void main(String[] args) {

//        class Address {
//            private String country;
//            private String city;
//
//            public Address(String country, String city) {
//                this.country = country;
//                this.city = city;
//            }
//        }
        Address address001 = new Address("Беларусь", "Минск");
        System.out.println(address001); //не выводит значения, только ссылку на ячейку памяти


//        class Person {
//            private String name;
//            private int age;
//            private String sex;
//            private Address address;
//
//            public Person(String name, int age, String sex, Address address) {
//                this.name = name;
//                this.age = age;
//                this.sex = sex;
//                this.address = address;
//            }
//        }

        Person person001 = new Person("Михаил", 21, "MALE", address001);
        System.out.println(person001); //не выводит значения, только ссылку на ячейку памяти

        Person[] persons = new Person[10];
        persons[0] = person001;
        for (Person person : persons) {
            System.out.println(person);
        }
    }
}
