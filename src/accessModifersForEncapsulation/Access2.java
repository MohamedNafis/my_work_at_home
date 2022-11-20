package accessModifersForEncapsulation;

public class Access2 extends Access1 {
	private String name = "This Variable comming from Access2 which is private";

	private void test2() {
		System.out.println("This method is comming from Access2 which private");
	}

	public static void main(String[] args) {
		System.out.println(
				"\\n---------- Inside same package, private type modifier content of Parent class [Access1] can't be accessed by sub/child class (Here Access2) ----------");
		Access2 access2 = new Access2();
		// Access2.test1(); //The method test1() from the type Access1 is not visible
	}

}
