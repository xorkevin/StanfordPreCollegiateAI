import java.util.Scanner;

public class NumberChooser {
	private static boolean cont = true;
	private static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		while (cont) {
			int n;
			int add;
			System.out.println("Choose a number");
			n = in.nextInt();
			System.out
					.println("Do you want the sum or product of the numbers from 1 to n? (0 for sum, 1 for product)");
			add = in.nextInt();
			if (add == 0) {
				System.out.println((1 + n) * n / 2);
			} else {
				int total = 1;
				for (int i = 1; i < n+1; i++) {
					total *= i;
				}
				System.out.println(total);
			}
			System.out.println("continue? (0 for no, 1 for yes)");
			cont = (in.nextInt() == 0) ? false : true;
		}
	}
}
