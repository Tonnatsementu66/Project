package Project;

import java.util.StringTokenizer;

public class E7 {


        public static int countWords(String input) {
            StringTokenizer tokens = new StringTokenizer(input, " ,.!?;:\"()[]{}");
            return tokens.countTokens();
        }

        public static void main(String[] args) {
            String input = "Hello, world!";
            System.out.println("Number of words: " + countWords(input));
        }
    }


