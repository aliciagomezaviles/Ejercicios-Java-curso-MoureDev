package oop;


/* public class UserExample {

    private String username;
    private String password;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String checkPassword(String inputPassword) {
        if (inputPassword.equals(this.password)) {
            System.out.println("Contraseña válida");
        } else {
            System.out.println("La contraseña no coincide");
        }
        return inputPassword;
    }
} */

    class UserExample {
        private String username;
        private String password;

        public void setUsername(String username) {
            if (username != null && username.length() >= 3) {
                this.username = username;
                System.out.println("Nombre de usuario establecido");
            } else {
                System.out.println("El nombre de usuario debe tener al menos 3 caracteres");
            }
        }

        public void setPassword(String password) {
            if (password != null && password.length() >= 6) {
                this.password = password;
                System.out.println("Contraseña establecida");
            } else {
                System.out.println("La contraseña debe tener al menos 6 caracteres");
            }
        }

        public boolean checkPassword(String inputPassword) {
            return password != null && password.equals(inputPassword);
        }

        public String getUsername() {
            return username;
        }
    }


