package ant;

import java.util.Scanner;

public class Test01 {
	static StringBuilder Line = new StringBuilder("1");
	static StringBuilder addLine = new StringBuilder();
	static int count = 1;
	static char temp = 0;
	

	public static void main(String[] args) {

		System.out.println("출력할 줄을 입력하세요");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		//반복해서 출력한다.
		
		
		
		for (int i = 0; i < input; i++) {
			System.out.println(Line);
			temp = Line.charAt(0);
			addLine.append(temp);
			Deduplication();
//			addLine.append(count);
			
			
			
			
		}
		
		
	}
	
	public static void Deduplication() {
		
		for (int i = 0; i < Line.length(); i++) {
			if (i == Line.length()-1) {
				addLine.append(count);
				count = 1;
			} else {
				// 앞뒤 값이 같을경 우
				if (Line.charAt(i)==Line.charAt(i+1)) {
					count ++;
				// 앞뒤 값이 다를 경우
				} else {
					addLine.append(count);
					temp = Line.charAt(i+1);
					addLine.append(temp);
					count = 1;
				}
			}	
		}
		
		
		Line.setLength(0);
		Line.append(addLine);
		addLine.setLength(0);

		//addLine.setLength(0);
	}
}
	

		