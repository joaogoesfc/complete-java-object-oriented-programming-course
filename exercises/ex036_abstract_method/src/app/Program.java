package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Shape> shapes = new ArrayList<>();
		
		System.out.print("Enter the number of shapes: ");
		int n = sc.nextInt();
		for(int i=1; i <=n; i++) {
			System.out.printf("Shape#%d data:\n", i);
			System.out.print("RectangleorCircle(r/c)? ");
			char shape = sc.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED): ");
			String color = sc.next();
			if(shape == 'r') {
				System.out.print("Width: ");
				double width = sc.nextDouble();
				System.out.print("Height: ");
				double height = sc.nextDouble();
				shapes.add(new Rectangle(Color.valueOf(color), width, height));
			} else if (shape == 'c'){
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				shapes.add(new Circle(Color.valueOf(color), radius));
			} else System.out.println("Invalid value! (without loop) reboot the program.");
		}

		System.out.println();
		System.out.println("SHAPE AREAS:");
		for(Shape sh : shapes) {
			System.out.printf("%.2f\n", sh.area());
		}
		sc.close();
	}

}
