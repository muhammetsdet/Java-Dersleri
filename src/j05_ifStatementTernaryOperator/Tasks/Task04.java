package j05_ifStatementTernaryOperator.Tasks;
import  java.util.Scanner;
public class Task04 {
    	/*Task->
		 Kullanicidan bir character alin.
		 Bu character buyuk harf ise "Buyuk Harf"
		 Bu character kucuk harf ise "Kucuk Harf"
		 Bu character harf degil ise "Harf Degil"  print eden code create ediniz.
		*/

    /*
     Logical Operator (Mantik Islemleri)
     1) And Islemi : Sembolu & veya && dir.&& sembolu daha hizli calisir.Bu yuzden genellikle && kullaniriz
                             true && true = true
                             true && false = false
                             false && true = false
                             false && false = false
     2)Or Islemi : Sembolu || dir
                             true || false = true
                             true || true = true
                             false || true = true
                             false || false = false
     3)Not Islemi : Sembolu !'dir
                             !true = false
                             !false = true


     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Write a character");
        Character chr = scn.next().charAt(0);
if(chr.isLetter(chr)){
if(chr.isUpperCase(chr)){
    System.out.println("This is uppercase letter");
} else {
    System.out.println("This is lowercase letter");
}
}else{
    System.out.println("This is not a letter");
}
    }
}
