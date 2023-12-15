package j11_Arrays.Tasks;

import java.util.Arrays;

//task-> aşağıdaki  arr  tum elemalarının çarpımını print eden code create edinz
public class Task15 {
    public static void main(String[] args) {
        int arr[][] = {
                {3, 5},//0. kat
                {2, 4, 1},//1. kat
                {6, 1, 2, 2},//2. kat
        };
        int multiplication =1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                multiplication*=arr[i][j];
            }
        }
        System.out.println(multiplication);
    }
}
