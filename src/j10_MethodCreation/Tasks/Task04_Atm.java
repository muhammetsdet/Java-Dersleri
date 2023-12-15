package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task04_Atm { /*
        Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma ve cekme, çıkış işlemlerinin yapıldıgı bir
         ATM app. code create ediniz
         */
         static Scanner scn = new Scanner(System.in);
    static int balance = 1000;
        public static void main(String[] args) {
           account();

        }

        private static void  account() {
            String   transactions = "Balanace --> 1" + "\n Deporsit --> 2"+  "\n Withdraw --> 3" + "\n Exit --> 4";
            System.out.println("Welcome to Ziraat Bank");
            System.out.println("Enter your password");
            int password = scn.nextInt();
            System.out.println("Welcome to your account");
            System.out.println("Please choose a transaction");
            String choice = scn.next();

            switch (choice){
                case "1":
                    balance();
                    break;
                case "2":
                    deposit();
                    break;
                case "3":
                    withdraw();
                    break;
                case "4":
                    System.out.println("Bye Bye have a nice day");
                default:
                    System.out.println("You have to choose a option between 1 to 4!!!");


            }


        }

    private static void withdraw() {
        System.out.print("Enter the amount you want to withdraw: ");
        int amount = scn.nextInt();
        if (balance>=amount){
            balance -= amount;
            System.out.println(amount + "$ withdraw your account and available balance: " + balance);
        }else if (balance<amount){
            System.out.println("You haven't enough balance in your account ");
        }
    }

    private static void deposit() {
        System.out.println("How much do you want to deposit");
        int deposit = scn.nextInt();
        balance+=deposit;
        System.out.println("Your new balance is "+balance);
    }

    private static void balance() {

            System.out.println("Your account limit is: " + balance);
    }


}
