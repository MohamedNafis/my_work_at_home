package accessModifersForEncapsulation;

public class Test {
	//Variable Declared
		private String info1;
		//Constructor Declared
		private Test() {
			System.out.println("This Constructor is comming from class Access3 which is private");
		}
		// Method Implemented 
		private void access3() {
			System.out.println("This method is comming from class Access3 whish is private");
		}
		public static void main(String[] args) {
			System.out.println("\\n---------- private type modifier content can be accessed inside the same class ----------\\n");
			
			Test test = new Test(); // Constructor is Initialize Here
			
			test.info1=" This Variable is comming fron class Access3 Which is private";// Variable Initialize Here
			System.out.println(test.info1);
			
			test.access3();// Method Initialize Here
			
		}

}
