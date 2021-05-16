import java.util.Scanner;

public class Longest2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number 1: ");
		int x = sc.nextInt();
		System.out.println("Enter number 2: ");
		int y = sc.nextInt();
		System.out.println("Enter number 3: ");
		int z = sc.nextInt();
		
		if (x>y) {
			
			if(x>z) 
				System.out.println(x + " is greater");
		}
		else if (y > z)
			System.out.println(y + " is greater");
		else
			System.out.println(z + " is greater");
				
	}
}
