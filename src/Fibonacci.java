import java.util.Scanner;


public class Fibonacci {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println(fibonacci(in.nextInt()));
	}
	
	public static int fibonacci(int a){
		if(a == 0){
			return 0;
		} else if(a == 1){
			return 1;
		} else {
			return fibonacci(a-1) + fibonacci(a-2);
		}
	}
}
