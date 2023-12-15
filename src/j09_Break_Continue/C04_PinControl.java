package j09_Break_Continue;

import java.util.Scanner;

public class C04_PinControl {
    public static void main(String[] args) {
        // Task -> Girilen String data type bir pin datasının 3 giriş hakkında kontrol eden code create ediniz.
        Scanner input = new Scanner(System.in);

        String pin = "javvaNUR";
        int grsHkk = 3;

        while (true) {

            System.out.println("agam pini giresen : ");
            String agaPin = input.next();

            if (agaPin.equals(pin)) {

                System.out.println("agam pin geçerli. dewamkee");
                break;

            } else {

                System.out.println("hatalı pin girdin tekrar dene");
                grsHkk--;
                System.out.println("agam pin için " + grsHkk + " kadar hakkın kaldı");
                if (grsHkk == 0) {

                    System.out.println("hakkınız kalmadı naşşş...");
                    break;
                }
            }
        }

    }
}
