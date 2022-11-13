package constructorInJava.Final;

public class Employee {
	public String empName;
	public int empId;
	public char gander;
	public boolean fullTimeWorker;
	
	public Employee () {
		System.out.println("This Default Constructor is from Employee Class");
	}

	public Employee(String empName, int empId, char gander, boolean fullTimeWorker) {
		this.empName = empName;
		this.empId = empId;
		this.gander = gander;
		this.fullTimeWorker = fullTimeWorker;
		System.out.println("Employee Name:" + empName +","+ " Employee ID NO:" + empId + " ,Employee Gander:" + gander
				+ " ,Employee Full Time Work Status:" + fullTimeWorker);
	}
}
