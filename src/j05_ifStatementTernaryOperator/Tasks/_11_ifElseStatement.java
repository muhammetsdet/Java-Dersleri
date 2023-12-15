package j05_ifStatementTernaryOperator.Tasks;
import  java.util.Scanner;
public class _11_ifElseStatement {
    /*  Eğer String null (0) değilse ve String uzunluğu 14 ise ve String "i love java" yı kapsıyorsa
"String is i love java and 14 character." yazdırınız.

Eğer String null(0) değilse ve karakter biçimini (büyük, kücük harf) görmezden gelirse,
"String is I love java" yazdırın. */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Say something");
        String str = scan.nextLine();
        if (str != null && str.length() == 14 && str.contains("i love java")) {
            System.out.println("String is i love java and 14 character.");
        }  else  if (str != null && str.equalsIgnoreCase("i love java")) {
            System.out.println("String is I love java");

        }
    }
}
