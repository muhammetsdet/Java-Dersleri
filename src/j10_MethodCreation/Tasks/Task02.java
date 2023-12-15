package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task02 {
    //task-> girilen ad ve soyadın ilk harfleri buyuk diğer harflerini küçük print eden METHOD create ediniz
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Write your first name ");
        String name = scn.next();
        System.out.println("Write your last name ");
        String lastName = scn.next();
        nameLastNameLetterControler(name,lastName);
        String Footballer = nameLastNameLetterControler2("muhammet", "salah");
        System.out.println(Footballer);
        System.out.println(parametresizMethod());
    }

    private static String parametresizMethod() {
        String name = "muhammet" ;
        String lastName = "salah" ;
        return name+ lastName;
    }

    private static void nameLastNameLetterControler(String a, String b) {
        System.out.println(a.substring(0, 1).toUpperCase() + a.substring(1).toLowerCase() + " " + b.substring(0, 1).toUpperCase() + b.substring(1));
    }
    private static String nameLastNameLetterControler2(String a, String b) {
    return  a.substring(0, 1).toUpperCase() + a.substring(1).toLowerCase() + " " + b.substring(0, 1).toUpperCase() + b.substring(1);

    }


}
