package loops;

public class Break_inside_nested_loop {
	public static void main(String[] args) {
		for (int x = 1; x <= 3; x++) {// 1,2,3
			for (int y = 1; y <= 3; y++) {// 1,2,3
				// if no break present
				// 1 1, 1 2, 1 3
				// 2 1, 2 2, 2 3
				// 3 1, 3 2, 3 3
				if (x == 1 && y == 1) {
					break;
				}
				// After break
				// * *,* *,* *
				// 2 1, 2 2,2 3
				// 3 1,3 2,3 3
				System.out.println(x + "   " + y);
			}
		}
	}

}
