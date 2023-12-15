package j25_Exceptions;

import java.time.DateTimeException;
import java.time.LocalDate;

public class C08_DateTimeException {
    public static void main(String[] args) {
        //DateTimeException -> tarih zaman value'lerde oluşan RTE
        try {
            LocalDate ld = LocalDate.of(2023, 2, 29);
            System.out.println("Agam  TRY blok'dan selamkeee  bu cıktıyı okuduysan  try sorunsuz CATCH calısmaz");

        } catch (DateTimeException e) {
            System.out.println(e.getMessage() + " Agam  CATCH blok'dan selamkeee  try excp fırlattı...  ");

        }
        System.out.println("Agam bu çıktıyı okuduysan app. gayet başarılı dewamkeee :)");//bu kod çalışmıssa pr sorunsuz kırılmadan run olmuştur

    }
}
