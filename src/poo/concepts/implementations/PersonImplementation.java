package poo.concepts.implementations;

import poo.concepts.models.Person;

public class PersonImplementation {
    public static void main(String[] args) {
        System.out.println("*** Creation of objects ***");
        var person1 = new Person("Gaby", "Alas", "gabi@mail.com");
        System.out.println("*** Show person ***");
        person1.showPerson();
        System.out.println("\n");

        System.out.println("*** Creation of second object ***");
        Person person2 = new Person();
        System.out.println("*** Set values ***");
        person2.setName("Josue");
        person2.setLastname("Avalos");
        person2.setEmail("josue@mail.com");
        System.out.println("*** Show values ***");
        person2.showPerson();

    }
}
