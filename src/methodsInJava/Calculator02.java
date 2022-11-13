package methodsInJava;


public class Calculator02 {
	//all Return type methods
	int a = 20;
	int b = 2;
	String myFirstName = "Mohammed ";
	String myLastNameString = "Nafis";
	char gander = 'M';
	boolean status = true;

	public int addition () {
		int total = a + b;
		System.out.println("Total Adition:" + total);
		return total;
		
	}
	
	public String myFullName () {
		String fullName = myFirstName + myLastNameString;
		System.out.println("My Full Name: "+ fullName);
		return fullName;
	}
	
	public char myGander() {
		char sex = gander;
		System.out.println("My gander:" + sex);
		return sex;
	}
	
	public boolean myStatus () {
		boolean legalStatus = status;
		System.out.println("Us Citizien: " + legalStatus );
		return legalStatus;
	}
	
	public int subtraction () {
		int total = a - b;
		System.out.println("Total subtraction:" + total);
		return total;
	}

}
