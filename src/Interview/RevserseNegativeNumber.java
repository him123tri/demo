package Interview;

public class RevserseNegativeNumber {

    public static void main(String[] args) {
        int n = 123;
        int reverseNum = 0;
        int r = 0;
        if (n < 0) {
            n = n * -1;
            while (n > 0) {
                r = n % 10;
                reverseNum = reverseNum * 10 + r;
                n = n / 10;
            }
            reverseNum = reverseNum * -1;
            System.out.println(reverseNum);
        } else if (n > 0) {
            while (n > 0) {
                r = n % 10;
                reverseNum = reverseNum * 10 + r;
                n = n / 10;
            }
            System.out.println(reverseNum);
        }


    }
}
