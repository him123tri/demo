package Practise2;

public class BubbleSort {

    /*In Bubble sort , we sort the max value first and then the second max value and so on.
    Time Complexity : O(n^2)
    Space Complexity : O(1)
    *
    * */

    public static void main(String[] args) {

        int [] a = {16, 17, 4, 3, 5, 2};
        int temp = 0;
        for (int i =0; i < a.length; i++){
            for (int j=0; j < a.length-1; j++){
                if (a[j] > a[j+1]){
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
            }
        for (int k =0; k < a.length; k++){
            System.out.println(a[k]);
        }
    }
}
