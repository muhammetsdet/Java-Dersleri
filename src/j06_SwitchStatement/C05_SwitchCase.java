package j06_SwitchStatement;

import java.util.Scanner;

public class C05_SwitchCase {
    public static void main(String[] args) {
        /*
TaskATM-> Bakıye 1000$ olan bir banka hesabı için bakıye öğrenme-para çekme-para yatırma
 ve çıkış işlemlerinin yapıldığı bir ATM app. create ediniz
 */
        Scanner scn = new Scanner(System.in);
        System.out.println("Write your want to : \nbalance ->  1 \n deporsit -> 2 \n withdraw -> 3 \n exit -> 4 ");
        int yourChose = scn.nextInt();
        switch (yourChose) {
            case 1:
                System.out.println("Balance");
                break;
            case 2:
                System.out.println("Deposit");
                break;
            case 3:
                System.out.println("Withdraw");
                break;
            case 4:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Try again");
        }

    }
}
