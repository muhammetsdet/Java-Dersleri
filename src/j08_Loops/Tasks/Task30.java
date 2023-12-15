package j08_Loops.Tasks;

import java.util.Scanner;

public class Task30 {
    // task-> girilen iki tamsayı arasındaki tamsayıların toplamını print eden code create ediniz
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        System.out.println("Write first number");
        int firstNum = scn.nextInt();
        System.out.println("Write second number");
        int secondNum = scn.nextInt();
        int sum = 0;
        for (int i = (firstNum<secondNum ? firstNum+1 : secondNum+1); i <(firstNum>secondNum ? firstNum : secondNum) ; i++) {
            sum +=i;
        }
        System.out.println(sum);
    }
}
