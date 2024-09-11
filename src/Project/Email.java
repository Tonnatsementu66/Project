package Project;

public class Email {
    public static class Registration {
        // Private fields, only accessible within the class
        private String email;
        private String userName;
        private String password;

        // Method to set email
        public void setEmail(String email) {
            if (email.endsWith("@yahoo.com")) {
                this.email = email;
                System.out.println("Email set successfully.");
            } else {
                System.out.println("Invalid email. Only Yahoo emails are allowed.");
            }
        }

        // Method to set userName
        public void setUserName(String userName) {
            if (userName != null && userName.length() > 6) {
                this.userName = userName;
                System.out.println("Username set successfully.");
            } else {
                System.out.println("Invalid username. It must be non-empty and at least 7 characters long.");
            }
        }

        // Method to set password
        public void setPassword(String password) {
            if (password != null && password.length() > 6 && (userName == null || !password.contains(userName))) {
                this.password = password;
                System.out.println("Password set successfully.");
            } else if (password != null && password.contains(userName)) {
                System.out.println("Password cannot contain the username.");
            } else {
                System.out.println("Invalid password. It must be non-empty, at least 7 characters long, and not contain the username.");
            }
        }

        // Method to display registration information
        public void displayInfo() {
            if (email != null && userName != null && password != null) {
                System.out.println("Registration Information:");
                System.out.println("Email: " + email);
                System.out.println("Username: " + userName);
            } else {
                System.out.println("Registration information is incomplete.");
            }
        }
            public static void main(String[] args) {
                Registration userRegistration = new Registration();

                userRegistration.setEmail("user@gmail.com"); // Invalid email
                userRegistration.setUserName("user");       // Invalid username
                userRegistration.setPassword("userpass");   // Invalid password

                userRegistration.displayInfo();
            }
        }

    }

