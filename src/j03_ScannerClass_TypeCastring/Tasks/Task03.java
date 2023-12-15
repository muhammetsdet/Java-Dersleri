package j03_ScannerClass_TypeCastring.Tasks;
import java.util.Scanner;
public class Task03 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("How many hours do you sleep a day?");
        int hours =scn.nextInt();
        int days = 30;
        int monthtesOfHours = hours*days;
        int totalHoursInYear =hours*365;
        int totalHoursIn40Years =totalHoursInYear*40;
        System.out.println("I sleep in a month :" + monthtesOfHours/24);
        System.out.println("I sleep in a year:"+totalHoursInYear/24);
        System.out.println("I sleep in 40 years:"+ totalHoursIn40Years/24);
    }
}
