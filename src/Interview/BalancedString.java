import java.util.HashSet;

public class BalancedString {

    public static void main(String[] args) {
        String s = "[{}][(){}]"; //
        char[] c = s.toCharArray();
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < c.length; i++) {
            set.add(c[i]);
        }
        Boolean flag = false;
        for (Character ch : set) {
            if (flag != true) {
                int count = 0;
                for (int i = 0; i < c.length; i++) {
                    if (ch == c[i]) ;
                    count = count + 1;
                }
                if (count % 2 != 0) {
                    System.out.print("Unbalanced String");
                    flag = true;
                    break;
                }

            }
        }
        if (flag != true) {
            System.out.print("Balanced String");
        }
    }
}
