@FunctionalInterface
interface A {
    void show(); // only 1 abstract method
    //void display (); // we cannot have multiple method in functional interface
}

//class B implements A {
//    public void show(){
//        System.out.println("Hello All");
//    }
//
//}


public class LambdaExpression {
    public static void main(String[] args) {

        // A obj = new A ();  - we cannot do this, as we cannot create object of Interface
//        A obj = new B();
//        obj.show();


        /*Just to Avoid extra class creation all the times for implementation of the interfaces
        * There comes the concept of Lambda Expression
        * Anonymous Inner class concept we are using here without naming the class we are creating a innerclass to another class*/


        A obj = () -> System.out.println("Hello All"); // one liner function with no name, modifier and return type
        obj.show();
    }
}
