package Motivation;

public class Question13 {
    public static void main(String[] args) {
        String s = "abcdefab";
        char [] c = s.toCharArray();

        for (int i =0; i<c.length; i++){
            int count = 1;
            for (int j =i+1; j<c.length; j++){
                if (c[i] == c[j]){
                    count =count +1;
                }

            }
            if (count ==1){
                System.out.println(c[i]);
                break;
            }

        }
    }
}
