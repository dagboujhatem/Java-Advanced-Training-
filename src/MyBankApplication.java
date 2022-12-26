import java.io.IOException;

public class MyBankApplication {
    static void start () throws IOException {
        try {
            BankAccount bankAccount = new BankAccount();
            bankAccount.deposit(-80);

        } catch (IOException e) {
            System.out.println("logging here ...");
            throw e;
        }
    }
}
