public class InvalidAmountException extends Exception {

    public InvalidAmountException(String message){
        super(message);
    }

    public InvalidAmountException() {
        super("Invalid amount exception.");
    }
}
