import java.util.HashMap;
import java.util.Map;

public class AvergeAgeUsingHashMap {
    public static void main(String[] args) {

        HashMap <String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 30);
        int value = 0;
        int average = 0;
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            value = value + entry.getValue();
            int size = map.size();
            average = value/size;

        }
        System.out.println("Average Age of Students is:" +average);

    }

}
