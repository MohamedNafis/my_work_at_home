package encapsulation;

public class StudentTest {
	public static void main(String[] args) {
		Student student = new Student();
		student.setStudentName("Nafis");
		student.setStudentId(2023);
		student.setSex('M');
		student.setGrade(4.0f);
		student.setFullTimeStudent(true);

		System.out.println("Student Name: " + student.getStudentName() + ", Student ID Number: "
				+ student.getStudentId() + ", Student Sex: " + student.getSex() + ", student Grade: "
				+ student.getGrade() + ", student Status: " + student.fullTimeStudent);

	}

}
