public class CopyArray {

    public static void main(String[] args) {
        int a [] = {2,3,4,5};
        int b [] = new int[4];

        for (int i =0 ; i<4; i++){
            b[i] = a[i];
        }
        for (int j : b){
            System.out.print(j);
        }
    }
}
