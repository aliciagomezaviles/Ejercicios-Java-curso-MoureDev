public class ConditionalsExercises {

    public static void main(String[] args) {

        //1. Establece la edad de un usuario y muestra si puede votar (mayor o igual a 18).

        var age = 19;

        if (age < 18) {
            System.out.println("No puedes votar ya que eres menor de 18 años");
        } else {
            System.out.println("¡Perfecto!Puedes votar");
        }

        // 2. Declara dos números y muestra cuál es mayor, o si son iguales.

        int a = 2;
        int b = 5;


        if (a > b) {
            System.out.println("El número mayor es: " + a);
        } else if (b > a) {
            System.out.println("El número mayor es: " + b);
        } else {
            System.out.print("Los dos números son iguales");
        }

        // 3. Dado un número, verifica si es positivo, negativo o cero.

        int c = -4;

        if (c > 0) {
            System.out.println("El número es positivo");
        } else if (c < 0) {
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es cero");
        }

        // 4. Crea un programa que diga si un número es par o impar.

        int d = 13;

        if (d%2==0) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }

        // 5. Verifica si un número está en el rango de 1 a 100.

        int e = 35;

        if (e >= 1 && e <= 100) {
            System.out.println("El número es " + e + " y está en el rango del 1 al 100");
        } else {
            System.out.println("El número es " + e + " y no está en el rango del 1 al 100");
        }

        // 6. Declara una variable con el día de la semana (1-7) y muestra su nombre con switch.

        var day = 4;

        switch (day) {
            case 1:
                System.out.println("Lunes");
                break;

            case 2:
                System.out.println("Martes");
                break;

            case 3:
                System.out.println("Miercoles");
                break;

            case 4:
                System.out.println("Jueves");
                break;

            case 5:
                System.out.println("Viernes");
                break;

            case 6:
                System.out.println("Sábado");
                break;

            case 7:
                System.out.println("Domingo");
                break;

            default:
                System.out.println("No es ningún día de la semana");
        }

        // 7. Simula un sistema de notas: muestra "Sobresaliente", "Aprobado" o "Suspenso" según la nota (0-100).

        var note = 98;

        if (note >= 75 && note <= 100) {
            System.out.println("Su nota es Sobresaliente");
        } else if (note < 75 && note > 50) {
            System.out.println("Su nota es Aprobado");
        } else {
            System.out.println("Su nota es Suspenso");
        }

        // 8. Escribe un programa que determine si puedes entrar al cine: debes tener al menos 15 años o ir acompañado.

        var age2 = 13;
        boolean accompained = false;

        if (age2 >= 15) {
            System.out.println("Puedes entrar al cine");
        } else if (age2 < 15 && accompained) {
            System.out.println("Puedes entrar al cine");
        } else {
            System.out.println("No puedes entrar al cine");
        }

        /* int cinemaAge = 12;
        boolean isAccompanied = true;
        System.out.println("Edad: " + cinemaAge + " años");
        System.out.println("¿Va acompañado? " + isAccompanied);

        if (cinemaAge >= 15 || isAccompanied) {
            System.out.println("Puede entrar al cine");
        } else {
            System.out.println("NO puede entrar al cine");
        } */


        // 9. Crea un programa que diga si una letra es vocal o consonante.

        char letter = 'c';

        switch (letter) {
            case 'a':
                System.out.println("La letra 'a' es vocal");
                break;

            case 'e':
                System.out.println("La letra 'e' es vocal");
                break;

            case 'i':
                System.out.println("La letra 'i' es vocal");
                break;

            case 'o':
                System.out.println("La letra 'o' es vocal");
                break;

            case 'u':
                System.out.println("La letra 'u' es vocal");
                break;

            default:
                System.out.println("La letra " + letter + " es consonante");
        }

        /* char letter = 'a';
        System.out.println("Letra: " + letter);

        // Convertir a minúscula para facilitar la comparación
        char lowerLetter = Character.toLowerCase(letter);

        if (lowerLetter == 'a' || lowerLetter == 'e' || lowerLetter == 'i' ||
                lowerLetter == 'o' || lowerLetter == 'u') {
            System.out.println("La letra '" + letter + "' es una vocal");
        } else if (Character.isLetter(lowerLetter)) {
            System.out.println("La letra '" + letter + "' es una consonante");
        } else {
            System.out.println("'" + letter + "' no es una letra válida");
        } */


        // 10. Usa tres variables a, b, c y muestra cuál es el mayor de las tres.

        int f = 10;
        int g = 20;
        int h = 30;

        System.out.println("f = " + f + ", g = " + g + ", h = " + h);

        if (f >= g && f >= h) {
            System.out.println("El mayor es 'f' y su valor es: " + f);
        } else if (g >= f && g >= h) {
            System.out.println("El mayor es 'g' y su valor es: " + g);
        } else {
            System.out.println("El mayor es 'h' y su valor es: " + h);
        }
    }
}
