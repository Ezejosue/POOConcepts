package models;

public class Person {
    private String name;
    private String lastname;
    private String email;

    public void showPerson() {
        System.out.println("The name is " + name + ", the lastname " + lastname
                + " and the email is " + email);
    }
}
