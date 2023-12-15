package j06_SwitchStatement.Tasks;

import java.util.Scanner;

public class Task05 {
    /*
TASK :
Girilen note değerinin  aşağıdaki kurallara göre karşılığını print eden code create ediniz.
1. 0(dahil) ile 50 arasi - D
2. 50(dahil) ile 60 arası - C
3. 60(dahil) ile 80 arası - B
4. 80(dahil) ustu- A
Yanlis not girilirse ekrana "Lütfen gecerli not giriniz" print ediniz

AHAN DA  TRICK :) switch() de long kullanilmaz, float kullanilmaz, double kullanilmaz, boolean kullanilmaz.
switch() de int, byte, short, char, String kullanilir.

 */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Write your grade");
        int grade = scn.nextInt();
        int letter =grade/10;
        switch(letter){
            case 0,1,2,3,4:
                System.out.println("Your grade is D");
                break;
            case 5,6:
                System.out.println("Your grade is C");
                break;
            case 7,8:
                System.out.println("Your grade is B");
                break;
            case 9:
                System.out.println("Your grade is A");
                break;
            default:
                System.out.println("You need to enter a number between 1 and 100");

        }
    }
}
