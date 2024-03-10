import java.util.ArrayList;

public class NAB {

    public static void main(String[] args) {
        String str = "AABBBBAABBA";
        System.out.println(minDeletions(str));
    }

    public static int minDeletions(String str) {
        int aCount = 0;
        int bCount = 0;
        int deletions = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'A') {
                aCount++;
                if (bCount > 0) {
                    deletions++;
                    bCount--;
                }
            } else if (str.charAt(i) == 'B') {
                bCount++;
            }
        }
        return deletions;
    }
}


