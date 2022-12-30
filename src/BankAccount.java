public class BankAccount {
    private double balance;
    private String holder;
    private String email;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public BankAccount(double balance, String holder, String email) {
        this.balance = balance;
        this.holder = holder;
        this.email = email;
    }

    @Override
    public String toString() {
        return "BankAccount {" +
                "balance=" + balance +
                '}';
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
