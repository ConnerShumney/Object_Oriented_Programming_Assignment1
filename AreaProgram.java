import java.util.Scanner;

public class AreaProgram {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int option;

		do {
			System.out
					.print("=== AREA CALCULATOR ===\n1. Square\n2. Circle\n3. Triangle\n4. Exit\n");
			System.out.println("Enter the desired option[1-4]: ");
			option = keyboard.nextInt();

					switch (option) {

			case 1:
				System.out.println();
				System.out.println("Enter the length of the square: ");
				double squareLength;
				squareLength = keyboard.nextDouble();
				System.out.println();
				double squareArea = squareLength * squareLength;
				System.out.print("The area of the square is: ");
				System.out.println(squareArea);
				System.out.println();
				break;

			case 2:
				System.out.println();
				System.out.println("Enter the radius of a circle: ");
				double circleRadius;
				circleRadius = keyboard.nextDouble();
				double circleArea = 3.14 * circleRadius * circleRadius;
				System.out.println();
				System.out.print("The area of your circle is: ");
				System.out.println(circleArea);
				System.out.println();
				break;

			case 3:
				System.out.println();
				System.out.println("Enter the base length of your triangle: ");
				double triangleBase;
				triangleBase = keyboard.nextDouble();
				System.out.println();
				System.out.println("Enter the height of your triangle: ");
				double triangleHeight;
				triangleHeight = keyboard.nextDouble();
				double triangleArea = (triangleBase * triangleHeight) / 2;
				System.out.println();
				System.out.print("The area of your triangle is: ");
				System.out.println(triangleArea);
				System.out.println();
				break;

			case 4:
				System.out.println("Goodbye! Exiting...");
				break;

		}
		} while (option != 4);

		keyboard.close();
	}
}