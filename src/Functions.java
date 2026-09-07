
public class Functions {

    public static void main(String[] args) {

        // Funciones

        for (int index = 0; index < 5; index++){
            sendEmail();
        }
        sendEmail();

        sendEmailToUser("alicia@gmail.com");
        sendEmailToUser("alicia@gmail.com", "Alicia");

        var state = sendEmailWithState("paul@gmail.com");
        System.out.println(state);
        System.out.println(sendEmailWithState(""));

    }

    public static void sendEmail() {
        System.out.println("Se envía el email");
    }

    // Función con parámetros

    public static void sendEmailToUser(String email) {
        System.out.println("Se envía el email a " + email);
    }

    // Sobrecargar una función, reutilizo el mismo nombre pero con un comportamiento diferente.

    public static void sendEmailToUser(String email, String name) {
        System.out.println("Se envía el email a " + name + " (" + email + ")");
    }


    // Función con retorno

    public static boolean sendEmailWithState(String email) {
        if (email.isEmpty()) {
            return false;
        }
        System.out.println("Se envía el email a " + email);
        return true;
    }
}
