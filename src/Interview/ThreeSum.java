package Interview;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

import java.util.*;

public class ThreeSum {

    public static void main(String[] args) {
        int[] a = {-1, 0, 1, 2, -1, -4};
        HashSet<List<Integer>> set = new HashSet<>();
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            int temp = 0 - a[i];
            int j = i+1;
            int k = a.length-1;

            while (j<k){
                if (a[j]+a[k] > temp){
                    k--;
                }
                else if(a[j]+ a[k] < temp){
                    j++;
                }
                else{
                    List<Integer> list = new ArrayList<>();
                    list.add(a[i]);
                    list.add(a[j]);
                    list.add(a[k]);
                    Collections.sort(list);
                    set.add(list);
                    j++;
                    k--;
                }

            }





        }
        System.out.println(set);


    }
}
