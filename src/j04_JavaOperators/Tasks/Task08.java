package j04_JavaOperators.Tasks;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Task08 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter seconds: ");
        int seconds = scn.nextInt();
        int hours = seconds/3600;
        int minutes = seconds%3600;
        int seconds1 = (minutes%60)/60;
        System.out.println("The time is: " + hours+":" + minutes+ ":" + seconds1);
    }
}