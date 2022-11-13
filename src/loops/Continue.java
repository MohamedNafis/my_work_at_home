package loops;

public class Continue {
	public static void main(String[] args) {
		System.out.println("\n---------- for loop  ----------\n");
		for (int i = 1; i <= 5; i++) {
			System.out.println("The values is: " + i);
		}

		System.out.println("\n---------- for loop after continue 01  ----------\n");

		for (int x = 0; x <= 10; x++) {
			if (x == 4) {// if you use continue, this condition will skipped
				continue;
			}
			System.out.println("The Values Is " + x);
		}

		System.out.println("\n---------- for loop after continue 02  ----------\n");

		for (int y = 0; y <= 10; y++) {
			if (y % 2 == 0) {
				continue;
			}
			System.out.println("The Values Is " + y);
		}

		System.out.println("\n---------- for loop after continue 02  ----------\n");
		for (int i = 1; i <= 10; i++) { // Generally the outcome should be: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
			if (i % 2 == 1) { // condition for the odd numbers and
				continue; // continue will skip all the odd number
			}
			System.out.println("The value is: " + i); // 2, 4, 6, 8, 10
		}

		System.out.println("\n---------- while loop after continue ----------\n");

		int w = 0;
		while (w <= 10) {
			if (w == 3) {
				w++;// important info: this is an exception, because the outcome doesn't go to print
					// and increment in next line,
				// we use increment here 5 become 7
				// important: if you comment out line 41: the code don't proceed further and
				// stopped like infinite loop
				continue;
			}

			System.out.println("The Values Is " + w);
			w++;
		}

		System.out.println("\n---------- do while loop after continue ----------\n");

		int y = 1;
		do {
			if (y == 5) {
				y += 2;// important info: this is an exception, because the outcome doesn't go to print
						// and increment in next line,
				// we use increment here 5 become 7
				// important: if you comment out line 56: the code don't proceed further and
				// stopped like infinite loop
				continue;
			}
			System.out.println("The Valuse is " + y);
			y += 2;
		} while (y <= 10);
	}

}
