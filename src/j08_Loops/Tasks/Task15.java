package j08_Loops.Tasks;

import java.util.Scanner;

public class Task15 {
	/*
Task-> girilen bir String'deki rakam sayısını print eden code create ediniz
 */
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Say something...");
		String str = scn.nextLine();
		int sumOfNumbers = 0;
		for (int i = 0; i <str.length(); i++) {
if (Character.isDigit(str.charAt(i))) {

	sumOfNumbers++;
}

		}
		System.out.println(sumOfNumbers);
	}
}
