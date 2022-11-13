package accessModifiers;



public class Public {
	
	// variable declared
		public String info2; 
		
		// constructor declared
		public Public() {
			System.out.println("This Constructor is coming from class D which is protected type");
		}
		
		// method implemented
		public void d() {
			System.out.println("This method is coming from class D which is protected type");
		}

		public static void main(String[] args) {
			System.out.println("\n---------- protected type modifier content can be accessed inside the same class ----------\n");
			Public test01 = new Public();// Constructor will be initialized here
			test01.info2 = "This variable is coming from class D which is protected type"; // variable initialized here
			System.out.println(test01.info2); 
			
			test01.d(); // method initialized here

		}
	

}
