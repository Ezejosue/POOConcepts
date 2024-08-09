package poo.concepts.concepts;

import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
        Set<String> conjunct = new TreeSet<>();

        //Add elements, in this case, continents
        conjunct.add("Africa");
        conjunct.add("Antarctica");
        conjunct.add("Asia");
        conjunct.add("Europe");
        conjunct.add("North America");
        conjunct.add("Oceania");
        conjunct.add("South America");
        //conjunct.add("Africa"); // Duplicates are not allowed

        //Show the set
        conjunct.forEach(System.out::println);

        //Size of the set
        System.out.println("Size of the set: " + conjunct.size());

        //Remove an element
        conjunct.remove("Antarctica");

        //Check if the set contains an element
        System.out.println("Is Antarctica in the set? " + conjunct.contains("Antarctica"));

        //Show the set
        System.out.println("\n");
        conjunct.forEach(System.out::println);
    }
}
