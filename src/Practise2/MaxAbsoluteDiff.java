import static java.lang.Math.abs;

public class MaxAbsoluteDiff {

    public static void main(String[] args) {

        int [] a = {2,3,67,8,1};
        int [] b = {65,78,4,7,9,0};
        int amax = a[1];
        int amin = a[1];
        int bmax = 0;
        int bmin = 0;

        for (int i =0; i < a.length; i++){
            if (a[i]> amax){
                amax = a[i];
            }
            if (a[i] < amin){
                amin = a[i];
            }
        }

        for (int j =0; j < b.length; j++){
            if (b[j]> bmax){
                bmax = b[j];
            }
            if (b[j] < bmin){
                bmin = b[j];
            }

        }

        System.out.println(abs(amax - bmin));
        System.out.println(abs(amin - bmax));
    }


}
