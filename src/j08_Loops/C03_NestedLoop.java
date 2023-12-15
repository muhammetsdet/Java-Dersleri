package j08_Loops;

public class C03_NestedLoop {
    /*
    Bir loop body'de {loop}  farklı bir loop tanımlanmasıyla oluşan code blok'a nestedd loop denir.-> apt. daire döngüsü
    iç loop dış  loop'un her step'inde tekrar çalışır.en içteki lopp bitmeden dış lopp bitmez. ilk önce en içdeki lopp run olur
 */
    public static void main(String[] args) {

        for (int kat = 1; kat <=9 ; kat++) {
            for (int daire=1;  daire<=5 ; daire++) {
                for (int odalar = 1; odalar <=3 ; odalar++) {
                    System.out.println("daireler :" + daire+ "kat :" + kat + "için daire no :" + daire);
                }


            }
            
        }
    }
}
