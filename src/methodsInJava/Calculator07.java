package methodsInJava;

public class Calculator07 {
	public int addition(int a, String b) {
		int total = a + Integer.parseInt(b);
		System.out.println("Total Addition: " + total);
		return total;
	}

	public double multiplication(double g, String h) {
		double total = g * Double.parseDouble(h);
		System.out.println(" Total Multiplication: " + total);
		return total;
	}

	public int subtraction(int c, double d) {
		int total = c - (int) d;
		System.out.println("Total Subtraction: " + total);
		return total;
	}

	public int divition(int e, float f) {
		int total = e / (int) f;
		System.out.println("Total Division: " + total);
		return total;
	}

	public float division02(int e, float f) { // int = 8, narrow, need widening
		float total5 = e / f;
		System.out.println("Division of e by f is: " + total5);
		return total5;
	}

}
