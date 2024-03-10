package Blind75;

public class LargestAndSmallestInArray {

    public static void main(String[] args) {
        int a [] = {2,5,1,3,-1};
        int max = a[0];
        int min = a[0];
        for (int i =0; i <a.length; i++){
            if (a[i] > max){
                max = a[i];
            }
            if (a[i] <min) {
                min = a[i];
            }
        }
        System.out.println(max +":"+ min);

    }
}
