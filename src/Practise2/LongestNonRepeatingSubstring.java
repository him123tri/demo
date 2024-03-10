import java.util.ArrayList;

public class LongestNonRepeatingSubstring {

    public static void main(String[] args) {
        String s = "abcadefgab";
        char[] c = s.toCharArray();
        ArrayList <Integer> list = new ArrayList<>();
        for (int i =0; i < s.length(); i++){
            int count =1;
            for (int j =i+1; j<8; j++){
                if (c[i] != c[j]){
                     count = count+1;
                }
                else{
                    break;
                }

            }list.add(count);
        }
        int max = 0;
        for (Integer x : list){
            if (x>max){
                max = x;
            }
        }System.out.print(max);
    }
}
