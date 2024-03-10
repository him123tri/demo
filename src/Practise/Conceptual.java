package Practise;
@FunctionalInterface
interface clone {
    void meth1();

//    void meth2();
}

// class Anonymous implements clone {
//    @Override
//    public void meth1() {
//        System.out.println("I am in method 1");
//    }
//
//    @Override
//    public void meth2() {
//        System.out.println("I am in method 2");
//    }
//
//}

public class Conceptual {

    public static void main(String[] args) {


        // Lambda Function:::

        clone obj = ()->{System.out.println("I am in method 2");};
        obj.meth1();
//        Anonymous an = new Anonymous();
//        an.meth1();
//        an.meth2();



        //Concept of Anonymous class
//        clone obj = new clone() {
//            @Override
//            public void meth1() {
//                System.out.println("I am in method 1");
//            }
//
//            @Override
//            public void meth2() {
//                System.out.println("I am in method 2");
//            }
//        };
//        obj.meth1();
    }
}
