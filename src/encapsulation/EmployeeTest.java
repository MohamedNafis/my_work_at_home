package encapsulation;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee employee = new Employee("Nafis", 25, 'M', 3.5f, true);
		System.out.println("The Employee Name Is: " + employee.getName() + ", Employee Age is:" + employee.getAge() + ", Employee Sex is: " + employee.getSex() + ", Employee Grade is: " + employee.getGrade() + ", Employee Status is: " + employee.isUsCitizen());
	}
	

}
