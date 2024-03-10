public class FreqOfStrings {
    public static void main(String[] args) {

        StringBuffer newS = new StringBuffer("my name is himanshu");
        System.out.println(newS.capacity());
        String s1 = "My name is Himanshu My name is Himanshu";
        String [] s2 = s1.split(" ");
        String s3 = "Himanshu";
        int count =0;
        for (int i=0; i<s2.length; i++ ){
            if (s3.equals(s2[i])){
                count = count+1;
            }
        }
        System.out.println(count);
    }
}
