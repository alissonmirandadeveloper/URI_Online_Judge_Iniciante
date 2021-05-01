package uri1013;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		double maiorAB;
		int ehMaior;
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		
		maiorAB = (a + b + Math.abs(a - b)) / 2;
		
		if ((a > b) && (a > c)) {
			ehMaior = a;
		}
		else if (b > c) {
			ehMaior = b;
		}
		else {
			ehMaior = c;
		}
		
		
		System.out.println(ehMaior + " eh o maior");
	}

}
