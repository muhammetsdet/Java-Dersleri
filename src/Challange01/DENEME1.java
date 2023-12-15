package Challange01;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DENEME1 {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("How many elements?");
        int numbers = input.nextInt();
        int num[] = new int[numbers];
        for (int i =0  ; i < numbers; i++) {
            System.out.print("Write "+i+ ".number -->");
            num[i] = input.nextInt();
        }
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));
List<String> lines = new ArrayList<>(Arrays.asList("a","b","c"));
        System.out.println(lines);
    }
    }
//Neden out bound hatası veriyor? i=0 i<numbers olunca hata vermiyor ama?