package j05_ifStatementTernaryOperator.Tasks;
import java.util.Scanner;
public class Task12 {
    /*
TASK -> girilen bir karakterin harf  olup olmadığını  kontrol eden code create ediniz..
*/
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        System.out.println("Please enter any letter");
        char letter = scn.next().charAt(0);
        if(Character.isLetter(letter)){
            System.out.println("This  is a letter");
        }else{
            System.out.println("This  is not a letter");
        }

    }
}
