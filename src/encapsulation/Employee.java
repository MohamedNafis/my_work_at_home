package encapsulation;

public class Employee {
	private String name;
	private int age;
	private char sex;
	private float grade;
	private boolean usCitizen;
	
	public Employee(String name, int age, char sex, float grade, boolean usCitizen) {
		this.name=name;
		this.age=age;
		this.sex=sex;
		this.grade=grade;
		this.usCitizen=usCitizen;
		
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public char getSex() {
		return sex;
	}

	public float getGrade() {
		return grade;
	}

	public boolean isUsCitizen() {
		return usCitizen;
	}

}
