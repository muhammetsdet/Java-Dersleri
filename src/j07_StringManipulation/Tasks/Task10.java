package j07_StringManipulation.Tasks;
import java.util.Scanner;

public class Task10 {        /* TASK :
 * Girilen  isim sadece 3 harfli olmalidir ternary
 * kullanarak harflerin unique(farkli) olmasını control eden code create ediniz
 */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter name with 3 characters");
        String input = scn.nextLine();
        System.out.println(input.charAt(0) != input.charAt(1) && input.charAt(1) != input.charAt(2) && input.charAt(2) != input.charAt(0) && input.length() == 3? "Unique" : "Control charakters");
    }
}
