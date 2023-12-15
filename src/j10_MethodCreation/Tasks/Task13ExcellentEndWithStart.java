package j10_MethodCreation.Tasks;


import java.util.Scanner;
/*
Task-> girilen iki String'den ikincisi, birincisinin son harflerine eşitse, true, diğer durumda false return eden METHOD create ediniz

Örnekler:
("abc", "bc") ➞ true
("abc", "d") ➞ false
("samurai", "zi") ➞ false
("feminine", "nine") ➞ true
("convention", "tio") ➞ false


String x = "feminine";
String y = "nine";
String z = "tio";
*/
public class Task13ExcellentEndWithStart {
    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        control();
    }
    private static void control() {
        System.out.println("You are first--> say anything..");
        String word1 = scn.nextLine();
        System.out.println("You are second--> say anything..");
        String word2 = scn.nextLine();
        System.out.println(word1.endsWith(word2) ? "True" : "False");
    }
}
