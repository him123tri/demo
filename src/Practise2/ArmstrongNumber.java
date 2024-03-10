import java.lang.Math;
public class ArmstrongNumber {

    public static void main(String[] args) {

        int n = 253;
        int temp = n;
        int r = 0;
        double num = 0;
        int digits = 0;
        while (n>0){
            digits = digits + 1;
            n = n/10;
        }

        while (temp>0){
            r = temp%10;
            num = num + Math.pow(r,digits);
            temp = temp/10;
        }
        System.out.print(num);
    }
}
