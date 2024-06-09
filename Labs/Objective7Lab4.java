public class Objective7Lab4{
	public static void main (String[] args) {
		int counter = 1;
		int sumTotal = 0;

		while(counter <= 20) {
			sumTotal = counter + sumTotal;
			counter = counter + 1;
		}
		System.out.println(sumTotal);
	}
}