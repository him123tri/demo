package Practise2;

import java.util.ArrayList;
import java.util.HashSet;

public class RepeatingCharsWithGivenNumbers {

    public static void main(String[] args) {

        int [] a = {2,3,4,5,6,6,7,2,3,6,6,7,7};
        int num = 2;
        ArrayList<Integer> l = new ArrayList<>();
        HashSet <Integer> set = new HashSet<>();

        for (int i = 0; i< a.length; i++){
            set.add(a[i]);
        }

        for(int j:set){
            int count = 0;
            for (int k =0 ; k <a.length; k++){
                if (j == a[k]){
                    count = count +1;
                }
            }
            if (count == num){
                l.add(j);

            }
        }
        System.out.print(l);
    }
}
