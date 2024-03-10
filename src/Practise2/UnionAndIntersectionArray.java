import java.util.ArrayList;
import java.util.HashSet;

public class UnionAndIntersectionArray {

    // Union and intersection of 2 sorted Array

    public static void main(String[] args) {
        int a1 [] = {1,2,3,4,3,4,5,6};
        int a2 [] = {1,2,2,4,5,6,7};
        ArrayList <Integer> list = new ArrayList<>();

        for (int i =0; i<a1.length; i++){
            for (int j =0; j<a2.length; j++ ){

                if (a1[i] == a2[j]){
                    list.add(a1[i]);
                    break;
                }

            }
        }
        System.out.print(list);

        HashSet<Integer> s1 = new HashSet();
        HashSet<Integer> s2 = new HashSet();

        for(int removeDuplicates1:a1){
            s1.add(removeDuplicates1);
        }


        for(int removeDuplicates2:a2){
            s2.add(removeDuplicates2);
        }

        for (int elements:s2){
            s1.add(elements);
        }
        System.out.print(s1);
    }
}
