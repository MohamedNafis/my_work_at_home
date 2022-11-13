package loops;

public class Use_of_for_loop {
	public static void main(String[] args) {
		// Incremental block
		System.out.println("\n-------------------------for loop 01----------------------------\n");
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}

		System.out.println("\n--------------------------for loop 02----------------------------\n");
		int j = 4;
		for (int i = 1; i <= 10; i = i + 2) {
			System.out.println(i * j);
		}

		System.out.println("\n---------------------------for loop 03-----------------------------\n");

		for (int i = 1; i <= 10; i += 3) {
			System.out.println("The values is: " + i);
		}

		System.out.println("\n----------------------------for loop 04-----------------------------\n");
		double h = 2.5;
		for (double i = 2.5; i <= 12.5; i = i + 2.5) {
			System.out.println(i + h);
		}

		// Decrimental block

		System.out.println("\n----------------------------for loop 05--------------------------------\n");

		for (int i = 10; i >= 0; i--) {
			System.out.println(i);
		}

		System.out.println("\n-----------------------------for loop 06---------------------------------\n");
		int n = 2;
		for (int i = 10; i >= 1; i = i - 2) {
			System.out.println(i + n);
		}

		System.out.println("\n------------------------------for loop 07---------------------------------\n");

		for (int i = 10; i >= 1; i -= 3) {
			System.out.println(i);

		}

		System.out.println("\n------------------------------for loop 08----------------------------------\n");
		double x = 2.5;
		for (double i = 12.5; i >= 2.5; i = i - 2.5) {
			System.out.println(i + x);
		}

		System.out.println("\n------------------------------for loop condition is false---------------------\n");
		int y = 20;
		for (int i = 40; i <= 10; i -= 2) {
			System.out.println(i - y);

		}

		System.out.println("\n--------------------------------for loop infinite loop-------------------------\n");
		/*
		 * for(int i =2; i>1; i += 3 ) { System.out.println(i);
		 * 
		 * }
		 */
	}

}
