import java.util.ArrayList;
import java.util.Collections;

public class StringPrefix {

    public static void main(String[] args) {
        String[] strs = {"abc", "ab", "abcd"};
        ArrayList<Integer> l = new ArrayList <>();
        for (int i=0; i<strs.length;i++ ){
            l.add(strs[i].length());}
        Collections.sort(l);
        int count = l.get(0);

        String word = "";

        for (int i=0; i<count; i++){

            if (strs[0].charAt(i) == strs[1].charAt(i) && strs[1].charAt(i) == strs[2].charAt(i)){
                word = word + strs[1].charAt(i);
            }


        }
        System.out.println(word);



        // As a part of this solution we need to print the prefix

        // Store all the chars in char array:
//        char[] c1 = new char[3];
//        char[] c2 = new char[2];
//        char[] c3 = new char[4];
//
//        for (int i = 0; i < s.length; i++) {
//
//            c1 = s[i].toCharArray();
//            c2 = s[i].toCharArray();
//            c3 = s[i].toCharArray();
//        }
//        String word = "";
//        for (int i = 0; i < 2; i++) {
//            if (c1[i] == c2[i] && c2[i] == c3[i]) {
//                word = word + c1[i];
//            }
//
//            if (c1[i] != c2[i] && c2[i] != c3[i]) {
//                break;
//            }
//        }
//        System.out.println(word);
    }
}
