import java.awt.image.ImageProducer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SecondHighestRemoveFromHashMap {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Himanshu", 100);
        map.put("Tripathi", 300);
        map.put("Bhavana", 200);
        map.put("Tiger", 500);

        for (Map.Entry entrySet : map.entrySet()) {
            list.add((Integer) entrySet.getValue());
        }

        int max = list.get(0);
        int secondmax = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
            if (list.get(i) > secondmax && list.get(i) < max) {
                secondmax = list.get(i);
            }
        }

        for (Map.Entry entrySet : map.entrySet()) {
            if (entrySet.getValue().equals(secondmax)) {
                map.remove(entrySet.getKey());
                break;
            }
        }
        System.out.println(map);
    }
}


