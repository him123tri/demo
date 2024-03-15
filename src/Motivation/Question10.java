package Motivation;

import java.util.*;

public class Question10 {
    //Group Anagram
    public static void main(String[] args) {


        int[] a = {123, 890, 678,132, 809, 666, 312};
        HashMap<String, List<Integer>> map = new HashMap<>();
        List<List<Integer>> list = new ArrayList<>();
        for (Integer n : a) {
            String s = String.valueOf(n);
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String snew = new String(c);
            if (!map.containsKey(snew)) {
                map.put(snew, new ArrayList<>());
            }
            map.get(snew).add(n);
        }
        list.addAll(map.values());
        System.out.println(list);


    }
}
