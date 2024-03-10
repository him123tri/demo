public class SelectionSort {

    /*In Selection sort : we sort the min value first and then the second min value and so on.
    Time Complexity : O(n^2)
    Space Complexity : O(1)
    *
    * */

    public static void main(String[] args) {

        int[] a = {16, 17, 4, 3, 5, 2};
        for (int i = 0; i < a.length; i++) {
            int mid = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[mid]) {
                    mid = j;
                }
            }
            int temp = a[mid];
            a[mid] = a[i];
            a[i] = temp;
        }
        for (int k = 0; k < a.length; k++) {
            System.out.println(a[k]);
        }


    }
}
