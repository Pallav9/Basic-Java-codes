
import java.util.Scanner;

public class Area {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter width(in m): ");
		double w = sc.nextDouble();
		
		System.out.println("Enter height/(in m/): ");
		double h = sc.nextDouble();
		
		System.out.println("Area is " + (w*h) + "\nPerimeter is " + (2*(w+h)));
	}
}
		
		
		