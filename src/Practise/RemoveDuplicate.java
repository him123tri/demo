package Practise;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicate {

    public static void main(String[] args) {

        int[] a = {1, 2, 2, 3, 4, 5, 6, 6};
        Map <Integer,Integer> newValues = RemoveDuplicate(a);
//        System.out.println(newValues);

    }

    public static Map<Integer, Integer> RemoveDuplicate(int[] a) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            if (map.containsKey(a[i])) {
                map.remove(a[i]);
            }
            map.put(a[i], i);
        }
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey());
        }
        return map;

    }

}

