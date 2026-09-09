package oop;

public class StudentExample {

    private String name;
    private int grade;

    public StudentExample(String name) {
        this.name = name;
        this.grade = 0;
    }

    public void setGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            this.grade = grade;
        } else {
            System.out.println("La nota debe estar entre 0 y 100");
        }
    }

    public boolean isPassed() {
        return grade >= 60;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }
}
