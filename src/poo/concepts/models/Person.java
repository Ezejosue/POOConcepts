package poo.concepts.models;

public class Person {
    static int personCounter = 0;
    private Integer personId;
    private String name;
    private String lastname;
    private String email;

    public Person() {
        this.personId = ++personCounter;
    }

    public Person(String name, String lastname, String email) {
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.personId = ++personCounter;
    }

    public Integer getPersonId() {
        return personId;
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

    public static int getPersonCounter() {
        return personCounter;
    }

    public static void setPersonCounter(int personCounter) {
        Person.personCounter = personCounter;
    }

    public void showPerson() {
        System.out.println("The name is " + name + ", the lastname " + lastname
                + " and the email is " + email);
    }

    @Override
    public String toString() {
        return "Person{" +
                "personId='" + personId + '\'' +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", memory='" + super.toString() + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
