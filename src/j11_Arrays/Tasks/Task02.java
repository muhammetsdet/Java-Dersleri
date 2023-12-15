package j11_Arrays.Tasks;

import java.util.Arrays;
import java.util.Scanner;

//task-> girilen int array elemanları toplamını print eden code create ediniz.
public class Task02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many elements?");
        int numbers =input.nextInt();
        int num[] = new int[numbers];
        int sum =0;
        for (int i =0  ; i < numbers; i++) {
            System.out.print("Write "+(i+1)+ ".number -->");
            num[i]=input.nextInt();
            sum+=num[i];
        }
        System.out.println("The sum of digits of the given number is: " + sum);
    }

}
//Terminalde  fazladan yazma ?