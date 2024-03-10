// Subtract the product and sum of digits of an integer

public class ProductSubtractionOfArrayElements {
    public static void main(String[] args) {

    int a = 2345;
    int x = 1;
    int y = 0;
    int r = 0;
    int [] num = new int [4];

    /*We have converted the number into an array of digits
    * and then we have done the manipulation on Array elements
    * */
    for (int i = 0; a !=0; i++){
        r = a%10;
        num [i] = r;
        a = a/10;
    }
        for (int j = 0; j<4; j++){
            x = x * num[j];
            y = y + num[j];
        }
    System.out.print(x-y);

    }
}
