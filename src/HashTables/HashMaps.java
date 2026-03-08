package HashTables;

import java.util.HashMap;
import java.util.Map;

public class HashMaps {

    public static void main(String[] args) {

        // Create a HashMap of Integer (key) and String (value)
        HashMap<Integer, String> students = new HashMap<>();

        // 1. Add key-value pairs using put()
        students.put(101, "Aavishkar");
        students.put(102, "Sahil");
        students.put(103, "Rohit");
        students.put(104, "Harry");

        // Duplicate key: will overwrite the previous value
        students.put(103, "Rahul");

        // 2. Display the HashMap
        System.out.println("HashMap: " + students);

        // 3. Get value by key
        System.out.println("Student with Roll 101: " + students.get(101));

        // 4. Check if a key exists
        System.out.println("Contains Roll 102? " + students.containsKey(102));

        // 5. Check if a value exists
        System.out.println("Contains Name 'Sneha'? " + students.containsValue("Sneha"));

        // 6. Remove a key-value pair
        students.remove(104);
        System.out.println("After removing roll 104: " + students);

        // 7. Size of HashMap
        System.out.println("Total Students: " + students.size());

        // 8. Iterate using for-each loop
        System.out.println("\nIterating using entrySet():");
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println("Roll: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        // 9. Clear the HashMap
        students.clear();
        System.out.println("After clearing: " + students);
        System.out.println("Is HashMap empty? " + students.isEmpty());
    }
}
