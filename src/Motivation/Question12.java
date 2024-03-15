package Motivation;

import java.util.Stack;

public class Question12 {
    public static void main(String[] args) {
        String s = "[}}}][(){}]";
        char[] c = s.toCharArray();

        Stack<Character> stack = new Stack<>();
        boolean flag = true;
        for (int i = 0; i < c.length; i++) {

            if (c[i] == '{' || c[i] == '(' || c[i] == '[') {
                stack.add(c[i]);
            } else {
                char c2 = stack.peek();
                stack.pop();

                if ((c2 == '{' && c[i] == '}')
                        || (c2 == '(' && c[i] == ')'
                        || (c2 == '[' && c[i] == ']'))) {
                } else {
                    flag = false;
                    break;
                }
            }
        }

        if (flag ==true) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }

    }
}
