package poo.concepts.concepts;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Monday");
        list.add("Tuesday");
        list.add("Wednesday");
        list.add("Thursday");
        list.add("Friday");
        list.add("Saturday");
        list.add("Sunday");
        //list.add("Sunday"); // Duplicates are allowed

        for (String day : list) {
            System.out.println(day);
        }
        System.out.println("\n");
        //Lambda expression to print the list
        list.forEach(System.out::println);

        //Size of the list
        System.out.println("Size of the list: " + list.size());

        //Remove an element
        list.remove("Sunday");

        //Check if the list contains an element
        System.out.println("Is Sunday in the list? " + list.contains("Sunday"));

        //Modify an element
        list.set(0, "Holiday");

        //Show the list
        System.out.println("\n");
        list.forEach(System.out::println);

        //Get an element
        System.out.println("Element at index 0: " + list.get(0));

        //Clear the list
        list.clear();

        //Check if the list is empty
        System.out.println("Is the list empty? " + list.isEmpty());

        List<String> names = Arrays.asList("John", "Jane", "Mary", "Peter");

        //Show the list
        System.out.println("\n");
        names.forEach(System.out::println);
    }
}
