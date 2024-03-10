package Practise;

public class StringFrequency {
    public static void main(String[] args) {

        String s = "aaabbccaa";
        char c[] = s.toCharArray();

        for (int i = 0; i < c.length; i++) {
            int count = 1;
            for (int j = i; j < c.length -1; j++) {
                if (c[j] == c[j + 1]) {
                    count = count + 1;
                }
                else{
                i = j;
                break;}


            }
            System.out.println(c[i] + ":" + count);
        }


    }
}
