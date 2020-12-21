package back_5OneDemensionArray;

import java.util.Scanner;

public class B2562 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int maxNumber = 0;
		int indexNumber = 0;
		
		int[] numbers = new int[9];
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = sc.nextInt();
			
			if (numbers[i] > maxNumber) {
				maxNumber = numbers[i];
				indexNumber = i+1;
			}
		}
		
		System.out.println(maxNumber);
		System.out.println(indexNumber);
	}
}
