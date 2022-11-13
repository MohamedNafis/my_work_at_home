package switch_condition;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		System.out.println("<-- Please print a day -->");
		Scanner scanner = new Scanner(System.in);
		String day= scanner.nextLine();
		
		switch (day) {
		case "Saturday":
			System.out.println("Today Is Saturday");
			break;
		case "Sunday":
			System.out.println("Today Is Sunday");
			break;
		case "Monday":
			System.out.println("Today Is Monday");
			break;
		case "Tuesday":
			System.out.println("Today Is Tuesday");
			break;
		case "Wednesday":
			System.out.println("Today Is Wednesday");
			break;
		case "Thursday":
			System.out.println("Today Is Thursday");
			break;
		case "Friday":
			System.out.println("Today Is Friday");
			break;
		default:
			System.out.println("Please Put A Valid Date !! ");
			break;
		}
		scanner.close();
	}

}
