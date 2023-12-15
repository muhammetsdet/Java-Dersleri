package j10_MethodCreation.Tasks;
/*
    Task-> vucüt kitleendexini print eden METHOD create ediniz
    vki->kg(mt*mt)
 18,5 kg/m2 ve daha düşük değerler = Zayıf.
 18,5 ve 24,9 kg/m2 arasındaki değerler = Normal ağırlıkta.
 25,0 ve 29,9 kg/m2 arasındaki değerler = Kilolu.
 30,0 ve üstü =  obezite.

     */

import java.util.Scanner;

public class Task23 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        bodyMass();
    }
    private static void bodyMass() {
        System.out.print("Write your weight (kilograms)--> ");
        double weight = input.nextDouble();
        System.out.print("Write your height (centimeters)--> ");
        double height = input.nextDouble();
        double BMI = weight / (height * height);
        System.out.println(BMI);
        if (BMI <= 18.5 && BMI > 0) {
            System.out.println("You ara a weak person");
        } else if (BMI > 18.5 && BMI < 24.9) {
            System.out.println("You ara a complete athlete person");
        } else if (BMI > 25 && BMI < 29.9) {
            System.out.println("You ara a curvy person:)");
        } else if (BMI >= 30) {
            System.out.println("You ara a obesity");
        } else {
            System.out.println("Write real values");

        }

    }
}
