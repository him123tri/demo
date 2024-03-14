package Interview;

import java.util.ArrayList;

public class MergeTwoSortedArrayAndMedian {

    public static void main(String[] args) {

//        double dividend = 10;
//        double divisor = 3;
//
//        double quotient = dividend / divisor;
//        long roundedQuotient = Math.round(quotient);
//
//        System.out.println("Quotient: " + quotient);

        int [] a = {1,3};
        int [] b = {2,7};
        ArrayList <Integer> l = new ArrayList<>();

        for (int i= 0; i< a.length; i++){
            l.add(a[i]);
        }
        for (int j= 0; j< b.length; j++){
            l.add(b[j]);
        }
        double sum =0;
        for (Integer elements : l){
            sum = sum +elements;
        }
        double average = sum / l.size();
        System.out.println(average);
    }
}
