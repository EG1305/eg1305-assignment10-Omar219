
package Homework;

import java.util.Scanner;

public class LotteryHomework {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] myArray = new int[5];
		int[] userArray = new int[5];
		for (int i = 0; i < myArray.length; i++) {
			int n = (int) (Math.random() * 10);
			myArray[i] = n;
		}
		System.out.println("Enter a series of 5 numbers.");
		for (int i = 0; i < userArray.length; i++) {
			System.out.print("Enter number " + (i + 1) + ":\n");
			userArray[i] = input.nextInt();
		}
		for (int i = 0; i < myArray.length; i++) {
			System.out.print(myArray[i] + " ");
		}
		int same = 0;
		for (int i = 0; i < myArray.length - 1; i++) {
			if (myArray[i] == userArray[i]) {
				same++;
			}

		}
		System.out.println("\nYou matched " + same + " numbers");

		if (same>0) {
			System.out.println("The matching numbers are: ");
			for(int i =0;i<myArray.length;i++) {
				if (myArray[i]==userArray[i]) {
					System.out.println(myArray[i+1] + " ");
				}
			}
		}
		input.close();
	}
}
