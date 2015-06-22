import java.util.Scanner;

public class PMT {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter apr, months, pv");
		System.out.println(pmt(in.nextDouble(), in.nextInt(), in.nextDouble()));
	}

	public static double pmt(double apr, int months, double pv) {
		double monthrate = apr / 12;
		return monthrate * pv / (1 - Math.pow(1 + monthrate, -months));
	}
}
