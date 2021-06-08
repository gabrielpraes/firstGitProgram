package util;

public class CalcRetangle {
	
	public static double area(double width, double height) {
		return width * height;
	}
	
	public static double diagonal(double width, double height) {
		return Math.sqrt(width*width + height*height);
	}
	
}
