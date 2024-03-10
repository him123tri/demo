public class AddingOneNumberToArray {

    public static void main(String[] args) {

        int [] a = {10,3};
        int num = 0;
        int [] newArray = new int [3];
        for (int i = 0; i< a.length; i++){
            num = num * 10 + a[i];
        }
        int num2 = num+ 1;
        char[] digits = String.valueOf(num2).toCharArray();
        for (int j = 0; j< digits.length; j++){
            System.out.print(digits[j]);

        }
        System.out.print(num2);

    }
}
