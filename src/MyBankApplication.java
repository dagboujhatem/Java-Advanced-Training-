import java.io.IOException;

public class MyBankApplication {
    static void start () throws BankAccountException {
        try {
            BankAccount bankAccount = new BankAccount();
            bankAccount.deposit(-80);

        } catch (BankAccountException e) {
            System.out.println("logging here ...");
            throw e;
        }
    }
}
