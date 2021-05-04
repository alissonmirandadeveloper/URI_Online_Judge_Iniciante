package uri1013;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int maiorAB;
		int maiorABC;
		int ehMaior;
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		
		maiorAB = (a + b + Math.abs(a - b)) / 2;
		maiorABC = (maiorAB + c + Math.abs(maiorAB - c)) / 2;
		
	
		
		System.out.println(maiorABC + " eh o maior");
	}

}
