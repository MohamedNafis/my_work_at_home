package different_types_of_class;

import java.util.Scanner;

public class Scanner_class_04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please put your grade below: ");
		Float gradeInHw=scanner.nextFloat();
		Float gradeInQuiz=scanner.nextFloat();
		Float gradeInAvarage=(gradeInHw+gradeInQuiz)/2;
		System.out.println("\nThe Final grade of mine: " + gradeInAvarage);
		scanner.close();
		
	}

}
