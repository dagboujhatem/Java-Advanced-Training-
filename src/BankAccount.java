public class BankAccount implements Comparable<BankAccount>, Cloneable {
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

    @Override
    public int compareTo(BankAccount bankAccount) {
        // 1st way to compare two object based on their attributes
        // this > bankAccount : return 1 (or any positif number)
        // this < bankAccount : return -1 (on any negatif number)
        // this == bankAccount : return 0
       /*if (balance > bankAccount.balance){
           return 1;
       }else if (balance < bankAccount.balance){
           return -1;
       }else{
           return 0;
       }*/

       // 2nd way to do the same thing
        return (int) (balance - bankAccount.balance);
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
