package back_5OneDemensionArray;

import java.util.Scanner;

public class B10818 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int minNumber = 0 ;
		int maxNumber = 0 ;
		
		int [] numbers = new int[number];
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = sc.nextInt();
			
			if ( i == 0) {
				maxNumber = numbers[i];
				minNumber = numbers[i];
			}
			
			if (numbers[i]> maxNumber) {
				maxNumber = numbers[i];
			}
			
			if (numbers[i] < minNumber) {
				minNumber = numbers[i];
			}
		}
		
		System.out.print(minNumber + " " + maxNumber);

	}
}
