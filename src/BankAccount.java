import java.io.IOException;

public class BankAccount {
    private double balance;

    public void deposit(double amount) throws IOException {
        // Defensive programming
        if(amount <= 0 ){
            throw new IOException(); // lancer une nouvelle exception
        }
        this.balance += amount;
    }
}
