package oop;

import java.util.ArrayList;

public class InheritanceExercises {

    public static void main(String[] args) {

        // 1. Crea una clase Vehicle con un método move(). Luego crea una subclase Car
        // que herede de Vehicle y agrega el método honk().

        Vehicle vehicle1 = new Vehicle();
        vehicle1.move();

        Car car1 = new Car();
        car1.move();
        car1.honk();

        // 2. Define una clase Person con los atributos name y age. Luego crea una clase
        // Student que agregue el atributo grade y un método study().

        Person person1 = new Person("Alicia", 29);
        System.out.println("Persona: " + person1.name + ", edad: " + person1.age);

        Student student1 = new Student("Aliciaga", 39, "A");
        System.out.println("Estudiante: " + student1.name + ", edad: " + student1.age + ", nota: " + student1.grade);
        student1.Study();

        // 3. Crea una clase Animal con el método makeSound(). Haz que Dog diga "Guau, Guau" y
        // Cat diga "Miau, Miau" sobrescribiendo ese método.

        Animal animal = new Animal();
        animal.makeSound();

        Dog dog = new Dog();
        dog.makeSound();

        Cat cat = new Cat();
        cat.makeSound();

        // 4. La clase Employee tiene los atributos name y salary. Manager hereda de
        // Employee y agrega el atributo department.

        Employee employee = new Employee("Alicia", 2500.0);
        System.out.println("Empleado: " +  employee.name + ", salario: " + employee.salary);

        Manager manager = new Manager("Aliciagom", 2700.0, "Ventas");
        System.out.println("Manager: " + manager.name + ", salario: " + manager.salary + ", Departamento: " + manager.department);


        // 5. Crea una clase abstracta Shape con un método calculateArea(). Luego
        // implementa ese método en Circle y Rectangle.

        Circle circle = new Circle(5.0);
        System.out.println("Área del círculo: " + circle.calculateArea());

        Rectangle rectangle = new Rectangle(4.0, 6.0);
        System.out.println("Área del rectángulo: " + rectangle.calculateArea());

        // 6. Crea una clase Bird con el método fly(). Luego crea Eagle que sobrescriba
        // fly() pero también llame al método original con super.fly().

        Bird bird = new Bird();
        bird.fly();

        Eagle eagle = new Eagle();
        eagle.fly();

        // 7. Haz una clase Device con un constructor que imprima "Device created".
        // Luego crea Phone que herede de Device y en su constructor imprima "Phone
        // ready".

        Device device = new Device();
        Phone phone = new Phone();

        // 8. Account tiene un saldo y métodos para deposit() y withdraw().
        // SavingsAccount hereda y agrega un método addInterest().

        Account account = new Account(1000.0);
        account.deposit(200.0);
        account.withdraw(150.0);
        System.out.println("Saldo de cuenta: " + account.balance);

        SavingsAccount savingsAccount = new SavingsAccount(2000.0);
        savingsAccount.deposit(300.0);
        savingsAccount.addInterest();
        System.out.println("Saldo de cuenta de ahorros: " + savingsAccount.balance);


        // 9. Crea una clase Vehicle y tres subclases: Car, Bike y Truck, cada una con
        // un método describe() sobrescrito.

        VehicleBase vehicleBase1 = new CarVehicle();
        VehicleBase vehicleBase2 = new BikeVehicle();
        VehicleBase vehicleBase3 = new TruckVehicle();

        vehicleBase1.describe();
        vehicleBase2.describe();
        vehicleBase3.describe();

        // 10. Crea un ArrayList<Animal> que contenga instancias de Dog, Cat y Bird.
        // Recorre la lista y llama a makeSound().

        ArrayList<AnimalSound> animals = new ArrayList<>();
        animals.add(new DogSound());
        animals.add(new CatSound());
        animals.add(new BirdSound());

        for (AnimalSound animalSound : animals) {
            animalSound.makeSound();
        }
    }








    // 1. Crea una clase Vehicle con un método move(). Luego crea una subclase Car
    // que herede de Vehicle y agrega el método honk().

    public static class Vehicle {

        public void move() {
            System.out.println("El vehículo se está moviendo");
        }
    }

    public static class Car extends Vehicle {

        public void honk() {
            System.out.println("El coche está pitando");
        }
    }

    // 2. Define una clase Person con los atributos name y age. Luego crea una clase
    // Student que agregue el atributo grade y un método study().

    public static class Person {

        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    public static class Student extends Person {

        String grade;

        public Student(String name, int age, String grade) {
            super(name, age);
            this.grade = grade;
        }
        public void Study() {
            System.out.println(name + " está estudiando");
        }
    }

    // 3. Crea una clase Animal con el método makeSound(). Haz que Dog diga "Guau, Guau" y
    // Cat diga "Miau, Miau" sobrescribiendo ese método.

    public static class Animal {

        public void makeSound() {
            System.out.println("El animal emite un sonido");
        }
    }
    public static class Dog extends Animal {

        @Override
        public void makeSound() {
            System.out.println("Guau, Guau");
        }
    }
    public static class Cat extends Animal {
        @Override
        public void makeSound() {
            System.out.println("Miau, Miau");
        }
    }

    // 4. La clase Employee tiene los atributos name y salary. Manager hereda de
    // Employee y agrega el atributo department.

    public static class Employee {

        String name;
        Double salary;

        public Employee(String name, Double salary) {
            this.name = name;
            this.salary = salary;
        }
    }

    public static class Manager extends Employee {

        String department;

        public Manager(String name, Double salary, String department) {
            super(name, salary);
            this.department = department;
        }
    }

    // 5. Crea una clase abstracta Shape con un método calculateArea(). Luego
    // implementa ese método en Circle y Rectangle.

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

    // 6. Crea una clase Bird con el método fly(). Luego crea Eagle que sobrescriba
    // fly() pero también llame al método original con super.fly().

    public static class Bird {
        public void fly() {
            System.out.println("El pájaro está volando");
        }
    }
    public static class Eagle extends Bird {
        @Override
        public void fly() {
            super.fly();
            System.out.println("El águila está volando");
        }
    }

    // 7. Haz una clase Device con un constructor que imprima "Device created".
    // Luego crea Phone que herede de Device y en su constructor imprima "Phone
    // ready".

    public static class Device {
        public Device() {
            System.out.println("Device created");
        }
    }
    public static class Phone extends Device {
        public Phone() {
            super();
            System.out.println("Phone ready");
        }
    }


    // 8. Account tiene un saldo y métodos para deposit() y withdraw().
    // SavingsAccount hereda y agrega un método addInterest().

    public static class Account {
        protected double balance;

        public Account(double balance) {
            this.balance = balance;
        }

        public void deposit(double amount) {
            balance += amount;
            System.out.println("Depósito de " + amount + ". Nuevo saldo: " + balance);
        }

        public void withdraw(double amount) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Retiro de " + amount + ". Nuevo saldo: " + balance);
            } else {
                System.out.println("Fondos insuficientes");
            }
        }
    }

    public static class SavingsAccount extends Account {
        public SavingsAccount(double balance) {
            super(balance);
        }

        public void addInterest() {
            double interest = balance * 0.05;
            balance += interest;
            System.out.println("Interés agregado: " + interest + ". Nuevo saldo: " + balance);
        }
    }

    // 9. Crea una clase Vehicle y tres subclases: Car, Bike y Truck, cada una con
    // un método describe() sobrescrito.

    public static abstract class VehicleBase {
        public abstract void describe();
    }

    public static class CarVehicle extends VehicleBase {
        @Override
        public void describe() {
            System.out.println("Soy un coche con 4 ruedas");
        }
    }

    public static class BikeVehicle extends VehicleBase {
        @Override
        public void describe() {
            System.out.println("Soy una bicicleta con 2 ruedas");
        }
    }

    public static class TruckVehicle extends VehicleBase {
        @Override
        public void describe() {
            System.out.println("Soy un camión para transportar carga");
        }
    }

    // 10. Crea un ArrayList<Animal> que contenga instancias de Dog, Cat y Bird.
    // Recorre la lista y llama a makeSound().

    public static abstract class AnimalSound {
        public abstract void makeSound();
    }

    public static class DogSound extends AnimalSound {
        @Override
        public void makeSound() {
            System.out.println("El perro hace: Guau, Guau");
        }
    }

    public static class CatSound extends AnimalSound {
        @Override
        public void makeSound() {
            System.out.println("El gato hace: Miau, Miau");
        }
    }

    public static class BirdSound extends AnimalSound {
        @Override
        public void makeSound() {
            System.out.println("El pájaro hace: Pío, Pío");
        }
    }
}
