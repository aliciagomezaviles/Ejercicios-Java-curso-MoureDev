package oop;

public class Classes {

    public static void main(String[] args) {

        var person = new Person("Alicia", 39);

//        person.name = "Alicia";
//        person.age = 39;

        person.sayHello();

        System.out.println(person.name);

        person.name = "Alicia Gómez";
        System.out.println(person.name);

        var person2 = new Person("Bob", 17);
        person2.sayHello();
    }
}

