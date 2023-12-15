package j20_StaticKeyword;

public class C03_StaticKeyWord {
int ogrId;
static int ogrenciSayisi;

    public C03_StaticKeyWord() {

        ogrenciSayisi++;
        ogrId=101;


    }

    public static void main(String[] args) {
        System.out.println("ogrenci sayısı  a objesi öncesi= " + ogrenciSayisi);
        C03_StaticKeyWord a=new C03_StaticKeyWord();
        System.out.println("a obj sontası ogrensi sayısı= " + ogrenciSayisi);
        C03_StaticKeyWord b=new C03_StaticKeyWord();

        C03_StaticKeyWord c=new C03_StaticKeyWord();

        C03_StaticKeyWord d=new C03_StaticKeyWord();

        System.out.println("a,b,c obj sonrası ogrenci sayısı= " + ogrenciSayisi);
        C03_StaticKeyWord e;//obj declaration ama assaigment yapılmamış--> const call yok
        System.out.println("e obj sontası ogrensi sayısı= " + ogrenciSayisi);
        System.out.println("a.ogrId = " + a.ogrId);
        System.out.println("b.ogrId = " + b.ogrId);
        System.out.println("c.ogrId = " + c.ogrId);
        System.out.println("d.ogrId = " + d.ogrId);
       // System.out.println("e.ogrId = " + e.ogrId); daha doğmamış.

        System.out.println("gunun sonunda ogrensi sayısı= " + ogrenciSayisi);


    }



}

