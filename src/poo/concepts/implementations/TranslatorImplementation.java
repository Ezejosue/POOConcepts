package poo.concepts.implementations;

import poo.concepts.models.English;
import poo.concepts.models.Translator;

public class TranslatorImplementation {
    public static void main(String[] args) {

        //Translator translator = new Translator(); This line will throw an error because the interface Translator is abstract

        Translator translator = new English(); //We can create an object of the class that implements the interface
        translator.initializeTranslator();
        translator.translate();
    }
}
