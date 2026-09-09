package oop;

public class Temperature {

    private double celsius;

    public double getCelsius() {
        return celsius;
    }
    public void setCelsius(double celsius) {
        if (celsius < -100) {
            this.celsius = celsius;
            System.out.println("Temperatura por debajo de -100: " + celsius);
        }  else if (celsius > 100) {
            this.celsius = celsius;
            System.out.println("Temperatura superior a 100: " + celsius);
        } else  {
            this.celsius = celsius;
            System.out.println("La temperatura es de: " + celsius);
        }
    }
}
