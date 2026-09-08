package oop;

import java.util.ArrayList;

public class ClassesExercises {

    public static void main(String[] args) {

        // 1. Crea una clase Book con atributos title y author. Crea un objeto y muestra
        // sus datos.

        var book = new Book("'La Celestina'", "Fernando de Rojas");

        book.titleBook();

        // 2. Crea una clase Dog con un método bark() que imprima su sonido.

        var dog = new Dog("Guau, Guau");

        dog.Bark();

        // 3. Añade un constructor a la clase Book que reciba title y author.

        var book2 = new Book("'Harry Potter y la Piedra filosofal'", "J.K. Rowling");
        book2.titleBook();

        // 4. Crea una clase Car con atributos brand y model y un método showData().

        var car = new Car("Ford", "Fiesta");
        car.showData();

        // 5. Crea una clase Student con atributo score y un método que diga si aprueba
        // (mayor o igual a 60).

        var student = new Student(75.5);
        student.ratings();

        // 6. Crea una clase BankAccount con atributo balance y un método deposit() que
        // sume el saldo.

        var bankAccount = new BankAccount(250.35, 125.15);
        bankAccount.deposit();

        // 7. Crea una clase Rectangle con métodos para calcular el área y el perímetro.

        var rectangle = new Rectangle(3.2, 2.7);
        rectangle.Area();
        rectangle.Perimeter();

        // 8. Crea una clase Worker que reciba nombre y salario, y un método para
        // mostrar su salario.

        var worker = new Worker("Alicia", 1250.00);
        var worker2 = new Worker("Bob", 1220.50);
        var worker3 = new Worker("Paul", 2320.36);

        worker.showSalary();
        worker2.showSalary();
        worker3.showSalary();

        // 9. Crea varios objetos Person y guárdalos en un ArrayList.

        ArrayList<Person> people = new ArrayList<>();

        people.add(new Person("Bob", 23));
        people.add(new Person("Charlie", 38));
        people.add(new Person("Paul", 40));

        System.out.println("Lista de personas:");
        for (Person person : people) {
            person.sayHello();
        }

        // 10. Crea una clase Product y un método que aplique un descuento sobre su
        // precio.

        var product = new Product(100.00, 10.00);

        product.discount();
    }
}

