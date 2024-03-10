import java.util.Arrays;

public class MinSumOf4DigitNumber {
    public static void main(String[] args) {

        int num = 4113;
        int[] nums = new int[4];
        for (int i = 0; num != 0; ++i) {
            nums[i] = num % 10;
            num /= 10;
        }
        Arrays.sort(nums);
        int x = Integer.parseInt((Integer.toString(nums[0]) + Integer.toString(nums[3])));
        int y = Integer.parseInt((Integer.toString(nums[1]) + Integer.toString(nums[2])));

        System.out.print (x+y);
    }
}
