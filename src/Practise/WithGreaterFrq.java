package Practise;

import sun.tools.tree.CharExpression;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class WithGreaterFrq {

    public static void main(String[] args) {
        String s = "Cool";
        char[] ch = s.toCharArray();
        List<Character> list = new ArrayList<>();
        HashSet<Character> set = new HashSet<>();
        for (Character c : ch) {
            set.add(c);
        }
        for (Character c : set) {
            int count = 0;
            for (int i = 0; i < ch.length; i++) {
                if (c == ch[i]) {
                    count = count + 1;
                }
            }
            if (count >= 2) {
                for (int j = 0; j < count; j++) {
                    list.add(c);
                }
            }

        }
        for (int i =0; i< ch.length; i++){
            if (!list.contains(ch[i])){
                list.add(ch[i]);
            }
        }
        System.out.println(list);

    }
}
