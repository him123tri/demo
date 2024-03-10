package Test;

import java.util.Stack;

public class ReverseUsingStack {

    public static void main(String[] args) {
        String s = "Himanshu Tripathi";


        String s1 [] = s.split(" ");
        int n = s1.length;
        int k =0;
        String word = "";
        while( k<n){
        Stack <Character> stack = new Stack<>();
        char[] c = s1[k].toCharArray();

        for (Character c1 :c){
            stack.add(c1);
        }
        System.out.println(stack);

        for (int i=0; i<c.length; i++){
            word = word + stack.peek();
            stack.pop();
        }
        k++;
        }
        System.out.println(word);

    }
}
