
import java.util.Scanner;

public class Percentage {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Roll no.: ");
		int rollno = sc.nextInt();
		
		System.out.println("Enter Your Name: ");
		
		String str = sc.next();
		sc.nextLine();
		
		System.out.println("Physics: ");
		int p = sc.nextInt();
		
		System.out.println("Chemistry: ");
		int c = sc.nextInt();
		
		System.out.println("Maths: ");
		int m = sc.nextInt();
		
		double percentage = (p+c+m)/3.0;
		
		System.out.println("Roll no: " + rollno + "\nName: " + str
		+ "\nTotal Marks: " + (p+c+m) + "\nPercentage: " + percentage);
	}
}
