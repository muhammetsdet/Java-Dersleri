package j05_ifStatementTernaryOperator.Tasks;
import java.util.Scanner;
public class Task13 {
    /*
      TASK -> girilen iki sayiyi seçilen dört işlemden birine uygulayıp sonucu print eden code crate ediniz

     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter first number");
        int num1 = scn.nextInt();
        System.out.println("Please enter second number");
        int num2 = scn.nextInt();
        System.out.println("Chose a mathematical operation");
        Character a = scn.next().charAt(0);
if(a=='+'){
    System.out.println(num1 + num2);
} else if (a=='-') {
    System.out.println(num1 - num2);

}else if (a=='*'){
    System.out.println(num1 * num2);
} else if (a=='/') {
    System.out.println(num1 / num2);

}

    }
}
