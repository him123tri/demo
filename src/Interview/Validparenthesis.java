package Interview;

import java.nio.charset.StandardCharsets;
import java.util.Stack;

public class Validparenthesis {
    public static void main(String[] args) {
        String s = "[}{][(){}]";
        char[] c = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        boolean flag = true;

        for (int i = 0; i < c.length; i++) {
            if (c[i] == '[' || c[i] == '{' || c[i] == '(') {
                stack.push(c[i]);
            } else {
                char c2 = stack.peek();
                stack.pop();
                if ((c2 == '(' && c[i] == ')')
                        || (c2 == '{' && c[i] == '}')
                        || (c2 == '[' && c[i] == ']')) {
                } else {
                    flag = false;
                    break;
                }
            }
        }
        if (flag) {
            System.out.println("balenced");
        } else {
            System.out.println("Not balenced");
        }
    }

}



