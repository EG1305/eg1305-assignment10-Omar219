package Homework;

import java.util.Scanner;

public class Rectangle {
	private static Scanner input = new Scanner(System.in);

	public static double[][] getRectangle() {
		System.out.println("Enter the number of rectangles to be created");
		int user = input.nextInt();
		double[][] array = new double[user][2];
		return array;

	}
	public static double[][] getLengthAndWidth(double[][] array) {
		
		for(int i =0;i<array.length;i++) {
			System.out.println("Enter the rectangle " + (i+1) + " length ");
			array[i][0]=input.nextInt();
			System.out.println("Enter the rectangle " + (i+1) + " width ");
			array[i][1]=input.nextInt();
			
		}
		return array;
	}
	public static void getPerimeterandArea(double[][]  array) {
		double area = 0, perimeter=0;
		for(int i =0;i<array.length;i++) {
			area=array[i][0]*array[i][1];
			perimeter=2*(array[i][0])+2*(array[i][1]);
			System.out.println("Rectangle " + (i+1) + ": area" + area + ": perimeter " + perimeter);
		}
	}

}

