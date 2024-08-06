package poo.concepts.implementations;

import poo.concepts.models.Person;

public class PersonImplementation {
    public static void main(String[] args) {

        System.out.println("*** Show personCounter ***");
        System.out.println(Person.getPersonCounter());
        System.out.println("*** Creation of objects ***");
        var person1 = new Person("Gaby", "Alas", "gabi@mail.com");
        System.out.println("*** Show person ***");
        person1.showPerson();
        System.out.println("*** Show person with toString() ***");
        System.out.println(person1);
        System.out.println("*** Show personCounter ***");
        System.out.println(Person.getPersonCounter());
        System.out.println("\n");

        System.out.println("*** Creation of second object ***");
        Person person2 = new Person();
        System.out.println("*** Set values ***");
        person2.setName("Josue");
        person2.setLastname("Avalos");
        person2.setEmail("josue@mail.com");
        System.out.println("*** Show values ***");
        person2.showPerson();
        System.out.println("*** Show values with toString() ***");
        System.out.println(person2);
        System.out.println("*** Show personCounter ***");
        System.out.println(Person.getPersonCounter());

    }
}
