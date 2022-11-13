package different_types_of_class;

import java.util.Scanner;

public class Scanner_class_02 {
	public static void main(String[] args) {
		System.out.println("Please put values below: ");
		Scanner scanner = new Scanner(System.in);
		int value1=scanner.nextInt();
		int value2=scanner.nextInt();
		int value3=scanner.nextInt();
		int total=value1+value2+value3;
		System.out.println("Total value is: " + total);
		scanner.close();
	}

}
