package j11_Arrays.Tasks;

import java.util.Scanner;

// Task -> Girilen 5 sayıyı , giriş sırasına göre tersten print eden code create ediniz
public class Task09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numbers[]=new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Write " + (i + 1) + ".number -->");
            numbers[i]=input.nextInt();
        }
        for (int i = 4; i >=0 ; i--) {
            System.out.print(numbers[i]+ " ");
        }
    }
}
