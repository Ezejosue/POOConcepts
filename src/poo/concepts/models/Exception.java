package poo.concepts.models;

public class Exception extends Throwable {
    private String message;

    public Exception(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
