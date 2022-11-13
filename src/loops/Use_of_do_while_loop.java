package loops;

public class Use_of_do_while_loop {
	public static void main(String[] args) {

		System.out.println("\n---------------------------------- do while loop 01---------------------------------\n");

		int i = 0;
		do {
			System.out.println(i);
			i++;
		} while (i <= 10);

		System.out.println("\n----------------------------------do while loop 02---------------------------------\n");

		int a = 10;
		do {
			System.out.println(a);
			a = a + 5;
		} while (a <= 100);

		System.out.println("\n----------------------------------do while loop 03---------------------------------\n");

		double b = 4.0;
		do {
			System.out.println(b);
			b += 2.0;
		} while (b <= 10.0);

		System.out.println("\n----------------------------------do while loop 04---------------------------------\n");

		int q = 10;
		do {
			System.out.println(q);
			q--;
		} while (q >= 0);

		System.out.println("\n----------------------------------do while loop 02---------------------------------\n");

		int w = 10;
		do {
			System.out.println(w);
			w = w - 2;
		} while (w >= 0);

		System.out.println("\n----------------------------------do while loop 02---------------------------------\n");

		int z = 10;
		do {
			System.out.println(z);
			z -= 4;
		} while (z >= 0);

		System.out.println(
				"\n----------------------------------do while loop condition is false---------------------------------\n");
		// as the condition is not true, loop stop after 1st iteration
		double x = 4.5;
		do {
			System.out.println(x);
			x -= 5;
		} while (x >= 5.5);
	}

}
