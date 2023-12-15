package j11_Arrays.Tasks;
// Task-> verilen bir array'den istenmeyen elemanı silip  kalanlari
// yeni bir array'a atayıp print eden METHOD create ediniz

import java.util.Arrays;
import java.util.Scanner;

public class Task20 {
    static Scanner input = new Scanner(System.in);
    static int arr[]={3,4,2,3,5,7,3,8,5,2,4};
    public static void main(String[] args) {

        noWantNum();
    }
    private static void noWantNum() {
        System.out.println("Which number do you not want");
        int noNum=input.nextInt();
        int count =0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]!=noNum){
                count++;
            }
        }
        int newArr[]=new int [count];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != noNum) {
                newArr[index] = arr[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(newArr));
    }

}
