public class ReverseArray {
    public static void main(String[] args) {
        // We can also do by interchanging the first and last element and so on
        //int tmp = arr[start];
        // arr[start] = arr[end];
        // arr[end] = tmp;

        int a[] = {2, 3, 4,5};
        int b [] = new int[a.length];
        int num = 0;
        for (int i = 0; i < a.length; i ++){
            num = num * 10 + a[i];

        }
        System.out.println(num);
        for (int j=0; j< a.length; j++){
            b[j] = num % 10;
            num = num / 10;
        }
        for (int k = 0; k< b.length; k++){
            System.out.print(b[k]);
        }

    }
}
