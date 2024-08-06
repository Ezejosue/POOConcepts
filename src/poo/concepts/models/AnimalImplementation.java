package poo.concepts.models;

public class AnimalImplementation {
    public static void main(String[] args) {
        System.out.println("*** Inheritance Example ***");
        System.out.println("*** Animal is a father class ***");
        var animal = new Animal();
        printAnimal(animal);
        System.out.println("\n");

        System.out.println("*** Dog is a child class ***");
        var dog = new Dog();
        printAnimal(dog);
        System.out.println("\n");

        System.out.println("*** Cat is a child class ***");
        var cat = new Cat();
        printAnimal(cat);

    }

    // This method receives an Animal object and calls the methods sleep, eat and makeSound. Example of polymorphism
    static void printAnimal(Animal animal) {
        animal.sleep();
        animal.eat();
        animal.makeSound();
    }
}
