import java.util.ArrayList;

public class MoveAllZeroToEnd {

    // We need to move all the zeros to the end of the array

    //1st Approach is Optimal Solution , while approach 2 is brute force solution

    public static void main(String[] args) {
        int a[] = {1, 2, 0, 3, 0, 4, 5, 6, 0, 9};
        int n = a.length;
        ArrayList<Integer> list = new ArrayList<>();
        int j = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                j = i;
                break;
            }
        }
        for (int i = j + 1; i < a.length; i++) {
            if (a[i] != 0) {
                int tmp;
                tmp = a[i]; //3
                a[i] = a[j];
                a[j] = tmp;
                j++;
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }

//        for (int i =0; i <n; i++){
//            if (a[i] != 0){
//                list.add(a[i]);
//            }
//        }
//
//        for (int j=0; j<list.size(); j++){
//            a[j] = list.get(j);
//        }
//
//        for(int j = list.size(); j <n;j++){
//            a[j] =0;
//        }
//
//        for (int i =0; i<a.length; i++){
//            System.out.print(a[i]);
//        }


    }
}
