package j08_Loops.WhileLoops.WhileLoops_Tasks;
import java.util.Scanner;
public class Task01 {
    // task-> Girilen sayıların toplamı 333'ü geçtiğinde girilen sayı adetini ve toplamını print eden code create edinz
    public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);
        System.out.println("Write numbers");
        int sum=0;
     int numOFnumber = 0;
      while (sum<334){
          int num = scn.nextInt();
          numOFnumber++;
         sum+=num;
      }
        System.out.println("number of numbers you entered = "+ numOFnumber+ " count of number is   = " + sum);
    }
}
