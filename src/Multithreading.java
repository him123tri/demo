public class Multithreading {

    public static void main(String[] args) {
        threading t = new threading();
        threading t2 = new threading();

        t.start();
        t2.start();
    }
}
