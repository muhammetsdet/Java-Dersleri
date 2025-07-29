package ATricks;

import java.util.Scanner;

public class RecursiveMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Write any number of");
        int num = input.nextInt();
        System.out.println(topla(num));
        input.nextLine();
        System.out.println("Say something...");
        String words = input.nextLine();
        System.out.println(palindromeKontrolEt(words));


    }

    private static boolean palindromeKontrolEt(String words) {
        if (words.isEmpty() || words.length() == 1) {
            return true;
        } else {
            if (words.substring(0, 1).equalsIgnoreCase(words.substring(words.length() - 1))) {
                return palindromeKontrolEt(words.substring(1, (words.length() - 1)));
            } else {
                return false;
            }
        }

    }


    public static int topla(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num + topla(num - 1);
        }
    }
}
