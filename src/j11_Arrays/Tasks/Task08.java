package j11_Arrays.Tasks;

import java.util.Arrays;
import java.util.Scanner;

//Task-> girilen 7 elemanlı bir int  arrayın tek elemanlarını print eden code create ediniz.
public class Task08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numbers[]=new int[7];
        for (int i = 0; i < 7; i++) {
            System.out.print("Write " + (i + 1) + ".number -->");
            numbers[i]=input.nextInt();
        }
        System.out.println(Arrays.toString(numbers));
    }
}
