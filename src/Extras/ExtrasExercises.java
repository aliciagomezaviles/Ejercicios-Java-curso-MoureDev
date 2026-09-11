package Extras;

import java.util.Random;
import java.util.Scanner;

public class ExtrasExercises {

    static String globalMessage = "Mensaje global";

    static int staticCounter = 42;

    public static void main(String[] args) {

        // 1. Crea una variable de tipo String inicializada como null y verifica que no
        // esté vacía antes de usarla.

        String text = null;

        if (text != null) {
            System.out.println("El texto es: " + text.toUpperCase());
        } else {
            System.out.println("La variable está vacía (null)");
        }

        text = "Hola, Alicia";

        if (text != null) {
            System.out.println("El texto es: " + text.toUpperCase());
        }

        // 2. Escribe un programa que lea el nombre y edad del usuario usando Scanner.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce tu nombre: ");
        var name = scanner.nextLine();

        System.out.println("Introduce tu edad");
        var age = scanner.nextInt();

        System.out.println("Hola, " + name + ", tienes " + age + " años");

        // 3. Declara una constante final llamada MAX_SCORE con valor 100 y muéstrala.

        final int MAX_SCORE = 100;
        System.out.println("La puntuación máxima es: " + MAX_SCORE);

        // 4. Crea una variable global message y otra local message dentro del método
        // main(). Muestra ambas.

        String localMessage = "Mensaje local";

        System.out.println("Variable global: " + globalMessage);
        System.out.println("Variable local: " + localMessage);
        showGlobalMessage(); // Función que accede a la variable global

        // 5. Usa import java.util.Scanner; para leer un número y mostrar si es positivo
        // o negativo.

        System.out.println("Introduce un numero: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("El numero introducido, " + number + ", es negativo");
        } else if (number > 0){
            System.out.println("El número introducido, " + number + ", es positivo");
        } else {
            System.out.println("El número introducido es cero");
        }


        // 6. Declara una variable static en una clase y accede a ella desde main() sin
        // crear un objeto.

        System.out.println("Accediendo a variable static sin crear objeto: " + staticCounter);


        // 7. Importa java.util.Random y genera un número aleatorio del 1 al 10.

        Random random = new Random();
        int randomNumber = random.nextInt(10) + 1; // del 1 al 10
        System.out.println("Aparecerá un número aleatorio del 1 al 10: " + randomNumber);


        // 8. Crea una clase con comentarios adecuados explicando cada sección del
        // código.

        DocumentedClass documentedExample = new DocumentedClass();
        documentedExample.showInfo();

        // 9. Define una clase User con una constante APP_NAME, una variable global
        // username y una función que imprima ambas.

        User user = new User();
        user.setUsername("aliciagom");
        user.displayInfo();

        // También podemos acceder a la constante directamente
        System.out.println("Nombre de la app: " + User.APP_NAME);


        // 10. Haz debug del código implementado haciendo uso de sus diferentes
        // herramientas.

        debugExample();

        scanner.close();
    }





    public static void showGlobalMessage() {
        System.out.println("Accediendo desde función: " + globalMessage);
    }

    public static class DocumentedClass {

        private String info;

        public DocumentedClass() {
            this.info = "Información de ejemplo";
        }

        public void showInfo() {
            System.out.println("Info desde clase documentada: " + info);
        }
    }

    public static class User {

        public static final String APP_NAME = "MiApp Java";
        private String username;

        public User() {
            this.username = "usuario_default";
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getUsername() {
            return username;
        }

        public void displayInfo() {
            System.out.println("Aplicación: " + APP_NAME);
            System.out.println("Usuario: " + username);
        }
    }

    public static void debugExample() {
        int a = 5;
        int b = 10;
        int result = a + b;

        // Puntos de debug típicos:
        System.out.println("Debug: a = " + a); // Verificar valor de a
        System.out.println("Debug: b = " + b); // Verificar valor de b
        System.out.println("Debug: resultado = " + result); // Verificar resultado

        // Para debug real, podrías poner breakpoints en estas líneas
        if (result > 10) {
            System.out.println("El resultado es mayor que 10");
        }
    }
}
