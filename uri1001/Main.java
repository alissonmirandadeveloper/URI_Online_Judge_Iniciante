package uri1001;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);
		
		int A, B, X;
		
		A = input.nextInt();
		B = input.nextInt();
		
		X = A + B;
		
		System.out.println("X = " + X);
	}

}
