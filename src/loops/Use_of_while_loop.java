package loops;

public class Use_of_while_loop {
	public static void main(String[] args) {

		System.out.println("\n----------------------------------while loop 01---------------------------------\n");

		int i = 0;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}

		System.out.println("\n----------------------------------while loop 02---------------------------------\n");

		int j = 1;
		while (j <= 10) {
			System.out.println(j);
			j = j + 2;
		}

		System.out.println("\n----------------------------------while loop 03---------------------------------\n");
		int x = 5;
		int k = 2;
		while (k <= 20) {
			System.out.println(k - x);
			k += 3;
		}

		System.out.println("\n----------------------------------while loop 04---------------------------------\n");

		int y = 10;
		while (y >= 0) {
			System.out.println(y);
			y--;
		}

		System.out.println("\n----------------------------------while loop 05---------------------------------\n");

		int c = 20;
		while (c >= 10) {
			System.out.println(c);
			c = c - 2;
		}

		System.out.println("\n----------------------------------while loop 06---------------------------------\n");
		int b = 5;
		double a = 5.0;
		while (a >= 2.5) {
			System.out.println(a + b);
			a -= 2.5;
		}

		System.out.println(
				"\n----------------------------------while loop condition is false---------------------------------\n");
		int e = 50;
		while (e >= 100) {
			System.out.println(e);
			e = e + 10;

		}
	}

}
