package ro.sda._3_exceptions._2_exercise;

//Unchecked Exception
public class InvalidAccountException extends RuntimeException {
    public InvalidAccountException(String message) {
        super(message);
    }
}
