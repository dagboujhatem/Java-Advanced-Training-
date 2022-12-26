import java.io.IOException;

public class MyBankApplication {
    static void start () throws InvalidAmountException {
        try {
            BankAccount bankAccount = new BankAccount();
            bankAccount.deposit(-80);

        } catch (InvalidAmountException e) {
            System.out.println("logging here ...");
            throw e;
        }
    }
}
