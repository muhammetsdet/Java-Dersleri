package j13_ForEachLoop;

public class C03_ForEachLoop {
    public static void main(String[] args) {
        int arr[][] = {
                {2, 3},
                {4},
                {5, 6, 7}
        };
        int multiplication = 1;
        for (int[] avuc1 : arr) {
            for (int avuc2 : avuc1) {
                multiplication *= avuc2;

                {

                }
            }

            System.out.println(multiplication);
        }

    }
}
/*
int multiplication =1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                multiplication*=arr[i][j];
            }
 */