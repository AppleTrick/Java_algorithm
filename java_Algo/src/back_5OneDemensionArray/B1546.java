package back_5OneDemensionArray;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class B1546 {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int Maxnumber = 0;
		int sum = 0;
		int value = 0;
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < a; i++) {
			list.add(sc.nextInt());
		}
		
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			value = it.next();
			sum = sum + value;
			if (Maxnumber < value) {
				Maxnumber = value;
			}
		}

		double result = (double)sum / (double)(Maxnumber*a) * 100;
		
		System.out.println(result);
		
		sc.close();
	}
}
