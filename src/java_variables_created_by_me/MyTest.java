package java_variables_created_by_me;

public class MyTest {
	public static void main(String[] args) {
		MyInfo myInfo = new MyInfo();
		System.out.println(myInfo.name);
		System.out.println(myInfo.age);
		System.out.println(myInfo.monthlyRent);
		System.out.println(myInfo.investment);
		System.out.println(myInfo.netWorth);
		System.out.println(myInfo.productHight);
		System.out.println(myInfo.distance);
		System.out.println(myInfo.gander);
		System.out.println(myInfo.citizen);
		System.out.println(myInfo.name + myInfo.age + myInfo.monthlyRent);
		System.out.println("My Name:" + myInfo.name + ", Age:" + myInfo.age + ", My Rant:" + myInfo.monthlyRent);
		System.out.println(myInfo.sex);
		System.out.println("Address: " + myInfo.homeAddress);
		
		myInfo.myInfo();
		
	}

}
