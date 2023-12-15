package j07_StringManipulation;

public class C01_Concetenation {
    /*
concat() -> methodu içinde parametre alığı String variable'yi çalşıtığı string sonuna ekler(birleştirir)
Java '+' işleminde en az bir string ifade vars artimetik toplama değil birleştirme yapılır
 */
    public static void main(String[] args) {
        /*
        concat() -> methodu içinde parametre aldığı String variable'ı çaloştığı string sonuna ekler(birleştirir)
        Java '+' işleminde en az bir string ifade varsa artimetik toplama değil birleştirme yapılır.
         */
        String qa = "Sebnem";

        String teamLead = "Feride";
        System.out.println("concat öncesi qa = " + qa);// Sebnem
        System.out.println("teamLead.concat(qa) = " + teamLead.concat(qa));// FerideSebnem
        System.out.println("qa.concat(teamLead) = " + qa.concat(teamLead));// SebnemFeride
        qa.toUpperCase();
        System.out.println("concat sonrası qa = " + qa);// Sebnem
        qa=teamLead.concat(qa);
        System.out.println("qa = " + qa);//FerideSebnem
 /*
 Ahan da TRICK-> String meth vcariable'da kalıcı değil geçici değişklik yapar.
 String variabvle kalıcı değişklik yapmak için atama(=) yapılmalı
  */

        /*
        Trick->concat meth. parametre olarak String harici tum dataları Stringe cevirip concat(birleştirir)
        String murekkep gibi sonrasındaki tum variable'rı String olarak concat(birleştirir)
         */
        System.out.println("teamLead.concat(23+\"$\") = " + teamLead.concat(23 + "$"));//Feride23$
        System.out.println("teamLead.concat(100+\"\") = " + teamLead.concat(100 + ""));//Feride100
        System.out.println("teamLead.concat(true+\"\") = " + teamLead.concat(true + ""));// Feridetrue

    }
}
