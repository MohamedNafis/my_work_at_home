package methodsInJava;

public class Calculator01 {
	//global variable
	int a = 10; 
	int b = 2;
	
	//All are void type methods
	public void addition () {
		int total = a + b; //local variable
		System.out.println("Total Addition: " + total);
	}
	
	public void subtraction () {
		int total = a - b;
		System.out.println("Total Subtraction: " + total);
	}
	
	public void multipliacation () {
		int total = a*b;
		System.out.println("Total Multipliacation: " + total);
	}
	
	public void division () {
		int total = a / b;
		System.out.println("Total Division: " + total);
	}

}
