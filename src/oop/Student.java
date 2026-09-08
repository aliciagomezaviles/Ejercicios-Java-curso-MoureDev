package oop;

public class Student {

    Double score;

    public Student(Double score) {
        this.score = score;
    }

    public void ratings() {
        if (score >= 60) {
            System.out.println("¡Enhorabuena!¡Has aprobado!");
        } else {
            System.out.println("Seguro que apruebas la próxima vez");
        }
    }
}
