package Practise;

import java.util.HashMap;

public class TwoSumRevise {
    public static void main(String[] args) {
        int a[] = {2, 6, 5, 8, 11};
        int num = 14;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<a.length; i++){
            int more = num -a[i];
            map.put(a[i],i);
            if(map.containsKey(num-a[i])){
                System.out.println("Yes");
                break;
            }
        }

    }
}
