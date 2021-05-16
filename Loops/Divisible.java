import java.util.Scanner;

public class Divisible{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		int num = sc.nextInt();
		
		if( num%3 == 0 && num%5 == 0)
			System.out.println("number is divisible by 3 & 5");
		
	}
}