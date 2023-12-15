package j05_ifStatementTernaryOperator.Tasks;
import java.util.Scanner;
public class _20_ticketPrice {
    /* Task->
        Trafik cezasının değerini hesaplayın code create ediniz
45 hız sınırıdır.
Eğer hızınız 55-74 arasında ise:
Ceza 100 $'dır.
Eğer hızınız 75 - 84 arasında ise:
Ceza 150 $'dır.
Eğer hızınız 85 -94 arasında ise:
Ceza 320 $'dır.
Eğer hızınız 94'den daha fazla ise:
Ceza 500 $'dır.
ve ayrıca,
Eğer sürücünün ehliyeti yoksa cezaya 200 $ eklenir.
Örn: Hızınız 77 iken cezanız 150$'dır ama ehliyetiniz yoksa ceza 350 $ olur.
-----------------------------------------
Örn;
currentSpeed(Hızınız) 87
ve isDriverLicenceAvailable(Ehliyeti var mı?) = true;
sonuç 320 olmalıdır.
currentSpeed(Hızınız) 65
ve isDriverLicenceAvailable(Ehliyeti var mı?) = false;
sonuç 300 olmalıdır.  */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("driver's speed");
        int currentSpeed = scan.nextInt();
        System.out.println("Do you have driver licence");
        boolean isDriverLicenceAvailable = scan.nextBoolean();
        if (currentSpeed >= 55 && currentSpeed <= 74) {
            if (!isDriverLicenceAvailable) {
                System.out.println("You have to pay 300$");
            } else {
                System.out.println("You have to pay 100$");
            }
              }else if (currentSpeed >= 75 && currentSpeed <= 84) {
            if (!isDriverLicenceAvailable) {
                System.out.println("You have to pay 350$");
            } else {
                System.out.println("You have to pay 150$");
            }
             }else if (currentSpeed >= 85 && currentSpeed <= 94) {
            if (!isDriverLicenceAvailable) {
                System.out.println("You have to pay 520$");
            } else {
                System.out.println("You have to pay 320$");
            }
               }else if (currentSpeed > 94) {
                        if (!isDriverLicenceAvailable) {
                            System.out.println("You have to pay 700$");
                        } else {
                            System.out.println("You have to pay 500$");
                        }
                    }

                }
            }




