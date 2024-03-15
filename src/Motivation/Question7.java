package Motivation;

public class Question7 {

    public static void main(String[] args) {

        String s = "My name is a Himanshu";
        String [] c = s.split(" ");
        // Print String of max and min length//

        String max = "";
        String min = "";
        int minLength =c.length;
        int maxLength =0 ;

        for (int i =0; i<c.length;i++){
            if (c[i].length() > maxLength){
                max = c[i];
            }

            if (c[i].length() < minLength){
                min = c[i];
            }


        }
        System.out.println(max +"    "+ min);
    }

}
