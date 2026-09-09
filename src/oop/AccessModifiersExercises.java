package oop;

public class AccessModifiersExercises {

    public static void main(String[] args) {

        // 1. Crea una clase PersonExample con atributos privados name y age. Usa los métodos
        // getName(), setName(), getAge() y setAge() para asignar y mostrar valores
        // desde otra clase.

        PersonExample person1 = new PersonExample();
        person1.setName("Alicia");
        person1.setAge(39);
        System.out.println("Nombre: " + person1.getName());
        System.out.println("Edad: " + person1.getAge());

        // 2. Crea una clase ProductExample con el atributo privado price. Añade el método
        // setPrice(double price) que solo permita precios mayores a 0.

        ProductExample product1 = new ProductExample("Altavoces");
        product1.setPrice(19.90);
        System.out.println("Precio actualizado del producto: " + product1.getPrice() + "€.");
        product1.setPrice(-30.2);

        // 3. Crea una clase BankAccount con el atributo privado balance. Implementa los
        // métodos deposit(double amount) y withdraw(double amount) que validen las
        // cantidades correctamente.

        BankAccountExample account1 = new BankAccountExample("123456");
        account1.deposit(1500.0);
        account1.withdraw(400.0);
        account1.withdraw(700.0);
        account1.deposit(-50.0);

        // 4. Crea una clase Book con el atributo privado title. Permite leerlo con el
        // método getTitle() pero no modificarlo (sin setTitle()). El título debe
        // asignarse solo por el constructor.

        BookExample book1 = new BookExample("El Principito");

        System.out.println("Título: " + book1.getTitle());
        //No hay método setTitle() - Solo lectura.


        // 5. Crea una clase Temperature con el atributo privado celsius. El método
        // setCelsius(double celsius) solo debe aceptar valores entre -100 y 100.

        Temperature temperature1 = new Temperature();

        temperature1.setCelsius(89.3);
        System.out.println("Temperatura: " + temperature1.getCelsius() + "ºC");
        temperature1.setCelsius(-150.2);
        temperature1.setCelsius(140.3);


        // 6. Crea una clase User con los atributos privados username y password.
        // Implementa los métodos setUsername(String username), setPassword(String
        // password) y checkPassword(String inputPassword) que compare contraseñas.

        /* UserExample user1 = new UserExample();

        user1.setPassword("123456");
        user1.checkPassword("123456");

        UserExample user2 = new UserExample();
        user2.setPassword("123567");
        user2.checkPassword("123568");*/

        UserExample user1 = new UserExample();
        user1.setUsername("aliciagom");
        user1.setPassword("miPassword123");
        System.out.println("Usuario: " + user1.getUsername());
        System.out.println("¿Contraseña correcta? " + user1.checkPassword("miPassword123"));
        System.out.println("¿Contraseña incorrecta? " + user1.checkPassword("password123"));


        // 7. Crea una clase Employee con el atributo privado salary. Agrega el método
        // raiseSalary(double percent) que solo permita aumentos positivos.

        EmployeeExample employee1 = new EmployeeExample("Alicia", 1230.20);
        employee1.showInfo();
        employee1.raiseSalary(10.0);
        employee1.showInfo();
        employee1.raiseSalary(-10.0);


        // 8. Crea una clase Rectangle con los atributos privados width y height. Agrega
        // setters y el método calculateArea() que devuelva el resultado de width *
        // height.

        RectangleExample rectangle1 = new RectangleExample();

        rectangle1.setWidth(4.0);
        rectangle1.setHeight(2.0);
        System.out.println("Tamaño del rectángulo: " + rectangle1.getWidth() + "x" + rectangle1.getHeight());
        System.out.println("El área del rectángulo es de: " + rectangle1.calculateArea());

        // 9. Crea una clase Student con el atributo privado grade. Agrega los métodos
        // setGrade(int grade) y isPassed() que retorne true si la nota es mayor o igual
        // a 60.

        StudentExample student1 = new StudentExample("Alicia Gómez");
        student1.setGrade(80);
        System.out.println("Estudiante: " + student1.getName());
        System.out.println("Nota: " + student1.getGrade());
        System.out.println("¿Ha aprobado? " + student1.isPassed());

        // 10. Crea una clase Car con el atributo privado speed. Agrega los métodos
        // accelerate(int amount) que aumente la velocidad (máximo 120) y brake(int
        // amount) que reduzca la velocidad (mínimo 0).

        CarExample car1 = new CarExample("Ford Fiesta");
        car1.showStatus();
        car1.accelerate(50);
        car1.showStatus();
        car1.accelerate(80);
        car1.showStatus();
        car1.brake(30);
        car1.showStatus();
        car1.brake(100);
        car1.showStatus();
    }
}
