package accessModifiers;

public class Test2 {
	public static void p() {
		System.out.println("\tA");
		p();
	}
	public static void main(String[] args) {
		System.out.println("B");
		p();
		System.out.println("C");
	}
}
