package Practise;

public class InitialsInString {

    public static void main(String[] args) {

        String s = "Bhavana Himanshu Tripathi";
        String [] s1 = s.split(" ");

        String word = "";

        for(int i =0; i < s1.length-1; i++){
            word = word +s1[i].charAt(0);
        }
        System.out.println(word+ "  "+ s1[2]);

    }
}
