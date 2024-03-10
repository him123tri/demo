public class Abc {

    public static void main(String[] args) {

        /*
        * Input: arr[] = {16, 17, 4, 19, 5, 2,7},
Output: 19,7

Input: arr[] = {1, 2, 3, 4, 5, 2},
Output: 5, 2
        * */

        int [] a = {16, 17, 4, 3, 5, 2};
        int max = a[0];

        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];}

        }


    }
}
