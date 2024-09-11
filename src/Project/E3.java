package Project;

public class E3 {

        public static String reverse(String input) {
            StringBuilder reversed = new StringBuilder(input);
            return reversed.reverse().toString();
        }

        public static void main(String[] args) {
            String input = "Hello";
            System.out.println("Reversed String: " + reverse(input));
        }
    }

