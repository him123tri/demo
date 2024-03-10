public class StringOperations {

    public static void main(String[] args) {
        String s = "himanshu kumar tripathi";
        String s1 [] = s.split(" ");
        String word = "";

        for(int i=0; i<s1.length; i++){

            String upperCase = s1[i].substring(0, 1).toUpperCase();
            word = word+upperCase + s1[i].substring(1) + " ";

        }
        System.out.println(word);

//        String s = "himanshu kumar tripathi";
//        // String s1 = s.substring(0, 1) + s.substring(10, 11);  Read this ?
//        String [] s1 = s.split(" ");
//        String word = "";
//         for (int i =0; i< s1.length-1; i++){
//            char [] ch = s1[i].toCharArray();
//            word = word + ch[0] + ".";
//        }
//        System.out.println(word + s1[2].toUpperCase());
    }
}
