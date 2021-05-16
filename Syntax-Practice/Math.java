
public class Math {
	public static void main(String args[]) {
		double x = Double.parseDouble(args[0]);
		double y = Double.parseDouble(args[1]);
		
		System.out.println("Sum is " + (x+y));
		System.out.println("Multiplication is " + (x*y));
		System.out.println("Division is " + (x/y));
		System.out.println("Remainder is " + (x%y));
	}
}
