package j03_ScannerClass_TypeCastring.Tasks;
import java.util.Scanner;
public class _25_Scanner4 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        System.out.println("What is model of my car");
        String carModel =input.next();
        System.out.println("My car model is :" + carModel);
        System.out.println("How many doors does the your car have");
        int carDoors =input.nextInt();
        System.out.println("I have " + carDoors+ " doors");


    }
}
