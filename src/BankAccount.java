import java.io.IOException;

public class BankAccount {
    private double balance;

    public void deposit(double amount) throws BankAccountException {
        // Defensive programming
        if(amount <= 0 ){
            // 1st way
            /* BankAccountException bankAccountException = new BankAccountException();
            InvalidAmountException invalidAmountException =  new InvalidAmountException("Invalid amount.");
            bankAccountException.initCause(invalidAmountException);
            throw bankAccountException; */

            // 2nd way (more easy)
            throw new BankAccountException(new InvalidAmountException("Invalid amount."));
        }
        this.balance += amount;
    }
}
