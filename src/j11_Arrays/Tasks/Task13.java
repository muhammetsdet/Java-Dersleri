package j11_Arrays.Tasks;

import java.util.Scanner;

/* TASK :
Girilen 8 elemanli arrayin icinde
3 e bolunebilen sayi adedini print eden  code create ediniz (negatif sayilar dahil )

 */
public class Task13 {
    public static void main(String[] args) {
        int[] arr = new int[8];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i <8 ; i++) {
            System.out.print("Write "+(i+1)+ ".number -->");
            arr[i] = scan.nextInt();
        }
        int count=0;
        for (int i = 0; i <8; i++) {
            if (arr[i]%3==0){
                count++;
            }
        }
        System.out.println(count +" numbers are divisible by 3");
    }
}
