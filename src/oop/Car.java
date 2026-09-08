package oop;

public class Car {

    String brand;
    String model;

    public Car(String brand, String model){
        this.brand = brand;
        this.model = model;
    }

    public void showData(){
        System.out.println("El coche es de la marca " + brand + " y modelo " + model);
    }
}
