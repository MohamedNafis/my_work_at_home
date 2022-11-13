package loops;

public class for_loop {
	public static void main(String[] args) {

		// Incremental block
		System.out.println("\n-------------------------for loop 01----------------------------\n");
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}

		System.out.println("\n--------------------------for loop 02----------------------------\n");
		for (int i = 1; i <= 10; i = i + 2) {
			System.out.println(i);
		}

		System.out.println("\n---------------------------for loop 03-----------------------------\n");

		for (int i = 1; i <= 10; i += 3) {
			System.out.println(i);
		}

		System.out.println("\n----------------------------for loop 04-----------------------------\n");

		for (double i = 2.5; i <= 12.5; i = i + 2.5) {
			System.out.println(i);
		}

		// Decrimental block

		System.out.println("\n----------------------------for loop 05--------------------------------\n");

		for (int i = 10; i >= 0; i--) {
			System.out.println(i);
		}

		System.out.println("\n-----------------------------for loop 06---------------------------------\n");

		for (int i = 10; i >= 1; i = i - 2) {
			System.out.println(i);
		}

		System.out.println("\n------------------------------for loop 07---------------------------------\n");

		for (int i = 10; i >= 1; i -= 3) {
			System.out.println(i);

		}

		System.out.println("\n------------------------------for loop 08----------------------------------\n");

		for (double i = 12.5; i >= 2.5; i = i - 2.5) {
			System.out.println(i);
		}
	}

}
