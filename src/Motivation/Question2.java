package Motivation;

import java.util.ArrayList;

public class Question2 {
    public static void main(String[] args) {
        String s = "My Name is Abhay";
        char[] c = s.toCharArray();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < c.length; i++) {
            if (String.valueOf(c[i]).equals(" ")) {
                list.add(i);
            }}
            System.out.println(list);

            String newReversedString = reverse(s);
            System.out.println(newReversedString);

            StringBuffer sb = new StringBuffer(newReversedString);
            for (int j=0; j<list.size(); j++){
                sb.insert(list.get(j)," ");
            }
        System.out.println(sb);
        }



    public static String reverse(String s) {

        String s1 = s.replace(" ", "");
        char [] c1 = s1.toCharArray();
        String reversedString = "";
        for (int i =c1.length-1; i>0; i--){
            reversedString = reversedString + c1[i];
        }

        return reversedString;
    }
}
