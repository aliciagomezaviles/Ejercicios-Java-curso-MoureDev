package oop;

public class Product {

    Double price;
    Double discountPercentage;

    public Product(Double price, Double discountPercentage){
        this.price = price;
        this.discountPercentage = discountPercentage;
    }

    public void discount(){
        System.out.println("El precio del producto es de " + price + " Euros");
        System.out.println("El descuento que se le aplica es del " + discountPercentage + " %");
        System.out.println("El precio del producto después de aplicar el descuento es de " + (price-(price * discountPercentage)/100));
    }
}
