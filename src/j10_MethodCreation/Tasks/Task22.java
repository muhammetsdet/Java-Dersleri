package j10_MethodCreation.Tasks;

import java.util.Scanner;
/* task->
katsayıları a,b,c  verilen 1 bilinmeyenli ax^2 + bx + c denklemin köklerini print eden METHOD create ediniz.

trick-> kokler : (-b +/- karekök(delta)) / (2*a)
 delta = b*b - 4*a*c
 delta > 0 => 2 tane kök vardır x1=(-b + kök(d)) / (2a)  , x2= (-b - kök(d)) / (2*a)
 delta = 0 => 1 tane kök vardır x = -b/2a
 delta < 0 ise kök yoktur.
*/
public class Task22 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        rootCalculation();
    }
    private static void rootCalculation() {
        System.out.print("Denklemin a, b ve c sayilarini giriniz\na: ");
        double a = input.nextInt();
        System.out.print("b: ");
        double b = input.nextInt();
        System.out.print("c: ");
        double c = input.nextInt();
        double delta =   ((b * b) - (4 * a * c));
        if (delta > 0) {
            System.out.println("There are 2 roots");
            System.out.println("The first root is " + (-b + Math.sqrt(delta) / (2 * a))+
                    " \nThe second root is " + ((-b) - Math.sqrt(delta) / (2 * a)));
        } else if (delta == 0) {
            System.out.println("There are 1 roots");
            System.out.println("The root is--> " + -b / (2 * a));
        } else {
            System.out.println("There are no roots");
        }
    }
}
