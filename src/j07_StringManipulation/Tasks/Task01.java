package j07_StringManipulation.Tasks;
import java.util.Scanner;
public class Task01 {
    public static void main(String[] args) {
        // Task->  Girilen  bir stringde boşluk karakterinin olup olmadığını
        // kontrol eden code create ediniz
        Scanner scn = new Scanner(System.in);
        System.out.println("Say something...");
        String str = scn.nextLine();
        if(str.contains(" ")){
            System.out.println("Contains space");
        }else {
            System.out.println("Your letters are not contain space");
        }
    }
}
