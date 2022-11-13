package methodsInJava;

public class MethodeTest {

	public static void main(String[] args) {
		Calculator01 calculator01 = new Calculator01();
		calculator01.addition();
		calculator01.subtraction();
		calculator01.multipliacation();
		calculator01.division();

		System.out.println("\n------------------------------------------------------\n");

		Calculator02 calculator02 = new Calculator02();
		calculator02.addition();
		calculator02.myFullName();
		calculator02.myGander();
		calculator02.myStatus();
		calculator02.subtraction();

		System.out.println("\n---------------------------------------------------------\n");

		Calculator03 calculator03 = new Calculator03();
		calculator03.multiplication();
		calculator03.divition(4.455f, 3.456f);
		calculator03.divition(9.455f, 7.456f);
		calculator03.divition(5.455f, 4.456f);
		calculator03.addition(2.455f, 2.456f);

		System.out.println("\n----------------------------------------------------------\n");

		Calculator04 calculator04 = new Calculator04();
		calculator04.divition();
		calculator04.multiplication();

		System.out.println("\n-----------------------------------------------------------\n");

		Calculator05 calculator05 = new Calculator05();
		calculator05.addition(30, 20);
		calculator05.subtraction(30, 10);
		calculator05.multiplication(20, 20);
		calculator05.divition(60, 30);
		calculator05.addition(50, 50);
		calculator05.subtraction(50, 20);
		calculator05.multiplication(30, 30);
		calculator05.divition(40, 20);
		calculator05.allMethod(30, 10);
		calculator05.stName("Mohammed ", "Nafis");
		calculator05.stName("Sholil  ", "Shouro");

		System.out.println("\n------------------------------------------------------------\n");

		Calculator06 calculator06 = new Calculator06();
		calculator06.addition(10, 10);
		calculator06.subtraction(12, 10);
		calculator06.multiplication(30, 30);
		calculator06.divition(50, 2);
		calculator06.workerName("Rofikul", " Islam");
		calculator06.workerInfo("Mohammed Nafis ", 2113, 'M', true);
		calculator06.workerInfo("Ripon Ahmed ", 4553, 'M', false);

		System.out.println("\n----------------------------------------------------------------\n");

		Calculator07 calculator07 = new Calculator07();
		calculator07.addition(10, "20");
		calculator07.multiplication(3.887465, "28");
		calculator07.subtraction(45, 4.88765);
		calculator07.divition(62357, 642.823974f);
		calculator07.divition(2357, 42.84f);

	}

}
