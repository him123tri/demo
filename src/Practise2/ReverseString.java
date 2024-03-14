package Practise2;

public class ReverseString {

    public static void main(String[] args) {
        String s = "abcdw";
        String rev = "";
        for (int i = 4; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }

        System.out.println(rev);
        if (s.equals(rev)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}

//q:how to convert char to string array
//a: String.valueOf(charArray)