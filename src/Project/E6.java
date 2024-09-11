package Project;

public class E6 {

        public static int countVowels(String input) {
            int count = 0;
            input = input.toLowerCase();
            for (char c : input.toCharArray()) {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    count++;
                }
            }
            return count;
        }

        public static void main(String[] args) {
            String input = "documentation";
            System.out.println("Number of vowels: " + countVowels(input));
        }
    }

