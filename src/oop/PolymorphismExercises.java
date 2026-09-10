package oop;

import java.util.ArrayList;

public class PolymorphismExercises {

    public static void main(String[] args) {

        // 1. Crea una clase Animal con el método makeSound(). Luego crea subclases Dog,
        // Cat y Cow que sobrescriban ese método con sonidos diferentes. Llama al método
        // desde una lista de Animal.

        ArrayList<Animal> animalList = new ArrayList<>();
        animalList.add(new Dog());
        animalList.add(new Cat());
        animalList.add(new Cow());

        for (Animal animal : animalList) {
            animal.makeSound();
        }


        // 2. Crea una clase Shape con el método calculateArea(). Luego implementa
        // subclases Circle y Rectangle con sus propias fórmulas. Usa una lista de Shape
        // para recorrer e imprimir el área de varias figuras.

        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(5.0));
        shapes.add(new Rectangle(4.0, 6.0));

        for (Shape shape : shapes) {
            System.out.println("Área: " + shape.calculateArea());
        }

        // 3. Crea una clase Printer con varios métodos print() sobrecargados que
        // acepten diferentes tipos de parámetros (String, int, double). Llama a cada
        // uno desde main.

        var printer = new Printer();

        printer.print("¡Hola, Java");
        printer.print(10);
        printer.print(2.8);

        // 4. Crea una clase Greeter con dos métodos greet(): uno que salude con
        // "Hello", y otro que reciba un nombre y salude con "Hello, [nombre]".

        var greeter = new Greeter();

        greeter.greet();
        greeter.greet("Alicia");

        // 5. Crea una clase Vehicle con un método start(). Luego crea Car, Bike y Truck
        // que sobrescriban ese método. Recorre una lista ArrayList<Vehicle> para llamar
        // a start() en cada uno.

        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car());
        vehicles.add(new Bike());
        vehicles.add(new Truck());

        for (Vehicle vehicle : vehicles) {
            vehicle.start();
        }

        // 6. Crea una clase Notification con método send(), y subclases
        // EmailNotification, SMSNotification. Luego crea una función
        // sendNotification(Notification n) que reciba cualquier tipo y lo ejecute.

        sendNotification(new EmailNotification());
        sendNotification(new SMSNotification());

        // 7. Crea una función showAnimalType(Animal animal) que imprima el tipo de
        // animal. Pasa diferentes subclases (Dog, Cat, Horse) para que cada una imprima
        // su tipo con su propio getType() sobrescrito.

        showAnimalType(new DogType());
        showAnimalType(new CatType());
        showAnimalType(new HorseType());


        // 8. Crea una clase Converter con métodos convert(int), convert(double), y
        // convert(String) que devuelvan diferentes formatos de texto.

        /*var converter = new Converter();

        converter.convert("Hola, Java");
        converter.convert(8);
        converter.convert(3.5); */

        Converter converter = new Converter();
        System.out.println(converter.convert(100));
        System.out.println(converter.convert(25.75));
        System.out.println(converter.convert("Java"));


        // 9. Crea una clase Product con el método getPrice(). Luego, Book y Electronic
        // deben sobrescribirlo con su propia lógica de descuento. Recorre una lista de
        // Product e imprime el precio final de cada uno.


        ArrayList<Product> products = new ArrayList<>();
        products.add(new Book(25.0));
        products.add(new Electronic(150.0));
        products.add(new Book(30.0));

        for (Product product : products) {
            System.out.println("Precio final: " + product.getPrice());
        }


        // 10. Crea una clase Character con método attack(). Luego crea subclases
        // Warrior, Archer, Mage con ataques diferentes. En main, crea un array de
        // Character y llama a attack() para cada uno.

        /* ArrayList<Character>  characters = new ArrayList<>();
        characters.add(new Warrior());
        characters.add(new Archer());
        characters.add(new Mage());

        for (Character character : characters) {
            character.attack();
        } */

        Character[] characters = { new Warrior(), new Archer(), new Mage() };

        for (Character character : characters) {
            character.attack();
        }
    }












    // 1. Crea una clase Animal con el método makeSound(). Luego crea subclases Dog,
    // Cat y Cow que sobrescriban ese método con sonidos diferentes. Llama al método
    // desde una lista de Animal.

    public static class Animal {

        public void makeSound(){
            System.out.println("El animal hace un sonido");
        }
    }
    public static class Dog extends Animal {

        @Override
        public void makeSound() {
            System.out.println("El perro hace 'Guau, Guau'");
        }
    }
    public static class Cat extends Animal {
        @Override
        public void makeSound() {
            System.out.println("El gato hace 'Miau, Miau'");
        }
    }
    public static class Cow extends Animal {
        @Override
        public void makeSound() {
            System.out.println("La vaca hace 'Muuuuuu'");
        }
    }


    // 2. Crea una clase Shape con el método calculateArea(). Luego implementa
    // subclases Circle y Rectangle con sus propias fórmulas. Usa una lista de Shape
    // para recorrer e imprimir el área de varias figuras.

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


    // 3. Crea una clase Printer con varios métodos print() sobrecargados que
    // acepten diferentes tipos de parámetros (String, int, double). Llama a cada
    // uno desde main.

    public static class Printer {

        public void print(String text) {
            System.out.println("Imprimiendo: " + text);
        }
        public void print(int number) {
            System.out.println("Imprimiendo numero " + number);
        };
        public void print (double number) {
            System.out.println("Imprimiendo número decimal " + number);
        }
    }


    // 4. Crea una clase Greeter con dos métodos greet(): uno que salude con
    // "Hello", y otro que reciba un nombre y salude con "Hello, [nombre]".

    public static class Greeter {

        public void greet() {
            System.out.println("Hello");
        }
        public void greet(String name) {
            System.out.println("Hello " + name);
        }
    }

    // 5. Crea una clase Vehicle con un método start(). Luego crea Car, Bike y Truck
    // que sobrescriban ese método. Recorre una lista ArrayList<Vehicle> para llamar
    // a start() en cada uno.

    public static class Vehicle{

        public void start() {
            System.out.println("El vehículo esta arrancando");
        }
    }
    public static class Car extends Vehicle{
        @Override
        public void start() {
            System.out.println("El coche está arrancando");
        }
    }
    public static class Bike extends Vehicle{
        @Override
        public void start() {
            System.out.println("La bicicleta está preparada");
        }
    }
    public static class Truck extends Vehicle{
        @Override
        public void start() {
            System.out.println("El camión está arrancando");
        }
    }


    // 6. Crea una clase Notification con método send(), y subclases
    // EmailNotification, SMSNotification. Luego crea una función
    // sendNotification(Notification n) que reciba cualquier tipo y lo ejecute.

    public static class Notification {

        public void send(){
            System.out.println("Enviando notificación");
        }
    }
    public static class EmailNotification extends Notification{
        @Override
        public void send() {
            System.out.println("Enviando notificación por email");
        }
    }

    public static class SMSNotification extends Notification{
        @Override
        public void send() {
            System.out.println("Enviando notificación por SMS");
        }
    }

    public static void sendNotification(Notification notification){
        notification.send();
    }

    // 7. Crea una función showAnimalType(Animal animal) que imprima el tipo de
    // animal. Pasa diferentes subclases (Dog, Cat, Horse) para que cada una imprima
    // su tipo con su propio getType() sobrescrito.

    public static abstract class AnimalType {
        public abstract String getType();
    }

    public static class DogType extends AnimalType {
        @Override
        public String getType() {
            return "Perro";
        }
    }

    public static class CatType extends AnimalType {
        @Override
        public String getType() {
            return "Gato";
        }
    }

    public static class HorseType extends AnimalType {
        @Override
        public String getType() {
            return "Caballo";
        }
    }

    // Función para el ejercicio 7
    public static void showAnimalType(AnimalType animal) {
        System.out.println("Tipo de animal: " + animal.getType());
    }


    // 8. Crea una clase Converter con métodos convert(int), convert(double), y
    // convert(String) que devuelvan diferentes formatos de texto.

    /* public static class Converter {

        public void convert(String text){
            System.out.println("Convirtiendo: " + text);
        }
        public void convert(double number){
            System.out.println("Convirtiendo: " + number);
        }
        public void convert(int number){
            System.out.println("Convirtiendo: " + number);
        }
    } */
    public static class Converter {
        public String convert(int number) {
            return "Número entero convertido: " + number + " -> '" + number + "'";
        }

        public String convert(double number) {
            return "Número decimal convertido: " + number + " -> '" + String.format("%.2f", number) + "'";
        }

        public String convert(String text) {
            return "Texto convertido: " + text + " -> '" + text.toUpperCase() + "'";
        }
    }

    // 9. Crea una clase Product con el método getPrice(). Luego, Book y Electronic
    // deben sobrescribirlo con su propia lógica de descuento. Recorre una lista de
    // Product e imprime el precio final de cada uno.

    public static class Product {
        protected double basePrice;

        public Product(double basePrice) {
            this.basePrice = basePrice;
        }

        public double getPrice() {
            return basePrice;
        }
    }

    public static class Book extends Product {
        public Book(double basePrice) {
            super(basePrice);
        }

        @Override
        public double getPrice() {
            // Descuento del 10% para libros
            return basePrice * 0.9;
        }
    }

    public static class Electronic extends Product {
        public Electronic(double basePrice) {
            super(basePrice);
        }

        @Override
        public double getPrice() {
            // Descuento del 5% para electrónicos
            return basePrice * 0.95;
        }
    }

    // 10. Crea una clase Character con método attack(). Luego crea subclases
    // Warrior, Archer, Mage con ataques diferentes. En main, crea un array de
    // Character y llama a attack() para cada uno.

    public static abstract class Character{
        public abstract void attack();
    }
    public static class Warrior extends Character{
        @Override
        public void attack() {
            System.out.println("El guerrero ataca con su espada");
        }
    }
    public static class Archer extends Character{
        @Override
        public void attack() {
            System.out.println("El arquero apunta con su arco");
        }
    }
    public static class Mage extends Character{
        @Override
        public void attack() {
            System.out.println("El mago usa sus poderes sobrenaturales");
        }
    }
}
