package constructorInJava;

public class EmployeeTest {
	public static void main(String[] args) {
		// Default Constructor Initialized
		Employee employee1 = new Employee();
		// Parameterized Constructor Initialized
		Employee employee2 = new Employee("Mohammed Nafis");
		Employee employee3 = new Employee("Mohammede Nafis ", 23645);
		Employee employee4 = new Employee("Mohammede Nafis ", 23645, 'M');
		Employee employee5 = new Employee("Mohammede Nafis ", 23645, 'M', true);
		Employee employee6 = new Employee("Sholil Shourob ", 34563, 'M', false);
		Employee employee7 = new Employee("Farzana Akther ", 76548, 'F', true);
		Employee employee8 = new Employee("Mahdi Hussain ", 14532, 'M', false);
		Employee employee9 = new Employee("Mariya Fulzahan ", 56433, 'F', false);
	}

}
