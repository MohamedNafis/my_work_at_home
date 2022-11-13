package different_types_of_class;

import java.util.Scanner;

public class Scanner_class_01 {
	public static void main(String[] args) {
		System.out.println("Please Enter Your Age: ");
		Scanner scanner = new Scanner(System.in);
		int age =scanner.nextInt();
		System.out.println("\nMy Age is: " + age);
		
	}

}
