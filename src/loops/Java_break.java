package loops;

public class Java_break {
	public static void main(String[] args) {
		System.out.println("\n-----------------for loop-------------------\n");

		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}

		System.out.println("\n-----------------for loop after break-------------------\n");

		for (int i = 0; i <= 10; i++) {
			if (i == 5) {
				break;
			}
			System.out.println("The Values is " + i);

		}

		System.out.println("\n-----------------for loop after break condition not meet--------------------\n");

		for (int x = 20; x <= 30; x = x + 2) {
			if (x == 5) { // if the condition doesn't meet, no break
				break;
			}
			System.out.println("The Values Is" + x);
		}

		System.out.println("\n-----------------for loop after break ------------------\n");

		for (int x = 20; x <= 30; x = x + 2) {
			if (x == 26) { // if the condition meet, break
				break;
			}
			System.out.println("The Values Is" + x);
		}

		System.out.println("\n-----------------while loop-------------------\n");

		int y = 0;
		while (y <= 10) {
			System.out.println(y);
			y++;
		}

		System.out.println("\n---------- while loop after break 01 ----------\n");

		int x = 0;
		while (x <= 10) {
			if (x == 6) {
				break;
			}
			System.out.println(x);
			x += 2;
		}

		System.out.println("\n---------- do while loop ----------\n");

		int w = 0;
		do {
			System.out.println(w);
			w++;
		} while (w <= 10);
		System.out.println("\n----------DO while loop after break 01 ----------\n");

		int a = 0;
		do {
			System.out.println("The Values is " + a);// remember, in do while loop, sysout is present before break

			if (a == 2) {
				break;
			}
			a += 2;
		} while (a <= 10);

	}

}
