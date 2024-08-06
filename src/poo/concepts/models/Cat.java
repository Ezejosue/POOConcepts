package poo.concepts.models;

public class Cat extends Animal {
    @Override
    protected void eat() {
        System.out.println("The cat is eating");
    }

    @Override
    protected void sleep() {
        System.out.println("The cat is sleeping");
    }

    @Override
    protected void makeSound() {
        System.out.println("The cat is meowing");
    }
}
