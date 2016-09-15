package pkgMain;

import java.util.Scanner;

public class QB_rating {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter variable values
		System.out.println("Enter the number of passing attempts: ");
		double att = input.nextDouble();
		System.out.println("Enter the number of completions: ");
		double comp = input.nextDouble();
		System.out.println("Enter the number of passing yards: ");
		double yds = input.nextDouble();
		System.out.println("Enter the number of touchdown passes: ");
		double td = input.nextDouble();
		System.out.println("Enter the number of interceptions: ");
		double intcep = input.nextDouble();
		
		input.close();
		
		// Calculate each variable
		double a = (((comp / att) - 0.3) * 5);
		double b = (((yds / att) - 3) * 0.25);
		double c = ((td / att) * 20);
		double d = 2.375 - (intcep * 25 / att);
		
		// Check the values of variables
		final double max = 2.375;
		a = (a > max)?2.375 : a;
		b = (b > max)?2.375 : b;
		c = (c > max)?2.375 : c;
		d = (d > max)?2.375 : d;
		
		a = (a < 0)?0 : a;
		b = (b < 0)?0 : b;
		c = (c < 0)?0 : c;
		d = (d < 0)?0 : d;
			
		// Calculate the QB rating
		double rating = (a + b + c + d) * 100 / 6.0;
		
		System.out.println("The QB rating is" + rating);
	}
}