package j05_ifStatementTernaryOperator.Tasks;
import java.util.Objects;
import java.util.Scanner;
public class Task22 {
    /*
        Sifreyi kontrol etmek için ternary yaziniz.
        8'den fazla karakter iceriyorsa, baş harfi 'i' olmalidir.
        8 karakterden fazla icermiyorsa, baş harfi 'K' olmalidir.
 */
    /*public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Write your password");
        String passWord =scn.next();
        Character firstLetter = passWord.charAt(0);
        String pass = passWord.length() > 8 ? firstLetter == 'i' : firstLetter == 'K';
    }
}*/


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Write your password");
        String passWord = scn.next();
        char firstLetter = passWord.charAt(0);
        String pass = (passWord.length() > 8 ? (firstLetter == 'i' ? "Valid Password" : "The first letter should be 'i'.") : (firstLetter == 'K' ? "Valid Password" : "The first letter should be 'K'."));

        System.out.println(pass);
    }
}
