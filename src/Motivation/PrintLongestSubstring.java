package Motivation;

import java.util.ArrayList;

public class PrintLongestSubstring {
    public static void main(String[] args) {

        String s = "abcabcdefa";
        char [] c = s.toCharArray();

        int max =0;
        ArrayList <String> list = new ArrayList<>();
        for (int i =0; i<c.length; i++){
            int count =1;
            int min =0;
            int max2 =0;
            for(int j =i+1; j<c.length; j++){
                if (c[i]!=c[j]){
                    count = count+1;
                }
                else{
                    min =i;
                    max2 =j;
                    break;
                }
            }
            if (count >max){
                list.clear();
                max = count;
                list.add(s.substring(min,max2));
            }
        }
        System.out.println(list);
        System.out.println(max);
    }
}
