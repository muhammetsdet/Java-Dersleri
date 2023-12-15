package j05_ifStatementTernaryOperator.Tasks;
import  java.util.Scanner;
public class _07_ifElseStatement {
    /*  int number 8. satırda.
    Eğer, int number ikiye bölündüğünde geri kalanı 0'a eşit ise "number is a EVEN number" yazdırın.
    Eğer, int number ikiye bölündüğünde geri kalanı 0'a eşit değil ise "number is a ODD number" yazdırın.
*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Write a cincix number");
        int number = scan.nextInt();
        if ((number%2)==0) {
            System.out.println("number is a EVEN number");

        }else{
            System.out.println("number is a ODD number");
        }
    }

}
