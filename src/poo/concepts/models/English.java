package poo.concepts.models;

public class English implements Translator { //The class must implement the interface Translator
    @Override
    public void translate() {
        System.out.println("Translating to English...");
    }
}
