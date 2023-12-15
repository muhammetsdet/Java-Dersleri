package j05_ifStatementTernaryOperator;

public class C01_ifStatement {
    public static void main(String[] args) {
       /*
       if statement blok herhangi bir actionun belirli bir şarta bağlı çalışmasını sağlamak için kullanılır.
        */
        int abdYas = 30;
        int canYas = 35;
        if (abdYas == canYas) {//abdYas ve canYas eşitlik kontrolu(sartı) tanımlandı
            System.out.println("yaşdaş arkıdeşlerrr..  :) ");
            System.out.println("yoksam siz gardeş misinizz :? ");
        }
        if (canYas >= 40) {//canYas 40'a eşit yada buyuk olma sartı(kontrolu) tanımlandı
            System.out.println("Can bey 40 yaş dırt yaş :( ");
        }
        if (canYas + abdYas >= 70) {
            System.out.println("teksatırlık actionlarda {} kullanılmayabilir");
            System.out.println("javaCAN'lara selamkeee :)");

            System.out.println("agam bu cıktıyı okuduysan code cincix dewamkeee ....");
        }
        // if blok'dan sonra {} kullanılmaz ise ilk satır veya komut if ile çalışır diğer komutlar if'den bağımsız olur-> bad practice

    }
}
