package poo.concepts.concepts;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, String> person = new HashMap<>();

        //Add elements, in this case, the person's data
        person.put("name", "John");
        person.put("surname", "Doe");
        person.put("age", "30");
        person.put("city", "New York");
        person.put("country", "USA");
        //person.put("name", "Jane"); // Duplicates are not allowed

        //Show the map
        //person.forEach((key, value) -> System.out.println(key + ": " + value));
        person.entrySet().forEach(System.out::println);

        //Size of the map
        System.out.println("Size of the map: " + person.size());

        //Remove an element
        person.remove("city");

        //Check if the map contains a key
        System.out.println("Is city in the map? " + person.containsKey("city"));

        //Check if the map contains a value
        System.out.println("Is New York in the map? " + person.containsValue("New York"));

        //Show the map
        System.out.println("\n");
        person.forEach((key, value) -> System.out.println(key + ": " + value));

        //Get an element
        System.out.println("Element with key 'name': " + person.get("name"));

        //Modify an element
        person.put("age", "31");

        //Show the map
        System.out.println("\n");
        person.forEach((key, value) -> System.out.println(key + ": " + value));

        //Clear the map
        person.clear();
    }
}
