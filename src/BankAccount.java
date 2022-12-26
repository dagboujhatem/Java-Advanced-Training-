import java.io.IOException;

public class BankAccount {
    private double balance;

    public void deposit(double amount) throws BankAccountException {
        // Defensive programming
        if(amount <= 0 ){
            BankAccountException bankAccountException = new BankAccountException();
            InvalidAmountException invalidAmountException =  new InvalidAmountException("Invalid amount.");
            bankAccountException.initCause(invalidAmountException);
            throw bankAccountException;
        }
        this.balance += amount;
    }
}
