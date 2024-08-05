package poo.concepts.implementations;

import poo.concepts.models.Person;

public class PersonImplementation {
    public static void main(String[] args) {
        System.out.println("*** Creation of objects ***");
        var person1 = new Person("Gaby", "Alas", "gabi@mail.com");

        System.out.println("*** Show person ***");
        person1.showPerson();
        
    }
}
