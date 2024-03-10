import java.util.ArrayList;

public class ContinousElement {

    public static void main(String[] args) {

        int a [] = {1,2,3,4,1,2,3,4,5,6,7,8,9};

        int count =1;
        int tmp =1;
        for (int i =0; i< a.length-1; i++){
            if (a[i]+1 == a[i+1]){
               count = count+1;
            }
            else{
                count =1;
            }
            if (count > tmp) {
                tmp = count;
            }

        }
        System.out.print(tmp);
    }
}
