public class BinarySearch {

    int [] x = {1,2,3,4,5,6,7,8,9,10};

    public static void main(String[] args) {

        int [] x = {1,2,3,4,5,6,7,8,9,10};
        int low = x[0];
        int high = x[x.length-1];

        while (low <= high) {
            int mid = (low + high)/2;
            if (mid == 10) {
                System.out.println(mid);
                break;
            }
            else if (x[mid] < 10) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
}}
