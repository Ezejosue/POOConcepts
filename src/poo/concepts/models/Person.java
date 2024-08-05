package poo.concepts.models;

public class Person {
    private String name;
    private String lastname;
    private String email;

    public Person() {
    }

    public Person(String name, String lastname, String email) {
        this.name = name;
        this.lastname = lastname;
        this.email = email;
    }

    public void showPerson() {
        System.out.println("The name is " + name + ", the lastname " + lastname
                + " and the email is " + email);
    }
}
