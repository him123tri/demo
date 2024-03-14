package Interview;

public class ReverseDigit {

    public static void main(String[] args) {

        int n = -143;
        int r = 1;
        int reverse = 0;
        while (n>0) {
            r = n % 10;
            reverse = reverse*10+r;
            n = n / 10;
        }
        System.out.print(reverse);


//        String s = "My name is Himanshu";
//        String[] s1 = s.split(" ");
//        String word = " ";
//
//        for(String newString:s1){
//
//            char [] c2 = newString.toCharArray();
//            for (int i = c2.length-1; i >=0; i--){
//                word = word +" "+ c2[i];
//            }
//            //System.out.print(" ");
//
//        }System.out.print(word);


    }
}
