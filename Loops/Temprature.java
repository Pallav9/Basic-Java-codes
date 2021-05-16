import java.util.Scanner;

public class Temprature {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter current temprature: ");
		double tmp = sc.nextDouble();
		
		if (tmp < 0)
			System.out.println("Freezing weather");
		else if ( tmp > 0 && tmp <= 10)
			System.out.println("Very Cold weather");
		else if ( tmp > 10 && tmp <= 20)
			System.out.println( "Cold weather");
		else if (tmp > 20 && tmp <= 30)
			System.out.println("Normal weather");
		else if ( tmp > 30 && tmp < 40)
			System.out.println("Hot weather");
		else
			System.out.println("very Hot....");
	}
}
	
