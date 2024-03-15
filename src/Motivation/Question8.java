package Motivation;
// Move All Negative to the Left
public class Question8 {
    public static void main(String[] args) {

        int [] a = {-2,-4,7,-9,7,-1,4};

        int j =0;
        for (int i = 0; i< a.length; i++){
            if (a[i] >0){
                j =i;
                break;
            }
        }

        for (int i =j+1; i< a.length; i++){
            if (a[i]< 0){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                j++;
            }

        }

        for (int i =0; i <a.length; i++){
            System.out.println(a[i]);
        }
    }
}
