package Interview;

import java.util.ArrayList;

public class LongestSubString {

    public static void main(String[] args) {
        String s = "abcabcdefa";
        char [] c = s.toCharArray();
        int max = 1;
        for(int i =0; i< c.length; i++){
            int count =1;
            int min =0;
            int maxV =0;

            ArrayList <Integer> list = new ArrayList<>();

            for (int j =i+1; j< c.length ; j++){
                if (c[i] != c[j]){
                    count = count +1;
                    min =i;
                    maxV =j;
                    list.add(min);
                    list.add(max);
                }
                else{
                    i =j;
                    break;
                }
            }
            if (count >max){
                max = count;
            }
        }
        System.out.print(max);
    }
}
