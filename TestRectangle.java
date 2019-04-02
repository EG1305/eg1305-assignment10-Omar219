package Homework;


public class TestRectangle {
	public static void main(String[] args) {
		Rectangle rec = new Rectangle();
		double[][] array = rec.getLengthAndWidth(rec.getRectangle());
		System.out.println("Here are the rectangles you created: ");
		rec.getPerimeterandArea(array);
}
}