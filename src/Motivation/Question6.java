package Motivation;

public class Question6 {
    public static void main(String[] args) {
        String s = "aabbccaa";
        char [] c = s.toCharArray();

        for (int i=0; i<c.length; i++){

            int count=1;
            for (int j =i; j<c.length-1; j++){
                if (c[j] == c[j+1]){
                    count =count+1;
                    i =j+1;
                }
                else{
                    break;
                }

            }
            System.out.println(c[i] +" "+ count);

        }


    }
}
