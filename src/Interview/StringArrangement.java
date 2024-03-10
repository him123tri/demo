import java.util.ArrayList;
import java.util.HashSet;

public class StringArrangement {
    public static void main(String[] args) {
        String s = "Kapooorrrr";
        char[] c = s.toCharArray();
        HashSet<Character> set = new HashSet<>();
        ArrayList<Character> l = new ArrayList<>();
        for (int i = 0; i < c.length; i++) {
            set.add(c[i]);
        }
        for (Character value : set) {
            int count = 0;
            for (int j = 0; j < c.length; j++) {
                if (value == c[j])
                    count = count + 1;
            }

            int max =1;
            if (count > max){
                max = count;
            }
            for (int i = 0; i < max; i++) {
                if (count > max)
                    l.add(value);
            }
        }

        for (int x = 0; x < c.length; x++) {
            if (!l.contains(c[x]))
                l.add(c[x]);
        }
        System.out.println(l);
    }
}
