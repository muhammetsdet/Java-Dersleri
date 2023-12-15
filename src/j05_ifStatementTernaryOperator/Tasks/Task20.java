package j05_ifStatementTernaryOperator.Tasks;
import  java.util.Scanner;
public class Task20 {
    /*
etkinlik öneren program
Koşullar :
Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
 */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("what is the temperature");
        int temp = scn.nextInt();
        if (temp > 0) {
            if (temp < 5) {
                System.out.println("You should ski");
            } else if (temp >= 5 && temp < 15) {
                System.out.println("You should go to cinema");
            } else if (temp >= 15 && temp < 25) {
                System.out.println("You should go to piknik");
            }else{
                System.out.println("You should go to swim");

        }

        }


    }
}