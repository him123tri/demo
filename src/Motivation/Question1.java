package Motivation;

// Find the Prime Number and Store first in Array without creating a new array
public class Question1 {

    public static void main(String[] args) {
        int [] a = {3,6,13,7,9};
        int j =0;
        for(int i =0; i<a.length; i++){
            boolean flag = IsPrime(a[i]);
            if (flag == false){
                j=i;
                break;
            }
        }
        int temp =0;

        for (int i=j+1; i<a.length; i++){
            boolean flag = IsPrime(a[i]);
            if (flag == true){
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                j++;

            }
        }

        for (int i=0; i<a.length; i++){
            System.out.println(a[i]);
        }
    }

    public static boolean IsPrime(int n){
        if (n==0 || n==1){
            return false;
        }
        for (int i =2; i< n; i++){
            if (n%i ==0){
                return false;
            }
        }
        return true;
    }
}
