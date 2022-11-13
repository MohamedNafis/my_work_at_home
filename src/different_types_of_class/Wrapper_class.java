package different_types_of_class;

public class Wrapper_class {
	public static void main(String[] args) {
		String name1="100";
		System.out.println(name1);
		System.out.println(name1 + 20);
		System.out.println(name1 + "20");
		System.out.println(name1 + "20");
		System.out.println(25+25+name1+25);
		System.out.println(25+25+Integer.parseInt(name1)+25);
		
		String name2="100";
		System.out.println(name2);
		System.out.println(name2+1.34);
		System.out.println(name2+"1.25");
		System.out.println(2.50+2.50+name2+2.50);
		System.out.println(2.50+2.50+Double.parseDouble(name2)+2.50);
		
	
		String name3="100";
		System.out.println(name3);
		System.out.println(name3+1.34f);
		System.out.println(name3+"1.25");
		System.out.println(2.50f+2.50f+name3+2.50f);
		System.out.println(2.50f+2.50f+Float.parseFloat(name3)+2.50f);
		
		char sex=Character.toLowerCase('M');
		System.out.println("SEX: " + sex);
		
		char gander = Character.toUpperCase('f');
		System.out.println("Gander: " + gander);
		
		String worker= "true";
		System.out.println("Employee :" + worker);
		System.out.println("Employee :" + Boolean.parseBoolean(worker));
		
		String worker1= "";
		System.out.println("Employee :" + worker1);
		System.out.println("Employee :" + Boolean.parseBoolean(worker1));
		
		
		int a = 25;
		System.out.println(a);
		System.out.println(a+25);
		System.out.println(a+"25");
		System.out.println(a+"25");
		System.out.println(a+"25");
		System.out.println(25+25+a+"25");
		System.out.println(25+25+String.valueOf(a)+"25");
		System.out.println(String.valueOf(a)+"25");
		
	}
	
	

}
