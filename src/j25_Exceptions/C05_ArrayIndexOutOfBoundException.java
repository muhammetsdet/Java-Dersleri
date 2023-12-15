package j25_Exceptions;

public class C05_ArrayIndexOutOfBoundException {
    public static void main(String[] args) {
        // ArrayIndexOutOfBoundException-> array'lerde olmayan index elemanı ile işlem yapıldıgında oluşan  RTE
        int sayi[] = {38, 33, 61, 52, 10, 59, 16, 15};
        System.out.println("sayi[5] = " + sayi[5]);//sayi[5] = 59
        // System.out.println("sayi[21] = " + sayi[21]);//RET->ArrayIndexOutOfBoundsException
        try {
            System.out.println("sayi[21] = " + sayi[21]);//RTE excp fırlatır alt satıra inmeden catch blok calısır
            System.out.println("Agam  TRY blok'dan selamkeee  bu cıktıyı okuduysan  try sorunsuz CATCH calısmaz");

            // } catch (Exception e) {//Exception->hz.Adem excp tum excp yakalar:bad practice
        } catch (
                ArrayIndexOutOfBoundsException e) {//ArrayIndexOutOfBoundsException->child excp app hızı icin best practice
            System.out.println("Agam try blok exception fırlattı habarıng olsun :( ");
            System.out.println("Agam  CATCH blok'dan selamkeee  olmayan eleman istirsen  teee Ellamm yaa  ");

        }
        System.out.println("Agam bu çıktıyı okuduysan app. gayet başarılı dewamkeee :)");//bu kod çalışmıssa pr sorunsuz kırılmadan run olmuştur

    }
}
