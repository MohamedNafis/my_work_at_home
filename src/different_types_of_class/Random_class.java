package different_types_of_class;

import java.awt.image.renderable.RenderableImage;
import java.util.Random;

public class Random_class {
	public static void main(String[] args) {
		Random random = new Random();
		int a =random.nextInt();
		int b =random.nextInt();
		System.out.println("Random Value :" + a );
		System.out.println("Random Value :" + b );
		System.out.println("Random Value :" + random.nextInt() );
		
		System.out.println(" \nRndom Value With limit ");
		
		int c = random.nextInt(100);
		int d = random.nextInt(200);
		System.out.println("Random Value with limit:" + c);
		System.out.println("Random Value with limit:" + d);
		System.out.println("Random Value with limit:" + random.nextInt(200));
		
		System.out.println("\n---------------------------------------------------------------\n");
		
		
		boolean e = random.nextBoolean();
		boolean f = random.nextBoolean();
		System.out.println("Random Value Boolean 1 :" + e);
		System.out.println("Random Value Boolean 2:" + f);
		System.out.println("Random Value Boolean 3 :" + random.nextBoolean());
		
		System.out.println("\n-------------------------------------------------------------------\n");
		
		
		float g = random.nextFloat();
		double h = random.nextDouble();
		long i = random.nextLong();
		System.out.println("random Float Value is : " + g );
		System.out.println("random Double Value is : " + h );
		System.out.println("random Float long is : " + i );
		
	}

}
