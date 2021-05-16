import java.util.Scanner;

public class Largest {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number 1: ");
		int x = sc.nextInt();
		System.out.println("Enter number 2: ");
		int y = sc.nextInt();
		if (x>y)
			System.out.println(x + " is greater");
		else
			System.out.println(y + " is Greater");
	}
}
