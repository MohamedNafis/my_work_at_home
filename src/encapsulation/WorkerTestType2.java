package encapsulation;

public class WorkerTestType2 {
	public static void main(String[] args) {
		WorkerType2 workerType2 = new WorkerType2();
		workerType2.setName("Nafis");
		workerType2.setAge(25);
		workerType2.setGander('M');
		workerType2.setRaiting(3.52f);
		workerType2.setFullTime(true);

		System.out.println("Worker Name: " + workerType2.getName() + ", Age: " + workerType2.getAge() + ", Gander: "
				+ workerType2.getGander() + ", Raiting: " + workerType2.getRaiting() + ", Fulltime: "
				+ workerType2.isFullTime());

	}

}
