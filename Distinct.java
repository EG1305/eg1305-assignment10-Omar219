import java.util.Scanner;

public class Distinct {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] array = new int[10];
		array = input(array);
		System.out.println("The distinct values are: ");
		distinctNumbers(array);

	}

	private static int[] input(int[] array) {
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			System.out.print("Enter integer " + (i + 1) + ":");
			array[i] = input.nextInt();
		}
		input.close();
		return array;
	}

	private static void distinctNumbers(int[] array) {
		for (int i = 0; i < array.length; i++) {
			boolean disc = false;
			for (int t = 0; t < i; t++) {
				if (array[i] == array[t]) {
					disc = true;
				}

			}
			if (!disc) {
				System.out.print(array[i] + " ");
			}
		}

	}
}
