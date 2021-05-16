import java.util.Scanner;
public class Average {
	public  static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[5];
		int count = 0;
		
		for (int i =0; i < 5; i++)
		{
			System.out.println("Enter " + (i+1) + " number");
			arr[i] = sc.nextInt();
			count = count + arr[i];
		}
		
		double avg = count/5.0;
		
		System.out.println("Average is: " + avg);
	}
}