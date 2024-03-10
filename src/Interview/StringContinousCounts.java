public class StringContinousCounts {

    public static void main(String[] args) {

        String s = "daaabbccaa";
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            int count = 1;
            for (int j = i; j < c.length - 1; j++) {
                if (c[j] == c[j + 1]) {
                    count = count + 1;
                    i = j + 1;
                }
                if (c[j] != c[j + 1]) {
                    break;
                }
            }
            System.out.println(c[i] + ":" + count);

        }
    }
}

