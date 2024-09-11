package Project;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class E8 {


        public static List<String> filterAndLowercase(List<String> input) {
            return input.stream()
                    .filter(s -> s.startsWith("A"))
                    .map(String::toLowerCase)
                    .collect(Collectors.toList());
        }

        public static void main(String[] args) {
            List<String> list = new ArrayList<>();
            list.add("Apple");
            list.add("Banana");
            list.add("Avocado");
            list.add("Apricot");

            System.out.println("Filtered and Lowercased: " + filterAndLowercase(list));
        }
    }

