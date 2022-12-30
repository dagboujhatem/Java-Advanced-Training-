public class Main {
    public static void main(String[] args) {
        System.out.println(Utils.min(8,9));
        System.out.println(Utils.min(8.6D,9.0D));
        System.out.println(Utils.min(8.65F,3.02F));

        // multiple type in the generic method
        Utils.printKeyValue(4, "Hatem");
        Utils.printKeyValue(2F, 5);
    }
}