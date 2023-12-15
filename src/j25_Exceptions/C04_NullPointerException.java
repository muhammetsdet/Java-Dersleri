package j25_Exceptions;

public class C04_NullPointerException {
    public static void main(String[] args) {
        // NullPointerException -> null ataması yapılan bir String variable length() meth call edildiğinde oluşan RTE
        String str1 = "";
        System.out.println("str1.length() = " + str1.length());//0
        String str2 = null;

        //  System.out.println("str2.length() = " + str2.length());//RTE-> NullPointerException
        try {
            System.out.println("str2.length() = " + str2.length());//RTE excp fırlatır alt satıra inmeden catch blok calısır
            System.out.println("Agam  TRY blok'dan selamkeee  bu cıktıyı okuduysan  try sorunsuz CATCH calısmaz");

        } catch (NullPointerException e) {
            System.out.println("Agam try blok exception fırlattı habarıng olsun :( ");
            System.out.println("Agam  CATCH blok'dan selamkeee  nerde görülmüş dutluk boyutu teee Ellamm yaa  ");

        }
        System.out.println("   ***   ");
        try {
            System.out.println("str1.length() = " + str1.length());//0 RTE excp fırlatmaz catch blok calışmaz
            System.out.println("Agam  TRY blok'dan selamkeee  bu cıktıyı okuduysan  try sorunsuz CATCH calısmaz");

        } catch (NullPointerException e) {
            System.out.println("Agam try blok exception fırlattı habarıng olsun :( ");
            System.out.println("Agam  CATCH blok'dan selamkeee  nerde görülmüş dutluk boyutu teee Ellamm yaa  ");

        }

        System.out.println("Agam bu çıktıyı okuduysan app. gayet başarılı dewamkeee :)");//bu kod çalışmıssa pr sorunsuz kırılmadan run olmuştur

    }
}
