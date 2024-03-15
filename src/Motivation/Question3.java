package Motivation;

public class Question3 {
    public static void main(String[] args) {
        // Solution is not yet ready
        int [] a = {-2,-4,0,7,-9,7,0,-1,4,0};

        int j =0;
        for (int i =0; i< a.length; i++){
            if (a[i] >0){
                j =i;
                break;
            }
        }

        for(int i =j+1; i<a.length; i++){
            if (a[i] <0){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                j++;
            }
        }
        for (int i=0; i<a.length; i++){
            System.out.println(a[i]);
        }

    }
}
