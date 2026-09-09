package oop;

public class RectangleExample {

    private double width;
    private double height;


    public void setWidth(double width) {
        if (width > 0.0) {
            this.width = width;
        } else {
            System.out.println("La base del rectángulo debe ser positiva");
        }
    }

    public void setHeight(double height) {
        if (height > 0.0) {
            this.height = height;
        } else {
            System.out.println("La altura del rectángulo debe ser positiva");
        }
    }

    public double calculateArea() {
        return width * height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}
