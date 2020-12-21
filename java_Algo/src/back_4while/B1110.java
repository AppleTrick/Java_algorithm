package back_4while;

import java.util.Scanner;

public class B1110 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		int one = 0;
		int two = 0;
		int another = 0;
		int count = 0;
		
		one = input / 10; //2
		two = input % 10; //6
		
		while(true) {
			
			count ++; //1 // 2 //3 // 4
			another = two;  //6 // 8 // 4 //2
			two = (one + two) % 10; //8 // 4 // 2 // 6
			one = another; // 6  // 8  //4
			
			if (input == one*10 + two ) {
				break;
			}

		}
		
		System.out.println(count);
	}
}
