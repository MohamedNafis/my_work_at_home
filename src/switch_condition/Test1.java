package switch_condition;

public class Test1 {
	public static void main(String[] args) {
		char size = 'X';
		switch (size) {
		case 'S':
			System.out.println("Yes We have your Small Size Shirt");
			break;
		case 'M':
			System.out.println("Yes We have your Medium Size Shirt");
			break;
		case 'L':
			System.out.println("Yes We have your Large Size Shirt");
			break;
		case 'X':
			System.out.println("Yes We have your Extra Large Size Shirt");
			break;
		default:
			System.out.println("Sorry! We don't have your size");
			break;
		}
	}

}
