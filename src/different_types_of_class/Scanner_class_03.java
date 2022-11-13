package different_types_of_class;

import java.util.Scanner;

public class Scanner_class_03 {
	public static void main(String[] args) {
		System.out.println("Please Type Your Full Name: ");
		Scanner scanner = new Scanner(System.in);
		String fullname=scanner.nextLine();
		System.out.println("\nHi" + " "+ fullname + " " + "Now you now how scanner works !" );
		scanner.close();
	}

}
