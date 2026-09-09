package oop;

public class ProductExample {

    private String name;
    private double price;

    public ProductExample(String name) {
        this.name = name;
        this.price = 0.0;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("El producto no puede ser menor que 0");
        }
    }
}
