package Project;

public class E2 {

        public static void main(String[] args) {
            String input = "Hello, World! 123";
            int count = 0;

            for (char c : input.toCharArray()) {
                if (Character.isLetter(c)) {
                    count++;
                }
            }

            System.out.println("Number of alpha characters: " + count);
        }
    }
