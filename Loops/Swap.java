import java.util.Scanner;

public class Swap {
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter x: ");
		int x = sc.nextInt();
		System.out.println("Enter y: ");
		int y = sc.nextInt();
		
		int z;
		
		z = x;
		x = y;
		y = z;
		
		System.out.println( " x: " + x + " y: " + y);
	}
}

		
		