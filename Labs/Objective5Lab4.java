import java.util.Scanner;

public class Objective5Lab4 {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num;

		System.out.println("Enter a number");
		num = scanner.nextInt();

		if(num % 2 == 0) {
			System.out.println("Number is even");
		}
		else 
			System.out.println("Number is odd");
		
		scanner.close();
	}
}