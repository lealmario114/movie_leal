package movie_leal;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		String mov;
		int adlt;
		int chil;
		
		System.out.println("Please Enter the movie name: ");
		mov=input.next();
		
		System.out.println("Enter the number of adults: ");
		adlt=input.nextInt();
		
		System.out.println("Enter number of children");
		chil=input.nextInt();
		
		System.out.println();
		
		ID demo = new ID(mov,adlt,chil);
		
		System.out.println(demo.toString());
		
	}

}
