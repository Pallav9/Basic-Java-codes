import java.util.Scanner;

public class Voter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Age: ");
		int x = sc.nextInt();
		
		if (x < 18)
			System.out.println("You Are not Elligible");
		else
			System.out.println("You Are Elligible");
	}
}
