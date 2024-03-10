public class ArithmeticException {

    // this is Run Time exception
    // ArrayIndexOutOfBoundException
    //NumberFormatException
    //FileNotFound
    //ClassNotFoundException
    public static void main(String[] args) {

        try{
        int n = 2/0;
        System.out.println(n);}

        catch (java.lang.ArithmeticException e){
            System.out.println("In catch block");
            e.printStackTrace();
        }
        catch(java.lang.NullPointerException a){
            a.printStackTrace();

        }

    }
}
