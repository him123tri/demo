import java.util.HashMap;
import java.util.Map;

public class charcountHashMap {
    public static void main(String[] args) {


        String s = "aaabbbcccaaadd";
        char c[] = s.toCharArray();

        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : c) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }


        System.out.print(map);

    }
}