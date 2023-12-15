package Challange01;

import java.util.Scanner;

public class Task01 {
    /* Task->
     * girilen String icinde "xyz" dizimi var ise true degilse false return eden metod create ediniz.
     *
     * input      output
     * axyzm  ==   true
     * xyz    ==   true
     * x.yz   ==   false
     * xyaz   ==   false
     */


    static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Bir cumle giriniz");
        String cumle= scan.nextLine();
        String soyisim=scan.next();
        boolean varMi=xyzVarMi(cumle);
        System.out.println(varMi);
        varMi1();

    }

    private static void varMi1() {
        System.out.println("Bir cumle giriniz");
        String cumle=scan.nextLine();
        System.out.println(cumle.contains("xyz"));
    }

    private static boolean xyzVarMi(String cumle) {

        return cumle.contains("xyz");

    }
}
