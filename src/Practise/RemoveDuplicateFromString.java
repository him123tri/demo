package Practise;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateFromString {

    public static void main(String[] args) {
        String s = "javaTpoint is the best learning website";
        Set<Character> set = new LinkedHashSet<>();
        String s1 = s.replace(" ","");
        char [] c = s1.toCharArray();
        for(Character ch:c){
            set.add(ch);
        }
        String word = "";
        for(Character x:set){
            word = word + x;
        }
        System.out.println(String.valueOf(set));
        System.out.println(word);

    }
}
