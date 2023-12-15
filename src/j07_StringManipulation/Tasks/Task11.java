package j07_StringManipulation.Tasks;

import java.util.Scanner;

public class Task11 {      /* TASK :
       Kullanıcıdan tek seferde alınan ad soyadı ifadeyi
      ad ve soyadı ayrı ayrı print eden code create ediniz
       */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Write your full name");
        String fullName = input.nextLine();
        String firstName = fullName.substring(0, fullName.indexOf(" "));
        String lastName = fullName.substring(fullName.indexOf(" ") + 1);
        System.out.println(firstName);
        System.out.println(lastName);
    }

}

