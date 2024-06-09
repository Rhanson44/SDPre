import java.util.Scanner;

public class Objective9Lab5 {

  public static void main(String[] args) {
    Scanner kb = new Scanner (System.in);
		double num1, num2;
		boolean keepGoing = true;
		int choice;
		double answer = 0.0;

    System.out.println("Enter your first number");
    num1 = kb.nextDouble();

    System.out.println("Enter your second number");
    num2 = kb.nextDouble();

		while (keepGoing) {
			printMenu();
			System.out.print("Which would you like to do? ");
			choice = kb.nextInt();

			switch (choice) {
      case 1:
      	answer = findSum(num1, num2);
      	System.out.println(answer);
       	break;
      case 2:
      	answer = findAverage(num1, num2);
				System.out.println(answer);
      	break;
      case 3:
      	answer = calcTax(num1, num2);
      	System.out.println(answer);
      	break;
      case 4:
    		System.out.println("Goodbye");
    		keepGoing = false;
    		break;
      default:
      	System.out.println("Invalid entry, try again");
      	break;
			}
		}
		kb.close();
	}

	public static void printMenu() {
		System.out.println();
		System.out.println("========= MENU =========");
		System.out.println("|                      |");
		System.out.println("|   1. Add Numbers     |");
		System.out.println("|   2. Find Average    |");
		System.out.println("|   3. Calculate Tax   |");
		System.out.println("|   4. Exit            |");
		System.out.println("|                      |");
		System.out.println("========================");
		System.out.println();
	}

	public static double findSum(double x, double y) {
		double answer = x + y;
		return answer;
	}
  
  public static double findAverage(double a, double b) {
    double answer = ((a + b) / 2);
    return answer;
  }

	public static double calcTax(double c, double d) {
		double answer = ((c + d) * 0.0831);
		return answer;
	}
}