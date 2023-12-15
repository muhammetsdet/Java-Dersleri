package j05_ifStatementTernaryOperator.Tasks;
     /* double1 ve double2 isimli iki tane double oluşturulmuştur.
        Eğer double1, double2'dan büyük ise "double 1 is greater than double 2" yazdırınız.
        Eğer double1, double2'dan küçük ise "double 1 is smaller than double 2" yazdırınız. */

import java.util.Scanner;
public class _04_if_elseStatement {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Write any double number");
        double number = scan.nextDouble();
        System.out.println("Write second double number");
        double number2 = scan.nextDouble();
        if(number>number2){
            System.out.println("double 1 is greater than double 2");
        }else if(number<number2){
            System.out.println("double 1 is smaller than double 2");
        }
    }
}
