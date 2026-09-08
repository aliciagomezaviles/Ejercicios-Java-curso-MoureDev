package oop;

public class Dog {

    String sound;

    public Dog(String sound){

        this.sound = sound;
    }

    public void Bark() {
        System.out.println("El perro hace " + sound);
    }
}
