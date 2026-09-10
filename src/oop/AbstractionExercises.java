package oop;

public class AbstractionExercises {

    public static void main(String[] args) {

        // 1. Crea una clase abstracta Shape con el método calculateArea(). Luego
        // implementa dos subclases: Circle y Rectangle, y haz que cada una calcule su
        // propia área.

        Shape circle = new Circle(2.0);
        System.out.println("Área del círculo :" + circle.calculateArea());

        Shape rectangle = new Rectangle(3.0, 4.0);
        System.out.println("Área del rectángulo :" + rectangle.calculateArea());


        // 2. Crea una interfaz Playable con el método play(). Luego implementa esa
        // interfaz en dos clases: Guitar y Piano. Cada una debe mostrar un mensaje
        // diferente al ejecutarse.

        Playable guitar = new Guitar();
        guitar.play();

        Playable piano = new Piano();
        piano.play();

        // 3. Define una clase abstracta Animal con el método makeSound(). Implementa
        // Dog y Cat para que hagan sonidos distintos. Crea un array de Animal para
        // mostrar polimorfismo.

        Animal[] animals = { new Dog(), new Cat()};
        for (Animal animal : animals) {
            animal.makeSound();
        }

        // 4. Crea una interfaz Drawable. Implementa las clases Circle, Square, y
        // Triangle que muestren cómo se dibuja cada figura usando draw().

        /*Drawable drawableCircle = new DrawableCircle();
        drawableCircle.draw();

        Drawable drawableSquare = new DrawableSquare();
        drawableSquare.draw();

        Drawable drawableTriangle = new DrawableTriangle();
        drawableTriangle.draw(); */

        Drawable[] drawings = { new DrawableCircle(), new DrawableSquare(), new DrawableTriangle() };
        for (Drawable drawing : drawings) {
            drawing.draw();
        }


        // 5. Crea una clase abstracta Employee con un método calculateSalary().
        // Implementa FullTimeEmployee y PartTimeEmployee con lógica diferente para
        // calcular el salario.

        Employee fullTime = new FullTimeEmployee(3000.0);
        Employee partTime = new PartTimeEmployee(20, 15.0);
        System.out.println("Salario empleado tiempo completo: $" + fullTime.calculateSalary());
        System.out.println("Salario empleado medio tiempo: $" + partTime.calculateSalary());


        // 6. Crea una interfaz Movable con el método move(). Haz que las clases Car y
        // Robot implementen ese método con comportamientos diferentes.

        Movable car = new Car();
        car.move();

        Movable robot = new Robot();
        robot.move();


        // 7. Crea una clase abstracta Appliance con método turnOn() y turnOff().
        // Implementa TV y WashingMachine con mensajes diferentes al encender y apagar.

        Appliance tv = new TV();
        tv.turnOn();
        tv.turnOff();

        Appliance washingmachine = new WashingMachine();
        washingmachine.turnOn();
        washingmachine.turnOff();


        // 8. Crea dos interfaces Flyable y Swimmable. Crea una clase Duck que
        // implemente ambas interfaces y muestre cómo puede volar y nadar.

        Duck duck = new Duck();

        duck.fly();
        duck.swim();


        // 9. Crea una clase abstracta Document con el método print(). Luego crea
        // PDFDocument y WordDocument, cada una con su forma de imprimir.

        Document pdfdocument = new PDFDocument();
        Document worddocument = new WordDocument();

        pdfdocument.print();
        worddocument.print();


        // 10. Crea una interfaz Payable con el método pay(). Luego implementa las
        // clases Invoice y EmployeePayment, cada una mostrando un mensaje de pago
        // diferente.

        /* Payable invoice = new Invoice();
        Payable employeePayment = new EmployeePayment();

        invoice.pay();
        employeePayment.pay(); */

        Payable invoice = new Invoice(500.0);
        Payable employeePayment = new EmployeePayment("Alicia", 1500.0);
        invoice.pay();
        employeePayment.pay();
    }




    

    // 1. Crea una clase abstracta Shape con el método calculateArea(). Luego
    // implementa dos subclases: Circle y Rectangle, y haz que cada una calcule su
    // propia área.

    public static abstract class Shape {

        public abstract double calculateArea();
    }

    public static class Circle extends Shape {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public double calculateArea() {
            return Math.PI * radius * radius;
        }
    }

    public static class Rectangle extends Shape {
        private double width;
        private double height;

        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        @Override
        public double calculateArea() {
            return width * height;
        }
    }

    // 2. Crea una interfaz Playable con el método play(). Luego implementa esa
    // interfaz en dos clases: Guitar y Piano. Cada una debe mostrar un mensaje
    // diferente al ejecutarse.

    public interface Playable {
        void play();
    }

    public static class Guitar implements Playable {
        @Override
        public void play() {
            System.out.println("Está tocando la guitarra");
        }
    }

    public static class Piano implements Playable {
        @Override
        public void play() {
            System.out.println("Está tocando el piano");
        }
    }


    // 3. Define una clase abstracta Animal con el método makeSound(). Implementa
    // Dog y Cat para que hagan sonidos distintos. Crea un array de Animal para
    // mostrar polimorfismo.

    public static abstract class Animal {
        public abstract void makeSound();
    }
    public static class Dog extends Animal {
        @Override
        public void makeSound() {
            System.out.println("El perro hace Guau, Guau");
        }
    }
    public static class Cat extends Animal {
        @Override
        public void makeSound() {
            System.out.println("El gato hace Miau, Miau");
        }
    }

    // 4. Crea una interfaz Drawable. Implementa las clases Circle, Square, y
    // Triangle que muestren cÃ³mo se dibuja cada figura usando draw().

    public interface Drawable {
        void draw();
    }

    public static class DrawableCircle implements Drawable {
        @Override
        public void draw() {
            System.out.println("Dibujando un círculo: ⚪");
        }
    }
    public static class DrawableSquare implements Drawable {
        @Override
        public void draw() {
            System.out.println("Dibujando un cuadrado: ⬜");
        }
    }
    public static class DrawableTriangle implements Drawable {
        @Override
        public void draw() {
            System.out.println("Dibujando un triángulo: 🔺");
        }
    }


    // 5. Crea una clase abstracta Employee con un método calculateSalary().
    // Implementa FullTimeEmployee y PartTimeEmployee con lógica diferente para
    // calcular el salario.

    public static abstract class Employee {
        public abstract double calculateSalary();
    }

    public static class FullTimeEmployee extends Employee {
        private double monthlySalary;

        public FullTimeEmployee(double monthlySalary) {
            this.monthlySalary = monthlySalary;
        }

        @Override
        public double calculateSalary() {
            return monthlySalary;
        }
    }

    public static class PartTimeEmployee extends Employee {
        private int hoursWorked;
        private double hourlyRate;

        public PartTimeEmployee(int hoursWorked, double hourlyRate) {
            this.hoursWorked = hoursWorked;
            this.hourlyRate = hourlyRate;
        }

        @Override
        public double calculateSalary() {
            return hoursWorked * hourlyRate;
        }
    }


    // 6. Crea una interfaz Movable con el método move(). Haz que las clases Car y
    // Robot implementen ese método con comportamientos diferentes.

    public interface Movable {
        void move();
    }

    public static class Car implements Movable {
        @Override
        public void move() {
            System.out.println("El coche se está moviendo");
        }
    }
    public static class Robot implements Movable {
        @Override
        public void move() {
            System.out.println("El robot se está moviendo");
        }
    }


    // 7. Crea una clase abstracta Appliance con método turnOn() y turnOff().
    // Implementa TV y WashingMachine con mensajes diferentes al encender y apagar.

    public static abstract class Appliance {
        public abstract void turnOn();
        public abstract void turnOff();
    }

    public static class TV extends Appliance {
        @Override
        public void turnOn() {
            System.out.println("La TV está encendida");
        }

        @Override
        public void turnOff() {
            System.out.println("La TV está apagada");
        }
    }

    public static  class WashingMachine extends Appliance {

        @Override
        public void turnOn() {
            System.out.println("La lavadora está encendida");
        }

        @Override
        public void turnOff() {
            System.out.println("La lavadora está apagada");
        }
    }

    // 8. Crea dos interfaces Flyable y Swimmable. Crea una clase Duck que
    // implemente ambas interfaces y muestre cómo puede volar y nadar.

    public interface Flyable {
        void fly();
    }
    public interface Swimmable {
        void swim();
    }

    public static class Duck implements Flyable, Swimmable {
        @Override
        public void fly() {
            System.out.println("El pato vuela con sus alas");
        }

        @Override
        public void swim() {
            System.out.println("El pato es capaz de nadar");
        }
    }


    // 9. Crea una clase abstracta Document con el método print(). Luego crea
    // PDFDocument y WordDocument, cada una con su forma de imprimir.

    public static abstract class Document {
        public abstract void print();
    }
    public static class PDFDocument extends Document {
        @Override
        public void print() {
            System.out.println("Imprimiendo documento PDF...");
        }
    }
    public static class WordDocument extends Document {
        @Override
        public void print() {
            System.out.println("Imprimiendo documento Word...");
        }
    }

    // 10. Crea una interfaz Payable con el método pay(). Luego implementa las
    // clases Invoice y EmployeePayment, cada una mostrando un mensaje de pago
    // diferente.

    /* public interface Payable {
        void pay();
    }
    public static class Invoice implements Payable {
        @Override
        public void pay() {
            System.out.println("Pagar factura");
        }
    }
    public static class EmployeePayment implements Payable {
        @Override
        public void pay() {
            System.out.println("Pagar nómina");
        }
    } */

    // 10. Interfaz Payable y clases Invoice y EmployeePayment
    public interface Payable {
        void pay();
    }

    public static class Invoice implements Payable {
        private double amount;

        public Invoice(double amount) {
            this.amount = amount;
        }

        @Override
        public void pay() {
            System.out.println("Pagando factura por $" + amount);
        }
    }

    public static class EmployeePayment implements Payable {
        private String employeeName;
        private double salary;

        public EmployeePayment(String employeeName, double salary) {
            this.employeeName = employeeName;
            this.salary = salary;
        }

        @Override
        public void pay() {
            System.out.println("Pagando salario de $" + salary + " a " + employeeName);
        }
    }
}



