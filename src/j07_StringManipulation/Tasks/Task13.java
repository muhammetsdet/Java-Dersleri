package j07_StringManipulation.Tasks;
import  java.util.Scanner;
public class Task13 {
    //Task->  Girilen  String'deki space haric kac tane character kullanildigini print eden code create ediniz.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Write your full name");
        String fullName = input.nextLine();
        String noSpace = fullName.replaceAll("\\W", "");
        System.out.println(noSpace.length());


    }
}
