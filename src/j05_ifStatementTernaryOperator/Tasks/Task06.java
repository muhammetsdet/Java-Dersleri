package j05_ifStatementTernaryOperator.Tasks;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
		/* Task->
		 Kullanıcıdan cinsiyetini girmesini isteyin.
		Erkek ise yaşını kontrol edin. Yaşı 18 den küçük ise ekrana “Erkek çocuk” yazdırın.
		Yaşı 18 den büyük eşit ise ekrana “Adam” yazdırın.
		Kadin ise yasini kontrol edin. Yaşı 18 den küçük ise ekrana “Kız çocuk” yazdırın.
		Yaşı 18 den büyük eşit ise ekrana “Kadın” yazdırın.
		 */Scanner input = new Scanner(System.in);
        System.out.print("agam cinsiyetini giresen : ");
        String cnsyt = input.next();

        System.out.print("agam yasını giresen : ");
        int agaYası = input.nextInt();
        if (cnsyt.equalsIgnoreCase("erkek")) {//cinsiyet erkek olma sartı

            if (agaYası < 18) {// erkek olan cinsiyetin 18 den kucuk yas sartı
                System.out.println("Erkek çocuk");
            } else {
                System.out.println("Adam");
            }

        } else {//cinsiyet erkek olamama sartı

            if (agaYası < 18) {// erkek olmayan cinsiyetin 18 den kucuk yas sartı
                System.out.println("Kız çocuk");
            } else {
                System.out.println("Kadın");
            }
        }


    }
}
