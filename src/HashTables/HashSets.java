package HashTables;

import java.util.HashSet;
import java.util.Iterator;

public class HashSets {

    public static void main(String[] args) {

        // Create a HashSet of Strings
        HashSet<String> fruits = new HashSet<>();

        // 1. Add elements to the HashSet
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Banana"); // Duplicate - will not be added

        // 2. Display the HashSet
        System.out.println("HashSet: " + fruits);

        // 3. Check if an element exists
        System.out.println("Contains Mango? " + fruits.contains("Mango"));
        System.out.println("Contains Grapes? " + fruits.contains("Grapes"));

        // 4. Remove an element
        fruits.remove("Orange");
        System.out.println("After removing Orange: " + fruits);

        // 5. Size of the HashSet
        System.out.println("Size of HashSet: " + fruits.size());

        // 6. Iterating through elements using for-each loop
        System.out.println("\nIterating using for-each loop:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // 7. Iterating using Iterator
        System.out.println("\nIterating using Iterator:");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 8. Clear the HashSet
        fruits.clear();
        System.out.println("After clearing: " + fruits);
        System.out.println("Is HashSet empty? " + fruits.isEmpty());
    }
}
