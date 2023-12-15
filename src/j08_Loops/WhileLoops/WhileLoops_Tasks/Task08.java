package j08_Loops.WhileLoops.WhileLoops_Tasks;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Task08 {
    // task-> girilen şifrenin asagidaki sartlari kontrol edin
    // ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
    // eger tum sartlari saglarsa, "sifre basariyla kaydedildi" print edin
    // - ilk harf kucuk harf olmali
    // - son karakter rakam olmali
    // - sifre bosluk icermemeli
    // - uzunlugu en az 10 karakter olmali
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Write your password");
        String password = scn.next();

        boolean isValid = false;

        
        Pattern pattern = Pattern.compile("^(?=.*[A-Z])(?=.*\\d)[A-Za-z\\d\\W]{10,}$");

        while (!isValid) {
            if (pattern.matcher(password).matches()) {
                isValid = true;
            } else {
                System.out.println("Password must have at least one uppercase letter, one digit, no spaces, and be at least 10 characters long");
                System.out.println("Please try again");
                password = scn.next();
            }
        }

        System.out.println("Your password is successful");


    }
}
