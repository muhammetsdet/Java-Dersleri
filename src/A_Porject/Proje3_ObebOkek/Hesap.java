package A_Porject.Proje3_ObebOkek;

public class Hesap {
public void obeb(PojoObebOkek obje){
 int kucukSayi=Math.min(obje.getS1(),obje.getS2());
 int enBuyukBolen=1;
    for (int i = 1; i <kucukSayi ; i++) {
        if (obje.getS1()%i==0 && obje.getS2()%i==0) {
    enBuyukBolen=i;
        }    }
    System.out.println("En büyük ortak bölen " + enBuyukBolen);
}
    public void okek(PojoObebOkek obje){
        int buyukSayi=Math.max(obje.getS1(),obje.getS2());
        int enkucukOrtakKat;
        for (int i = 1; i <buyukSayi ; i++) {
            enkucukOrtakKat=buyukSayi*i;
            if (enkucukOrtakKat%obje.getS1()==0 && enkucukOrtakKat%obje.getS2()==0) {
                System.out.println("En küçük ortak bölen " + enkucukOrtakKat);
                break;
            }    }

    }

}
