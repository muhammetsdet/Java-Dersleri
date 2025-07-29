package j23_Encapsulation.Task.Task07;

import java.util.Random;
import java.util.Scanner;

public class RandomException {
   /* randomSayi isminde static void bir method create ediniz.
    Bu method içerisinde iki int random sayı oluştursun. (0'dan 10 TcKontrol kadar)
    Bu iki random sayının toplamını yazdırın.
    Eğer bu iki random sayının toplamı 12 den küçükse "Exception" versin ve mesaj olarak
            ("Sayı 12'den küçük ise hata verir") print edin.

    */
   public static void main(String[] args) {
       randomSayi();
   }
    public static void randomSayi(){
        Random rnd=new Random();
        int num1=rnd.nextInt(11);
        int num2= rnd.nextInt(11);
        if (num1+num2>=12){
            System.out.println(num1 + num2);
        }else{
throw new ArithmeticException("Sayı 12'den küçük ise hata verir");
        }
    }
}
