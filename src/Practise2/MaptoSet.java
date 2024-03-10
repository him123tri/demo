import java.util.*;

public class MaptoSet {
    public static void main(String[] args) {


                Map map=new HashMap();
                //Adding elements to map
                map.put(1,"Amit");
                map.put(5,"Rahul");
                map.put(2,"Jai");
                map.put(6,"Amit");
                //Traversing Map
                Set set=map.entrySet();//Converting to Set so that we can traverse

                    System.out.println(set);
                }
            }

