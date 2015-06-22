import java.util.ArrayList;
import java.util.Scanner;

public class BoxWord {
	private static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		String[] wordList;
			wordList = in.nextLine().trim().split(" ");
		int maxVal = wordList[0].length();
		for (int i = 1; i < wordList.length; i++) {
			int length = wordList[i].length();
			if(length > maxVal){
				maxVal = length;
			}
		}
		String header = "";
		for(int i = 0; i < maxVal+2; i++){
			header += "*";
		}
		System.out.println(header);
		for(String s : wordList){
			System.out.print("*");
			System.out.printf("%-" + maxVal + "s", s);
			System.out.println("*");
		}
		System.out.println(header);
	}
}
