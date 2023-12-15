package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task03 {
    //task-> girilen Saati saniyeye mil'i km'ye kg'yi gr'a çeviren METHOD create ediniz.
    static Scanner input = new Scanner(System.in);//herkeşler erişsin(Güneş gibin) diye method üstü class level'a tanımlandı

    public static void main(String[] args) {
        //task-> girilen Saati saniyeye mil'i km'ye kg'yi gr'a çeviren METHOD create ediniz.
        // Scanner input = new Scanner(System.in);
        // System.out.println("Agam cevirilecek birim giriniz : ");
        // String birim = input.next().toLowerCase();
        // System.out.println("Agam cevirilecek birimin miktarını giriniz : ");
        // double miktar = input.nextDouble();

        donustur(birimVer(), miktarVer());

    }//main sonu

    private static void donustur(String birim, double miktar) {//ahcı
        switch (birim) {
            case "saat":
                saatSaniye(miktar);   // System.out.println("agam girdiğin "+ miktar+" saatin saniye değeri : "+(miktar*3600));
                break;
            case "mil":
                milKm(miktar);  //  System.out.println("agam girdiğin "+ miktar+" milin km değeri : "+(miktar*1.6));

                break;
            case "kg":
                kgGram(miktar);// System.out.println("agam girdiğin "+ miktar+" kg'nin gram değeri : "+(miktar*1000));

                break;
            default:
                System.out.println("Agam hatalı girisen gelmimmm oraya :(");
        }


    }

    private static void kgGram(double miktar) {
        System.out.println("agam girdiğin " + miktar + " kg'nin gram değeri : " + (miktar * 1000));
    }

    private static void milKm(double miktar) {
        System.out.println("agam girdiğin " + miktar + " milin km değeri : " + (miktar * 1.6));
    }

    private static void saatSaniye(double miktar) {//ahcı yamah
        System.out.println("agam girdiğin " + miktar + " saatin saniye değeri : " + (miktar * 3600));
    }

    public static String birimVer() {
        System.out.println("Agam cevirilecek birim giriniz : ");
        String birim = input.next().toLowerCase();
        return birim;
    }

    public static double miktarVer() {

        System.out.println("Agam cevirilecek birimin miktarını giriniz : ");
        double miktar = input.nextDouble();
        return miktar;
    }
}
