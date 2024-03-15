package Motivation;

public class TwoSum {
    public static void main(String[] args) {
        int [] a = {2,3,4,6,8,9};
        int num = 20;

        int i =0;
        int j = a.length-1;
        boolean flag = false;

        while(i<j){
            if (a[i] + a[j] == num){
                System.out.println(i +" "+j);
                flag = true;
                break;
            }

            if (a[i] +a[j] < num){
                i++;
            }
            if (a[i] +a[j] > num){
                j--;
            }

        }
        if (flag == false){
            System.out.println("Sum not present");
        }

    }
}
