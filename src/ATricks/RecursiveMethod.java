package ATricks;

import java.util.Scanner;

public class GoodPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Write any number of");
        int num=input.nextInt();
        int result=topla(num);
        System.out.println(result);

    }
    public static int topla(int input){
        if (input==1){
            return 1;
        }
        else {
            return input +topla(input-1);
        }
    }
}
