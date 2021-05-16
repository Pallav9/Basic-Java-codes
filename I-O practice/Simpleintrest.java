//Finding Simple-Intrest

import java.util.Scanner;

public class Simpleintrest {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Principal Amount: ");
		double p = sc.nextDouble();
		System.out.println("Enter Rate per annum: ");
		double r = sc.nextDouble();
		System.out.println("Enter Time(in years): ");
		double t = sc.nextDouble();
		
		double si = (p*r*t)/100;
		
		System.out.println("Simple Intrest for Given data is: " + si);
	}
}