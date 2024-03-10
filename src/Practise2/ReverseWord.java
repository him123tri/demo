public class ReverseWord {

    public static void main(String[] args) {

        String s = "My Name is Himanshu";
        String newString [] = s.split(" ");

       for (String s1:newString){
           char [] c = s1.toCharArray();
           String words = " ";
           for (int i =c.length-1; i >=0; i--){
               words = words + c[i];

           }
           System.out.print(words);
       }

    }
}
