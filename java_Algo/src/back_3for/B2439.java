package back_3for;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2439 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= a; i++) {
			for (int j = a; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
