package poo.concepts.models;

public interface Translator {
    //The methods in an interface are abstract and public by default
    void translate();

    //Methods with a default implementation
    default void initializeTranslator() {
        System.out.println("Initializing translator...");
    }
}
