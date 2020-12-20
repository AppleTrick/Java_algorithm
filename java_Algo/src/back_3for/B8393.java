package back_3for;

import java.util.Scanner;

public class B8393 {

	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int res = 0;
		
		for (int i = 1; i <= a; i++) {
			res += i;
		}
		System.out.println(res);
		
		sc.close();
	}
}
