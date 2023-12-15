package j05_ifStatementTernaryOperator.Tasks;

import java.util.Scanner;

public class Task17 {
    /*
Task-> taş- kağıt -makas oyununu simüle eden code create ediniz
*/
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("First player chose your power");
        String gamer1 = scn.next();
        System.out.println("Second player chose your power");
        String gamer2 = scn.next();

        if (gamer1.equals("stone") && gamer2.equals("scissors")) {
            System.out.println("gamer1 is winner");
        } else if (gamer1.equals("stone") && gamer2.equals("paper")) {
            System.out.println("gamer2 is winner");
        } else if (gamer2.equals("stone") && gamer1.equals("scissors")) {
            System.out.println("gamer2 is winner");

        } else if (gamer2.equals("stone") && gamer1.equals("paper")) {
            System.out.println("gamer1 is winner");

        } else if (gamer1.equals("paper") && gamer2.equals("scissors")) {
            System.out.println("gamer2 is winner");

        } else if (gamer2.equals("paper") && gamer1.equals("scissors")) {
            System.out.println("gamer1 is winner");
        }else{
            System.out.println("draw");
        }


    }

    }

