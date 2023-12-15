package j10_MethodCreation;

public class C03_MethodStore {

/*
her class main method tanımlama zorunluluğu yoktur.Belirli action özel Class'lar tanımlanabilir
 */

    public static void gecmeNotu(int not) {//p'li void method->komsu koy amelesi...
        if (not >= 85) {
            System.out.println("TAKDIR belgesi kazandınız :) ");
        } else if (not >= 70) {
            System.out.println("TESEKKUR belgesi kazandınız :) ");
        } else if (not >= 50) {
            System.out.println("gecmiş olsun belegesi kazandınız :) ");
        } else System.out.println("mortingen strasse  :-( ");
        C03_MethodCreation.selamVer();
    }


}
