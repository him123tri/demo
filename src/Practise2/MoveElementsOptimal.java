package Practise2;

public class MoveElementsOptimal {

    public static void main(String[] args) {
        int a[] = {9,-8,-7,-6,2,3,-1,1,6};
        int n = a.length;
        int j = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                j = i;
                break;
            }
        }

        for (int i = j + 1; i < a.length; i++) {
            if (a[i] < 0) {
                int tmp;
                tmp = a[i]; //3
                a[i] = a[j];
                a[j] = tmp;
                j++;
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }




    }
}
