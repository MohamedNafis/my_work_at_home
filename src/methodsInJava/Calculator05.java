package methodsInJava;

public class Calculator05 {

	// no global variable
	// return type parameterized method
	public int addition(int a, int b) {
		int total = a + b; // local variables
		System.out.println("Total Addition: " + total);
		return total;
	}

	public int subtraction(int a, int b) {
		int total = a - b;
		System.out.println("total subtraction: " + total);
		return total;
	}

	public int multiplication(int a, int b) {
		int total = a * b;
		System.out.println("Total Multiplication: " + total);
		return total;
	}

	public int divition(int a, int b) {
		int total = a / b;
		System.out.println("Total Divition: " + total);
		return total;
	}

	// Methods can be called inside a method
	public void allMethod(int a, int b) {
		addition(a, b);
		subtraction(a, b);
		multiplication(a, b);
		divition(a, b);
	}

	public String stName(String firstname, String lastname) {
		String fullName = firstname + lastname;
		System.out.println("Student Name:" + fullName);
		return fullName;
	}

}
