package loops;

public class Nested_loop {
	public static void main(String[] args) {
		for (int i = 0; i <= 2; i++) { // 0,1,2 outer loop
			System.out.println("\n-------------------01------------------------\n");
			for (int j = 0; j <= 3; j++) {// 0,1,2,3 inner loop
				System.out.println(i + j);

				// 0+0,0+1,0+2,0+3
				// 1+0,1+1,1+2,1+3
				// 2+0,2+1,2+2,2+3
			}
		}

		for (int x = 1; x <= 10; x = x + 2) {// 1,3,5,7,9
			System.out.println("\n----------------------02---------------------------\n");
			for (int y = 1; y <= 10; y = y + 3) {// 1,4,7,10
				System.out.println(x + y);

				// 1+1,1+4,1+7,1+10=2,5,8,11
				// 3+1,3+4,3+7,3+10=4,7,10,13
				// 5+1,5+4,5+7,5+10=6,9,12,15
				// 7+1,7+4,7+7,7+10=8,11,14,17
				// 9+1,9+4,9+7,9+10=10,13,16,19
			}
		}

		// not important
		// Below 2 is for example, but try to understand the first one
		System.out.println("\n---------- nested loop (here, a while loop inside a for loop) ----------\n");
		for (int k = 1; k <= 6; k += 2) { // 1, 3, 5
			int l = 2;
			while (l <= 4) { // 2, 3, 4
				System.out.println(k * l);
				l++;
			}
		}

		// not important
		System.out.println("\n---------- nested loop (here, a while loop inside a while loop) ----------\n");
		int m = 1;
		while (m <= 6) {
			// line 29-34 is the inner while loop
			int n = 2;
			while (n <= 4) {
				System.out.println(n * m);
				n++;
			}
			m += 2; // tricky part , where is the first incremental block located
		}

	}

}
