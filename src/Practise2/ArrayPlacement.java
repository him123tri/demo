package Practise2;

public class ArrayPlacement {

    public static void main(String[] args) {

        int a[] = {-2, 0, 3, 4,0, 0, -15, -6, -7,17,-22};

        int j = 0, temp;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                if (i != j) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
                j++;
            }
        }
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
    }}
