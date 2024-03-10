import java.util.Arrays;

public class AnagramsString {

    public static void main(String[] args) {
        String s1 = "India";
        String s2 = "India";
        boolean flag = true;

        if (s1.length() != s2.length()){
            System.out.println("Not Anagrams");
        }
        else
        {
            char c1 []  = s1.toCharArray();
            char c2 []  = s2.toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);

            for (int i =0 ; i < c1.length; i++){
                if (c1[i] != c2[i]){
                    flag = false;}
            }
            if (flag == true){
                System.out.println("Anagrams");
            }
            else
            {
                System.out.println("Not Anagrams");
            }
        }
    }
}
