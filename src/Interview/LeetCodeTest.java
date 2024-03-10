public class LeetCodeTest {
    public static int [] main(String[] args) {

        int [] nums = {2,4,5,6,8,9};
        int target =15;
        int [] sample = new int [1];
        Boolean flag = false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    flag = true;
                    break;
                }

                sample[0] = nums[i];
                sample[1] = nums[j];


            }
            if (flag) {
                break;
            }

        }
        return sample;
    }
}