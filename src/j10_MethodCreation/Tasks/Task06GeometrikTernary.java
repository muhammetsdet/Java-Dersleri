package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task06GeometrikTernary {
    //Task-> Girilen iki boyuta göre seçilen geometrik şeklin(kare,  dikdörtgen , üçgen)
    // alan ve çevre değerlerini print eden METHOD  create ediniz
    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {

        calculation();
    }

    private static void calculation() {
        System.out.println("How many right angles does gommetric shape have");
        int angle = scn.nextInt();
        System.out.println("Write first side: ");
        int side1 = scn.nextInt();
        System.out.println("Write second side: ");
        int side2 = scn.nextInt();
        if (side1 == side2 && angle == 4) {
            String geo = "Square";
            System.out.println("The area of the Square is: " + (side1 * side2) + " The perimeter of the Square is: " + (side1 + side2) * 2);
        } else if (angle == 1) {
            System.out.println("Write third side");
            String geo = "Triangle";
            int side3 = scn.nextInt();
            double result = Math.max(side1, side2) < side3 ? side1 * side2 : Math.min(side1, side2) * side3;
            System.out.println("The area of the Triangle is: " + result / 2 + " The perimeter of the Triangle is: " + (side1 + side2 + side3));
        } else if (side1 != side2 && angle == 4) {
            String geo = "Rectangle";
            System.out.println("The area of the rectangle is: " + (side1 * side2) + " The perimeter of the triangle is: " + (side1 + side2) * 2);
        }
    }
}
/*


public class Task06 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        //Task-> Girilen iki boyuta göre seçilen geometrik şeklin(kare dikdörtgen , üçgen) alan ve çevre değerlerini print eden METHOD  create ediniz
        int boyut1= 0;
        int boyut2= 0;
        System.out.println("Hangi sekil");
        String geoSekil= input.next().toLowerCase();

        switch (geoSekil){
            case "kare":
                System.out.println("1.boyutu giriniz");
                boyut1= input.nextInt();
                kareAlani(boyut1);
                kareCevresi(boyut1);
                break;
            case "dikdortgen":
                System.out.println("1.boyutu giriniz");
                boyut1= input.nextInt();
                System.out.println("2.boyutu giriniz");
                boyut2= input.nextInt();
                dikdortgenAlani(boyut1,boyut2);
                dikdortgenCevresi(boyut1,boyut2);
                break;
            case "ucgen":
                System.out.println("1.boyutu giriniz");
                boyut1= input.nextInt();
                System.out.println("2.boyutu giriniz");
                boyut2= input.nextInt();
                ucgenAlani(boyut1);
                ucgenCevresi(boyut1,boyut2);
                break;
            default:
                System.out.println("Hatali sekil girdiniz");
        }
    }//main sonu

    private static void ucgenAlani(int boyut1) {
        System.out.println("Yuksekligi giriniz");
        int yukseklik=input.nextInt();
        System.out.println("ucgenin alani= "+((boyut1*yukseklik)/2));
    }

    private static void ucgenCevresi(int boyut1, int boyut2) {
        System.out.println("3.boyutu giriniz");
        int boyut3=input.nextInt();
        System.out.println("ucgenin cevresi= "+(boyut1+boyut2+boyut3));
    }

    private static void dikdortgenCevresi(int boyut1, int boyut2) {
        System.out.println("dikdortgenin cevresi= "+(boyut1+boyut2)*2);
    }

    private static void dikdortgenAlani(int boyut1, int boyut2) {
        System.out.println("dikdortgenin cevresi= "+(boyut1*boyut2));
    }

    private static void kareCevresi(int boyut1) {
        System.out.println("karenin cevresi= "+boyut1*4);
    }

    private static void kareAlani(int boyut1) {
        System.out.println("karenin alani= "+boyut1*boyut1);
    }
 */

