public class test {

    public static void main(String[] args) {

        String s = "a2b2c1a4";
        String[] c = s.split("[A-Za-z]");
        int sum = 0;
        for (int i = 0; i < c.length; i++) {

            if (!c[i].equals("")){
            sum = Integer.parseInt(sum + c[i]);}

        }
        System.out.println(sum);

    }
}
