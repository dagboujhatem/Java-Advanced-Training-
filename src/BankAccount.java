public class BankAccount {
    private double balance;

    public void deposit(double amount) {
        // Defensive programming
        if(amount <= 0 ){
            throw new IllegalArgumentException(); // lancer une nouvelle exception
        }
        this.balance += amount;
    }
}
