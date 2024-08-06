package poo.concepts.models;

public class Dog extends Animal {

    @Override
    protected void eat() {
        System.out.println("The dog is eating");
    }

    @Override
    protected void sleep() {
        System.out.println("The dog is sleeping");
    }

    @Override
    protected void makeSound() {
        System.out.println("The dog is barking");
    }
}
