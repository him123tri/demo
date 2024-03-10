public class SumIntInString {

    public static void main(String[] args) {

        String s = "123mehul10jain3356";
        int sum = 0;
        String[] str1 = s.split("[A-Za-z]");
//        String[] str6 = s.split("\\d");
//        String newString = s.replaceAll("\\d","");
//
//        System.out.print(newString);
        for (String str2 : str1) {
            if(!str2.equals("")){
            sum = sum + Integer.parseInt(str2);
            }

        }System.out.print(sum);
}}
