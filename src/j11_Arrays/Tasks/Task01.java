package j11_Arrays.Tasks;

import java.util.Arrays;
import java.util.Scanner;

//Task-> girilen bir int array elemanlarını buyukten kucuge   print eden code create ediniz.
public class Task01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many elements?");
        int numbers = input.nextInt();
        int num[] = new int[numbers];
        for (int i =0  ; i < numbers; i++) {
            System.out.print("Write "+(i+1)+ ".number -->");
            num[i] = input.nextInt();
        }
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));

    }
}


//Neden out bound hatası veriyor? i=0 i<numbers olunca hata vermiyor ama?

