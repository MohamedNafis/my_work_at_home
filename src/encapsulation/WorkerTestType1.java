package encapsulation;

public class WorkerTestType1 {
	public static void main(String[] args) {
		WorkerType1 workerType1 = new WorkerType1("Nafis", 25, 'M', 3.52f, true);
		System.out.println("Worker Name: " + workerType1.getName() + ", Age: " + workerType1.getAge() + ", Gander: "
				+ workerType1.getGander() + ", Raiting: " + workerType1.getRaiting() + ", Fulltime: "
				+ workerType1.isFullTime());
	}

}
