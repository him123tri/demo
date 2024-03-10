public class AlternateIndexArrayAddition {

    public static void main(String[] args) {

        int a [] = {2,4,5,6,7,8,9};
        int sum = 0;
        for (int i = 0; i< a.length; i++){
            if (i%2 == 0){
                System.out.println(a[i]);
                sum = sum + a[i];
            }

        }
        System.out.println(sum);
    }
}
