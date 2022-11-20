package encapsulation;

public class Student {
	public String studentName;
	public int studentId;
	public char sex;
	public float grade;
	public boolean fullTimeStudent;
	
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public float getGrade() {
		return grade;
	}
	public void setGrade(float grade) {
		this.grade = grade;
	}
	public boolean isFullTimeStudent() {
		return fullTimeStudent;
	}
	public void setFullTimeStudent(boolean fullTimeStudent) {
		this.fullTimeStudent = fullTimeStudent;
	}
	
	

}
