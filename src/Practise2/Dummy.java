package Practise2;

import java.util.HashSet;

import java.util.*;

 public class Dummy {
    public static void main(String[] args) {

        String s = "Gauravvvv";
        char[] c = s.toCharArray();
        HashSet<Character> set = new HashSet<>();
        int max =0;
        ArrayList <Character> list = new ArrayList<>();
        for (char cha : c) {
            set.add(cha);
        }
        for (Character x : set) {
            int count = 0;
            for (int j = 1; j < c.length; j++) {
                if (x == c[j]) {
                    count = count + 1;
                }
            }

            if (count > max) {
                list.clear();
                max = count;
                list.add(x);
            }

        }
        System.out.println(list);


//
//
////        String firstString = "ABC";
////        String secondString = "XYZ";
////        String thirdString = "";
////
////        char c [] = firstString.toCharArray();
////        char c1 [] = secondString.toCharArray();
////
////        for (int i = 0; i <3; i++){
////            thirdString = thirdString+String.valueOf(c[i]) + String.valueOf(c1[i]);
////        }
////
////        System.out.print(thirdString);
//        }


    }
}