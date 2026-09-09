package oop;

public class EmployeeExample {

    private String name;
    private double salary;

    public EmployeeExample(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void raiseSalary(double percent) {
        if (percent > 0) {
            double increase = salary * (percent/100);
            salary += increase;
            System.out.println("Salario aunmentado en " + percent + "%. Nuevo salario: " +  salary);
        } else  {
            System.out.println("El porcentaje de aumento debe ser positivo");
        }
    }
    public void showInfo() {
        System.out.println("Empleado: " + name + ", Salario: " + salary);
    }
}
