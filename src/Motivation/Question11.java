package Motivation;

public class Question11 {

    public static void main(String[] args) {
        String[] s = {"3.1.3","3.0.2","3.0","3.1"};

        for (int i=0 ; i<s.length; i++){
            String s1 = s[i].replace(".","");
            if (Integer.valueOf(s1) > 30){
                System.out.println(s[i]);
            }

        }


    }
}
