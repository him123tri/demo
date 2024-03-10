import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {
        int[] a = {2, 6, 5, 8, 11};
        int num = 14;
        int low = 0;
        int high = a.length - 1;

        Arrays.sort(a);
        while (low < high) {
            if (a[low] + a[high] == num) {
                System.out.print("YES");
                break;
            } else if (a[low] + a[high] < num) {
                low++;
            } else {
                high--;
            }
        }

        // O (n* logn)
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for (int i =0; i <a.length; i++){
//            int x = a[i];
//            int more = num -a[i];
//            map.put(a[i],i);
//            if(map.containsKey(more)){
//                System.out.print("YES");
//                System.out.print(map.get(more) +" "+ map.get(a[i]));
//                break;
//            }
//        }


        // Brute Force - > Better, Optimal
        // Space Complexity ----> a[] ==== O (
        // Time Complexity ----> O (n^2)
//        Boolean flag = false;
//        for (int i=0; i<a.length; i++){
//            for (int j=0; j<a.length; j++){
//                if (a[i]+a[j] == num){
//                    flag = true;
//                    System.out.print("Index of i:" +i +"index of j:" +j);
//                    break;
//                }
//            }
//            if (flag == true){
//                break;
//            }
//        }


    }
}
