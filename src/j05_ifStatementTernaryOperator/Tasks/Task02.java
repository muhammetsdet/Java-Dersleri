package j05_ifStatementTernaryOperator.Tasks;
import java.util.Scanner;
public class Task02 {
    /*
Task->
Kullanıcıdan bir üçgenin  üç kenar uzunluğunu alın eğer üç kenar uzunluğu birbirine eşit ise ekrana
“Eşkenar üçgen" yazdırın. Sadece iki kenar uzunluğu birbirine eşit ise ekrana “Ikizkenar üçgen"
yazdırın. Tüm kenar uzunlukları birbirinden farklı ise “Çeşitkenar üçgen" print eden code create ediniz.

 */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Write side \"a\" of the triangle");
        int a = scn.nextInt();
        System.out.println("Write side \"b\" of the triangle");
        int b = scn.nextInt();
        System.out.println("Write side \"c\" of the triangle");
        int c = scn.nextInt();
        if(a ==b && b == c){
            System.out.println("This triangle is an equilateral");
        }else if ( a ==b || b==c || c ==a ){
            System.out.println("This is an isoscele triangle");
        }else {
            System.out.println("This is a scalene triangle");
        }
    }
}
