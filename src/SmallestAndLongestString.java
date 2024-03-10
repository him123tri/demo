import java.util.HashMap;

public class SmallestAndLongestString {

    public static void main(String[] args) {
        String s = "My name is a Himanshu";
        String [] s1 = s.split(" ");
        int min =s1.length;
        int max =0;
        String minString = "";
        String maxString = "";
        for (int i=0 ;i<s1.length; i++){
            if (s1[i].length()>max){
                max = s1[i].length();
                maxString = s1[i];
            }
            else if(s1[i].length() < min){
                min = s1[i].length();
                minString = s1[i];
            }
        }
        System.out.println("String with Min Characters:"+minString + " String with Max Characters:"+ maxString);



    }
}
