import java.util.Scanner;

public class Smallest {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		for (int i =0; i < 5; i++){
			System.out.println("Enter " + (i+1) + " Number");
			arr[i] = sc.nextInt();
		}
		
		int tmp;
		for(int i = 0; i < 5; i++){
			for(int j = 0; j < 5 - i - 1; j++){
				if(arr[j] > arr[j+1]){
					tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		
		for (int i = 0; i < 5; i++)
		{
			System.out.println(arr[i]);
		}
	}
}
