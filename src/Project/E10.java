package Project;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class E10 {



        public static List<String> removeDuplicates(List<String> input) {
            return new ArrayList<>(new LinkedHashSet<>(input));
        }

        public static void main(String[] args) {
            List<String> list = new ArrayList<>();
            list.add("apple");
            list.add("banana");
            list.add("apple");
            list.add("orange");

            System.out.println("Original List: " + list);
            System.out.println("List after removing duplicates: " + removeDuplicates(list));
        }

}
