package nested_if_condition;

import java.util.Random;

public class Test2 {
	public static void main(String[] args) {
		System.out.println("---: Please put number belows :---");
		Random random = new Random();
		int val1 = random.nextInt(100);
		int val2 = random.nextInt(100);

		if (val1 % 2 == 0) {
			if (val1 < val2) {
				System.out.println(val1 + " is an even number and " + val1 + " is less than " + val2);
			} else if (val1 > val2) {
				System.out.println(val1 + " is an even number and " + val1 + " is greater than " + val2);
			} else if (val1 == val2) {
				System.out.println(val1 + " in an even number" + val1 + " is equal to " + val2);
			} else if (val1 <= val2) {
				System.out.println(val1 + " is an even number" + val1 + " is less than or equal to " + val2);
			} else if (val1 >= val2) {
				System.out.println(val1 + " in an even number " + val1 + " is greater than or equal to" + val2);
			}
		}

		else if (val1 % 2 == 1) {
			if (val1 < val2) {
				System.out.println(val1 + " is a odd number " + val1 + " is less than " + val2);
			} else if (val1 > val2) {
				System.out.println(val1 + " is an odd number and " + val1 + " is greater than " + val2);
			} else if (val1 == val2) {
				System.out.println(val1 + " is an odd number and " + val1 + " is equal to " + val2);
			} else if (val1 <= val2) {
				System.out.println(val1 + " is an odd number and " + val1 + " is greater than or equal to " + val2);
			} else if (val1 >= val2) {
				System.out.println(val1 + " is an odd number and " + val1 + " is less than or equal to " + val2);
			}

		} else {
			System.out.println("The system failed to execute your order");
		}
	}

}
