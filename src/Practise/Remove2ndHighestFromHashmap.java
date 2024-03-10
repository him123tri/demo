package Practise;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Remove2ndHighestFromHashmap {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        map.put("Himanshu", 3);
        map.put("xyu", 30);
        map.put("hj", 300); // Delete this
        map.put("hu", 331);
        // we can use comparator also here

        for(Map.Entry entry: map.entrySet()){
            Integer value = (Integer) entry.getValue();
            list.add(value);
        }
        System.out.println(list);
        int max = 0;
        int min =0;
        for(int i=0; i< list.size(); i++){
            if (list.get(i) > max){
                max = list.get(i);
            }
            if (list.get(i)<max && list.get(i) > min){
                min = list.get(i);
            }
        }
        System.out.println(min);

        for(Map.Entry entry: map.entrySet()){
            if(entry.getValue().equals(min)){
                map.remove(entry.getKey());
                break;
            }
        }
        System.out.println(map);


    }
}
