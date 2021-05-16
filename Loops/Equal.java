import java.util.Scanner;

public class Equal {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int x = sc.nextInt();
		System.out.println("Enter 2nd number: ");
		int y = sc.nextInt();
		
		if (x == y)
			System.out.println("Two numbers are equal");
		else
			System.out.println("Numbers are not equal");
	}
}