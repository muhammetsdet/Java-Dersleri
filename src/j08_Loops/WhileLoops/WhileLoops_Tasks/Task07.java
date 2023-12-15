package j08_Loops.WhileLoops.WhileLoops_Tasks;
import java.util.Scanner;
public class Task07 {
    // Task-> girilen 5 sayının en buyugunu print eden code create ediniz
    public static void main(String[] args) {
Scanner scn = new Scanner(System.in);
int num = 1;
int largestNum = 0;
        while (num<=5){
            System.out.println("Write " + num + ".number");
            int number= scn.nextInt();
            num++;
            if (largestNum>number){
                System.out.println("a");
            }else{
                largestNum=number;
            }

            }
        System.out.println("Largest number is =" +largestNum);
        }

    }


