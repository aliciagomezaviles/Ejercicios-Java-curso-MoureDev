package oop;

public class Worker {

    String name;
    Double salary;

    public Worker(String name, Double salary){
        this.name = name;
        this.salary = salary;
    }

    public void showSalary(){
        System.out.println("El salario de " + name + " es de " + salary + " Euros");
    }
}
