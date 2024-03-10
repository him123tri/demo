import javax.swing.text.AttributeSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class WordwithMaxFrequency {

    public static void main(String[] args) {

        String s = "Today is My Birthday";
        String[] s1 = s.split(" ");
        String newString = "";
        for (String s3 : s1) {
            newString = newString + s3;
        }

        char [] c = newString.toCharArray();
        HashSet <Character> set = new HashSet<>();
        for(char ch:c){
            set.add(ch);
        }
        HashMap <Character, Integer> map = new HashMap<>();

        for (char newc:set){
            int count =0;
            for (int j=1; j < c.length; j++){
                if (newc == c[j]){
                    count = count +1;
                }

            }
            map.put(newc,count);
            System.out.print(newc +"="+count+ "  ");

        }System.out.print(map);


    }
}
