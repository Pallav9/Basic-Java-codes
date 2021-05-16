import java.util.Scanner;

public class Salary {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Base Salary: ");
		double sal = sc.nextDouble();
		
		sal = 1.4*sal - .12*sal + 1700;
		
		System.out.println("Your In-hand Salary is: " + sal);
	}
}