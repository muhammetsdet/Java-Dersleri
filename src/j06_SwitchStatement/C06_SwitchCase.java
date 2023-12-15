package j06_SwitchStatement;

import java.util.Scanner;

public class C06_SwitchCase {
    public static void main(String[] args) {
        // TASK-> Girilen haftanın gününü hafta içi veya sonu oldugunu print eden code create ediniz..
        Scanner input = new Scanner(System.in);
        System.out.print("Girilen haftanın günü giriniz : ");
        String hafta =input.next();
        switch ( hafta ) {
            case  "Pazartesi","Sali","Carsamba","Persembe","Cuma":
                System.out.println("Hafta içindesiniz");
                break;
                case "Cumartesi","Pazar":
                    System.out.println("hafta sonu");
        }

    }
}
