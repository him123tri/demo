
public class Multiply {


    public static void main(String[] args) {
        int [] a = {2,3,5,7};
        for (int i =0 ; i< a.length; i++){
            int mutiplication = 1;
            for (int j =0 ; j< a.length; j++){
                if (i!=j){
                    mutiplication = mutiplication *a[j];
                }
            }
            System.out.println(mutiplication);

        }
    }


}
