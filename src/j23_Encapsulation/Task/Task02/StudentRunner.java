package j23_Encapsulation.Task.Task02;

import java.util.Scanner;

public class StudentRunner {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Write your name");
        String name=input.nextLine();

        System.out.println("Write your age");
        int age=input.nextInt();

        Student st = new Student(name,age);
        System.out.println(st);
    }
}
