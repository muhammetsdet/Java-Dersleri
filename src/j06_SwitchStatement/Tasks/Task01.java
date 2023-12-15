package j06_SwitchStatement.Tasks;

import java.util.Scanner;

public class Task01 {
    /*Task->  Girilen bir tamsayının onlar basamağının harf karakteri
    ile  print eden code create ediniz.
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Write at least 2 digits number");
        int num = scn.nextInt();
        num = (num / 10) % 10;
        switch (num) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
            default:
            System.out.println("The number you wrote is at least 2 digits long");
        }
    }
}
