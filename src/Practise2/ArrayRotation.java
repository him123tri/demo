


public class ArrayRotation {
    public static void main(String[] args) {
        int a[] = {2, 3, 4, 5};
        int count = 2;
        while (count >0){
        int temp = a[3];
        for (int i = a.length - 1; i > 0; i--) {
            a[i] = a[i - 1];
        }
        a[0] = temp ;
        count--;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }


    }
}
