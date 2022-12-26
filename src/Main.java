import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            MyBankApplication.start();
        } catch (BankAccountException e) {
            e.printStackTrace();
        }
    }
}