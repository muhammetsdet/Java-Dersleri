package j06_SwitchStatement.Tasks;

import java.util.Scanner;

public class Task06 {
    //Task-> Girilen  VIP (Very Important Person) kisaltmasindaki harflerin anlamini print eden code create ediniz
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Learn of Meaning any character of  VIP");
        char letter = scn.next().toUpperCase().charAt(0);
        switch (letter) {
            case 'V':
                System.out.println("Very");
                break;
            case 'I':
                System.out.println("Important");
                break;
                case 'P':
                    System.out.println("Person");
                    break;
            default:
                System.out.println("You must specify a VIP");


        }

    }
}
