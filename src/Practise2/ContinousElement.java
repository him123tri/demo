package Practise2;

import java.util.ArrayList;
import java.util.List;

public class ContinousElement {

    public static void main(String[] args) {

        int a[] = {1, 2, 3, 4, 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3};

        List<Integer> list = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        int count = 1;
        int max = 1;

        for (int i = 0; i < a.length - 1; i++) {

            if (a[i]+1 == a[i+1]) {
                count = count + 1;
                temp.add(a[i]);
            } else {
                count = 1;
                temp.add(a[i]);
                if (temp.size() > list.size()) {
                    list.clear();
                    list.addAll(temp);
                }
                temp.clear();
            }
        }
        System.out.print(list);
    }
}
