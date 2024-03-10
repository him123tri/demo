public class NullPointerException {
    public static void main(String[] args) {

        // This is run time exception
        try {
            String s = null;
            int n = s.length();

        } catch (java.lang.NullPointerException e) {
            e.printStackTrace();
        }

        finally {
            System.out.println("Next piece of code");
        }
    }
}
