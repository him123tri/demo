import java.util.ArrayList;
import java.util.Arrays;

public class FactorsInArray {

    public static void main(String[] args) {
        int a [] = {1,2,3,4,5,6,7,8,9,10};
        Arrays.asList(a);
        ArrayList<Integer> list = new ArrayList<Integer>();
        int n =6;

        for (int i =1; i <= n; i++){
            if (n%i == 0){
                list.add(i);

            }
        }
        System.out.print(list);
    }

}
