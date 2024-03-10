package Interview;

public class NumbersWithoutLoop {

    public static void printNumbers(int number){
        if (number <100){
            System.out.println(number);
            number = number +1;
            printNumbers(number);
        }
    }
    public static void main(String[] args) {
        printNumbers(1);
    }
}
