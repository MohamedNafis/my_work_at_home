package nested_if_condition;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("Please Enter your age here: ");
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();

		if (age >= 18) {
			System.out.println("Please Enter your weight here: ");
			int weight = scanner.nextInt();
			if (weight > 50) {
				System.out.println(
						"You are eligible to donate blood as your weight is " + weight + " kg and age is " + age);
			} else {
				System.out.println(
						"You are not eligible to donate blood as your weight is " + weight + " kg and age is " + age);
			}

		} else {
			System.out.println("First, Your age should be more than or equal to 18 to donate blood");
		}
		scanner.close();
	}

}
