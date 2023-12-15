package j10_MethodCreation;

public class C01_MethodCreation {
    public static void main(String[] args) {
        /*
       code okunabilirliği ve sadeliği için sürekli kullanılan aksiyonlar için method create edip
       main method'a call edip run etmek uygulamanın test edilmesi maintanance ve reusable açısından tercih edilir.
       1) Java method'larin sadece name  değil  name + parametre'lere göre run eder
       parametre sayisi, parametre'lerin data tiplerin ve parametrelerin sırası methodu belirler.

       str.endsWith("el");   Bu method'un gorevi gidip kelimenin son kismini kontrol etmek
                             bu method'u kullanmak icin bu method'un kontrol ettikten sonra
                             bana rapor olarak ne getirdigini bilmem lazim (true/false)

       2) Bir method create edildiğinde  method'un aksiyonuna ve aksiyon çıktısı da method içinde create edilir

       3) Bir method olusturulurken  " str.indexOf(String str, int fromIndex) "
          de oldugu gibi
          disaridan kabul edecegi parametreleri ve bu parametrelerin data tiplerini
          deklare edilmeli

          method call edildiğinde  Parametre olarak
          declare edilen data tiplerine uygun value'ler (ARGUMENT)  girilmeli.
   */

        //main level
        selam();// "agaya selamkeee :)"
        topla();//topla() meth call edildi-> toplam : 73
        //  selam();
        // Method'lar main blok'a yukarıdan aşağıya ve soldan sağa call sırasına göre run edilir.
        // topla(); selam();// methlar main'e birden çok ve yanyana call edilebilir
        System.out.println( topla1());// 60
        // return type olan meth. sout edilemzse concsole çıktı vermez ama meth run olur
        topla2(23,47,61);//43
        topla2(34,0,2);//12
        System.out.println("topla3(22,68,67) = " + topla3(22, 68, 67));//52.0

    }//main sonu
    private static double topla3(int a, int b, int c) {// 3 int p'li double return type meth
        // double ortalama=  (a+b+c)/3; return ortalama;
        return (a+b+c)/3;
    }

    public static void topla2(int ebik, int gabık, int falan) {// 3 p'li void meth
        System.out.println("ortalama : "+(ebik + gabık + falan) / 3);

    }

    private static void selam() {
        System.out.println("agaya selamkeee :)");
    }

// methodlar Class içi mani dısına tanımlanır.....

    public static void topla() {//p'siz return type olmatan:void-> bir cıktısı olamayan meth
        int a = 38;
        int b = 35;
        int toplam= a+b;
        System.out.println("toplam : " + (a + b));
    }

    public static String topla1() {//p'siz int return type meth
        int a = 45;
        int b = 15;
        System.out.println("return type meth selamlar");
        return "selam ben topla1 meth'dan javaCAN :) " + (a + b);
    }
}
