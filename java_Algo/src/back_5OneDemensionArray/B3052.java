package back_5OneDemensionArray;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class B3052 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Set<Integer> numbers = new HashSet<Integer>();
		
		int input;
		
		for (int i = 0; i < 10; i++) {
			input = sc.nextInt();
			numbers.add(input%42);
		}
		System.out.println(numbers.size());
		
		sc.close();
	}
}
