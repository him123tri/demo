package Test;

import java.util.ArrayList;
import java.util.List;

public class LongestConsecutiveSequence {

    public static void main(String[] args) {
        int [] a = {2,51,90,52,65,56,53};

        List<Integer> list = new ArrayList<>();

        int count =1;
        for (int i =0; i< a.length; i++){

            int tmp =a[i];
            for(int j =0; j<a.length; j++){
                if (a[j] == tmp+1){
                    count = count+1;
                    tmp =a[j]+1;
                }

            }
            list.add(count);
        }
        System.out.println(list);
    }
}
