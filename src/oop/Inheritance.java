package oop;

public class Inheritance {

    public static void main(String[] args) {

        // Herencia

        var animal = new Animal("Mi animal");
        //animal.name = "Mi animal";
        animal.eat();

        var dog = new Dog("Mi dog", 3);
        //dog.name = "Mi dog";
        dog.eat();

        var cat = new Cat("Mi cat");
        //cat.name = "Mi cat";
        cat.eat();

        var bird = new Bird("Mi bird");
        //bird.name = "Mi bird";
        bird.eat();
        bird.fly();
    }

    public static class Animal {

        String name;

        public Animal(String name) {
            this.name = name;
        }

        public void eat() {
            System.out.println("El animal con nombre " + name + " está comiendo");
        }
    }

    public static class Dog extends Animal {

        int age;

        public Dog(String name, int age) {
            super(name);
            this.age = age;
        }

        @Override // Sobreescribe el método, la subclase cambia el comportamiento de la superclase.
        public void eat() {
            System.out.println("El perro con nombre " + name + " está comiendo");
        }
    }

    public static class Cat extends Animal {

        public Cat(String name) {
            super(name);
        }
    }

    public static class Bird extends Animal {

        public Bird(String name) {
            super(name);
        }

        public void fly() {

            System.out.println("Este animal está volando");
        }
    }
}
