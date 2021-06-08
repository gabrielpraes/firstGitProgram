package application;

import java.util.Locale;
import java.util.Scanner;

import util.CalcRetangle;

public class Program {

	public static void main(String[] args) {
			
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the retangle width: ");
		double width = sc.nextDouble();
		System.out.print("Enter the retangle height: ");
		double height = sc.nextDouble();
		
		CalcRetangle calc = new CalcRetangle(width, height);
		
		System.out.println("Area: " + calc.area());
		System.out.println("Diagonal: " + calc.diagonal());
		
		sc.close();

	}

}
