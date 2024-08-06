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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
