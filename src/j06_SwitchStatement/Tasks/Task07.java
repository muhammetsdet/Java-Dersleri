package j06_SwitchStatement.Tasks;

import java.util.Scanner;

public class Task07 {
    // Task-> Girilen 3 basamaklı bir sayıyı hardf karakteri ile print eden code create ediniz.
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Write any 3 digits number");
        int num = scn.nextInt();
if (num>=100 && num<1000) {
    switch (num / 100) {
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
            System.out.println("Four");
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

    }
    switch ((num / 10) % 10) {
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
            System.out.println("Four");
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

    }
    switch (num % 10) {
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
            System.out.println("Four");
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

    }
}else{
    System.out.println("Write just 3 digits number");
}

    }
}
