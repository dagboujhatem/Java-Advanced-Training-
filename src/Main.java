
public class Main {
    public static void main(String[] args) {
        try {
            //code qui peut déclencher une exception
            int res = 10 / 0;
            System.out.println(res);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }
}