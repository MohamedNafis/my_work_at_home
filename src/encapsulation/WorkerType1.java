package encapsulation;

public class WorkerType1 {
	private String name;
	private int age;
	private char gander;
	private float raiting;
	private boolean fullTime;

	public WorkerType1(String name, int age, char gander, float raiting, boolean fullTime) {
		this.name = name;
		this.age = age;
		this.gander = gander;
		this.raiting = raiting;
		this.fullTime = fullTime;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public char getGander() {
		return gander;
	}

	public float getRaiting() {
		return raiting;
	}

	public boolean isFullTime() {
		return fullTime;
	}

}
