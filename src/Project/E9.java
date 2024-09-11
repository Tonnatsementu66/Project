package Project;

import java.util.LinkedHashMap;
import java.util.Map;

public class E9 {


        public static char findFirstNonRepeatingChar(String input) {
            Map<Character, Integer> charCountMap = new LinkedHashMap<>();

            for (char c : input.toCharArray()) {
                charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
            }

            for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
                if (entry.getValue() == 1) {
                    return entry.getKey();
                }
            }
            return '\0';
        }

        public static void main(String[] args) {
            String input = "abracadabra";
            System.out.println("First non-repeating character: " + findFirstNonRepeatingChar(input));
        }
    }

