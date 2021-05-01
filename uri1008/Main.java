package uri1008;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double salary;
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int number = input.nextInt();
		int hour = input.nextInt();
		double hourWorkedValue = input.nextDouble();
		
		salary = hour * hourWorkedValue;
		
		
		System.out.println("NUMBER = " + number);
		System.out.println("SALARY = U$ " + String.format("%.2f", salary));
		
		input.close();

	}

}
