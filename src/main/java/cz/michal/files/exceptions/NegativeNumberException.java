package cz.michal.files.exceptions;

public class NegativeNumberException extends Exception {

    public NegativeNumberException() {
        super("Number must be positive!");
    }
}
