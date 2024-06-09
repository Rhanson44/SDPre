public class Objective8Lab2{
	public static void main(String[] args) {
		int sumTotal = 0;

		for(int i = 1; i < 21; i++)
			sumTotal = i + sumTotal;

		System.out.println(sumTotal);
	}
}