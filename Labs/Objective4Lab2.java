import java.util.Scanner;

public class Objective4Lab2 {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    int num1 = 0, num2 = 0, num3 = 0;
    double dub1 = 0.0, dub2 = 0.0, dub3 = 0.0;

    System.out.println("Enter your first integer");
    num1 = keyboard.nextInt();
    System.out.println("Enter your second integer");
    num2 = keyboard.nextInt();
    System.out.println("Enter your third integer");
    num3 = keyboard.nextInt();

    int result1 = (num1 + num2 + num3);

    System.out.println("Enter your first double");
    dub1 = keyboard.nextDouble();
    System.out.println("Enter your second double");
    dub2 = keyboard.nextDouble();
    System.out.println("Enter your third double");
    dub3 = keyboard.nextDouble();

    double result2 = (dub1 + dub2 + dub3);

    System.out.println("The sum of " + num1 + " + " + num2 + " + " + num3 + " = " + result1);

    System.out.println("The sum of " + dub1 + " + " + dub2 + " + " + dub3 + " = " + result2);
  }
}
