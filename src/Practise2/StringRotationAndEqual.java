public class StringRotationAndEqual {

    public static void main(String[] args) {

            /*String s1 = "abc";
            String s2 = "acb";
            String s3 = s1 + s1;
            if (s3.contains(s2)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }*/

        String s1 = "abcdef";
        String s2 = "defabc";
        int j = 0;
        char[] c = s1.toCharArray();
        while (j < 6) {

            char temp = c[c.length - 1];
            for (int i = c.length - 1; i > 0; i--) {
                c[i] = c[i - 1];
            }
            c[0] = temp;
            String s3 = new String(c);

            System.out.println(s3);

            if (s2.equals(s3)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
            j++;
        }
    }
}
