package j25_Exceptions;

public class C06_NumberFormatException {
    public static void main(String[] args) {
        // NumberFormatException -> numerik formetta olmayan bir value parseInt() meth call edilirse oluşan RTE
        String icardi = "1905";
        System.out.println("icardi = " + icardi);// 1905
        System.out.println("icardi+28 = " + icardi + 28);// 190528
        int wanda = Integer.parseInt(icardi);// 1905
        System.out.println("wanda = " + wanda);//1905
        System.out.println("wanda+28 = " + (wanda + 28));// 1933

        String id = "145357l622";
        // int invalidId=Integer.parseInt(id);//RTE->NumberFormatException
        // System.out.println("invalidId = " + invalidId);//1453571622
        int invalidId;
        try {
            invalidId = Integer.parseInt(id);//RTE->NumberFormatException:catch blok run
            System.out.println("Agam  TRY blok'dan selamkeee  bu cıktıyı okuduysan  try sorunsuz CATCH calısmaz");

        } catch (NumberFormatException e) {
            id = "1453571622";
            invalidId = Integer.parseInt(id);
            System.out.println("Agam ahan da gercek id : " + invalidId);
            System.out.println("Agam  CATCH blok'dan selamkeee  bu cıktıyı okuduysan  try excp fırlattı ama handle ettik :) ");

        }

        System.out.println("Agam bu çıktıyı okuduysan app. gayet başarılı dewamkeee :)");//bu kod çalışmıssa pr sorunsuz kırılmadan run olmuştur

    }
}
