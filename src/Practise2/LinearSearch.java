public class LinearSearch {
    public static void main(String[] args) {

        int [] a = {16, 17, 4, 3, 5, 2};
        int count = 0;
        for (int i =0; i <a.length-1; i ++) {

            if (a[i] == 90) {
                System.out.println(i);
                count = count+1;
                break;
            }
        }
        if (count == 0) {
            System.out.println(-1);
        }

    }
}
