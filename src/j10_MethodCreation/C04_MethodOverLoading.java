package j10_MethodCreation;

public class C04_MethodOverLoading {
    /*

       Java'da  methodlarin farkli  olmaları  icin
            a)Method ismi  b)parametreler kontrol edilir..


       Java da ayni isimle birden çok method create edilmesine method overloading denir.
      method Overloading icin Method Signature'larinin farkli olmasi gerekir
       Method Signature = method name + parametre sayisi + parametre data type

      ahan da TRICK_01 : Access Modifier'lari degistirmek de method'lari Java  farkli methodlar olarak derlemez
       aynı method olarak derler   Cunku access modifier'lar method signature'a dahil degildir.
      ahan da TRICK_02 : Method'larin body'sini degistirmek de method'lari Java  farkli methodlar olarak derlemez
       aynı method olarak derler. Cunku body'ler method signature'a dahil degildir.
      ahan da TRICK_03 : Overloading "Compile Time Error" verir.

      Overloading :
      1)Parametrelerin sayisi degistirilerek method overloading tanımlanabilir.
      2)Parametre sayisi değiştirilmeden herhangi bir parametrenin data type'ini
        degistirerek method overloading tanımlanabilir.
      Note: topla(2,3); method call topla(double num1, int num2) var oldugu surece
            topla(int num1, int num2) yi kullanir, cunku argument data type ile parametre
            data type birebir eşleşiyor. Fakat argument data type ile parametre
            data type birebir eşleşmeyen data type yoksa auto widening'e
            gore Java kullanacagi method'u secilir. Auto widening'e gore kullanabilecegi bir method
            yoksa Java hata verir.
      3)FARKLI data type'indeki parametrelerin yerlerini degistirerek method overloading tanımlanabilir.
       birbirini kapsayan data turleri oldugunda Java en optimum cozumu tercih eder.
       (bire bir uyan varsa o methodu calistirir, bire bir uyan yoksa en fazla uyan
       methodu kullanir)
       Eger kapsayan bir method da bulamazsa Java CTE verir


    */
    public static void main(String[] args) {

        String str= "There is no success for those who have excuses";
    sum(2,3);
    sum(3.14,45);
    sum(66,3.65);
    sum(3.11,3.25);
    sum(2.1,4.5,87);
    }


    public static void sum(int num1, int num2){
        System.out.println("int-int type method  did run--> " + (num1+num2));
    }
    public static void sum(double num1, int num2){
        System.out.println("double-int type method  did run--> " + (num1+num2));
    }
    public static void sum(int num1, double num2){
        System.out.println("int-double type method  did run--> " + (num1+num2));
    }
    public static void sum(double num1, double num2){
        System.out.println("double-double type method  did run--> " + (num1+num2));
    }
    public static void sum(double num1, double num2,int num3){
        System.out.println("double-double-double type method  did run--> " + (num1+num2+num3));
    }

}
