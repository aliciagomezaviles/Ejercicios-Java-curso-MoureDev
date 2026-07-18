public class OperatorsExercises {

    public static void main(String[] args) {

        // 1. Crea una variable con el resultado de cada operación aritmética.

        int a = 10;
        int b = 5;

        int sum  = a + b;
        int subtraction = a - b;
        int multiplication = a * b;
        int division = a / b;
        int remainder = a % b;

        System.out.println("Los números son: a = " + a + ", b = " + b);
        System.out.println("La suma de los dos números es: " + sum);
        System.out.println("La resta de los dos números es: " + subtraction);
        System.out.println("La multiplicación de los dos números es: " + multiplication);
        System.out.println("La división de los dos números es: " + division);
        System.out.println("El resto de la división es: " + remainder);

        // 2. Crea una variable para cada tipo de operación de asignación.


        a = 10;
        System.out.println("Valor inicial de a: " + a);

        a += 1;
        System.out.println("a += 1: " + a);
        a -= 1;
        System.out.println("a -= 1: " + a);
        a *= 2;
        System.out.println("a *= 2: " + a);
        a /= 2;
        System.out.println("a /= 2: " + a);
        a %= 2;
        System.out.println("a %= 2: " + a);

        // 3. Imprime 3 comparaciones verdaderas con diferentes operadores de
        // comparación.

        System.out.println("10 != 14: " + (10 != 14));
        System.out.println("3 < 6: " + (3 < 6));
        System.out.println("30 >= 20: " + (30 >= 20));

        // 4. Imprime 3 comparaciones falsas con diferentes operadores de comparación.

        System.out.println("30 < 20: " + (30 < 20));
        System.out.println("3 > 6: " + (3 > 6));
        System.out.println("10 == 14: " + (10 == 14));

        // 5. Utiliza el operador lógico AND.

        int age = 22;
        boolean hasLicense = true;
        boolean canDrive = age >= 18 && hasLicense;
        System.out.println("Edad: " + age + ", Tiene licencia: " + hasLicense);
        System.out.println("¿Puede conducir? " + canDrive);

        System.out.println("true && true: " + (true && true));
        System.out.println("true && false: " + (true && false));

        // 6. Utiliza el operador lógico OR.

        boolean hasTicket = false;
        boolean isGuest = true;

        boolean canEnter = hasTicket || isGuest;

        System.out.println("Tiene entrada: " + hasTicket);
        System.out.println("Es invitado: " + isGuest);
        System.out.println("¿Puede entrar? " + canEnter);

        System.out.println("true || false: " + (true || false));
        System.out.println("true || true: " + (true || true));

        // 7. Combina ambos operadores lógicos.

        boolean hasHomework = true;
        boolean hasNotebook = false;
        boolean hasPen = true;

        boolean readyForClass = hasHomework && (hasNotebook || hasPen);

        System.out.println("Tiene deberes: " + hasHomework);
        System.out.println("Tiene cuaderno: " + hasNotebook);
        System.out.println("Tiene bolígrafo: " + hasPen);
        System.out.println("¿Está preparado para clase? " + readyForClass);

        System.out.println("true && (false || true): " + (true && (false || true)));
        System.out.println("false && (true || true): " + (false && (true || true)));

        // 8. Añade alguna negación.

        boolean lightOn = false;

        boolean lightOff = !lightOn;

        System.out.println("La luz está encendida: " + lightOn);
        System.out.println("La luz está apagada: " + lightOff);

        // 9. Imprime 3 ejemplos de uso de operadores unarios.

        int number = 10;

        System.out.println("Valor inicial: " + number);
        System.out.println("Incremento (++): " + (++number));
        System.out.println("Decremento (--): " + (--number));
        System.out.println("Negativo: " + (-number));

        // 10. Combina operadores aritméticos, de comparación y lógicos.

        int x = 8;
        int y = 4;

        boolean result = (x + y > 10) && (x * y == 32);

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("Resultado: " + result);
    }
}
