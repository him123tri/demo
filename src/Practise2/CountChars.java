import com.sun.xml.internal.org.jvnet.fastinfoset.EncodingAlgorithmIndexes;

import java.util.HashSet;

public class CountChars {

    public static void main(String[] args) {
        String s = "aabbccde";

        char [] c  = s.toCharArray();
        //Covert char array to Hashset
        //Iterate over hashset and count the occurance of each char in the string
        HashSet <Character> hashSet = new HashSet <Character>();
        for (int i = 0; i < c.length; i++) {
            hashSet.add(c[i]);
        }
        // Unique characters are stored in HashSet
        System.out.println(hashSet);
        for (Character o : hashSet) {
            int count = 0;
            for (int i = 0; i < c.length; i++) {
                if (o.equals(c[i])){
                    count++;
                }
            }
            System.out.println(o + " " + count);
        }

//        char[] strArray = inputString.toCharArray();
//        // checking each char of strArray
//        for (char c : strArray) {
//            if (charCountMap.containsKey(c))
//                charCountMap.put(c, charCountMap.get(c) + 1);
//            }
//            else {
//
//                charCountMap.put(c, 1);
//            }
//        }
//
//        for (Map.Entry entry : charCountMap.entrySet()) {
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }
    }
}
