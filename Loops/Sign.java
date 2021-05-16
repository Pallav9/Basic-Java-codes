import java.util.Scanner;

public class Sign {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your No: ");
		int num = sc.nextInt();
		
		if (num < 0)
		{
			System.out.println("negative number");
		}
		else
			System.out.println("Positive Number");
	}
}