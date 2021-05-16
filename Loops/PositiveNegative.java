import java.util.Scanner;

public class PositiveNegative {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int x = sc.nextInt();
		
		if (x > 0)
			System.out.println("Positive Number");
		else if ( x < 0)
			System.out.println("Negative number");
		else
			System.out.println("neither positive nor negative");
	}
}
