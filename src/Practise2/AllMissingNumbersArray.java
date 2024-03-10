import java.util.Arrays;
import java.util.List;

public class AllMissingNumbersArray {
    public static void main(String[] args) {
        Integer [] a =  {1,2,20};
        List <Integer> list = Arrays.asList(a);
        for (int i = 1;i<20; i++){
            if (list.contains(i)){
                continue;
            }
            else{
                System.out.print(i+ " ");
            }
        }

    }



}
