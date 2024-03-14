package Practise;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class GreaterFreqWithHashMap {
    public static void main(String[] args) {

        String s = "cool";
        char [] c = s.toCharArray();

        HashMap <Character, Integer> map = new HashMap<>();

        for(int i=0; i<c.length; i++){
            if(map.containsKey(c[i])){
                map.put(c[i],map.get(c[i])+1);
            }
            else{
                map.put(c[i],1);
            }
        }
        System.out.println(map);

        ArrayList<Integer> list = new ArrayList<>();

        for(Map.Entry entry:map.entrySet()){
            list.add((Integer) entry.getValue());
        }
        Collections.sort(list);

        ArrayList <Object> list2 = new ArrayList<>();

        // To resume thinking this -----????


    }
}
