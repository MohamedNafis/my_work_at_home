package methodsInJava;

public class Calculator06 {

	public void addition(int a, int b) {
		int total = a + b;
		System.out.println(" Addition fo a and b is: " + total);
	}

	public void subtraction(int a, int b) {
		int total = a - b;
		System.out.println(" Subtraction fo a and b is: " + total);
	}

	public void multiplication(int a, int b) {
		int total = a * b;
		System.out.println(" Multiplication fo a and b is: " + total);
	}

	public void divition(int a, int b) {
		int total = a / b;
		System.out.println(" Divication fo a and b is: " + total);
	}

	public String workerName(String firstname, String lastname) {
		String fullname = firstname + lastname;
		System.out.println("Name: " + fullname);
		return fullname;
	}

	public void workerInfo(String empName, int empId, char empSex, boolean empStatus) {
		System.out.println("Worker Name:" + empName + "Worker ID:" + empId + " Gander:" + empSex + " Full Time Worker:"
				+ empStatus);
	}

}
