package ro.sda._3_exceptions._2_exercise;

//Checked Exception
public class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}
