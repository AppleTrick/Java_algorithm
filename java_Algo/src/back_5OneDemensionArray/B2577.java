package back_5OneDemensionArray;

import java.util.Scanner;

public class B2577 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int count = 0;
		
		String result = Integer.toString(a*b*c);
		String[] result1 = result.split(""); 
		
		for (int i = 0; i <= 9; i++) {
			for (int j = 0; j < result1.length; j++) {
				int k = Integer.parseInt(result1[j]);
				if (i == k) {
					count ++;
				}
			}
			System.out.println(count);
			count =0;
		}
		
	}
}
