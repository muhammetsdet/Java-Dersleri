package j20_StaticKeyword.Task01.Task02;

public class RunnerElectricity {
    public static void main(String[] args) {
        Customer müsteri= new Customer();

        müsteri.name = "Necdet";

        ElectricityCalculator hesap=new ElectricityCalculator();

        müsteri.elektrikHesabi=hesap;

        müsteri.elektrikHesabi.tuketimEkle(100);
        müsteri.elektrikHesabi.tuketimEkle(150);

        System.out.println("toplam tüketim = " + müsteri.elektrikHesabi.toplamTuketim);

        System.out.println("ödenecek tutar = " + müsteri.elektrikHesabi.odenecekTutar());//2.Yöntem
        System.out.println("ödenecek tutar (2) = " + müsteri.elektrikHesabi.fatura);//1.Yöntem

    }



}