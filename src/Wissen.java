import javax.xml.stream.events.Characters;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Wissen {

    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        array.add(String.valueOf(1));

        String first = "ravi";//abcd
        String second = "raviteja";//cdef
        ArrayList <Character> l = new ArrayList<>();

        char [] c1 = first.toCharArray();
        char [] c2 = second.toCharArray();
        // Output - cd
        HashSet <Character> s1 = new LinkedHashSet<>();
        HashSet <Character> s2 = new LinkedHashSet<>();

        for (Character cset:c1){
            s1.add(cset);
        }


        for (Character cset2:c2){
            s2.add(cset2);
        }

       for (Character j:s1){
            for (Character k :s2){
                if (j == k){
                    l.add(j);
                }
            }
        }
        System.out.println(l);
    }
}
