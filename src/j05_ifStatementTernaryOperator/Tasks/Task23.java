package j05_ifStatementTernaryOperator.Tasks;
import java.util.Scanner;
public class Task23 {
    public static void main(String[] args) {
                /*
            Bir sayinin mutlak degerini hesaplamak icin ternary operatoru kullanarak kod yaziniz.
         */
        Scanner scn = new Scanner(System.in);
        System.out.println("Write any number");
        int num = scn.nextInt();
        System.out.println(num>0 ? "Pozitive" : " Abosuate Value is : " +Math.abs(num));
    }
}
