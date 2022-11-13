package constructorInJava;

public class Employee {
	public String empName;
	public int empId;
	public char gander;
	public boolean fullTimeWorker;

	public Employee() {
		// constructor is Declareds
		System.out.println("This Default constructor is from Employee class");

	}

	// parameterized constructor 01 is Declared
	public Employee(String empName) {
		this.empName = empName;
		System.out.println("Employee Name:" + empName);
	}

	// parameterized constructor 02 is Declared
	public Employee(String empName, int empId) {
		this.empName = empName;
		this.empId = empId;
		System.out.println("Employee Name:" + empName + ",Employee ID NO:" + empId);

	}

	// parameterized constructor 03 is Declared
	public Employee(String empName, int empId, char gander) {
		this.empName = empName;
		this.empId = empId;
		this.gander = gander;
		System.out.println("Employee Name:" + empName + ",Employee ID NO:" + empId + " ,Employee Gander:" + gander);

	}

	// parameterized constructor 03 is Declared
	public Employee(String empName, int empId, char gander, boolean fullTimeWorker) {
		this.empName = empName;
		this.empId = empId;
		this.gander = gander;
		this.fullTimeWorker = fullTimeWorker;
		System.out.println("Employee Name:" + empName + ",Employee ID NO:" + empId + " ,Employee Gander:" + gander
				+ " ,Employee Full Time Work Status:" + fullTimeWorker);

	}

}
