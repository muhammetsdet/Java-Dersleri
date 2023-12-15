package j11_Arrays.Tasks;

import java.util.Scanner;

// Task-> girilen int değeri tersten print eden code create ediniz.
public class Task05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Say something...");
        Integer numbers = scan.nextInt();
        String newNum1 = String.valueOf(numbers);
        String newNum2[]= newNum1.split("");
        for (int i = newNum2.length-1; i>=0; i--) {
            System.out.print(newNum2[i]);
        }
    }
}
