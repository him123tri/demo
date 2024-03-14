package Interview;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {

        String s = "himanshutripathi";
        char [] c = s.toCharArray();
        LinkedHashSet<Character> set = new LinkedHashSet<Character>();
        for (int i = 0; i<c.length; i++ ){
            set.add(c[i]);
        }
        for (Character ch : set){
            int count =0;
            Boolean flag = false;
            for (int i =0; i< c.length; i++){
                if (c[i] == ch){
                    count = count+1;
                }
            }
            if (count ==1){
                System.out.print(ch);
                flag = true;
                break;
            }
            if (flag){
                break;
            }

        }

    }
}
