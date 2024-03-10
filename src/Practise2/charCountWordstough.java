public class charCountWordstough {

    public static void main(String[] args) {
        String s = "aabbcddaa";
        char[]  ch = s.toCharArray();

        int i = 0;
        while (i < ch.length)
        {
            int count = 1;
            while (i + 1 < s.length() && s.charAt(i) == s.charAt(i+1))
            {
                i++;
                count++;
            }
            System.out.print(s.charAt(i) + ":" + count + " ");
            i++;

    }
}}
