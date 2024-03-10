public class ArrangeArrayElements {

    public static void main(String[] args) {

        int [] a = {-2,3,5,0,0,-1,-5,2,6,-5};

        for (int i =0; i<a.length; i++){

            if (a[i] <0){
                int tmp = a[0];
                a[0] = a[i];
                a[i+1] = tmp;
            }

        }
        for (int j =0; j<a.length; j++)
        System.out.print(a[j]);
    }
}
