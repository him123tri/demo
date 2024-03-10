package Test;

import java.util.Stack;

public class ReverseNumber {

    public static void main(String[] args) {

        int n = 123;

        Stack<Integer> stack = new Stack<>();
        int r = 0;
        while (n >0){
            r = n%10;
            stack.add(r);
        }




    }

}
