package methodsInJava;

public class Calculator03 {

	float a = 2.3453f;
	float b = 3.4543f;

	public float multiplication() {
		float total = a * b;
		System.out.println("Total Multiplication: " + total);
		return total;
	}

	// return type and parameterized type method
	public float divition(float c, float d) {
		float total = c / d;
		System.out.println("Total Divition of C and D is: " + total);
		return total;
	}

	public float addition(float c, float d) {
		float total = c + d;
		System.out.println("Total Addition of C and D is: " + total);
		return total;
		
		
	}

}
