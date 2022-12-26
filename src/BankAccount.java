import java.io.IOException;

public class BankAccount {
    private double balance;

    public void deposit(double amount) throws InvalidAmountException { // propagation de l'exception
        // Defensive programming
        if(amount <= 0 ){
            throw new InvalidAmountException("Invalid amount."); // lancer une nouvelle exception
        }
        this.balance += amount;
    }
}
