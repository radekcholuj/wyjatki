package pl.radekcholuj.exceptions.myexceptions;

public class PeselException extends Exception {
    public PeselException() {
        super("Pesel incorrect");
    }
}
