package oop;

public class Rectangle {

    Double width;
    Double height;

    public Rectangle(Double width, Double height){
        this.width = width;
        this.height = height;
    }

    public void Area(){
        System.out.println("El área de la superficie es " + (width*height));
    }

    public void Perimeter(){
        System.out.println("El perímetro del rectángulo es " + 2*(width + height));
    }
}
