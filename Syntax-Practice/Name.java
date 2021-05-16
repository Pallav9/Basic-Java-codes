import java.util.Scanner;
public class Name {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your Name: ");
		
		String name = scan.nextLine();
		System.out.println("hello \n" + name);
	}
}